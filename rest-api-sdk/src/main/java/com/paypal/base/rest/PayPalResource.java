package com.paypal.base.rest;

import com.paypal.base.*;
import com.paypal.base.exception.BaseException;
import com.paypal.base.exception.ClientActionRequiredException;
import com.paypal.base.exception.HttpErrorException;
import com.paypal.base.sdk.info.SDKVersionImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * PayPalResource acts as a base class for REST enabled resources.
 */
public abstract class PayPalResource extends PayPalModel{

	private static final Logger log = LoggerFactory.getLogger(PayPalResource.class);
	
	/*
	 * The class relies on an implementation of APICallPreHandler (here
	 * RESTAPICallPreHandler)to get access to endpoint, HTTP headers, and
	 * payload.
	 */
	/**
	 * Map used in dynamic configuration
	 */
	private static Map<String, String> configurationMap;

	/**
	 * Configuration enabled flag
	 */
	private static boolean configInitialized = false;

	/**
	 * Last request sent to Service
	 */
	private static final ThreadLocal<String> LASTREQUEST = new ThreadLocal<String>();

	/**
	 * Last response returned form Service
	 */
	private static final ThreadLocal<String> LASTRESPONSE = new ThreadLocal<String>();

	/**
	 * Initialize the system using a File(Properties file). The system is
	 * initialized using the given file and if the initialization succeeds the
	 * default 'sdk_config.properties' can only be loaded by calling the method
	 * initializeToDefault()
	 * 
	 * @param file
	 *            File object of a properties entity
	 * @throws PayPalRESTException
	 * @return	OAuthTokenCredential instance with client ID and client secret stored in configuration file.
	 */
	public static OAuthTokenCredential initConfig(File file) throws PayPalRESTException {
		try {
			if (!file.exists()) {
				throw new FileNotFoundException("File doesn't exist: "
						+ file.getAbsolutePath());
			}
			FileInputStream fis = new FileInputStream(file);
			return initConfig(fis);
		} catch (IOException ioe) {
			log.error(ioe.getMessage(), ioe);
			throw new PayPalRESTException(ioe.getMessage(), ioe);
		}

	}

	/**
	 * Initialize using Properties. The system is initialized using the given
	 * properties object and if the initialization succeeds the default
	 * 'sdk_config.properties' can only be loaded by calling the method
	 * initializeToDefault()
	 * 
	 * @param properties
	 *            Properties object
	 * @return	OAuthTokenCredential instance with client ID and client secret in given properties.
	 */
	public static OAuthTokenCredential initConfig(Properties properties) {
		configurationMap = SDKUtil.constructMap(properties);
		configInitialized = true;
		return getOAuthTokenCredential();
	}

	/**
	 * Initialize using {@link InputStream}(of a Properties file).. The system
	 * is initialized using the given {@link InputStream} and if the
	 * initialization succeeds the default 'sdk_config.properties' can only be
	 * loaded by calling the method initializeToDefault(). The system is
	 * initialized with the information after loading defaults for the
	 * parameters that are not passed as part of the configuration. For defaults
	 * see {@link ConfigManager}
	 * 
	 * @param inputStream
	 *            InputStream
	 * @throws PayPalRESTException
	 * @return	OAuthTokenCredential instance with client ID and client secret stored in given inputStream.
	 */
	public static OAuthTokenCredential initConfig(InputStream inputStream)
			throws PayPalRESTException {
		try {
			Properties properties = new Properties();
			properties.load(inputStream);

			/*
			 * Create a Map instance and combine it with default values
			 */
			configurationMap = SDKUtil.constructMap(properties);
			configInitialized = true;
			return getOAuthTokenCredential();
		} catch (IOException ioe) {
			log.error(ioe.getMessage(), ioe);
			throw new PayPalRESTException(ioe.getMessage(), ioe);
		}
	}
	
	/**
	 * Return Client ID from configuration Map
	 */
	public static String getClientID() {
		return configurationMap.get(Constants.CLIENT_ID);
	}

	/**
	 * Returns Client Secret from configuration Map
	 */
	public static String getClientSecret() {
		return configurationMap.get(Constants.CLIENT_SECRET);
	}
	
	/**
	 * Returns OAuthTokenCredential instance using client ID and client secret loaded from configuration.
	 * @return OAuthTokenCredential instance.
	 */
	public static OAuthTokenCredential getOAuthTokenCredential() {
		if(configInitialized){
			return new OAuthTokenCredential(getClientID(), getClientSecret(), configurationMap);
		}else{
			return new OAuthTokenCredential(getClientID(), getClientSecret());			
		}
	}

	/**
	 * Initialize to default properties
	 * 
	 * @throws PayPalRESTException
	 */
	public static void initializeToDefault() throws PayPalRESTException {
		configurationMap = SDKUtil.combineDefaultMap(ConfigManager
				.getInstance().getConfigurationMap());
	}

