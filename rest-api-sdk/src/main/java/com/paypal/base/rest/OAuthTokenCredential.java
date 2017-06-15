package com.paypal.base.rest;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.paypal.base.*;
import com.paypal.base.codec.binary.Base64;
import com.paypal.base.exception.ClientActionRequiredException;
import com.paypal.base.exception.HttpErrorException;
import com.paypal.base.sdk.info.SDKVersionImpl;
import com.paypal.base.util.UserAgentHeader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * OAuthTokenCredential is used for generation of OAuth Token used by PayPal
 * REST API service. ClientID and ClientSecret are required by the class to
 * generate OAuth Token, the resulting token is of the form "Bearer xxxxxx". The
 * class has two constructors, one of it taking an additional configuration map
 * used for dynamic configuration. When using the constructor with out
 * configuration map the endpoint is fetched from the configuration that is used
 * during initialization. See {@link PayPalResource} for configuring the system.
 * When using a configuration map the class expects an entry by the name
 * "oauth.EndPoint" or "service.EndPoint" to retrieve the value of the endpoint
 * for the OAuth Service. If either are not present the configuration should
 * have a entry by the name "mode" with values sandbox or live wherein the
 * corresponding endpoints are default to PayPal endpoints.
 */
public final class OAuthTokenCredential {

	private static final Logger log = LoggerFactory.getLogger(OAuthTokenCredential.class);

	private static Map<String, AccessToken> ACCESS_TOKENS = new ConcurrentHashMap<String, AccessToken>();

	/**
	 * OAuth URI path parameter
	 */
	private static String OAUTH_TOKEN_PATH = "/v1/oauth2/token";

	/**
	 * Client ID for OAuth
	 */
	private String clientID;

	/**
	 * Client Secret for OAuth
	 */
	private String clientSecret;

	/**
	 * Headers
	 */
	private Map<String, String> headers = new HashMap<String, String>();

	private String refreshToken;

	/**
	 * @deprecated This field is only used when OAuthTokenCredential is initialized with access token only.
	 * If the access token is directly passed in as a part of constructor, we will always pass this back.
	 */
	@Deprecated
	private final AccessToken __accessToken;

	/**
	 * Map used for dynamic configuration
	 */
	private Map<String, String> configurationMap;

	/**
	 * {@link SDKVersion} instance
	 */
	private SDKVersion sdkVersion;

	/**
	 * Sets the URI path for the OAuth Token service. If not set it defaults to
	 * "/v1/oauth2/token"
	 * 
	 * @param oauthTokenPath
	 *            the URI part to set
	 */
	public static void setOAUTH_TOKEN_PATH(String oauthTokenPath) {
		OAUTH_TOKEN_PATH = oauthTokenPath;
	}
	
	/**
	 * Constructor that takes in Access Token. Only used internally. Please do not use for external integrations.
	 * 
	 * @param accessToken
	 */
	@Deprecated
	OAuthTokenCredential(String accessToken) {
		__accessToken = new AccessToken(accessToken, 1);
	}

	/**
	 * Pass clientId and secret to OAuthTokenCredential. 
	 * 
	 * @param clientID
	 *            Client ID for the OAuth
	 * @param clientSecret
	 *            Client Secret for OAuth
	 */
	public OAuthTokenCredential(String clientID, String clientSecret) {
		super();
		this.clientID = clientID;
		this.clientSecret = clientSecret;
		this.configurationMap = SDKUtil.combineDefaultMap(ConfigManager.getInstance().getConfigurationMap());
		this.sdkVersion = new SDKVersionImpl();
		this.__accessToken = null;
	}

	/**
	 * Configuration Constructor for dynamic configuration
	 * 
	 * @param clientID
	 *            Client ID for the OAuth
	 * @param clientSecret
	 *            Client Secret for OAuth
	 * @param configurationMap
	 *            Dynamic configuration map which should have an entry for
	 *            'oauth.EndPoint' or 'service.EndPoint'. If either are not
	 *            present then there should be entry for 'mode' with values
	 *            sandbox/live, wherein PayPals endpoints are used.
	 */
	public OAuthTokenCredential(String clientID, String clientSecret, Map<String, String> configurationMap) {
		super();
		this.clientID = clientID;
		this.clientSecret = clientSecret;
		this.configurationMap = SDKUtil.combineDefaultMap(configurationMap);
		this.sdkVersion = new SDKVersionImpl();
		this.__accessToken = null;
	}

