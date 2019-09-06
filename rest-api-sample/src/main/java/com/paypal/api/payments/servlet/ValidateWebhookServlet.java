// #Validate Webhook Sample
// This is a sample code to demonstrate how to validate a webhook received on your web server.
// This sample assumes you are using java servlet, which returns HttpServletRequest object.
// However, this code can still be easily modified to your specific case.
package com.paypal.api.payments.servlet;

import com.paypal.api.payments.Event;
import com.paypal.api.payments.util.ResultPrinter;
import com.paypal.base.Constants;
import com.paypal.base.rest.APIContext;
import com.paypal.base.rest.PayPalRESTException;
import org.apache.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SignatureException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import static com.paypal.api.payments.util.SampleConstants.*;

public class ValidateWebhookServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	private static final Logger LOGGER = Logger
			.getLogger(ValidateWebhookServlet.class);

	public static final String WebhookId = "0FV983392A0531201";

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doPost(req, resp);
	}

	// ##Validate Webhook
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		try{
			// ### Api Context
			APIContext apiContext = new APIContext(clientID, clientSecret, mode);
			// Set the webhookId that you received when you created this webhook.
			apiContext.addConfiguration(Constants.PAYPAL_WEBHOOK_ID, WebhookId);
			
			// THIS IS MOCK DATA. All the below informatio would be retrieved originally from the webhook. This is a data for sample purpose only.
	        Map<String, String> headers = new HashMap<String, String>();
	        headers.put(Constants.PAYPAL_HEADER_CERT_URL, "https://api.sandbox.paypal.com/v1/notifications/certs/CERT-360caa42-fca2a594-1d93a270");
	        headers.put(Constants.PAYPAL_HEADER_TRANSMISSION_ID, "afa30d40-ca4a-11e9-ab68-7d4e2605c70c");
	        headers.put(Constants.PAYPAL_HEADER_TRANSMISSION_TIME, "2019-08-29T10:49:33Z");
	        headers.put(Constants.PAYPAL_HEADER_AUTH_ALGO, "SHA256withRSA");
	        headers.put(Constants.PAYPAL_HEADER_TRANSMISSION_SIG, "K7DF5+hOyGS6v0xTZ9PkEO+BFNQmpryxw2hFlXbHgmxpu+883ldEC9HcL6ccEmB8sfy80y/Q3qcZZL1MR8Qi0e1ysylVj/yROgKK6zBsQPoNmgXC8yTiNoAjULuhk5Aoau0Itk3nrkgAfji1zvADlErMFM9VZe2nDvhM3nDMLjCi/K5fRjWp3eGo6Nx17GX/WIEibeKDyS+YdJMex3i+KO4aWmm9zznC/FJ5Y/ntd0MxOJNrM0r0f3y7c3e3sO5pB3oPgN6KzKVS5P6AWHqtS8acD3DjgCKZ1uqKz7q954G1aBz2/m0wRGOFFsv0/D3FE2uIheRRmoQtVSOAX7Aupg==");
	        String requestBody = "{\"id\":\"WH-7MU294299R542214K-4N1831857K851783H\",\"event_version\":\"1.0\",\"create_time\":\"2019-08-29T10:49:03.439Z\",\"resource_type\":\"payment\",\"event_type\":\"PAYMENTS.PAYMENT.CREATED\",\"summary\":\"Checkout payment is created and approved by buyer\",\"resource\":{\"update_time\":\"2019-08-29T10:48:54Z\",\"create_time\":\"2019-08-29T10:47:51Z\",\"links\":[{\"href\":\"https://api.sandbox.paypal.com/v1/payments/payment/PAYID-LVT22VY7N839502VJ678725M\",\"rel\":\"self\",\"method\":\"GET\"}],\"id\":\"PAYID-LVT22VY7N839502VJ678725M\",\"state\":\"approved\",\"transactions\":[{\"amount\":{\"total\":\"30.11\",\"currency\":\"USD\",\"details\":{\"subtotal\":\"30.00\",\"tax\":\"0.07\",\"shipping\":\"0.03\",\"insurance\":\"0.01\",\"handling_fee\":\"1.00\",\"shipping_discount\":\"-1.00\"}},\"payee\":{\"merchant_id\":\"2BP3WP8PK6566\",\"email\":\"jaypatel512-facilitator@hotmail.com\"},\"description\":\"The payment transaction description.\",\"custom\":\"EBAY_EMS_90048630024435\",\"invoice_number\":\"48787589673111\",\"item_list\":{\"items\":[{\"name\":\"hat\",\"sku\":\"1\",\"description\":\"Brown hat.\",\"price\":\"3.00\",\"currency\":\"USD\",\"tax\":\"0.01\",\"quantity\":5},{\"name\":\"handbag\",\"sku\":\"product34\",\"description\":\"Black handbag.\",\"price\":\"15.00\",\"currency\":\"USD\",\"tax\":\"0.02\",\"quantity\":1}],\"shipping_address\":{\"recipient_name\":\"Brian Robinson\",\"line1\":\"4th Floor\",\"line2\":\"Unit #34\",\"city\":\"San Jose\",\"state\":\"CA\",\"postal_code\":\"95131\",\"country_code\":\"US\",\"default_address\":false,\"preferred_address\":false,\"primary_address\":false,\"disable_for_transaction\":false}},\"related_resources\":[{\"sale\":{\"id\":\"08U30449S6662931K\",\"state\":\"completed\",\"amount\":{\"total\":\"30.11\",\"currency\":\"USD\",\"details\":{\"subtotal\":\"30.00\",\"tax\":\"0.07\",\"shipping\":\"0.03\",\"insurance\":\"0.01\",\"handling_fee\":\"1.00\",\"shipping_discount\":\"-1.00\"}},\"payment_mode\":\"INSTANT_TRANSFER\",\"protection_eligibility\":\"ELIGIBLE\",\"protection_eligibility_type\":\"ITEM_NOT_RECEIVED_ELIGIBLE,UNAUTHORIZED_PAYMENT_ELIGIBLE\",\"transaction_fee\":{\"value\":\"1.17\",\"currency\":\"USD\"},\"parent_payment\":\"PAYID-LVT22VY7N839502VJ678725M\",\"create_time\":\"2019-08-29T10:48:54Z\",\"update_time\":\"2019-08-29T10:48:54Z\",\"links\":[{\"href\":\"https://api.sandbox.paypal.com/v1/payments/sale/08U30449S6662931K\",\"rel\":\"self\",\"method\":\"GET\"},{\"href\":\"https://api.sandbox.paypal.com/v1/payments/sale/08U30449S6662931K/refund\",\"rel\":\"refund\",\"method\":\"POST\"},{\"href\":\"https://api.sandbox.paypal.com/v1/payments/payment/PAYID-LVT22VY7N839502VJ678725M\",\"rel\":\"parent_payment\",\"method\":\"GET\"}]}}]}],\"intent\":\"sale\",\"payer\":{\"payment_method\":\"paypal\",\"status\":\"VERIFIED\",\"payer_info\":{\"email\":\"sb-ahlmo117121@personal.example.com\",\"first_name\":\"John\",\"last_name\":\"Doe\",\"payer_id\":\"WZH5NSHUBE63W\",\"shipping_address\":{\"recipient_name\":\"Brian Robinson\",\"line1\":\"4th Floor\",\"line2\":\"Unit #34\",\"city\":\"San Jose\",\"state\":\"CA\",\"postal_code\":\"95131\",\"country_code\":\"US\",\"default_address\":false,\"preferred_address\":false,\"primary_address\":false,\"disable_for_transaction\":false},\"phone\":\"4084959323\",\"country_code\":\"US\"}},\"cart\":\"1R7827981J4260732\"},\"links\":[{\"href\":\"https://api.sandbox.paypal.com/v1/notifications/webhooks-events/WH-7MU294299R542214K-4N1831857K851783H\",\"rel\":\"self\",\"method\":\"GET\"},{\"href\":\"https://api.sandbox.paypal.com/v1/notifications/webhooks-events/WH-7MU294299R542214K-4N1831857K851783H/resend\",\"rel\":\"resend\",\"method\":\"POST\"}]}";

	        Boolean isDataValid = Event.validateReceivedEvent(apiContext, headers, requestBody);
			LOGGER.info("Webhook Validated : "+ isDataValid);
			
			String result = isDataValid ? "{\"verification_status\":\"SUCCESS\"}" : "{\"verification_status\":\"FAILURE\"}";
			
			ResultPrinter.addResult(req, resp, "Webhook Validated:  ", "WebhookId : " + WebhookId, result, null);
		} catch (PayPalRESTException e) {
			LOGGER.error(e.getMessage());
			ResultPrinter.addResult(req, resp, "Webhook Validated:  ", "WebhookId : " + WebhookId, null, e.getMessage());
		} catch (InvalidKeyException e) {
			LOGGER.error(e.getMessage());
            ResultPrinter.addResult(req, resp, "Webhook Validated:  ", "WebhookId : " + WebhookId, null, e.getMessage());
		} catch (NoSuchAlgorithmException e) {
			LOGGER.error(e.getMessage());
            ResultPrinter.addResult(req, resp, "Webhook Validated:  ", "WebhookId : " + WebhookId, null, e.getMessage());
		} catch (SignatureException e) {
			LOGGER.error(e.getMessage());
            ResultPrinter.addResult(req, resp, "Webhook Validated:  ", "WebhookId : " + WebhookId, null, e.getMessage());
		}
		req.getRequestDispatcher("response.jsp").forward(req, resp);
	}

	// Simple helper method to help you extract the headers from HttpServletRequest object.
	private static Map<String, String> getHeadersInfo(HttpServletRequest request) {

		Map<String, String> map = new HashMap<String, String>();

		@SuppressWarnings("rawtypes")
		Enumeration headerNames = request.getHeaderNames();
		while (headerNames.hasMoreElements()) {
			String key = (String) headerNames.nextElement();
			String value = request.getHeader(key);
			map.put(key, value);
		}

		return map;
	}

	// Simple helper method to fetch request data as a string from HttpServletRequest object.
	private static String getBody(HttpServletRequest request) throws IOException {

	    String body;
	    StringBuilder stringBuilder = new StringBuilder();
	    BufferedReader bufferedReader = null;

	    try {
	        InputStream inputStream = request.getInputStream();
	        if (inputStream != null) {
	            bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
	            char[] charBuffer = new char[128];
	            int bytesRead = -1;
	            while ((bytesRead = bufferedReader.read(charBuffer)) > 0) {
	                stringBuilder.append(charBuffer, 0, bytesRead);
	            }
	        } else {
	            stringBuilder.append("");
	        }
	    } catch (IOException ex) {
	        throw ex;
	    } finally {
	        if (bufferedReader != null) {
	            try {
	                bufferedReader.close();
	            } catch (IOException ex) {
	                throw ex;
	            }
	        }
	    }

	    body = stringBuilder.toString();
	    return body;
	}

}
