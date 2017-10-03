package com.paypal.core.request;

import com.braintreepayments.http.Headers;
import com.braintreepayments.http.HttpRequest;
import com.paypal.core.PayPalEnvironment;
import com.paypal.core.object.AccessToken;

public class AccessTokenRequest extends HttpRequest<AccessToken> {

	public AccessTokenRequest(PayPalEnvironment environment) {
		super("/v1/oauth2/token", "POST", AccessToken.class);
		header(Headers.CONTENT_TYPE, "application/x-www-form-urlencoded");
		header(Headers.AUTHORIZATION, environment.authorizationString());
		super.requestBody("grant_type=client_credentials");
	}

	public AccessTokenRequest(PayPalEnvironment credentials, String refreshToken) {
		this(credentials);
		super.requestBody("grant_type=client_credentials&refresh_token=" + refreshToken);
	}
}
