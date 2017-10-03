package com.paypal.core;

import com.braintreepayments.http.HttpClient;
import com.paypal.core.object.AccessToken;
import com.paypal.core.object.RefreshToken;
import com.paypal.core.request.AccessTokenRequest;
import com.paypal.core.request.RefreshTokenRequest;

import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import static com.paypal.core.UserAgent.USER_AGENT;

public class AuthorizationProvider {

	private static final AuthorizationProvider sharedInstance = new AuthorizationProvider();
	private static final Object authLock = new Object();

	public static AuthorizationProvider sharedInstance() {
		return sharedInstance;
	}

	private Map<String, AccessToken> authorizationMap;

	private AuthorizationProvider() {
		authorizationMap = new ConcurrentHashMap<>();
	}

	public RefreshToken exchange(PayPalEnvironment environment, String authorizationCode) throws IOException {
		HttpClient client = new HttpClient(environment);
		RefreshTokenRequest refreshTokenRequest = new RefreshTokenRequest(environment, authorizationCode);
		return client.execute(refreshTokenRequest).result();
	}

	public AccessToken authorize(PayPalEnvironment environment, String refreshToken) throws IOException {
		String mapKey = mapKey(environment, refreshToken);
		AccessToken existingToken = authorizationMap.get(mapKey);

		if (existingToken == null || existingToken.isExpired()) {
			synchronized (authLock) {
				existingToken = authorizationMap.get(mapKey);

				if (existingToken == null || existingToken.isExpired()) {
					existingToken = fetchAccessToken(environment, refreshToken);
					authorizationMap.put(mapKey, existingToken);
				}
			}
		}

		return authorizationMap.get(mapKey);
	}

	private AccessToken fetchAccessToken(PayPalEnvironment environment, String refreshToken) throws IOException {
		HttpClient client = new HttpClient(environment);
		client.setUserAgent(USER_AGENT);

		AccessTokenRequest request;
		if (refreshToken == null) {
			request = new AccessTokenRequest(environment);
		} else {
			request = new AccessTokenRequest(environment, refreshToken);
		}

		return client.execute(request).result();
	}

	private String mapKey(PayPalEnvironment environment, String refreshToken) {
		String key = environment.authorizationString();
		if (refreshToken != null) {
			key += refreshToken;
		}

		return key;
	}
}
