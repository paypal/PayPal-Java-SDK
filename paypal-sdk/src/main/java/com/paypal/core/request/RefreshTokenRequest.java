package com.paypal.core.request;

import com.braintreepayments.http.Headers;
import com.braintreepayments.http.HttpRequest;
import com.paypal.core.PayPalEnvironment;
import com.paypal.core.object.RefreshToken;

public class RefreshTokenRequest extends HttpRequest<RefreshToken> {

	public RefreshTokenRequest(PayPalEnvironment credentials, String authorizationCode) {
		super("/v1/identity/openidconnect/tokenservice", "POST", RefreshToken.class);
		header(Headers.CONTENT_TYPE, "application/x-www-form-urlencoded");
		header(Headers.AUTHORIZATION, credentials.authorizationString());
		requestBody("grant_type=authorization_code&code=" + authorizationCode);
	}
}
