package com.paypal.core;

import com.braintreepayments.http.HttpRequest;
import com.braintreepayments.http.HttpResponse;
import com.braintreepayments.http.Injector;
import com.paypal.core.utils.PayPalWireMockHarness;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import static com.braintreepayments.http.Headers.ACCEPT_ENCODING;
import static com.braintreepayments.http.Headers.AUTHORIZATION;
import static com.braintreepayments.http.Headers.CONTENT_TYPE;
import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNull;

public class PayPalHttpClientTest extends PayPalWireMockHarness {

	private PayPalHttpClient client = null;

	@BeforeMethod
	public void setup() {
		super.setup();
		client = new PayPalHttpClient(environment());
	}

	@Test
	public void testPayPalHttpClient_execute_setsCommonHeaders() throws IOException {
		stubAccessTokenRequest(simpleAccessToken());

		HttpRequest<Void> request = new HttpRequest<>("/", "POST", Void.class);
		stub(request, null);

		client.execute(request);
		assertEquals(request.headers().header(ACCEPT_ENCODING), "gzip");
	}

	@Test
	public void testPayPalHttpClient_execute_doesNotSetContentTypeHeaderWhenRequestBodyNotPresent() throws IOException {
		stubAccessTokenRequest(simpleAccessToken());

		HttpRequest<Void> request = new HttpRequest<>("/", "POST", Void.class);
		stub(request, null);

		client.execute(request);

		assertNull(request.headers().header(CONTENT_TYPE));
	}

	@Test
	public void testPayPalHttpClient_execute_doesNotOverwriteContentTypeIfAlreadySet() throws IOException {
		stubAccessTokenRequest(simpleAccessToken());

		HttpRequest<Void> request = new HttpRequest<>("/", "POST", Void.class)
				.header(CONTENT_TYPE, "application/form-urlencoded");
		stub(request, null);

		client.execute(request);

		assertEquals(request.headers().header(CONTENT_TYPE), "application/form-urlencoded");
	}

	@Test
	public void testPayPalHttpClient_execute_setsBaseUrl() throws IOException {
		stubAccessTokenRequest(simpleAccessToken());

		HttpRequest<Void> request = new HttpRequest<>("/", "POST", Void.class);
		stub(request, null);

		client.execute(request);

		verify(postRequestedFor(urlEqualTo("/")));
	}

	@Test
	public void testPayPalHttpClient_execute_signsRequest() throws IOException {
		stubAccessTokenRequest(simpleAccessToken());

		HttpRequest<Void> request = new HttpRequest<>("/", "GET", Void.class);
		stub(request, null);

		client.execute(request);

		verify(getRequestedFor(urlEqualTo("/"))
				.withHeader("Authorization", equalTo("Bearer sample-access-token")));
	}

	@Test
	public void testPayPalHttpClient_execute_doesNotSignsRequestIfAuthorizationHeaderAlreadyPresent() throws IOException {
		stubAccessTokenRequest(simpleAccessToken());

		HttpRequest<Void> request = new HttpRequest<>("/", "GET", Void.class);
		request.header(AUTHORIZATION, "something else");
		stub(request, null);

		client.execute(request);

		verify(getRequestedFor(urlEqualTo("/"))
				.withHeader("Authorization", equalTo("something else")));
	}

	@Test
	public void testPayPalHttpClient_execute_withCustomInjector_signsRequest() throws IOException {
		stubAccessTokenRequest(simpleAccessToken());

		HttpRequest<Void> request = new HttpRequest<>("/", "GET", Void.class);
		stub(request, null);

		Injector injector = (r) -> r.header("super-header-key", "super-header-value");

		client.addInjector(injector);
		client.execute(request);

		verify(getRequestedFor(urlEqualTo("/"))
				.withHeader("super-header-key", equalTo("super-header-value")));
	}

	@Test
	public void testPayPalHttpClient_withRefreshToken_fetchesAccessToken() throws IOException {
		client = new PayPalHttpClient(environment(), "refresh-token");
		stubAccessTokenRequest(simpleAccessToken(), "refresh-token");

		HttpRequest<Void> request = new HttpRequest<>("/", "GET", Void.class);
		stub(request, null);

		client.execute(request);

		verify(postRequestedFor(urlEqualTo("/v1/oauth2/token"))
				.withRequestBody(equalTo("grant_type=client_credentials&refresh_token=refresh-token")));
	}

	@Test(expectedExceptions = {UnsupportedEncodingException.class})
	public void testPayPalHttpClient_execute_throwsWhenContentTypeNotSet() throws IOException {
		stubAccessTokenRequest(simpleAccessToken());

		HttpRequest<Void> request = new HttpRequest<>("/", "POST", Void.class);
		request.requestBody(new TestPojo("Brian Tree", 10));

		client.execute(request);
	}

	@Test
	public void testPayPalHttpClient_execute_doesNotThrowWhenRequestIsString() throws IOException {
		stubAccessTokenRequest(simpleAccessToken());

		HttpRequest<Void> request = new HttpRequest<>("/", "POST", Void.class);
		request.requestBody("Some plain data");

		stub(request, null);

		client.execute(request);

		verify(postRequestedFor(urlEqualTo("/"))
			.withRequestBody(equalTo("Some plain data")));
	}

	@Test
	public void testPayPalHttpClient_execute_doesNotThrowWhenResponseIsString() throws IOException {
		stubAccessTokenRequest(simpleAccessToken());

		HttpRequest<String> request = new HttpRequest<>("/", "GET", String.class);
		HttpResponse<String> responseStub = HttpResponse.<String>builder()
				.result("Some response data")
				.build();

		stub(request, responseStub);

		HttpResponse<String> response = client.execute(request);
		assertEquals(response.result(), "Some response data");
	}

	private class TestPojo {

		public TestPojo(String name, int age) {
			this.name = name;
			this.age = age;
		}

		private String name;
		private int age;
	}
}
