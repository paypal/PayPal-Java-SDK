package com.paypal.base;

import java.io.IOException;
import java.util.Map;
import java.util.logging.Logger;
import java.util.regex.Pattern;

import com.paypal.base.credential.CertificateCredential;
import com.paypal.base.exception.ClientActionRequiredException;
import com.paypal.base.exception.HttpErrorException;
import com.paypal.base.exception.InvalidCredentialException;
import com.paypal.base.exception.InvalidResponseDataException;
import com.paypal.base.exception.MissingCredentialException;
import com.paypal.base.exception.OAuthException;
import com.paypal.base.exception.SSLConfigurationException;

/**
 * Wrapper class for api calls
 * 
 */
public class APIService {

	private static final Logger log = Logger.getLogger(APIService.class.getName());
	
	/**
	 * Service Endpoint
	 * @deprecated
	 */
	@Deprecated
	private final String endPoint;

	/**
	 * Map used for to override ConfigManager configurations
	 */
	private Map<String, String> configurationMap = null;

	/**
	 * @deprecated Configuration Manager
	 */
	@Deprecated
	private ConfigManager config = null;

	/**
	 * HttpConfiguration
	 */
	private HttpConfiguration httpConfiguration = null;

	/**
	 * APISerice
	 * 
	 * @deprecated
	 */
	@Deprecated
	public APIService() {
		httpConfiguration = new HttpConfiguration();
		config = ConfigManager.getInstance();
		endPoint = config.getValue(Constants.ENDPOINT);
		httpConfiguration.setGoogleAppEngine(Boolean.parseBoolean(config
				.getValue(Constants.GOOGLE_APP_ENGINE)));
		if (Boolean.parseBoolean(config.getValue(Constants.USE_HTTP_PROXY))) {
			httpConfiguration.setProxyPort(Integer.parseInt(config
					.getValue(Constants.HTTP_PROXY_PORT)));
			httpConfiguration.setProxyHost(config
					.getValue(Constants.HTTP_PROXY_HOST));
			httpConfiguration.setProxyUserName(config
					.getValue(Constants.HTTP_PROXY_USERNAME));
			httpConfiguration.setProxyPassword(config
					.getValue(Constants.HTTP_PROXY_PASSWORD));
		}
		httpConfiguration.setConnectionTimeout(Integer.parseInt(config
				.getValue(Constants.HTTP_CONNECTION_TIMEOUT)));
		httpConfiguration.setMaxRetry(Integer.parseInt(config
				.getValue(Constants.HTTP_CONNECTION_RETRY)));
		httpConfiguration.setReadTimeout(Integer.parseInt(config
				.getValue(Constants.HTTP_CONNECTION_READ_TIMEOUT)));
		httpConfiguration.setMaxHttpConnection(Integer.parseInt(config
				.getValue(Constants.HTTP_CONNECTION_MAX_CONNECTION)));
		httpConfiguration.setIpAddress(config
				.getValue(Constants.DEVICE_IP_ADDRESS));
	}

