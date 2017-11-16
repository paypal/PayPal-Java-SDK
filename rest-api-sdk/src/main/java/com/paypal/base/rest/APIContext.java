package com.paypal.base.rest;

import com.paypal.base.Constants;
import com.paypal.base.SDKVersion;

import java.util.Map;
import java.util.UUID;

/**
 * <code>APIContext</code> wraps wire-level parameters for the API call.
 * AccessToken, which is essentially an OAuth token, is treated as a mandatory
 * parameter for (PayPal REST APIs). RequestId is generated if not supplied for
 * marking Idempotency of the API call. OAuth token can be generated using
 * {@link OAuthTokenCredential}. The Application Header property may be used by
 * clients to access application level headers. The clients are responsible to
 * cast the Application Header property to appropriate type.
 */
public class APIContext {

	/**
	 * Request Id
	 */
	private String requestId;

	/**
	 * Parameter to mask RequestId
	 */
	private boolean maskRequestId;

	/**
	 * Determine if a method was called that set the request ID.
	 */
	private boolean isRequestIdSet = false;

	/**
	 * {@link SDKVersion} instance
	 */
	private SDKVersion sdkVersion;

	/**
	 * {@link OAuthTokenCredential} credential instance
	 */
	private OAuthTokenCredential credential;

	/**
	 * Default Constructor
	 * @deprecated Please use {@link #APIContext(String, String, String)} instead.
	 * APIContext ideally needs more information than just accessToken to operate correctly. Now, you do not need
	 * to fetch accessToken from {@link OAuthTokenCredential} separately. Instead, just initialize {@link APIContext} with
	 * clientId, clientSecret and mode, with optional configurations, as shown below, and pass the context to paypal API methods:
	 * <pre>
	 * {@code
	 * APIContext context = new APIContext(clientId, clientSecret, "sandbox");
	 * }
	 * </pre>
	 */
	public APIContext() {
		super();
		this.credential = new OAuthTokenCredential(null);
	}

	/**
	 * Pass the clientID, secret and mode. The easiest, and most widely used
	 * option.
	 *
	 * @param clientID
	 * @param clientSecret
	 * @param mode
	 */
	public APIContext(String clientID, String clientSecret, String mode) {
		this(clientID, clientSecret, mode, null);
	}

	/**
	 * Pass the clientID, secret and mode along with additional configurations.
	 *
	 * @param clientID
	 * @param clientSecret
	 * @param mode
	 * @param configurations
	 */
	public APIContext(String clientID, String clientSecret, String mode, Map<String, String> configurations) {
		this.credential = new OAuthTokenCredential(clientID, clientSecret);
		if (configurations != null && configurations.size() > 0) {
			this.credential.addConfigurations(configurations);
		}
		this.setMode(mode);
	}

	/**
	 * @deprecated Please use {@link #APIContext(String, String, String)} instead.
	 * APIContext ideally needs more information than just accessToken to operate correctly. Now, you do not need
	 * to fetch accessToken from {@link OAuthTokenCredential} separately. Instead, just initialize {@link APIContext} with
	 * clientId, clientSecret and mode, with optional configurations, as shown below, and pass the context to paypal API methods:
	 * <pre>
	 * {@code
	 * APIContext context = new APIContext(clientId, clientSecret, "sandbox");
	 * }
	 * </pre>
	 *
	 * @param accessToken
	 *            OAuthToken required for the call. OAuth token used by the REST
	 *            API service. The token should be of the form 'Bearer xxxx..'.
	 *            See {@link OAuthTokenCredential} to generate OAuthToken
	 */
	public APIContext(String accessToken) {
		super();
		if (accessToken == null || accessToken.length() <= 0) {
			throw new IllegalArgumentException("AccessToken cannot be null");
		}
		this.credential = new OAuthTokenCredential(accessToken);
	}

