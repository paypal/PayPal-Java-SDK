package com.paypal.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.paypal.base.exception.ClientActionRequiredException;
import com.paypal.base.exception.HttpErrorException;
import com.paypal.base.exception.InvalidCredentialException;
import com.paypal.base.exception.InvalidResponseDataException;
import com.paypal.base.exception.MissingCredentialException;
import com.paypal.base.exception.OAuthException;
import com.paypal.base.exception.SSLConfigurationException;

/**
 * <code>BaseService</code> acts as base class for any concrete API service. The
 * Service class generated may extend this class to make API calls through HTTP
 */
public abstract class BaseService {
	
	private static final Logger log = Logger.getLogger(BaseService.class.getName());

	/*
	 * Map used for to override ConfigManager configurations
	 */
	protected Map<String, String> configurationMap = null;

	/**
	 * Access Token used in third party authorization
	 */
	private String accessToken = null;

	/**
	 * Token secret used in third party authorization
	 */
	private String tokenSecret = null;

	/**
	 * Last request processed
	 */
	private String lastRequest = null;

	/**
	 * Last response received
	 */
	private String lastResponse = null;
	
	/**
	 * Default Constructor
	 */
	public BaseService() {
		
	}

	/**
	 * Constructs {@link BaseService} using the supplied {@link InputStream} for
	 * {@link Properties} configuration
	 * 
	 * @param inputStream
	 *            {@link Properties} configuration stream
	 * @throws IOException
	 */
	public BaseService(InputStream inputStream) throws IOException {
		Properties properties = new Properties();
		properties.load(inputStream);
		this.configurationMap = SDKUtil.constructMap(properties);
	}

	/**
	 * Constructs {@link BaseService} using the supplied {@link Properties} for
	 * configuration
	 * 
	 * @param properties
	 *            Configuration {@link Properties}
	 */
	public BaseService(Properties properties) {
		this.configurationMap = SDKUtil.constructMap(properties);
	}

	/**
	 * Constructs {@link BaseService} using the supplied {@link Map} for
	 * configuration
	 * 
	 * @param configurationMap
	 *            Configuration {@link Map}
	 */
	public BaseService(Map<String, String> configurationMap) {
		this.configurationMap = SDKUtil.combineDefaultMap(configurationMap);
	}

	/**
	 * Gets the Access Token
	 * 
	 * @return the accessToken
	 */
	public String getAccessToken() {
		return accessToken;
	}

	/**
	 * Sets the Access Token
	 * 
	 * @deprecated
	 * @param accessToken
	 *            the accessToken to set
	 */
	@Deprecated
	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	/**
	 * Gets the Token Secret
	 * 
	 * @return the tokenSecret
	 */
	public String getTokenSecret() {
		return tokenSecret;
	}

	/**
	 * Sets the Token Secret
	 * 
	 * @deprecated
	 * @param tokenSecret
	 *            the tokenSecret to set
	 */
	@Deprecated
	public void setTokenSecret(String tokenSecret) {
		this.tokenSecret = tokenSecret;
	}

	/**
	 * @return the lastRequest
	 */
	public String getLastRequest() {
		return lastRequest;
	}

	/**
	 * @param lastRequest
	 *            the lastRequest to set
	 */
	public void setLastRequest(String lastRequest) {
		this.lastRequest = lastRequest;
	}

	/**
	 * @return the lastResponse
	 */
	public String getLastResponse() {
		return lastResponse;
	}

	/**
	 * @param lastResponse
	 *            the lastResponse to set
	 */
	public void setLastResponse(String lastResponse) {
		this.lastResponse = lastResponse;
	}
	
	/**
	 * Initialize from sdk_config.properties
	 */
	protected void initializeToDefault() {
		configurationMap = SDKUtil.combineDefaultMap(ConfigManager
				.getInstance().getConfigurationMap());
	}

	/**
	 * Overloaded static method used to load the configuration file.
	 * 
	 * @deprecated
	 * 
	 * @param is
	 */
	@Deprecated
	protected static void initConfig(InputStream is) throws IOException {
		try {
			ConfigManager.getInstance().load(is);
		} catch (IOException ioe) {
			log.log(Level.FINE, ioe.getMessage(), ioe);
			throw ioe;
		}
	}

	/**
	 * Overloaded static method used to load the configuration file
	 * 
	 * @deprecated
	 * 
	 * @param file
	 */
	@Deprecated
	protected static void initConfig(File file) throws IOException {
		try {
			if (!file.exists()) {
				throw new FileNotFoundException("File doesn't exist: "
						+ file.getAbsolutePath());
			}
			FileInputStream fis = new FileInputStream(file);
			initConfig(fis);
		} catch (IOException ioe) {
			log.log(Level.FINE, ioe.getMessage(), ioe);
			throw ioe;
		}
	}

	/**
	 * Overloaded static method used to load the configuration file
	 * 
	 * @deprecated
	 * 
	 * @param filepath
	 */
	@Deprecated
	protected static void initConfig(String filepath) throws IOException {
		try {
			File file = new File(filepath);
			initConfig(file);
		} catch (IOException ioe) {
			log.log(Level.FINE, ioe.getMessage(), ioe);
			throw ioe;
		}
	}

	/**
	 * Initializes {@link ConfigManager} with the passed {@link Properties}
	 * instance
	 * 
	 * @deprecated
	 * 
	 * @param properties
	 *            {@link Properties} instance
	 */
	@Deprecated
	protected static void initConfig(Properties properties) {
		ConfigManager.getInstance().load(properties);
	}

	/**
	 * Calls the APIService with the corresponding {@link APICallPreHandler}
	 * 
	 * @param apiCallPrehandler
	 *            {@link APICallPreHandler} instance
	 * @return Response as string from the API service
	 * @throws InvalidResponseDataException
	 * @throws HttpErrorException
	 * @throws ClientActionRequiredException
	 * @throws InvalidCredentialException
	 * @throws MissingCredentialException
	 * @throws OAuthException
	 * @throws SSLConfigurationException
	 * @throws IOException
	 * @throws InterruptedException
	 */
	protected String call(APICallPreHandler apiCallPrehandler)
			throws InvalidResponseDataException, HttpErrorException,
			ClientActionRequiredException, InvalidCredentialException,
			MissingCredentialException, OAuthException,
			SSLConfigurationException, IOException, InterruptedException {
		if (this.configurationMap == null || this.configurationMap.size() <= 0) {
			throw new ClientActionRequiredException(
					"Configuration not loaded..");
		}
		APIService apiService = new APIService(configurationMap);
		lastRequest = apiCallPrehandler.getPayLoad();
		String response = apiService.makeRequestUsing(apiCallPrehandler);
		lastResponse = response;
		return response;
	}

}