	/**
	 * Sets refresh token to be used for third party OAuth operations. This is commonly used for 
	 * third party invoicing and future payments. 
	 * This method is for internal use only. Please use {@link APIContext#setRefreshToken(String)} for your integration needs.
	 * 
	 * @param refreshToken
	 * @return {@link OAuthTokenCredential}
	 */
	synchronized OAuthTokenCredential setRefreshToken(String refreshToken) {
		if (!this.hasCredentials()) {
			throw new IllegalArgumentException("ClientID and Secret are required. Please use OAuthTokenCredential(String clientID, String clientSecret)");
		}
		this.refreshToken = refreshToken;
		return this;
	}

	/**
	 * Checks if clientID and secret are set.
	 * 
	 * @return {@link Boolean}
	 */
	public boolean hasCredentials() {
		return (this.clientID != null) && (this.clientSecret != null);
	}

	/**
	 * Sets Headers for every calls.
	 * 
	 * @param headers
	 * @return {@link OAuthTokenCredential}
	 */
	public OAuthTokenCredential setHeaders(Map<String, String> headers) {
		this.headers = headers;
		return this;
	}
	
	/**
	 * Adds headers.
	 * 
	 * @param headers
	 * @return {@link OAuthTokenCredential}
	 */
	public OAuthTokenCredential addHeaders(Map<String, String> headers) {
		this.headers.putAll(headers);
		return this;
	}
	
	/**
	 * Adds header to existing list of headers.
	 * 
	 * @param key
	 * @param value
	 * @return {@link OAuthTokenCredential}
	 */
	public OAuthTokenCredential addHeader(String key, String value) {
		this.headers.put(key, value);
		return this;
	}
	
	/**
	 * Returns the list of headers
	 * 
	 * @return {@link Map} of headers
	 */
	public Map<String, String> getHeaders() {
		return this.headers;
	}

	/**
	 * Returns the header value
	 *
	 * @return {@link String} value of header
	 */
	public String getHeader(String key) {
		return this.headers.get(key);
	}

	/**
	 * Computes Access Token by placing a call to OAuth server using ClientID
	 * and ClientSecret. The token is appended to the token type (Bearer).
	 *
	 * @return the accessToken
	 * @throws PayPalRESTException
	 */
	public String getAccessToken() throws PayPalRESTException {
		if (__accessToken != null) {
			return __accessToken.getAccessToken();
		}
		synchronized (ACCESS_TOKENS) {
			if (isRegenerationRequired()) {
				generateAccessToken();
			}
			return ACCESS_TOKENS.get(getCacheTokenKey()).getAccessToken();
		}
	}

	/**
	 * Checks if the access token is expired or null.
	 *
	 * @return true if expired or null, and can be regenerated.
	 * false otherwise
	 */
	private boolean isRegenerationRequired() {
		AccessToken token = ACCESS_TOKENS.get(getCacheTokenKey());
		if (token == null) {
			return hasCredentials();
		} else {
			return (token.getAccessToken() == null || (hasCredentials() && token.expiresIn() <= 0));
		}
	}

	/**
	 * Computes Access Token by doing a Base64 encoding on the ClientID and
	 * ClientSecret. The token is appended to the String "Basic ".
	 * 
	 * @return the accessToken
	 * @throws PayPalRESTException
	 */
	public String getAuthorizationHeader() throws PayPalRESTException {
		String base64EncodedString = generateBase64String(clientID + ":" + clientSecret);
		return "Basic " + base64EncodedString;
	}
	
	/**
	 * Returns clientID
	 * 
	 * @return {@link String} containing clientID
	 */
	public String getClientID() {
		return this.clientID;
	}

	/**
	 * Returns clientSecret
	 * 
	 * @return {@link String} containing clientSecret
	 */
	public String getClientSecret() {
		return this.clientSecret;
	}

	/**
	 * Specifies how long this token can be used for placing API calls. The
	 * remaining lifetime is given in seconds.
	 *
	 * @return remaining lifetime of this access token in seconds
	 */
	public long expiresIn() {
		AccessToken token = ACCESS_TOKENS.get(getCacheTokenKey());
		return token != null ? token.getExpires() : -1;
	}

