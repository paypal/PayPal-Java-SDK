package com.paypal.core.utils;

import com.braintreepayments.http.Headers;
import com.braintreepayments.http.HttpRequest;
import com.braintreepayments.http.HttpResponse;
import com.braintreepayments.http.exceptions.JsonSerializeException;
import com.braintreepayments.http.serializer.Json;
import com.braintreepayments.http.testutils.WireMockHarness;
import com.paypal.core.PayPalEnvironment;
import com.paypal.core.object.AccessToken;
import com.paypal.core.object.RefreshToken;
import com.paypal.core.request.AccessTokenRequest;
import com.paypal.core.request.RefreshTokenRequest;
import org.testng.annotations.BeforeMethod;

import java.lang.reflect.Field;
import java.util.Map;

import static com.paypal.core.utils.ReflectionHelper.setField;

public class PayPalWireMockHarness extends WireMockHarness {

	private PayPalEnvironment environment;

	@BeforeMethod
	@Override
	public void setup() {
		super.setup();
		environment = new PayPalEnvironment("fake-client-id", "fake-client-secret", String.format("http://%s:%d", host(), port()));
	}

	protected PayPalEnvironment environment() { return environment; }

	protected void stub(HttpRequest request, HttpResponse response) {
		String path = request.path();
		String verb = request.verb();
		Map<String, String> headers = translateHeaders(request.headers());
		String body = null;
		if (request.requestBody() != null) {
			if (request.requestBody() instanceof String) {
				body = (String) request.requestBody();
			} else {
				try {
					body = new Json().serialize(request.requestBody());
				} catch (JsonSerializeException ignored) {}
			}
		}

		String responseBody = null;
		Integer statusCode = null;
		Map<String, String> responseHeaders = null;
		if (response != null) {
			if (response.result() instanceof String) {
				responseBody = (String) response.result();
			} else {
				try {
					responseBody = new Json().serialize(response.result());
				} catch (JsonSerializeException ignored) {}
			}
			statusCode = response.statusCode();
			responseHeaders = translateHeaders(response.headers());
		}

		super.stub(path, verb, body, headers, responseBody, statusCode, responseHeaders);
	}

	@SuppressWarnings("unchecked")
	private Map<String, String> translateHeaders(Headers headers) {
		try {
			Field mHeaders = Headers.class.getDeclaredField("mHeaders");
			mHeaders.setAccessible(true);

			return (Map<String, String>) mHeaders.get(headers);
		} catch (NoSuchFieldException | IllegalAccessException ignored) {}

		return null;
	}

	protected AccessToken simpleAccessToken() {
		AccessToken accessToken = new AccessToken();
		try {
			setField("accessToken", accessToken, "sample-access-token");
			setField("expiresIn", accessToken, 3600);
			setField("tokenType", accessToken, "accessToken");
		} catch (NoSuchFieldException | IllegalAccessException ignored) {}

		return accessToken;
	}

	protected RefreshToken simpleRefreshToken() {
		RefreshToken refreshToken = new RefreshToken();
		try {
			setField("refreshToken", refreshToken, "sample-refresh-token");
		} catch (NoSuchFieldException | IllegalAccessException ignored) {}

		return refreshToken;
	}

	/**
	 * Used for stubbing access token requests to the oauth2 endpoint
	 *
	 * @param accessToken the accessToken to be returned in the response
	 */
	protected void stubAccessTokenRequest(AccessToken accessToken) {
		AccessTokenRequest accessTokenRequest = new AccessTokenRequest(environment());

		HttpResponse<AccessToken> accessTokenResponse = HttpResponse.<AccessToken>builder()
				.headers(new Headers().header("Content-Type", "application/json"))
				.result(accessToken)
				.statusCode(200)
				.build();

		stub(accessTokenRequest, accessTokenResponse);
	}

	protected void stubAccessTokenRequest(AccessToken accessToken, String refreshToken) {
		AccessTokenRequest request = new AccessTokenRequest(environment(), refreshToken);
		HttpResponse<AccessToken> accessTokenResponse = HttpResponse.<AccessToken>builder()
				.headers(new Headers().header("Content-Type", "application/json"))
				.result(accessToken)
				.statusCode(200)
				.build();

		stub(request, accessTokenResponse);
	}

	protected void stubRefreshTokenRequest(String authCode, RefreshToken refreshToken) {
		RefreshTokenRequest refreshTokenRequest = new RefreshTokenRequest(environment(), authCode);

		HttpResponse<RefreshToken> refreshTokenHttpResponse = HttpResponse.<RefreshToken>builder()
				.headers(new Headers().header("Content-Type", "application/json"))
				.statusCode(200)
				.result(refreshToken)
				.build();

		stub(refreshTokenRequest, refreshTokenHttpResponse);
	}
}
