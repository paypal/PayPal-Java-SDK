// #CreateCreditCard Sample
// Using the 'vault' API, you can store a 
// Credit Card securely on PayPal. You can
// use a saved Credit Card to process
// a payment in the future.
// The following code demonstrates how 
// can save a Credit Card on PayPal using 
// the Vault API.
// API used: POST /v1/vault/credit-card
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

public class CreateCreditCardServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	private static final Logger LOGGER = Logger
			.getLogger(CreateCreditCardServlet.class);

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doPost(req, resp);
	}

	// ##Create
	// Sample showing how to create a CreditCard.
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// ###CreditCard
		// A resource representing a credit card that can be
		// used to fund a payment.
		CreditCard creditCard = new CreditCard();
		creditCard.setExpireMonth(11);
		creditCard.setExpireYear(2018);
		creditCard.setNumber("4669424246660779");
		creditCard.setCvv2(0123);
		creditCard.setType("visa");

		try {

			// ### Api Context
			// Pass in a `ApiContext` object to authenticate
			// the call and to send a unique request id
			// (that ensures idempotency). The SDK generates
			// a request id if you do not pass one explicitly.
			APIContext apiContext = new APIContext(clientID, clientSecret, mode);
			
			// ###Save
			// Creates the credit card as a resource
			// in the PayPal vault. The response contains
			// an 'id' that you can use to refer to it
			// in the future payments.
			CreditCard createdCreditCard = creditCard.create(apiContext);
			
			LOGGER.info("Credit Card Created With ID: "
					+ createdCreditCard.getId());
			ResultPrinter.addResult(req, resp, "Created Credit Card", CreditCard.getLastRequest(), CreditCard.getLastResponse(), null);
		} catch (PayPalRESTException e) {
			ResultPrinter.addResult(req, resp, "Created Credit Card", CreditCard.getLastRequest(), null, e.getMessage());
		}
		req.getRequestDispatcher("response.jsp").forward(req, resp);
	}

}
