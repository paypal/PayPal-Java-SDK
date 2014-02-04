// #Sale Refund Sample
// This sample code demonstrate how you can 
// process a refund on a sale transaction created 
// using the Payments API.
// API used: /v1/payments/sale/{sale-id}/refund
package com.paypal.api.payments.servlet;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.paypal.api.payments.Amount;
import com.paypal.api.payments.Refund;
import com.paypal.api.payments.Sale;
import com.paypal.api.payments.util.Configuration;
import com.paypal.core.rest.APIContext;
import com.paypal.core.rest.OAuthTokenCredential;
import com.paypal.core.rest.PayPalRESTException;

/**
 * @author lvairamani
 * 
 */
public class SaleRefundServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	private static final Logger LOGGER = Logger
			.getLogger(SaleRefundServlet.class);

	public void init(ServletConfig servletConfig) throws ServletException {
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doPost(req, resp);
	}

	// ##RefundSale
	// Sample showing how to refund
	// a sale
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		// ###Sale
		// A sale transaction.
		// Create a Sale object with the
		// given sale transaction id.
		Sale sale = new Sale();
		sale.setId("5K228780JB5476510");

		// ###Refund
		// A refund transaction.
		// Use the amount to create
		// a refund object
		Refund refund = new Refund();
		// ###Amount
		// Create an Amount object to
		// represent the amount to be
		// refunded. Create the refund object, if the refund is partial
		Amount amount = new Amount();
		amount.setCurrency("USD");
		amount.setTotal("0.01");
		refund.setAmount(amount);
		
		APIContext apiContext = null;
		String accessToken = null; 
		try {
			// ###DynamicConfiguration
			// Retrieve the dynamic configuration map
			// containing only the mode parameter at
			// the least
			Map<String, String> configurationMap = Configuration
					.getConfigurationMap();

			// Retrieve the client credentials
			// containing the clientID and
			// clientSecret
			Map<String, String> clientCredentials = Configuration
					.getClientCredentials();

			// ###AccessToken
			// Retrieve the access token from
			// OAuthTokenCredential by passing in
			// ClientID and ClientSecret
			// It is not mandatory to generate Access Token on a per call basis.
			// Typically the access token can be generated once and
			// reused within the expiry window
			accessToken = new OAuthTokenCredential(
					clientCredentials.get("clientID"),
					clientCredentials.get("clientSecret"), configurationMap)
					.getAccessToken();

			// ### Api Context
			// Pass in a `ApiContext` object to authenticate
			// the call and to send a unique request id
			// (that ensures idempotency). The SDK generates
			// a request id if you do not pass one explicitly.
			apiContext = new APIContext(accessToken);
			apiContext.setConfigurationMap(configurationMap);
			// Use this variant if you want to pass in a request id
			// that is meaningful in your application, ideally
			// a order id.
			/*
			 * String requestId = Long.toString(System.nanoTime());
			 * APIContext apiContext = new APIContext(accessToken, requestId));
			 */
			
			// Refund by posting to the APIService
			// using a valid AccessToken in APIContext
			sale.refund(apiContext, refund);
			req.setAttribute("response", Sale.getLastResponse());
		} catch (PayPalRESTException e) {
			req.setAttribute("error", e.getMessage());
		}
		req.setAttribute("request", Sale.getLastRequest());
		req.getRequestDispatcher("response.jsp").forward(req, resp);
	}

}
