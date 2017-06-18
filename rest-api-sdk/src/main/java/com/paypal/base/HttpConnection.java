package com.paypal.base;

import com.paypal.base.exception.ClientActionRequiredException;
import com.paypal.base.exception.HttpErrorException;
import com.paypal.base.exception.InvalidResponseDataException;
import com.paypal.base.exception.SSLConfigurationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.net.HttpURLConnection;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Base HttpConnection class
 * 
 */
public abstract class HttpConnection {

	private static final Logger log = LoggerFactory
			.getLogger(HttpConnection.class);

	/**
	 * Subclasses must set the http configuration in the
	 * createAndconfigureHttpConnection() method.
	 */
	protected HttpConfiguration config;

	/**
	 * Subclasses must create and set the connection in the
	 * createAndconfigureHttpConnection() method.
	 */
	protected HttpURLConnection connection;

	public HttpConnection() {

	}

	public Map<String, List<String>> getResponseHeaderMap() {
		return connection.getHeaderFields();
	}

	/**
	 * Executes HTTP request
	 * 
	 * @param url
	 * @param payload
	 * @param headers
	 * @return String response
	 * @throws InvalidResponseDataException
	 * @throws IOException
	 * @throws InterruptedException
	 * @throws HttpErrorException
	 * @throws ClientActionRequiredException
	 */
	public String execute(String url, String payload,
			Map<String, String> headers) throws InvalidResponseDataException,
			IOException, InterruptedException, HttpErrorException {
		BufferedReader reader;
		String successResponse;
		InputStream result = executeWithStream(url, payload, headers);
		reader = new BufferedReader(new InputStreamReader(result,
				Constants.ENCODING_FORMAT));
		successResponse = read(reader);

		return successResponse;
	}

	/**
	 * Executes HTTP request
	 * 
	 * @param url URL for the connection
	 * @param payload Request payload
	 * @param headers Headers map
	 * @return String response
	 * @throws InvalidResponseDataException
	 * @throws IOException
	 * @throws InterruptedException
	 * @throws HttpErrorException
	 * @throws ClientActionRequiredException
	 */
	public InputStream executeWithStream(String url, String payload,
			Map<String, String> headers) throws InvalidResponseDataException,
			IOException, InterruptedException, HttpErrorException {
		InputStream successResponse = null;
		String errorResponse = null;
		int responseCode = -1;
		BufferedReader reader = null;
		OutputStreamWriter writer = null;
		connection.setRequestProperty("Content-Length", String.valueOf(payload.trim().length()));
		try {
			setHttpHeaders(headers);
			String mode = ConfigManager.getInstance().getConfigurationMap()
					.get(Constants.MODE);
			// Print if on live
			if (!Constants.LIVE.equalsIgnoreCase(mode)) {
				logCurlRequest(payload, headers);
			}

			// This exception is used to make final log more explicit
			Exception lastException = null;
			int retry = 0;
			retryLoop: do {
				try {
					if (Arrays.asList("POST", "PUT", "PATCH").contains(connection.getRequestMethod().toUpperCase())) {
						writer = new OutputStreamWriter(
								this.connection.getOutputStream(),
								Charset.forName(Constants.ENCODING_FORMAT));
						writer.write(payload);
						writer.flush();
					}

					responseCode = connection.getResponseCode();

					// SUCCESS
					if (responseCode >= 200 && responseCode < 300) {

						try {
							successResponse = connection.getInputStream();
						} catch (IOException e) {
							successResponse = connection.getErrorStream();
						}
						break retryLoop;
					}

					// FAILURE
					reader = new BufferedReader(new InputStreamReader(
							connection.getInputStream(),
							Constants.ENCODING_FORMAT));
					errorResponse = read(reader);
					String msg = "Response code: " + responseCode + "\tError response: " + errorResponse;

					if (responseCode >= 300 && responseCode < 500) {
						// CLIENT SIDE EXCEPTION
						throw new ClientActionRequiredException(responseCode, errorResponse, msg, new IOException(msg));
					} else if (responseCode >= 500) {
						// SERVER SIDE EXCEPTION
						throw new HttpErrorException(responseCode, errorResponse, msg, new IOException(msg));
					}
				} catch (IOException e) {
					lastException = e;
					try {
						responseCode = connection.getResponseCode();
						if (connection.getErrorStream() != null) {
							reader = new BufferedReader(new InputStreamReader(
									connection.getErrorStream(),
									Constants.ENCODING_FORMAT));
							errorResponse = read(reader);
							log.error("Response code: " + responseCode
									+ "\tError response: " + errorResponse);
						}
						if ((errorResponse == null)
								|| (errorResponse.length() == 0)) {
							errorResponse = e.getMessage();
						}
						if (responseCode <= 500) {
							String msg = "Response code: " + responseCode + "\tError response: " + errorResponse;
							throw new HttpErrorException(responseCode,
									errorResponse, msg, e);
						}
					} catch (HttpErrorException ex) {
						throw ex;
					} catch (Exception ex) {
						lastException = ex;
						log.error(
								"Caught exception while handling error response",
								ex);
					}
				}
				// RETRY LOGIC
				retry++;
				if (retry > 0) {
					log.error(" Retry  No : " + retry + "...");
					Thread.sleep(this.config.getRetryDelay());
				}
			} while (retry < this.config.getMaxRetry());

			if (successResponse == null
					|| (successResponse.available() <= 0 && !(responseCode >= 200 && responseCode < 300))) {
				throw new HttpErrorException(
						"retry fails..  check log for more information",
						lastException);
			}
		} finally {
			try {
				if (reader != null) {
					reader.close();
				}
				if (writer != null) {
					writer.close();
				}
			} finally {
				reader = null;
				writer = null;
			}
		}
		return successResponse;
	}