	/**
	 * Returns the last request sent to the Service
	 * 
	 * @return Last request sent to the server
	 */
	public static String getLastRequest() {
		return LASTREQUEST.get();
	}

	/**
	 * Returns the last response returned by the Service
	 * 
	 * @return Last response got from the Service
	 */
	public static String getLastResponse() {
		return LASTRESPONSE.get();
	}
	
	public static Map<String, String> getConfigurations() {
		return configurationMap;
	}

	/**
	 * Configures and executes REST call: Supports JSON
	 * 
	 * @deprecated Please use {@link #configureAndExecute(APIContext, HttpMethod, String, String, Class)} instead.
	 * Passing APIContext gives us better information than just raw access token.
	 *
	 * @param <T>
	 *            Response Type for de-serialization
	 * @param accessToken
	 *            OAuth AccessToken to be used for the call.
	 * @param httpMethod
	 *            Http Method verb
	 * @param resourcePath
	 *            Resource URI path
	 * @param payLoad
	 *            Payload to Service
	 * @param clazz
	 *            {@link Class} object used in De-serialization
	 * @return T
	 * @throws PayPalRESTException
	 */
	public static <T> T configureAndExecute(String accessToken,
			HttpMethod httpMethod, String resourcePath, String payLoad,
			Class<T> clazz) throws PayPalRESTException {
		return configureAndExecute(new APIContext(accessToken), httpMethod, resourcePath, payLoad, clazz);
	}

	/**
	 * Configures and executes REST call
	 *
	 * @param <T>
	 *            Response Type for de-serialization
	 * @param apiContext
	 *            {@link APIContext} to be used for the call.
	 * @param httpMethod
	 *            Http Method verb
	 * @param resourcePath
	 *            Resource URI path
	 * @param payLoad
	 *            Payload to Service
	 * @param clazz
	 *            {@link Class} object used in De-serialization
	 * @return T
	 * @throws PayPalRESTException
	 */
	public static <T> T configureAndExecute(APIContext apiContext,
			HttpMethod httpMethod, String resourcePath, String payLoad,
			Class<T> clazz) throws PayPalRESTException {
		return configureAndExecute(apiContext, httpMethod, resourcePath, payLoad, clazz, null);
	}

	/**
	 * Configures and executes REST call: Supports JSON
	 * 
	 * @param <T>
	 *            Response Type for de-serialization
	 * @param apiContext
	 *            {@link APIContext} to be used for the call.
	 * @param httpMethod
	 *            Http Method verb
	 * @param resourcePath
	 *            Resource URI path
	 * @param payLoad
	 *            Payload to Service
	 * @param clazz
	 *            {@link Class} object used in De-serialization
	 * @param accessToken
	 * 			  Access Token to be used instead of apiContext
	 * @return T
	 * @throws PayPalRESTException
	 */
	public static <T> T configureAndExecute(APIContext apiContext,
			HttpMethod httpMethod, String resourcePath, String payLoad,
			Class<T> clazz, String accessToken) throws PayPalRESTException {
		T t = null;
		Map<String, String> cMap;
		String requestId = null;
		Map<String, String> headersMap;
		if (apiContext != null) {
			if (apiContext.getHTTPHeader(Constants.HTTP_CONTENT_TYPE_HEADER) == null) {
				apiContext.addHTTPHeader(Constants.HTTP_CONTENT_TYPE_HEADER, Constants.HTTP_CONTENT_TYPE_JSON);
			}
			if (apiContext.getSdkVersion() != null) {
				apiContext.setSdkVersion(new SDKVersionImpl());
			}

			if (apiContext.getConfigurationMap() != null) {
				cMap = SDKUtil.combineDefaultMap(apiContext
						.getConfigurationMap());
			} else {
				if (!configInitialized) {
					initializeToDefault();
				}

				/*
				 * The Map returned here is already combined with default values
				 */
				cMap = new HashMap<String, String>(
						configurationMap);
			}
			headersMap = apiContext.getHTTPHeaders();
			if (accessToken == null) {
				accessToken = apiContext.fetchAccessToken();
			}
			// If it is still null, throw the exception.
			if (accessToken == null) {
				throw new IllegalArgumentException("AccessToken cannot be null or empty");
			}
			if (apiContext.isRequestIdSet()) {
				requestId = apiContext.getRequestId();
			}

			APICallPreHandler apiCallPreHandler = createAPICallPreHandler(cMap,
					payLoad, resourcePath, headersMap, accessToken, requestId,
					apiContext.getSdkVersion());
			HttpConfiguration httpConfiguration = createHttpConfiguration(cMap,
					httpMethod, apiCallPreHandler);
			t = execute(apiCallPreHandler, httpConfiguration, clazz);
		}
		return t;
	}