	/**
	 * Adds configuration to list of configurations.
	 * 
	 * @param key
	 * @param value
	 * @return {@link OAuthTokenCredential}
	 */
	public OAuthTokenCredential addConfiguration(String key, String value) {
		if (this.configurationMap == null) {
			this.configurationMap = new HashMap<String, String>();
		}
		this.configurationMap.put(key, value);
		return this;
	}
	
	/**
	 * Adds configurations to list of configurations.
	 * @param configurations
	 * @return {@link OAuthTokenCredential}
	 */
	public OAuthTokenCredential addConfigurations(Map<String, String> configurations) {
		if (this.configurationMap == null) {
			this.configurationMap = new HashMap<String, String>();
		}
		this.configurationMap.putAll(configurations);
		return this;
	}
	
	/**
	 * Replaces existing configurations with provided map of configurations.
	 * 
	 * @param configurations
	 * @return {@link OAuthTokenCredential}
	 */
	public OAuthTokenCredential setConfigurations(Map<String, String> configurations) {
		this.configurationMap = configurations;
		return this;
	}
	
	/**
	 * Returns list of configurations.
	 * 
	 * @return {@link Map} of configurations
	 */
	public Map<String, String> getConfigurations() {
		return this.configurationMap;
	}
	
	/**
	 * Returns specific configuration.
	 * 
	 * @param key
	 * @return {@link String} value of configuration
	 */
	public String getConfiguration(String key) {
		if (this.configurationMap != null) {
			return this.configurationMap.get(key);
		}
		return null;
	}

	private synchronized void generateAccessToken() throws PayPalRESTException {
		HttpConnection connection;
		HttpConfiguration httpConfiguration;
		String base64ClientID = generateBase64String(clientID + ":" + clientSecret);
		try {
			connection = ConnectionManager.getInstance().getConnection();
			httpConfiguration = getOAuthHttpConfiguration();
			connection.createAndconfigureHttpConnection(httpConfiguration);
			this.headers.put(Constants.AUTHORIZATION_HEADER, "Basic " + base64ClientID);

			// Accept only json output
			this.headers.put(Constants.HTTP_ACCEPT_HEADER, Constants.HTTP_CONTENT_TYPE_JSON);
			this.headers.put(Constants.HTTP_CONTENT_TYPE_HEADER, Constants.HTTP_CONFIG_DEFAULT_CONTENT_TYPE);
			UserAgentHeader userAgentHeader = new UserAgentHeader(sdkVersion != null ? sdkVersion.getSDKId() : null,
					sdkVersion != null ? sdkVersion.getSDKVersion() : null);
			this.headers.putAll(userAgentHeader.getHeader());
			String postRequest = getRequestPayload();

			// log request
			String mode = configurationMap.get(Constants.MODE);
			if (Constants.LIVE.equalsIgnoreCase(mode) && log.isDebugEnabled()) {
				log.warn("Log level cannot be set to DEBUG in " + Constants.LIVE
						+ " mode. Skipping request/response logging...");
			}
			if (!Constants.LIVE.equalsIgnoreCase(mode)) {
				log.debug("request header: " + this.headers.toString());
				log.debug("request body: " + postRequest);
			}

			// send request and get & log response
			String jsonResponse = connection.execute("", postRequest, this.headers);
			if (!Constants.LIVE.equalsIgnoreCase(mode)) {
				log.debug("response header: " + connection.getResponseHeaderMap().toString());
				log.debug("response: " + jsonResponse);
			}

			// parse response as JSON object
			JsonParser parser = new JsonParser();
			JsonElement jsonElement = parser.parse(jsonResponse);
			String accessToken = jsonElement.getAsJsonObject().get("token_type").getAsString() + " "
					+ jsonElement.getAsJsonObject().get("access_token").getAsString();
			// Save expiry date
			long tokenLifeTime = jsonElement.getAsJsonObject().get("expires_in").getAsLong();
			long expires = new Date().getTime() / 1000 + tokenLifeTime;
			ACCESS_TOKENS.put(getCacheTokenKey(), new AccessToken(accessToken, expires));
		} catch (ClientActionRequiredException e) {
			throw PayPalRESTException.createFromHttpErrorException(e);
		} catch (HttpErrorException e) {
			throw PayPalRESTException.createFromHttpErrorException(e);
		} catch (Exception e) {
			throw new PayPalRESTException(e.getMessage(), e);
		} finally {
			// Replace the headers back to JSON for any future use.
			this.headers.put(Constants.HTTP_CONTENT_TYPE_HEADER, Constants.HTTP_CONTENT_TYPE_JSON);
		}
	}

