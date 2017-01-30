package com.paypal.base;

import com.paypal.base.exception.HttpErrorException;
import com.paypal.base.exception.InvalidResponseDataException;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.HashMap;

import static org.mockito.Mockito.*;

public class GoogleAppEngineHttpConnectionTest {

	GoogleAppEngineHttpConnection googleAppEngineHttpConnection;
	HttpConfiguration httpConfiguration;

	@BeforeMethod
	public void setup() {
		googleAppEngineHttpConnection = new GoogleAppEngineHttpConnection();
		httpConfiguration = new HttpConfiguration();
	}

	@Test(expectedExceptions = MalformedURLException.class)
	public void checkMalformedURLExceptionTest() throws Exception {
		httpConfiguration.setEndPointUrl("ww.paypal.in");
		googleAppEngineHttpConnection
				.createAndconfigureHttpConnection(httpConfiguration);
	}

	@Test
	public void testCreateAndConfigureHttpConnection_setsRequestMethodToPost() throws IOException {
		httpConfiguration.setEndPointUrl("http://www.paypal.com");
		httpConfiguration.setHttpMethod("PATCH");
		GoogleAppEngineHttpConnection googleAppEngineHttpConnection = spy(GoogleAppEngineHttpConnection.class);
		doCallRealMethod().when(googleAppEngineHttpConnection).createAndconfigureHttpConnection((HttpConfiguration) any());
		googleAppEngineHttpConnection.createAndconfigureHttpConnection(httpConfiguration);
		Assert.assertEquals("POST", googleAppEngineHttpConnection.connection.getRequestMethod());
	}

	@Test
	public void testExecuteWithStream_usesPostInsteadOfPatchAndAddsOverrideHeader() throws InterruptedException, HttpErrorException, InvalidResponseDataException, IOException {
		httpConfiguration.setEndPointUrl("http://www.paypal.com");
		httpConfiguration.setHttpMethod("PATCH");
		GoogleAppEngineHttpConnection googleAppEngineHttpConnection = spy(GoogleAppEngineHttpConnection.class);
		doCallRealMethod().when(googleAppEngineHttpConnection).createAndconfigureHttpConnection((HttpConfiguration) any());
		try {
			googleAppEngineHttpConnection.createAndconfigureHttpConnection(httpConfiguration);
			googleAppEngineHttpConnection.executeWithStream(null, "payload", new HashMap<String, String>());
		} catch (Exception ex) {
			// Do nothing
		}
		verify(googleAppEngineHttpConnection).setHttpHeaders(new HashMap<String, String>() {{
			put("X-HTTP-Method-Override", "PATCH");
		}});
		Assert.assertEquals("POST", googleAppEngineHttpConnection.connection.getRequestMethod());
	}
}
