// #GetCreditCard Sample
// This sample code demonstrates how you 
// retrieve a previously saved 
// Credit Card using the 'vault' API.
// API used: GET /v1/vault/credit-card/{id}
package com.paypal.api.payments.servlet;

import static com.paypal.api.payments.util.SampleConstants.clientID;
import static com.paypal.api.payments.util.SampleConstants.clientSecret;
import static com.paypal.api.payments.util.SampleConstants.mode;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.paypal.api.payments.CreditCard;
import com.paypal.api.payments.util.ResultPrinter;
import com.paypal.base.rest.APIContext;
import com.paypal.base.rest.PayPalRESTException;


public class GetCreditCardServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private static final Logger LOGGER = Logger
			.getLogger(GetCreditCardServlet.class);

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

		try {
			// ### Api Context
			// Pass in a `ApiContext` object to authenticate
			// the call and to send a unique request id
			// (that ensures idempotency). The SDK generates
			// a request id if you do not pass one explicitly.
			APIContext apiContext = new APIContext(clientID, clientSecret, mode);

			// Retrieve the CreditCard object by calling the
			// static `get` method on the CreditCard class,
			// and pass the APIContext and CreditCard ID
			CreditCard creditCard = CreditCard.get(apiContext,
					"CARD-5BT058015C739554AKE2GCEI");
			LOGGER.info("Credit Card retrieved ID = " + creditCard.getId()
					+ ", status = " + creditCard.getState());
			ResultPrinter.addResult(req, resp, "Got Credit Card from Vault", CreditCard.getLastRequest(), CreditCard.getLastResponse(), null);
		} catch (PayPalRESTException e) {
			ResultPrinter.addResult(req, resp, "Got Credit Card from Vault", CreditCard.getLastRequest(), null, e.getMessage());
		}
		req.getRequestDispatcher("response.jsp").forward(req, resp);
	}

}
