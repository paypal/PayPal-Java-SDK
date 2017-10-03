package com.paypal.core;

import com.braintreepayments.http.Headers;
import com.braintreepayments.http.HttpClient;
import com.braintreepayments.http.HttpRequest;
import com.paypal.core.object.AccessToken;
import com.paypal.core.request.AccessTokenRequest;
import com.paypal.core.request.RefreshTokenRequest;

import java.io.IOException;

import static com.paypal.core.UserAgent.USER_AGENT;

public class PayPalHttpClient extends HttpClient {

	private String refreshToken;

	public PayPalHttpClient(PayPalEnvironment environment) {
		super(environment);
		this.addInjector(this::addGzipHeader);
		this.addInjector(this::signRequest);
	}

	public PayPalHttpClient(PayPalEnvironment environment, String refreshToken) {
		this(environment);
		this.refreshToken = refreshToken;
	}

	@Override
	protected String getUserAgent() {
		return USER_AGENT;
	}

	private void signRequest(HttpRequest request) throws IOException {
		if (!isAuthRequest(request)) {
			AccessToken accessToken = AuthorizationProvider.sharedInstance().authorize(this, refreshToken);
			request.header(Headers.AUTHORIZATION, accessToken.authorizationString());
		}
	}

	private void addGzipHeader(HttpRequest request) throws IOException {
		request.headers().headerIfNotPresent(Headers.ACCEPT_ENCODING, "gzip");
	}

	private boolean isAuthRequest(HttpRequest request) {
		return request instanceof AccessTokenRequest || request instanceof RefreshTokenRequest;
	}

	PayPalEnvironment getPayPalEnvironment() {
		return (PayPalEnvironment) super.getEnvironment();
	}
}
