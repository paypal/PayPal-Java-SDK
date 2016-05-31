package com.paypal.base;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ConnectionManagerTest {
	ConnectionManager conn;
	HttpConnection http;

	@BeforeClass
	public void beforeClass() {
		conn = ConnectionManager.getInstance();
		http = conn.getConnection();
	}

	@Test
	public void getConnectionTest() {
		Assert.assertNotNull(http);
	}

	@Test
	public void getConnectionWithHttpConfigurationForGoogleAppEngineTest() {
		HttpConfiguration httpConfig = new HttpConfiguration();
		httpConfig.setGoogleAppEngine(true);
		Assert.assertEquals(conn.getConnection(httpConfig).getClass(),
				GoogleAppEngineHttpConnection.class);
	}

	@Test
	public void getConnectionWithHttpConfigurationForDefauktTest() throws Exception {
		HttpConfiguration httpConfig = new HttpConfiguration();

		Assert.assertEquals(conn.getConnection(httpConfig).getClass(),
				DefaultHttpConnection.class);
		
		conn.configureCustomSslContext(SSLUtil.getSSLContext(null));
		
		Assert.assertEquals(conn.getConnection(httpConfig).getClass(),
			DefaultHttpConnection.class);
		
		conn.configureCustomSslContext(null);
	}

	@AfterClass
	public void afterClass() {
		conn = null;
		http = null;

	}

}