	/**
	 * Configures and executes REST call: Supports JSON
	 *
	 * @deprecated Please use {@link #configureAndExecute(APIContext, HttpMethod, String, String, Class)} instead. Headers could be passed directly
	 * to #APIContext itself.
	 *
	 * @param <T>
	 * @param apiContext
	 *            {@link APIContext} to be used for the call.
	 * @param httpMethod
	 *            Http Method verb
	 * @param resourcePath
	 *            Resource URI path
	 * @param headersMap
	 *            Optional headers Map
	 * @param payLoad
	 *            Payload to Service
	 * @param clazz
	 *            {@link Class} object used in De-serialization
	 * @return T
	 * @throws PayPalRESTException
	 */
	public static <T> T configureAndExecute(APIContext apiContext,
			HttpMethod httpMethod, String resourcePath,
			Map<String, String> headersMap, String payLoad, Class<T> clazz)
			throws PayPalRESTException {
		if (apiContext != null) {
			apiContext.addHTTPHeaders(headersMap);
		}
		return configureAndExecute(apiContext, httpMethod, resourcePath, payLoad, clazz);
	}

	/**
	 * Returns a implementation of {@link APICallPreHandler} for the underlying
	 * layer.
	 * 
	 * @param configurationMap
	 *            configuration Map
	 * @param payLoad
	 *            Raw payload
	 * @param resourcePath
	 *            URI part of the resource operated on
	 * @param headersMap
	 *            Custom HTTP headers map
	 * @param accessToken
	 *            OAuth Token
	 * @param requestId
	 *            PayPal Request Id
	 * @param sdkVersion
	 *            {@link SDKVersion} instance
	 * @return APICallPreHandler
	 */
	public static APICallPreHandler createAPICallPreHandler(
			Map<String, String> configurationMap, String payLoad,
			String resourcePath, Map<String, String> headersMap,
			String accessToken, String requestId, SDKVersion sdkVersion) {
		APICallPreHandler apiCallPreHandler = null;
		RESTAPICallPreHandler restAPICallPreHandler = new RESTAPICallPreHandler(
				configurationMap, headersMap);
		restAPICallPreHandler.setResourcePath(resourcePath);
		restAPICallPreHandler.setRequestId(requestId);
		restAPICallPreHandler.setAuthorizationToken(accessToken);
		restAPICallPreHandler.setPayLoad(payLoad);
		restAPICallPreHandler.setSdkVersion(sdkVersion);
		apiCallPreHandler = restAPICallPreHandler;
		return apiCallPreHandler;
	}

	/**
	 * Execute the API call and return response
	 * 
	 * @param <T>
	 *            Generic Type for response object construction
	 * @param apiCallPreHandler
	 *            Implementation of {@link APICallPreHandler}
	 * @param httpConfiguration
	 *            {@link HttpConfiguration}
	 * @param clazz
	 *            Response Object class
	 * @return Response Type
	 * @throws PayPalRESTException
	 */
	private static <T> T execute(APICallPreHandler apiCallPreHandler,
			HttpConfiguration httpConfiguration, Class<T> clazz)
			throws PayPalRESTException {
		T t = null;
		ConnectionManager connectionManager;
		HttpConnection httpConnection;
		Map<String, String> headers;
		String responseString;
		try {

			// REST Headers
			headers = apiCallPreHandler.getHeaderMap();

			// HttpConnection Initialization
			connectionManager = ConnectionManager.getInstance();
			httpConnection = connectionManager.getConnection(httpConfiguration);
			httpConnection.createAndconfigureHttpConnection(httpConfiguration);
			
			// capture request and log if conditions are met
			LASTREQUEST.set(apiCallPreHandler.getPayLoad());
			String mode = "";
			if (configurationMap != null) {
				mode = configurationMap.get(Constants.MODE);
			} else if (apiCallPreHandler.getConfigurationMap() != null) {
				mode = apiCallPreHandler.getConfigurationMap().get(Constants.MODE);
			}
			if (Constants.LIVE.equalsIgnoreCase(mode) && log.isDebugEnabled()) {
				log.warn("Log level cannot be set to DEBUG in " + Constants.LIVE + " mode. Skipping request/response logging...");
			} 
			if (!Constants.LIVE.equalsIgnoreCase(mode)) {
				log.debug("request header: " + headers.toString());
				log.debug("request body: " + LASTREQUEST.get());
			}
			
			// send request and receive response
			responseString = httpConnection.execute(null,
					apiCallPreHandler.getPayLoad(), headers);
			
			// capture response and log if conditions are met
			LASTRESPONSE.set(responseString);
			if (!Constants.LIVE.equalsIgnoreCase(mode)) {
				log.debug("response: " + LASTRESPONSE.get());
			}
			if (clazz != null) {
				t = JSONFormatter.fromJSON(responseString, clazz);
			}
		} catch (ClientActionRequiredException e) {
			throw PayPalRESTException.createFromHttpErrorException(e);
		} catch (HttpErrorException e) {
			throw PayPalRESTException.createFromHttpErrorException(e);
		} catch (Exception e) {
			throw new PayPalRESTException(e.getMessage(), e);
		}
		return t;
	}

