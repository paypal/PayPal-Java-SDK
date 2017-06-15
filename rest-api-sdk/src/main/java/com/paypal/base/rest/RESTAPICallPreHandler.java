package com.paypal.base.rest;

import com.paypal.base.APICallPreHandler;
import com.paypal.base.Constants;
import com.paypal.base.SDKUtil;
import com.paypal.base.SDKVersion;
import com.paypal.base.codec.binary.Base64;
import com.paypal.base.exception.ClientActionRequiredException;
import com.paypal.base.util.UserAgentHeader;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * RESTApiCallPreHandler acts as a {@link APICallPreHandler} for REST API calls.
 * The implementation is PayPal specific, To do custom implementation override
 * the protected methods
 */
public class RESTAPICallPreHandler implements APICallPreHandler {

	/*
	 * RESTApiCallPreHandler requires a configuration system to function
	 * properly. The configuration is initialized to default in PayPalResource
	 * class if no configuration methods initConfig(..) was attempted before
	 * making the API call. The users can override this default file
	 * 'sdk_config.properties' by choosing different version of
	 * initConfi(...) and passing their custom configuration.
	 * Initializing to default means the system looks for a file specifically
	 * named 'sdk_config.properties' in the classpath and reads the
	 * configuration from there. 'Dynamic Configuration' enables the users to
	 * pass custom configuration (per call basis) as a Map object to override
	 * the default behavior for the system to function. For Dynamic
	 * configuration to take effect create a Map of custom configuration and set
	 * it in APIContext object, choose the overloaded method of the Resource
	 * class that takes APIContext object as a parameter and pass the APIContext
	 * object.
	 */
	/**
	 * Configuration Map used for dynamic configuration
	 */
	private Map<String, String> configurationMap = null;

	/**
	 * Base URL for the service
	 */
	private URL url;

	/**
	 * Authorization token
	 */
	private String authorizationToken;

	/**
	 * Resource URI as defined in the WSDL
	 */
	private String resourcePath;

	/**
	 * Request Id
	 */
	private String requestId;

	/**
	 * Custom headers Map
	 */
	private Map<String, String> headersMap;

	/**
	 * Request Payload
	 */
	private String payLoad;

	/**
	 * {@link SDKVersion} instance
	 */
	private SDKVersion sdkVersion;

	/**
	 * Constructor using configurations dynamically
	 * 
	 * @param configurationMap
	 *            Map used for dynamic configuration
	 */
	public RESTAPICallPreHandler(Map<String, String> configurationMap) {
		this.configurationMap = SDKUtil.combineDefaultMap(configurationMap);
	}

	/**
	 * Constructor using a Map of headers for forming custom headers
	 * 
	 * @param configurationMap
	 *            Map used for dynamic configuration
	 * @param headersMap
	 *            Headers Map
	 */
	public RESTAPICallPreHandler(Map<String, String> configurationMap,
			Map<String, String> headersMap) {
		this(configurationMap);
		this.headersMap = (headersMap == null) ? Collections
				.<String, String> emptyMap() : headersMap;
	}

	/**
	 * @param authorizationToken
	 *            the authorizationToken to set
	 */
	public void setAuthorizationToken(String authorizationToken) {
		this.authorizationToken = authorizationToken;
	}

	/**
	 * @param resourcePath
	 *            the resourcePath to set
	 */
	public void setResourcePath(String resourcePath) {
		this.resourcePath = resourcePath;
	}

	/**
	 * @param requestId
	 *            the requestId to set
	 */
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	/**
	 * @param payLoad
	 *            the payLoad to set
	 */
	public void setPayLoad(String payLoad) {
		this.payLoad = payLoad;
	}

	/**
	 * @param sdkVersion
	 *            the sdkVersion to set
	 */
	public void setSdkVersion(SDKVersion sdkVersion) {
		this.sdkVersion = sdkVersion;
	}

	/**
	 * Returns HTTP headers as a {@link Map}
	 * 
	 * @return {@link Map} of Http headers
	 */
	public Map<String, String> getHeaderMap() {
		return getProcessedHeaderMap();
	}

	public String getPayLoad() {
		return getProcessedPayLoad();
	}

	public String getEndPoint() {
		/*
		 * Process the EndPoint to append the resourcePath sent as a part of the
		 * method call with the base endPoint retrieved from configuration
		 * system
		 */
		String endPoint = null;
		try {
			endPoint = getBaseURL().toURI().resolve(resourcePath).toString();
		} catch (MalformedURLException e) {
			//
		} catch (URISyntaxException e) {
			//
		}
		return endPoint;
	}

	public OAuthTokenCredential getCredential() {
		return null;
	}

	public void validate() throws ClientActionRequiredException {
		// TODO
	}

