package com.paypal.api.payments.servlet;

import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.paypal.api.payments.Amount;
import com.paypal.api.payments.Authorization;
import com.paypal.api.payments.util.GenerateAccessToken;
import com.paypal.core.rest.APIContext;
import com.paypal.core.rest.PayPalRESTException;
import com.paypal.core.rest.PayPalResource;

public class ReauthorizationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private static final Logger LOGGER = Logger
			.getLogger(ReauthorizationServlet.class);

	public void init(ServletConfig servletConfig) throws ServletException {
		// ##Load Configuration
		// Load SDK configuration for
		// the resource. This intialization code can be
		// done as Init Servlet.
		InputStream is = ReauthorizationServlet.class
				.getResourceAsStream("/sdk_config.properties");
		try {
			PayPalResource.initConfig(is);
		} catch (PayPalRESTException e) {
			LOGGER.fatal(e.getMessage());
		}
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doPost(req, resp);
	}

	// ##Reauthorization
	// Sample showing how to do a reauthorization
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// ###AccessToken
		// Retrieve the access token from
		// OAuthTokenCredential by passing in
		// ClientID and ClientSecret
		APIContext apiContext = null;
		String accessToken = null;
		try {
			accessToken = GenerateAccessToken.getAccessToken();

			// ### Api Context
			// Pass in a `ApiContext` object to authenticate
			// the call and to send a unique request id
			// (that ensures idempotency). The SDK generates
			// a request id if you do not pass one explicitly.
			apiContext = new APIContext(accessToken);
			// Use this variant if you want to pass in a request id
			// that is meaningful in your application, ideally
			// a order id.
			/*
			 * String requestId = Long.toString(System.nanoTime(); APIContext
			 * apiContext = new APIContext(accessToken, requestId ));
			 */

			// ###Reauthorization
			// Retrieve a authorization id from authorization object
			// by making a `Payment Using PayPal` with intent
			// as `authorize`. You can reauthorize a payment only once 4 to 29
			// days after 3-day honor period for the original authorization
			// expires.
			Authorization authorization = Authorization.get(apiContext,
					"7GH53639GA425732B");

			// ###Amount
			// Let's you specify a capture amount.
			Amount amount = new Amount();
			amount.setCurrency("USD");
			amount.setTotal("4.54");

			authorization.setAmount(amount);
			// Reauthorize by POSTing to
			// URI v1/payments/authorization/{authorization_id}/reauthorize
			Authorization reauthorization = authorization
					.reauthorize(apiContext);

			req.setAttribute("response", Authorization.getLastResponse());
			LOGGER.info("Reauthorization id = " + reauthorization.getId()
					+ " and status = " + reauthorization.getState());
		} catch (PayPalRESTException e) {
			req.setAttribute("error", e.getMessage());
		}
		req.setAttribute("request", Authorization.getLastRequest());
		req.getRequestDispatcher("response.jsp").forward(req, resp);
	}

}