	private String getCacheTokenKey() {
		return clientID + ":" + clientSecret + ":" + refreshToken;
	}

	/*
	 * Generate a Base64 encoded String from clientID & clientSecret
	 */
	private String generateBase64String(String clientCredentials) throws PayPalRESTException {
		String base64ClientID = null;
		byte[] encoded = null;
		try {
			encoded = Base64.encodeBase64(clientCredentials.getBytes("UTF-8"));
			base64ClientID = new String(encoded, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			throw new PayPalRESTException(e.getMessage(), e);
		}
		return base64ClientID;
	}

	/**
	 * Returns the request payload for OAuth Service. Override this method to
	 * alter the payload
	 * 
	 * @return Payload as String
	 */
	protected String getRequestPayload() {
		if (this.refreshToken != null) {
			return String.format("grant_type=refresh_token&refresh_token=%s", this.refreshToken);
		} else {
			return "grant_type=client_credentials";
		}
	}

	/*
	 * Get HttpConfiguration object for OAuth server
	 */
	protected HttpConfiguration getOAuthHttpConfiguration() throws MalformedURLException {
		HttpConfiguration httpConfiguration = new HttpConfiguration();
		httpConfiguration
				.setHttpMethod(Constants.HTTP_CONFIG_DEFAULT_HTTP_METHOD);
		
		/*
		 * Check for property 'mode' property in the configuration, if not
		 * found, check for 'oauth.EndPoint' property in the configuration and default
		 * endpoint to PayPal sandbox or live endpoints. Throw exception if the
		 * above rules fail
		 */
		String mode = this.configurationMap.get(Constants.MODE);
		// Default to Endpoint param.
		String endPointUrl = this.configurationMap.get(Constants.OAUTH_ENDPOINT);
		if (endPointUrl == null || endPointUrl.trim().isEmpty()) {
			if (Constants.SANDBOX.equalsIgnoreCase(mode)) {
				endPointUrl = Constants.REST_SANDBOX_ENDPOINT;
			} else if (Constants.LIVE.equalsIgnoreCase(mode)) {
				endPointUrl = Constants.REST_LIVE_ENDPOINT;
			} else if (endPointUrl == null || endPointUrl.length() <= 0) {
				// Default to Normal endpoint
				endPointUrl = this.configurationMap.get(Constants.ENDPOINT);
			}
		}
		// If none of the option works, throw exception.
		if (endPointUrl == null || endPointUrl.length() <= 0) {
			throw new MalformedURLException(
					"oauth.Endpoint, mode or service.EndPoint not set not configured to sandbox/live ");
		}
		
		if (Boolean
				.parseBoolean(configurationMap.get(Constants.USE_HTTP_PROXY))) {
			httpConfiguration.setProxySet(true);
			httpConfiguration.setProxyHost(configurationMap
					.get(Constants.HTTP_PROXY_HOST));
			httpConfiguration.setProxyPort(Integer.parseInt(configurationMap
					.get(Constants.HTTP_PROXY_PORT)));

			String proxyUserName = configurationMap
					.get(Constants.HTTP_PROXY_USERNAME);
			String proxyPassword = configurationMap
					.get(Constants.HTTP_PROXY_PASSWORD);

			if (proxyUserName != null && proxyPassword != null) {
				httpConfiguration.setProxyUserName(proxyUserName);
				httpConfiguration.setProxyPassword(proxyPassword);
			}
		}
		endPointUrl = (endPointUrl.endsWith("/")) ? endPointUrl.substring(0,
				endPointUrl.length() - 1) : endPointUrl;
		endPointUrl += OAUTH_TOKEN_PATH;
		httpConfiguration.setEndPointUrl(endPointUrl);
		httpConfiguration
				.setGoogleAppEngine(Boolean.parseBoolean(configurationMap
						.get(Constants.GOOGLE_APP_ENGINE)));
		return httpConfiguration;
	}

}
