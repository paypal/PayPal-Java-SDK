package com.paypal.base;

import com.paypal.base.exception.SSLConfigurationException;
import com.paypal.base.exception.HttpErrorException;
import com.paypal.base.exception.InvalidResponseDataException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.InputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;
import java.util.Map;
import java.util.HashMap;

/**
 * A special HttpConnection for use on Google App Engine.
 *
 * In order to activate this feature, set 'http.GoogleAppEngine = true' in the
 * SDK config file.
 *
 */
public class GoogleAppEngineHttpConnection extends HttpConnection {

	private static final Logger log = LoggerFactory.getLogger(GoogleAppEngineHttpConnection.class);

	private String requestMethod = null;

	@Override
	public void setupClientSSL(String certPath, String certKey)
			throws SSLConfigurationException {

		if (certPath != null || certKey != null) {
			log.warn("The PayPal SDK cannot be used with client SSL on Google App Engine; configure the SDK to use a PayPal API Signature instead");
		}
	}

	@Override
	public void createAndconfigureHttpConnection(
			HttpConfiguration clientConfiguration) throws IOException {

		this.config = clientConfiguration;

		URL url = new URL(this.config.getEndPointUrl());

		// Google App Engine does not support the
		// javax.net.ssl.HttpsURLConnection class.
		// However, one can use use URL.openConnection() with a https:// URL and
		// it will
		// return an HttpURLConnection that is capable of retrieving HTTPS data.
		// see
		// https://groups.google.com/forum/?fromgroups#!topic/google-appengine-java/ZEskGLwyE_0

		// Google App Engine does not require any proxy settings so we can skip
		// that configuration entirely.

		// Other Google issues that can be starred to add better support:
		// http://code.google.com/p/googleappengine/issues/detail?id=1036

		this.connection = (HttpURLConnection) url
				.openConnection(Proxy.NO_PROXY);
		this.connection.setDoInput(true);
		this.connection.setDoOutput(true);

		if ("PATCH".equals(config.getHttpMethod().toUpperCase())) {
			this.connection.setRequestMethod("POST");
			this.requestMethod = "PATCH";
		} else {
			this.connection.setRequestMethod(config.getHttpMethod());
		}
		this.connection.setConnectTimeout(this.config.getConnectionTimeout());
		this.connection.setReadTimeout(this.config.getReadTimeout());
	}

	@Override
	public InputStream executeWithStream(String url, String payload,
			Map<String, String> headers) throws InvalidResponseDataException,
			IOException, InterruptedException, HttpErrorException {

		Map<String, String> headersCopy = new HashMap<String, String>(headers);
		if (requestMethod != null) {
			headersCopy.put("X-HTTP-Method-Override", requestMethod);
		}

		return super.executeWithStream(url, payload, headersCopy);
	}
}
