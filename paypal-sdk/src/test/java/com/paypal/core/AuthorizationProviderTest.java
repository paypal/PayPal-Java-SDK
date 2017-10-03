package com.paypal.core;

import com.braintreepayments.http.HttpRequest;
import com.paypal.core.object.AccessToken;
import com.paypal.core.object.RefreshToken;
import com.paypal.core.utils.PayPalWireMockHarness;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static com.paypal.core.utils.ReflectionHelper.setField;
import static org.testng.Assert.assertEquals;

public class AuthorizationProviderTest extends PayPalWireMockHarness {

	@Test
	public void authorize_whenAccessTokenExpired_fetchesNewAccessToken() throws IOException, NoSuchFieldException, IllegalAccessException {
		AccessToken override = simpleAccessToken();
		setField("expiresIn", override, 0);

		Map<PayPalEnvironment, AccessToken> accessTokenMap = new HashMap<>();
		accessTokenMap.put(environment(), override);

		setField("authorizationMap", AuthorizationProvider.sharedInstance(), accessTokenMap);

		stubAccessTokenRequest(simpleAccessToken());

		HttpRequest<Void> request = new HttpRequest<>("/", "GET", Void.class);
		stub(request, null);

		AuthorizationProvider.sharedInstance().authorize(environment(), null);

		verify(1, postRequestedFor(urlEqualTo("/v1/oauth2/token")));
	}

	@Test
	public void authorize_concurrentWithSameCredentials_onlyMakesOneCall() throws IOException, InterruptedException {
		stubAccessTokenRequest(simpleAccessToken());

		CountDownLatch latch = new CountDownLatch(1);
		AccessTokenHolder async = new AccessTokenHolder();

		new Thread(() -> {
			try {
				async.accessToken = AuthorizationProvider.sharedInstance().authorize(environment(), null);
			} catch (IOException e) {}
			latch.countDown();
		}).run();

		AccessToken sync = AuthorizationProvider.sharedInstance().authorize(environment(), null);

		latch.await();

		verify(1, postRequestedFor(urlEqualTo("/v1/oauth2/token")));

		assertEquals(async.accessToken.accessToken(), sync.accessToken());
		assertEquals(async.accessToken.expiresIn(), sync.expiresIn());
	}

	@Test
	public void exchange_exchangesAuthCodeForRefreshToken() throws IOException {
		String authCode = "auth-code-from-lipp";

		stubRefreshTokenRequest(authCode, simpleRefreshToken());

		RefreshToken refreshToken = AuthorizationProvider.sharedInstance().exchange(environment(), authCode);
		verify(postRequestedFor(urlEqualTo("/v1/identity/openidconnect/tokenservice")));

		assertEquals(simpleRefreshToken().getRefreshToken(), refreshToken.getRefreshToken());
	}

	private class AccessTokenHolder {
		AccessToken accessToken;
	}
}
