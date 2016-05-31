package com.paypal.base;

import java.io.IOException;
import java.lang.reflect.Field;
import java.net.Authenticator;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;

import com.paypal.base.exception.SSLConfigurationException;

/**
 * Wrapper class used for HttpsURLConnection
 * 
 */
public class DefaultHttpConnection extends HttpConnection {

	/**
	 * Secure Socket Layer context
	 */
	private SSLContext sslContext;

	public DefaultHttpConnection() {
		try {
			sslContext = SSLUtil.getSSLContext(null);
		} catch (SSLConfigurationException e) {
			throw new RuntimeException(e);
		}
	}

	public DefaultHttpConnection(SSLContext sslContext) {
	    this.sslContext = sslContext;
	}

	@Override
	public void setupClientSSL(String certPath, String certKey)
			throws SSLConfigurationException {
		try {
			this.sslContext = SSLUtil.setupClientSSL(certPath, certKey);
		} catch (Exception e) {
			throw new SSLConfigurationException(e.getMessage(), e);
		}
	}

	@Override
	public void createAndconfigureHttpConnection(
			HttpConfiguration clientConfiguration) throws IOException {
		this.config = clientConfiguration;
		URL url = new URL(this.config.getEndPointUrl());
		Proxy proxy = null;
		String proxyHost = this.config.getProxyHost();
		int proxyPort = this.config.getProxyPort();
		if ((proxyHost != null) && (proxyPort > 0)) {
			SocketAddress addr = new InetSocketAddress(proxyHost, proxyPort);
			proxy = new Proxy(Proxy.Type.HTTP, addr);
		}
		if (proxy != null) {
			this.connection = (HttpURLConnection) url.openConnection(proxy);
		} else {
			this.connection = (HttpURLConnection) url
					.openConnection(Proxy.NO_PROXY);
		}
		if (this.connection instanceof HttpsURLConnection) {
			((HttpsURLConnection) this.connection)
					.setSSLSocketFactory(this.sslContext.getSocketFactory());
		}

		if (this.config.getProxyUserName() != null
				&& this.config.getProxyPassword() != null) {
			final String username = this.config.getProxyUserName();
			final String password = this.config.getProxyPassword();
			Authenticator authenticator = new DefaultPasswordAuthenticator(
					username, password);
			Authenticator.setDefault(authenticator);
		}

		System.setProperty("http.maxConnections",
				String.valueOf(this.config.getMaxHttpConnection()));
		System.setProperty("sun.net.http.errorstream.enableBuffering", "true");
		this.connection.setDoInput(true);
		this.connection.setDoOutput(true);
		setRequestMethodViaJreBugWorkaround(this.connection, config.getHttpMethod());
		this.connection.setConnectTimeout(this.config.getConnectionTimeout());
		this.connection.setReadTimeout(this.config.getReadTimeout());
		
	}

	 /**
     * Workaround for a bug in {@code HttpURLConnection.setRequestMethod(String)}
     * The implementation of Sun/Oracle is throwing a {@code ProtocolException}
     * when the method is other than the HTTP/1.1 default methods. So to use {@code PATCH}
     * and others, we must apply this workaround.
     *
     * See issue http://java.net/jira/browse/JERSEY-639
     */
    private static void setRequestMethodViaJreBugWorkaround(final HttpURLConnection httpURLConnection, final String method) {
        try {
            httpURLConnection.setRequestMethod(method); // Check whether we are running on a buggy JRE
        } catch (final ProtocolException pe) {
            try {
                final Class<?> httpURLConnectionClass = httpURLConnection.getClass();
				AccessController
						.doPrivileged(new PrivilegedExceptionAction<Object>() {
							public Object run() throws NoSuchFieldException,
									IllegalAccessException {
								try {
									httpURLConnection.setRequestMethod(method);
									// Check whether we are running on a buggy
									// JRE
								} catch (final ProtocolException pe) {
									Class<?> connectionClass = httpURLConnection
											.getClass();
									Field delegateField = null;
									try {
										delegateField = connectionClass
												.getDeclaredField("delegate");
										delegateField.setAccessible(true);
										HttpURLConnection delegateConnection = (HttpURLConnection) delegateField
												.get(httpURLConnection);
										setRequestMethodViaJreBugWorkaround(
												delegateConnection, method);
									} catch (NoSuchFieldException e) {
										// Ignore for now, keep going
									} catch (IllegalArgumentException e) {
										throw new RuntimeException(e);
									} catch (IllegalAccessException e) {
										throw new RuntimeException(e);
									}
									try {
										Field methodField;
										while (connectionClass != null) {
											try {
												methodField = connectionClass
														.getDeclaredField("method");
											} catch (NoSuchFieldException e) {
												connectionClass = connectionClass
														.getSuperclass();
												continue;
											}
											methodField.setAccessible(true);
											methodField.set(httpURLConnection,
													method);
											break;
										}
									} catch (final Exception e) {
										throw new RuntimeException(e);
									}
								}
								return null;
							}
						});
            } catch (final PrivilegedActionException e) {
                final Throwable cause = e.getCause();
                if (cause instanceof RuntimeException) {
                    throw (RuntimeException) cause;
                } else {
                    throw new RuntimeException(cause);
                }
            }
        }
    }
	
	/**
	 * Private class for password based authentication
	 * 
	 * @author kjayakumar
	 * 
	 */
	private static class DefaultPasswordAuthenticator extends Authenticator {

		/**
		 * Username
		 */
		private String userName;

		/**
		 * Password
		 */
		private String password;

		public DefaultPasswordAuthenticator(String userName, String password) {
			this.userName = userName;
			this.password = password;
		}

		public PasswordAuthentication getPasswordAuthentication() {
			return (new PasswordAuthentication(userName, password.toCharArray()));
		}
	}

}