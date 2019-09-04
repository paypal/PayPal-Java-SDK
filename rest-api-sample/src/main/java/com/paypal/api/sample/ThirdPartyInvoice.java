package com.paypal.api.sample;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.paypal.api.payments.Invoice;
import com.paypal.api.payments.Payment;
import com.paypal.base.rest.APIContext;
import com.paypal.base.rest.PayPalRESTException;

import static com.paypal.api.payments.util.SampleConstants.*;

public class ThirdPartyInvoice extends SampleBase<Invoice> {


	private static final Logger log = LogManager.getLogger(ThirdPartyInvoice.class);

	/**
	 * Initialize and instantiate an Invoice object
	 * 
	 * @throws PayPalRESTException
	 * @throws JsonSyntaxException
	 * @throws JsonIOException
	 * @throws FileNotFoundException
	 */
	public ThirdPartyInvoice() throws PayPalRESTException, JsonSyntaxException, JsonIOException, FileNotFoundException {
		super(new Invoice());
	}

	/**
	 * Create an invoice.
	 * 
	 * https://developer.paypal.com/webapps/developer/docs/api/#create-an-
	 * invoice
	 * 
	 * @return newly created Invoice instance
	 * @throws PayPalRESTException
	 */
	public Invoice create(APIContext context) throws PayPalRESTException, FileNotFoundException, IOException {
		// populate Invoice object that we are going to play with
		super.instance = load("invoice_create.json", Invoice.class);
		super.instance.getMerchantInfo().setEmail("developer@sample.com");
		super.instance = super.instance.create(context);
		return super.instance;
	}

	public Invoice send(Invoice invoice, APIContext context) throws PayPalRESTException {
		invoice.send(context);
		return Invoice.get(context, invoice.getId());
	}

	public static void main(String[] args) {
		try {
			// Authorization Code and Co-RelationID retrieved from Mobile SDK.
			String authorizationCode = "UdL0ZFrrevCFtvXHUwQNhpyboVu0qE6Lv1I6VU7TXrKPfOpvExYKVbI6iFs-AYhmMZVEWgdPXpaHD2nsv0ypk8riEgkpj-dXmmpfi_Ud9dGRt65uraIb9rKCqXpuUBNc2WbM1P8-CaOj5M6FxK_6sUh2nveShf66ZUj_fsuu1TrLTTY8";
			APIContext context = new APIContext(clientID, clientSecret, "sandbox");

			// Fetch the long lived refresh token from authorization code.
			String refreshToken = Invoice.fetchRefreshToken(context, authorizationCode);
			// Store the refresh token in long term storage for future use.

			// Set the refresh token to context to create invoice on third party merchant's behalf
			context.setRefreshToken(refreshToken);
			
			ThirdPartyInvoice fps = new ThirdPartyInvoice();

			log.info("creating third party invoice using refresh token " + refreshToken);
			
			// This will create an invoice for `developer@sample.com` merchant
			// whose refresh token it is.
			Invoice invoice = fps.create(context);
			System.out.println(Invoice.getLastRequest());
			System.out.println(Invoice.getLastResponse());
			invoice = fps.send(invoice, context);
			System.out.println(Invoice.getLastRequest());
			System.out.println(Invoice.getLastResponse());
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(Payment.getLastRequest());
			System.out.println(Payment.getLastResponse());
		}
	}
}
