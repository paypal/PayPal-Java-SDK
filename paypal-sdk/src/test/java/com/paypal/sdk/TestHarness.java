package com.paypal.sdk;

import com.braintreepayments.http.HttpClient;
import com.paypal.core.PayPalHttpClient;
import com.paypal.core.PayPalEnvironment;
import org.testng.annotations.BeforeMethod;

public class TestHarness {

	private HttpClient client;

	@BeforeMethod
	public void setup() {
		PayPalEnvironment environment = new PayPalEnvironment.Sandbox(
				System.getenv("PAYPAL_CLIENT_ID"),
				System.getenv("PAYPAL_CLIENT_SECRET"));
		client = new PayPalHttpClient(environment);
	}

	protected HttpClient client() {
		return client;
	}
}