	/**
	 * Utility method that creates a {@link HttpConfiguration} object from the
	 * passed information
	 * 
	 * @param configurationMap
	 *            Configuration to base the construction upon.
	 * @param httpMethod
	 *            HTTP Method
	 * @param apiCallPreHandler
	 *            {@link APICallPreHandler} for retrieving EndPoint
	 * @return
	 * @throws BaseException 
	 * @throws PayPalRESTException 
	 */
	private static HttpConfiguration createHttpConfiguration(
			Map<String, String> configurationMap, HttpMethod httpMethod,
			APICallPreHandler apiCallPreHandler) throws PayPalRESTException {
		HttpConfiguration httpConfiguration = new HttpConfiguration();
		httpConfiguration.setHttpMethod(httpMethod.toString());
		String endpoint = apiCallPreHandler.getEndPoint();
		if (endpoint == null || endpoint.isEmpty()) {
			throw new PayPalRESTException("The endpoint could not be fetched properly. You may be missing `mode` in your configuration.");
		}
		httpConfiguration.setEndPointUrl(apiCallPreHandler.getEndPoint());
		httpConfiguration
				.setGoogleAppEngine(Boolean.parseBoolean(configurationMap
						.get(Constants.GOOGLE_APP_ENGINE)));
		if (Boolean.parseBoolean(configurationMap
				.get((Constants.USE_HTTP_PROXY)))) {
			httpConfiguration.setProxyPort(Integer.parseInt(configurationMap
					.get((Constants.HTTP_PROXY_PORT))));
			httpConfiguration.setProxyHost(configurationMap
					.get((Constants.HTTP_PROXY_HOST)));
			httpConfiguration.setProxyUserName(configurationMap
					.get((Constants.HTTP_PROXY_USERNAME)));
			httpConfiguration.setProxyPassword(configurationMap
					.get((Constants.HTTP_PROXY_PASSWORD)));
		}
		httpConfiguration.setConnectionTimeout(Integer
				.parseInt(configurationMap
						.get(Constants.HTTP_CONNECTION_TIMEOUT)));
		httpConfiguration.setMaxRetry(Integer.parseInt(configurationMap
				.get(Constants.HTTP_CONNECTION_RETRY)));
		httpConfiguration.setReadTimeout(Integer.parseInt(configurationMap
				.get(Constants.HTTP_CONNECTION_READ_TIMEOUT)));
		httpConfiguration.setMaxHttpConnection(Integer
				.parseInt(configurationMap
						.get(Constants.HTTP_CONNECTION_MAX_CONNECTION)));
		httpConfiguration.setIpAddress(configurationMap
				.get(Constants.DEVICE_IP_ADDRESS));
		return httpConfiguration;
	}

	/**
	 * Returns ClientCredentials with client id and client secret from configuration Map
	 *
	 * @return Client credentials
     */
	public static ClientCredentials getCredential() {
		ClientCredentials credentials = new ClientCredentials();
		Properties configFileProperties = getConfigFileProperties();
		addConfigurations(configFileProperties);
		credentials.setClientID(configurationMap.get(Constants.CLIENT_ID));
		credentials.setClientSecret(configurationMap.get(Constants.CLIENT_SECRET));
		return credentials;
	}

	/**
	 * @deprecated Please use static method `getCredential` instead.
	 *
	 * Returns ClientCredentials with client id and client secret from configuration Map.
	 *
	 * @return Client credentials
	 */
	public ClientCredentials getClientCredential() {
		return PayPalResource.getCredential();
	}
	
	/**
	 * Fetches the properties from default configuration file.
	 * 
	 * @return {@link Properties}
	 */
	private static Properties getConfigFileProperties() {
		Properties properties = new Properties();
		try {
			properties.load(new FileReader(
					new File(PayPalResource.class.getClassLoader().getResource(Constants.DEFAULT_CONFIGURATION_FILE).getFile())));
		} catch (FileNotFoundException e) {
			return null;
		} catch (IOException e) {
			return null;
		}
		return properties;
	}

	/**
	 * Merges properties object with the configuration hash map. The configuration values are given higher priority.
	 * 
	 * @param properties
	 */
	private static void addConfigurations(Properties properties) {
		if (configurationMap == null) {
			configurationMap = new HashMap<String, String>();
		}
		if (properties != null) {
			for (final String name : properties.stringPropertyNames()) {
				if (!configurationMap.containsKey(name)) {
					configurationMap.put(name, properties.getProperty(name));
				}
			}	
		}
	}
}