	/**
	 * @deprecated Please use {@link #APIContext(String, String, String)} instead.
	 * APIContext ideally needs more information than just accessToken to operate correctly. Now, you do not need
	 * to fetch accessToken from {@link OAuthTokenCredential} separately. Instead, just initialize {@link APIContext} with
	 * clientId, clientSecret and mode, with optional configurations, as shown below, and pass the context to paypal API methods:
	 * <pre>
	 * {@code
	 * APIContext context = new APIContext(clientId, clientSecret, "sandbox");
	 * }
	 * </pre>
	 *
	 * @param accessToken
	 *            OAuthToken required for the call. OAuth token used by the REST
	 *            API service. The token should be of the form 'Bearer xxxx..'.
	 *            See {@link OAuthTokenCredential} to generate OAuthToken
	 * @param requestId
	 *            Unique requestId required for the call. The requestId is an idempotency id used by some PayPal services.
	 */
	public APIContext(String accessToken, String requestId) {
		this(accessToken);
		if (requestId == null || requestId.length() <= 0) {
			throw new IllegalArgumentException("RequestId cannot be null");
		}
		this.requestId = requestId;
	}

	/**
	 * Sets refresh token to be used for third party OAuth operations. This is commonly used for
	 * third party invoicing and future payments.
	 *
	 * @param refreshToken
	 * @return {@link APIContext}
	 */
	public APIContext setRefreshToken(String refreshToken) {
		if (this.credential != null && this.credential.hasCredentials()) {
			this.credential.setRefreshToken(refreshToken);
		} else {
			throw new IllegalArgumentException(
					"ClientID and Secret are required. Please use APIContext(String clientID, String clientSecret, String mode)");
		}
		return this;
	}

	/**
	 * Sets mode to either `live` or `sandbox`.
	 * @param mode
	 * @return {@link APIContext}
	 */
	public APIContext setMode(String mode) {
		if (mode == null || !(mode.equals(Constants.LIVE) || mode.equals(Constants.SANDBOX))) {
			throw new IllegalArgumentException("Mode needs to be either `sandbox` or `live`.");
		}
		this.credential.addConfiguration(Constants.MODE, mode);
		return this;
	}

	/**
	 * Enables settings for Google App Engine. Please set to `true` if using SDK in Google App Engine.
	 *
	 * @param usingGoogleAppEngine
	 * @return {@link APIContext}
	 */
	public APIContext usingGoogleAppEngine(boolean usingGoogleAppEngine) {
		return this.addConfiguration(Constants.GOOGLE_APP_ENGINE, String.valueOf(usingGoogleAppEngine));
	}

	/**
	 * Returns HTTP Headers.
	 *
	 * @return the hTTPHeaders
	 */
	public Map<String, String> getHTTPHeaders() {
		return this.credential.getHeaders();
	}


	public String getHTTPHeader(String key) {
		return this.credential.getHeader(key);
	}
	/**
	 * Replaces existing headers with provided one.
	 *
	 * @param httpHeaders
	 *            the httpHeaders to set
	 */
	public APIContext setHTTPHeaders(Map<String, String> httpHeaders) {
		this.credential.setHeaders(httpHeaders);
		return this;
	}

	/**
	 * Adds HTTP Headers to existing list
	 *
	 * @param httpHeaders
	 *            the httpHeaders to set
	 */
	public APIContext addHTTPHeaders(Map<String, String> httpHeaders) {
		this.credential.addHeaders(httpHeaders);
		return this;
	}


	/**
	 * Adds HTTP Header to existing list
	 *
	 * @param key
	 * @param value
	 */
	public APIContext addHTTPHeader(String key, String value) {
		this.credential.addHeader(key, value);
		return this;
	}

	/**
	 * Returns Configuration Map
	 *
	 * @return {@link Map} of configurations
	 */
	public Map<String, String> getConfigurationMap() {
		return this.credential.getConfigurations();
	}

	/**
	 * Replaces the existing configurations with provided one
	 *
	 * @param configurationMap
	 *            the configurationMap to set
	 * @return {@link APIContext}
	 */
	public APIContext setConfigurationMap(Map<String, String> configurationMap) {
		this.credential.setConfigurations(configurationMap);
		return this;
	}