	/**
	 * Logs the curl format based request, which could be helpful for debugging purposes.
	 *
	 * @param payload Payload Data
	 * @param headers Headers Map
     */
	private void logCurlRequest(String payload, Map<String, String> headers) {
		StringBuilder cmdBuilder = new StringBuilder("curl command: \n");
		cmdBuilder.append("curl --verbose");
		cmdBuilder.append(" --request ").append(connection.getRequestMethod().toUpperCase());
		cmdBuilder.append(" '").append(connection.getURL().toString()).append("'");

		if (headers != null) {
			for (String key : headers.keySet()) {
				String value = headers.get(key);
				cmdBuilder.append(String.format(" \\\n  --header \"%s:%s\"", key, value));
			}
		}

		cmdBuilder.append(String.format(" \\\n  --data '%s'", payload));

		log.debug(cmdBuilder.toString());
	}

	/**
	 * Set ssl parameters for client authentication
	 * 
	 * @param certPath
	 * @param certKey
	 * @throws SSLConfigurationException
	 */
	public abstract void setupClientSSL(String certPath, String certKey)
			throws SSLConfigurationException;

	/**
	 * create and configure HttpsURLConnection object
	 * 
	 * @param clientConfiguration
	 * @throws IOException
	 */
	public abstract void createAndconfigureHttpConnection(
			HttpConfiguration clientConfiguration) throws IOException;

	protected String read(BufferedReader reader) throws IOException {
		String inputLine;
		StringBuilder response = new StringBuilder();
		while ((inputLine = reader.readLine()) != null) {
			response.append(inputLine);
		}
		return response.toString();
	}

	/**
	 * Set headers for HttpsURLConnection object
	 * 
	 * @param headers
	 */
	protected void setHttpHeaders(Map<String, String> headers) {
		if (headers != null && !headers.isEmpty()) {
			Iterator<Map.Entry<String, String>> itr = headers.entrySet().iterator();
			while (itr.hasNext()) {
				Map.Entry<String, String> pairs = itr.next();
				String key = pairs.getKey();
				String value = pairs.getValue();
				this.connection.setRequestProperty(key, value);
			}
		}
	}

}