	/**
	 * Returns the base URL configured in application resources or {@link Map}
	 * passed for dynamic configuration
	 * 
	 * @return BaseUrl ending with a '/' character {@link URL}
	 * @throws MalformedURLException
	 *             if endpoint cannot be found or formed
	 */
	public URL getBaseURL() throws MalformedURLException {

		/*
		 * Check for property 'mode' property in the configuration, if not
		 * found, check for 'service.EndPoint' property in the configuration and default
		 * endpoint to PayPal sandbox or live endpoints. Throw exception if the
		 * above rules fail
		 */
		if (url == null) {
			String mode = this.configurationMap.get(Constants.MODE);
			// Default to Endpoint param.
			String urlString = this.configurationMap.get(Constants.ENDPOINT);
			if (urlString == null || urlString.trim().isEmpty()) {
				if (Constants.SANDBOX.equalsIgnoreCase(mode)) {
					urlString = Constants.REST_SANDBOX_ENDPOINT;
				} else if (Constants.LIVE.equalsIgnoreCase(mode)) {
					urlString = Constants.REST_LIVE_ENDPOINT;
				} else if (urlString == null || urlString.length() <= 0) {
					throw new MalformedURLException(
							"service.EndPoint not set (OR) mode not configured to sandbox/live ");
				}
			}
			if (!urlString.endsWith("/")) {
				urlString += "/";
			}
			url = new URL(urlString);
		}
		return url;
	}

	/**
	 * @param urlString
	 *            the url to set
	 */
	public void setUrl(String urlString) throws MalformedURLException {
		if (urlString != null && urlString.length() > 0) {
			String uString = urlString.endsWith("/") ? urlString : urlString
					+ "/";
			this.url = new URL(uString);
		} else {
			this.url = getBaseURL();
		}
	}

	/**
	 * Returns User-Agent header
	 * 
	 * @return {@link Map} storing the User-Agent header
	 */
	protected Map<String, String> formUserAgentHeader() {
		UserAgentHeader userAgentHeader = new UserAgentHeader(
				sdkVersion != null ? sdkVersion.getSDKId() : null,
				sdkVersion != null ? sdkVersion.getSDKVersion() : null);
		return userAgentHeader.getHeader();
	}

	/*
	 * Return Client ID from configuration Map
	 */
	private String getClientID() {
		return this.configurationMap.get(Constants.CLIENT_ID);
	}

	/*
	 * Returns Client Secret from configuration Map
	 */
	private String getClientSecret() {
		return this.configurationMap.get(Constants.CLIENT_SECRET);
	}

	/*
	 * Encodes Client ID and Client Secret in Base 64
	 */
	private String encodeToBase64(String clientID, String clientSecret)
			throws UnsupportedEncodingException {
		String base64ClientID = generateBase64String(clientID + ":"
				+ clientSecret);
		return base64ClientID;
	}

	/*
	 * Generate a Base64 encoded String from clientID & clientSecret
	 */
	private String generateBase64String(String clientID)
			throws UnsupportedEncodingException {
		String base64ClientID = null;
		byte[] encoded = null;
		encoded = Base64.encodeBase64(clientID.getBytes("UTF-8"));
		base64ClientID = new String(encoded, "UTF-8");
		return base64ClientID;
	}

	/**
	 * Override this method to return a {@link Map} of HTTP headers
	 * 
	 * @return {@link Map} of HTTP headers
	 */
	protected Map<String, String> getProcessedHeaderMap() {

		/*
		 * The implementation is PayPal specific. The Authorization header is
		 * formed for OAuth or Basic, for OAuth system the authorization token
		 * passed as a parameter is used in creation of HTTP header, for Basic
		 * Authorization the ClientID and ClientSecret passed as parameters are
		 * used after a Base64 encoding.
		 */
		Map<String, String> headers = new HashMap<String, String>();
		// Add any custom headers
		if (headersMap != null && headersMap.size() > 0) {
			headers.putAll(headersMap);
		}
		
		if (authorizationToken != null
				&& authorizationToken.trim().length() > 0) {
			headers.put(Constants.AUTHORIZATION_HEADER, authorizationToken);
		} else if (getClientID() != null && getClientID().trim().length() > 0
				&& getClientSecret() != null
				&& getClientSecret().trim().length() > 0) {
			try {
				headers.put(Constants.AUTHORIZATION_HEADER, "Basic "
						+ encodeToBase64(getClientID(), getClientSecret()));
			} catch (UnsupportedEncodingException e) {
				// TODO
			}
		}

		/*
		 * Appends request Id which is used by PayPal API service for
		 * Idempotency
		 */
		if (requestId != null && requestId.length() > 0) {
			headers.put(Constants.PAYPAL_REQUEST_ID_HEADER, requestId);
		}

		/*
		 * Add User-Agent header for tracking in PayPal system
		 */
		headers.putAll(formUserAgentHeader());

		// Add application/json as the default Content-Type
		// backward compatibility for PayPal rest sdks which
		// does not add Content-Type HTTP header in the sdk
		// stubs
		if (!headers.containsKey(Constants.HTTP_CONTENT_TYPE_HEADER)) {
			headers.put(Constants.HTTP_CONTENT_TYPE_HEADER,
					Constants.HTTP_CONTENT_TYPE_JSON);
		}
		return headers;
	}

	/**
	 * Override this method to process payload for processing
	 * 
	 * @return PayLoad as String
	 */
	protected String getProcessedPayLoad() {
		/*
		 * Since the REST API of PayPal depends on json, which is well formed,
		 * no additional processing is required.
		 */
		return payLoad;
	}
	
	/**
	 * Return configurationMap
	 * 
	 * @return configurationMap in this call pre-handler
	 */
	public Map<String, String> getConfigurationMap() {
		return this.configurationMap;
	}

}
