package com.paypal.base.rest;

import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Map;

import com.paypal.base.Constants;
import com.paypal.base.HttpConfiguration;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import com.paypal.base.exception.HttpErrorException;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

public class OAuthTokenCredentialTestCase {

	private static final Logger logger = Logger
			.getLogger(OAuthTokenCredentialTestCase.class);

	String clientID;
	String clientSecret;

	@BeforeClass
	public void beforeClass() {
		clientID = "EBWKjlELKMYqRNQ6sYvFo64FtaRLRR5BdHEESmha49TM";
		clientSecret = "EO422dn3gQLgDbuwqTjzrFgFtaRLRR5BdHEESmha49TM";
	}

	@Test(priority = 20, groups = "integration")
	public void testGetAccessToken() throws PayPalRESTException {
		Map<String, String> configurationMap = new HashMap<String, String>();
		configurationMap.put("service.EndPoint",
				"https://api.sandbox.paypal.com");
		OAuthTokenCredential merchantTokenCredential = new OAuthTokenCredential(
				clientID, clientSecret, configurationMap);
		String accessToken = merchantTokenCredential.getAccessToken();
		logger.info("Generated Access Token = " + accessToken);
		Assert.assertEquals(true, accessToken.length() > 0);
		Assert.assertEquals(true, merchantTokenCredential.expiresIn() > 0);
	}

	@Test(dependsOnMethods = { "testGetAccessToken" }, groups = "integration")
	public void testErrorAccessToken() {
		try {
			Map<String, String> configurationMap = new HashMap<String, String>();
			configurationMap.put("service.EndPoint",
					"https://localhost.sandbox.paypal.com");
			OAuthTokenCredential merchantTokenCredential = new OAuthTokenCredential(
					clientID, clientSecret, configurationMap);
			merchantTokenCredential.getAccessToken();
		} catch (PayPalRESTException e) {
			Assert.assertEquals(true, e.getCause() instanceof HttpErrorException);
		}
	}

	@Test
	public void getOAuthHttpConfiguration_returnsServiceEndpointIfSet() throws MalformedURLException {
		Map<String, String> configurationMap = new HashMap<String, String>();
		configurationMap.put(Constants.OAUTH_ENDPOINT,
				"https://oauth.example.com/abc");

		HttpConfiguration result = new OAuthTokenCredential("abc", "def", configurationMap).getOAuthHttpConfiguration();
		assertNotNull(result);
		assertEquals(result.getEndPointUrl(), "https://oauth.example.com/abc/v1/oauth2/token");
	}

	@Test
	public void getOAuthHttpConfiguration_usesModeEndpointIfServiceEndpointNotSet() throws MalformedURLException {
		Map<String, String> configurationMap = new HashMap<String, String>();
		configurationMap.put(Constants.MODE, "sandbox");

		HttpConfiguration result = new OAuthTokenCredential("abc", "def", configurationMap).getOAuthHttpConfiguration();
		assertNotNull(result);
		assertEquals(result.getEndPointUrl(), "https://api.sandbox.paypal.com/v1/oauth2/token");
	}

	@Test(expectedExceptions = MalformedURLException.class, expectedExceptionsMessageRegExp = "oauth\\.Endpoint, mode or service\\.EndPoint not set not configured to sandbox\\/live ")
	public void getOAuthHttpConfiguration_throwsExceptionIfBothModeAndServiceEndpointNotSet() throws MalformedURLException {
		new OAuthTokenCredential("abc", "def", new HashMap<String, String>()).getOAuthHttpConfiguration();
	}

}
