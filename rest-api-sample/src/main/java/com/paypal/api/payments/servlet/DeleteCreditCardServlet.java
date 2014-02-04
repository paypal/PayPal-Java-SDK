// #Delete Credit Card Sample
// This sample code demonstrate how you can
// delete a saved credit card.
// API used: /v1/vault/credit-card/{<creditCardId>}
// NOTE: HTTP method used here is DELETE
package com.paypal.api.payments.servlet;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.paypal.api.payments.CreditCard;
import com.paypal.api.payments.util.Configuration;
import com.paypal.core.rest.APIContext;
import com.paypal.core.rest.OAuthTokenCredential;
import com.paypal.core.rest.PayPalRESTException;

public class DeleteCreditCardServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	private static final Logger LOGGER = Logger
			.getLogger(DeleteCreditCardServlet.class);

	public void init(ServletConfig servletConfig) throws ServletException {
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doPost(req, resp);
	}

	// ##DeleteCreditCard
	// Sample showing how to delete a stored Credit Card
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
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
			 * String requestId = Long.toString(System.nanoTime()); APIContext
			 * apiContext = new APIContext(accessToken, requestId));
			 */

			// ### Save Credit Card
			// Save a Credit Card and retrieve the Credit
			// Card Id from the saved Credit Card
			String creditCardId = getCreditCardId(apiContext);
			
			// ### Get Credit Card
			// static `get` method on the CreditCard class,
			// and pass the APIContext and CreditCard ID
			CreditCard creditCard = CreditCard.get(apiContext,
					creditCardId);
			
			// ### Delete Credit Card
			creditCard.delete(apiContext);
			
			LOGGER.info("Credit Card Deleted ID = " + creditCardId);
			req.setAttribute("response", "CreditCard deleted successfully");
		} catch (PayPalRESTException e) {
			req.setAttribute("error", e.getMessage());
		}
		req.getRequestDispatcher("response.jsp").forward(req, resp);
	}

	private String getCreditCardId(APIContext apiContext)
			throws PayPalRESTException {

		// ###CreditCard
		// A resource representing a credit card that can be
		// used to fund a payment.
		CreditCard creditCard = new CreditCard();
		creditCard.setExpireMonth(11);
		creditCard.setExpireYear(2018);
		creditCard.setNumber("4417119669820331");
		creditCard.setType("visa");

		// ###Save
		// Creates the credit card as a resource
		// in the PayPal vault. The response contains
		// an 'id' that you can use to refer to it
		// in the future payments.
		CreditCard createdCreditCard = creditCard.create(apiContext);
		return createdCreditCard.getId();
	}

}
