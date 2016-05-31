package com.paypal.base;

import javax.net.ssl.SSLContext;

import com.paypal.base.credential.CertificateCredential;

/**
 * ConnectionManager acts as a interface to retrieve {@link HttpConnection}
 * objects used by API service
 * 
 */
public final class ConnectionManager {

	/**
	 * Singleton instance
	 */
	private static ConnectionManager instance;

	private SSLContext customSslContext;

	// Private Constructor
	private ConnectionManager() {
	}

	/**
	 * Singleton accessor method
	 * 
	 * @return {@link ConnectionManager} singleton object
	 */
	public static ConnectionManager getInstance() {
		synchronized (ConnectionManager.class) {
			if (instance == null) {
				instance = new ConnectionManager();
			}
		}
		return instance;
	}

	/**
	 * @return HttpConnection object
	 */
	public HttpConnection getConnection() {
    		if(customSslContext != null) {
			return new DefaultHttpConnection(customSslContext);
    		} else {
			return new DefaultHttpConnection();
    		}
	}

	/**
	 * Overloaded method used factory to load GoogleAppEngineSpecific connection
	 * 
	 * @param httpConfig
	 *            {@link HttpConfiguration} object
	 * @return {@link HttpConnection} object
	 */
	public HttpConnection getConnection(HttpConfiguration httpConfig) {
		if (httpConfig.isGoogleAppEngine()) {
			return new GoogleAppEngineHttpConnection();
		} else {
			return getConnection();
		}
	}
	
	/**
	 * 
	 * @param sslContext an custom {@link SSLContext} to set to all new connections. 
	 * 		If null, the default SSLContext will be recovered each new connection.<br>
	 *              Note: This custom SSLContext will be overwritten if you use a {@link CertificateCredential}
	 *                    to authenticate the client rest.
	 *<pre>
	 *	
	 * {@literal // On application startup...}
	 * public static void main({@link String}[] args) {
	 * 	{@link SSLContext} sslContext = {@link SSLContext}.getDefault(); 
	 * 	{@literal // Or provide your custom context.}
	 * 
	 * 	{@link ConnectionManager}.getInstance().configureCustomSslContext(sslContext); 
	 * 	{@literal // Now all connections will use this ssl context except if the authentication method is with certificate credential.}
	 * }
	 * 
	 *</pre>
	 *  
	 *  @see CertificateCredential
	 *  
	 */
	public void configureCustomSslContext(SSLContext sslContext) {
		customSslContext = sslContext;
	}
}
