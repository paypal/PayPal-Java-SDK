// #Get Credit Card Sample
// This sample code demonstrates how you 
// retrieve a previously saved 
// Credit Card using the 'vault' API.
// API used: GET /v1/vault/credit-card/{id}
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

/**
 * @author lvairamani
 * 
 */
public class GetCreditCardServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private static final Logger LOGGER = Logger
			.getLogger(GetCreditCardServlet.class);

	public void init(ServletConfig servletConfig) throws ServletException {
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doPost(req, resp);
	}

	// ##GetCreditCardUsingId
	// Call the method with a previously created Credit Card ID
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
			 * String requestId = Long.toString(System.nanoTime());
			 * APIContext apiContext = new APIContext(accessToken, requestId));
			 */

			// Retrieve the CreditCard object by calling the
			// static `get` method on the CreditCard class,
			// and pass the APIContext and CreditCard ID
			CreditCard creditCard = CreditCard.get(apiContext,
					"CARD-656164079W913814PKINRPFA");
			LOGGER.info("Credit Card retrieved ID = " + creditCard.getId()
					+ ", status = " + creditCard.getState());
			req.setAttribute("response", CreditCard.getLastResponse());
		} catch (PayPalRESTException e) {
			req.setAttribute("error", e.getMessage());
		}
		req.getRequestDispatcher("response.jsp").forward(req, resp);
	}

}