	/**
	 * Adds configurations
	 *
	 * @param configurations {@link Map} of configurations.
	 * @return {@link APIContext}
	 */
	public APIContext addConfigurations(Map<String, String> configurations) {
		this.credential.addConfigurations(configurations);
		return this;
	}

	/**
	 * Adds configuration
	 *
	 * @param key key
	 * @param value value
	 * @return {@link APIContext}
	 */
	public APIContext addConfiguration(String key, String value) {
		this.credential.addConfiguration(key, value);
		return this;
	}

	/**
	 * Returns string value of specific configuration.
	 *
	 * @param key key
	 * @return {@link String} value of specific configuration.
	 */
	public String getConfiguration(String key) {
		return this.credential.getConfiguration(key);
	}

	/**
	 * @deprecated Please use {@link #fetchAccessToken()} instead.
	 * Previously, this was a dumb getter method. However, we enabled the feature to re-generate the access Token if null, or expired.
	 * This required us to throw proper PayPalRESTException, with error information on failure.
	 *
	 * @return Access Token
	 */
	public String getAccessToken() {
		try {
			return fetchAccessToken();
		} catch (PayPalRESTException ex) {
			// we should be throwing proper exception here.
			return null;
		}
	}

	/**
	 * Returns the access Token. Regenerates if null or expired.
	 *
	 * @return {@link String} of AccessToken
	 * @throws PayPalRESTException
	 */
	public String fetchAccessToken() throws PayPalRESTException {
		if (this.credential != null) {
			return this.credential.getAccessToken();
		}
		return null;
	}

	/**
	 * Returns the unique requestId set during creation. If there is not an existing value,
	 * sets and returns a generated one
	 *
	 * @return requestId
	 */
	public String getRequestId() {
		String reqId = null;
		if (!maskRequestId) {
			if (requestId == null || requestId.length() <= 0) {
				requestId = UUID.randomUUID().toString();
				isRequestIdSet = true;
			}
			reqId = requestId;
		}
		return reqId;
	}

	/**
	 * Sets the requestId to be sent on each request. Used for idempotency purposes.
	 *
	 * @param requestId request Id
	 * @return APIContext
	 */
	public APIContext setRequestId(String requestId) {
		this.requestId = requestId;
		isRequestIdSet = true;
		return this;
	}

	/**
	 * @deprecated Set the request ID to null instead.
	 * @param maskRequestId
	 *            the maskRequestId to set
	 */
	public void setMaskRequestId(boolean maskRequestId) {
		this.maskRequestId = maskRequestId;
	}

	/**
	 * Determine if the request ID was set either manually or automatically.
	 *
	 * @return true if the request ID was set, false otherwise
	 */
	public boolean isRequestIdSet() {
		return isRequestIdSet;
	}

	/**
	 * @return the sdkVersion
	 */
	public SDKVersion getSdkVersion() {
		return sdkVersion;
	}

	/**
	 * @param sdkVersion
	 *            the sdkVersion to set
	 */
	public void setSdkVersion(SDKVersion sdkVersion) {
		this.sdkVersion = sdkVersion;
	}

	/**
	 * @deprecated Use getHTTPHeaders() instead
	 * @return the headersMap
	 */
	public Map<String, String> getHeadersMap() {
		return this.getHTTPHeaders();
	}

	/**
	 * @deprecated Please use {@link #setHTTPHeaders(Map)} or {@link #addHTTPHeaders(Map)} instead.
	 *
	 * @param headersMap
	 *            the headersMap to set
	 */
	public void setHeadersMap(Map<String, String> headersMap) {
		this.setHTTPHeaders(headersMap);
	}

	public String getClientID() {
		if (this.credential == null) {
			throw new IllegalArgumentException(
					"ClientID and Secret are required. Please use APIContext(String clientID, String clientSecret, String mode)");
		}
		return this.credential.getClientID();
	}

	public String getClientSecret() {
		if (this.credential == null) {
			throw new IllegalArgumentException(
					"ClientID and Secret are required. Please use APIContext(String clientID, String clientSecret, String mode)");
		}
		return this.credential.getClientSecret();
	}
}