	/**
	 * APIService configured through {@link Map}
	 * 
	 * @param configurationMap
	 *            {@link Map} to over-ride default Config Manager configuration
	 */
	public APIService(Map<String, String> configurationMap) {
		if (configurationMap == null) {
			throw new IllegalArgumentException(
					"ConfigurationMap cannot be null");
		}
		this.configurationMap = configurationMap;
		httpConfiguration = new HttpConfiguration();
		endPoint = this.configurationMap.get(Constants.ENDPOINT);
		httpConfiguration.setGoogleAppEngine(Boolean
				.parseBoolean(this.configurationMap
						.get(Constants.GOOGLE_APP_ENGINE)));
		if (Boolean.parseBoolean(this.configurationMap
				.get(Constants.USE_HTTP_PROXY))) {
			httpConfiguration.setProxyPort(Integer
					.parseInt(this.configurationMap
							.get(Constants.HTTP_PROXY_PORT)));
			httpConfiguration.setProxyHost(this.configurationMap
					.get(Constants.HTTP_PROXY_HOST));
			httpConfiguration.setProxyUserName(this.configurationMap
					.get(Constants.HTTP_PROXY_USERNAME));
			httpConfiguration.setProxyPassword(this.configurationMap
					.get(Constants.HTTP_PROXY_PASSWORD));
		}
		httpConfiguration.setConnectionTimeout(Integer
				.parseInt(this.configurationMap
						.get(Constants.HTTP_CONNECTION_TIMEOUT)));
		httpConfiguration.setMaxRetry(Integer
				.parseInt(this.configurationMap
						.get(Constants.HTTP_CONNECTION_RETRY)));
		httpConfiguration.setReadTimeout(Integer
				.parseInt(this.configurationMap
						.get(Constants.HTTP_CONNECTION_READ_TIMEOUT)));
		httpConfiguration.setMaxHttpConnection(Integer
				.parseInt(this.configurationMap
						.get(Constants.HTTP_CONNECTION_MAX_CONNECTION)));
		httpConfiguration.setIpAddress(this.configurationMap
				.get(Constants.DEVICE_IP_ADDRESS));
	}

	/**
	 * Makes a request to API service
	 * 
	 * @param apiCallPreHandler
	 *            API Call specific handler
	 * @return Response from API as string
	 * @throws InvalidResponseDataException
	 * @throws HttpErrorException
	 * @throws ClientActionRequiredException
	 * @throws IOException
	 * @throws InterruptedException
	 * @throws InvalidCredentialException
	 * @throws MissingCredentialException
	 * @throws OAuthException
	 * @throws SSLConfigurationException
	 */
	public String makeRequestUsing(APICallPreHandler apiCallPreHandler)
			throws InvalidResponseDataException, HttpErrorException,
			ClientActionRequiredException, IOException, InterruptedException,
			InvalidCredentialException, MissingCredentialException,
			OAuthException, SSLConfigurationException {

		/*
		 * The implementation is transparent to API request format NVP or SOAP,
		 * the headers, payload and endpoints are fed by the corresponding
		 * apiCallPreHandlers
		 */
		String response = null;
		apiCallPreHandler.validate();
		Map<String, String> headers = null;
		ConnectionManager connectionMgr = ConnectionManager.getInstance();
		HttpConnection connection = connectionMgr
				.getConnection(httpConfiguration);
		String url = apiCallPreHandler.getEndPoint();
		if (url == null || url.trim().length() <= 0) {
			throw new HttpErrorException(
					"Unable to retrieve a valid end-point from configuration");
		}
		httpConfiguration.setEndPointUrl(url);
		headers = apiCallPreHandler.getHeaderMap();
		String payLoad = apiCallPreHandler.getPayLoad();
		log.info(payLoadToLog(payLoad));
		if (apiCallPreHandler.getCredential() instanceof CertificateCredential) {
			CertificateCredential credential = (CertificateCredential) apiCallPreHandler
					.getCredential();
			connection.setupClientSSL(credential.getCertificatePath(),
					credential.getCertificateKey());
		}
		connection.createAndconfigureHttpConnection(httpConfiguration);

		// null values are not permitted for headers. But empty values are
		// accepted
		if (httpConfiguration.getIpAddress() != null) {
			headers.put(Constants.PAYPAL_DEVICE_IPADDRESS_HEADER,
					httpConfiguration.getIpAddress());
		}
		response = connection.execute(url, payLoad, headers);
		log.info(response);
		return response;
	}
	
	private String payLoadToLog(String payload) {
		Pattern p= Pattern.compile("(<(ebl:(Username|Password|Subject|Signature|CreditCardNumber|CVV2))>)[\\W\\w]+(</\\2>)");
		String passSub= p.matcher(payload).replaceAll("$1****************$4");
		return passSub;
	}

	/**
	 * @deprecated
	 * @return
	 */
	@Deprecated
	public String getEndPoint() {
		return endPoint;
	}

}
