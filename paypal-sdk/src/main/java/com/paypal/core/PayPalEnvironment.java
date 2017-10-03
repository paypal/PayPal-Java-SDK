package com.paypal.core;

import com.braintreepayments.http.Environment;

import java.util.Base64;

public class PayPalEnvironment implements Authorization, Environment {

	private String clientId;
	private String clientSecret;
	private String baseUrl;

	public PayPalEnvironment(String clientId, String clientSecret, String baseUrl) {
		this.clientId = clientId;
		this.clientSecret = clientSecret;
		this.baseUrl = baseUrl;
	}

	public static class Sandbox extends PayPalEnvironment {
		public Sandbox(String clientId, String clientSecret) {
			super(clientId, clientSecret, "https://api.sandbox.paypal.com");
		}
	}

	public static class Live extends PayPalEnvironment {
		public Live(String clientId, String clientSecret) {
			super(clientId, clientSecret, "https://api.paypal.com");
		}
	}

	@Override
	public String authorizationString() {
		return String.format("Basic %s", new String(Base64.getEncoder().encode((clientId + ":" + clientSecret).getBytes())));
	}

	@Override
	public String baseUrl() {
		return baseUrl;
	}

	protected String clientId() { return clientId; }
	protected String clientSecret() { return clientSecret; }

	@Override
	public int hashCode() {
		return (clientId + clientSecret).hashCode();
	}
}
