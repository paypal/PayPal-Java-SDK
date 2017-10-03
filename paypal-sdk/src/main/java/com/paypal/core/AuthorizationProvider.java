package com.paypal.core;

import com.paypal.core.object.AccessToken;
import com.paypal.core.object.RefreshToken;
import com.paypal.core.request.AccessTokenRequest;
import com.paypal.core.request.RefreshTokenRequest;

import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

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

	public RefreshToken exchange(PayPalHttpClient client, String authorizationCode) throws IOException {
		RefreshTokenRequest refreshTokenRequest = new RefreshTokenRequest(client.getPayPalEnvironment(), authorizationCode);
		return client.execute(refreshTokenRequest).result();
	}

	public AccessToken authorize(PayPalHttpClient client, String refreshToken) throws IOException {
		String mapKey = mapKey(client.getPayPalEnvironment(), refreshToken);
		AccessToken existingToken = authorizationMap.get(mapKey);

		if (existingToken == null || existingToken.isExpired()) {
			synchronized (authLock) {
				existingToken = authorizationMap.get(mapKey);

				if (existingToken == null || existingToken.isExpired()) {
					existingToken = fetchAccessToken(client, refreshToken);
					authorizationMap.put(mapKey, existingToken);
				}
			}
		}

		return authorizationMap.get(mapKey);
	}

	private AccessToken fetchAccessToken(PayPalHttpClient client, String refreshToken) throws IOException {
		AccessTokenRequest request;
		if (refreshToken == null) {
			request = new AccessTokenRequest(client.getPayPalEnvironment());
		} else {
			request = new AccessTokenRequest(client.getPayPalEnvironment(), refreshToken);
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
