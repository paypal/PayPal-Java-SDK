package com.paypal.core;

import com.paypal.core.cache.MemoryCache;
import com.paypal.core.object.AccessToken;
import com.paypal.core.object.RefreshToken;
import com.paypal.core.request.AccessTokenRequest;
import com.paypal.core.request.RefreshTokenRequest;

import java.awt.*;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import static java.lang.Thread.currentThread;
import static java.lang.Thread.sleep;

public class AuthorizationProvider {

	private static final AuthorizationProvider sharedInstance = new AuthorizationProvider();
	private static final Map<String, Object> locks = Collections.synchronizedMap(new HashMap<>());

    public static AuthorizationProvider sharedInstance() {
		return sharedInstance;
	}

	private MemoryCache<AccessToken> authorizationCache;

	private AuthorizationProvider() {
		authorizationCache = new MemoryCache<>();
	}

	public RefreshToken exchange(PayPalHttpClient client, String authorizationCode) throws IOException {
		RefreshTokenRequest refreshTokenRequest = new RefreshTokenRequest(client.getPayPalEnvironment(), authorizationCode);
		return client.execute(refreshTokenRequest).result();
	}

    public AccessToken authorize(PayPalHttpClient client, String refreshToken) throws IOException {
        String mapKey = mapKey(client.getPayPalEnvironment(), refreshToken);
        AccessToken existingToken = authorizationCache.get(mapKey);
        if (existingToken == null || existingToken.isExpired()) {
            Object lock = getLock(mapKey);
            synchronized (lock) {
                existingToken = authorizationCache.get(mapKey);
                if (existingToken == null || existingToken.isExpired()) {
                    existingToken = fetchAccessToken(client, refreshToken);
                    authorizationCache.put(mapKey, existingToken);
                }
            }
        }
        return authorizationCache.get(mapKey);
    }

    private Object getLock(String key) {
        return locks.computeIfAbsent(key, k -> new Object());
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
