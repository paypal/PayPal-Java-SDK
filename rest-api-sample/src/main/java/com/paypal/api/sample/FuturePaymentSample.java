package com.paypal.api.sample;

import java.util.ArrayList;
import java.util.List;

import com.paypal.api.payments.Amount;
import com.paypal.api.payments.FuturePayment;
import com.paypal.api.payments.Payer;
import com.paypal.api.payments.Payment;
import com.paypal.api.payments.Transaction;
import com.paypal.base.rest.APIContext;

import static com.paypal.api.payments.util.SampleConstants.*;

public class FuturePaymentSample {

	public static void main(String[] args) {
		try {
			// Authorization Code and Co-relationID retrieved from Mobile SDK.
			String authorizationCode = "C101.Rya9US0s60jg-hOTMNFRTjDfbePYv3W_YjDJ49BVI6YJY80HvjL1C6apK8h3IIas.ZWOGll_Ju62T9SXRSRFHZVwZESK";
			String correlationId = "123456123";
			
			APIContext context = new APIContext(clientID, clientSecret, "sandbox");

			// Fetch the long lived refresh token from authorization code.
			String refreshToken = FuturePayment.fetchRefreshToken(context, authorizationCode);
			// Store the refresh token in long term storage for future use.

			// Set the refresh token to context to make future payments of
			// pre-consented customer.
			context.setRefreshToken(refreshToken);
			
			// Create Payment Object
			Payer payer = new Payer();
			payer.setPaymentMethod("paypal");
			Amount amount = new Amount();
			amount.setTotal("0.17");
			amount.setCurrency("USD");
			Transaction transaction = new Transaction();
			transaction.setAmount(amount);
			transaction.setDescription("This is the payment tranasction description.");
			List<Transaction> transactions = new ArrayList<Transaction>();
			transactions.add(transaction);

			FuturePayment futurePayment = new FuturePayment();
			futurePayment.setIntent("authorize");
			futurePayment.setPayer(payer);
			futurePayment.setTransactions(transactions);

			Payment createdPayment = futurePayment.create(context, correlationId);
			System.out.println(createdPayment.toString());
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(Payment.getLastRequest());
			System.out.println(Payment.getLastResponse());
		}
	}
}
