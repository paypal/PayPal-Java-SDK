package com.paypal.base;

import com.paypal.api.payments.Event;
import com.paypal.base.rest.APIContext;
import com.paypal.base.rest.PayPalRESTException;
import com.paypal.base.rest.PayPalResource;
import com.paypal.base.util.TestConstants;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PowerMockIgnore;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.testng.PowerMockTestCase;
import org.testng.Assert;
import org.testng.IObjectFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.ObjectFactory;
import org.testng.annotations.Test;

import java.io.InputStream;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SignatureException;
import java.util.HashMap;
import java.util.Map;

import static org.powermock.api.support.membermodification.MemberModifier.stub;

@PrepareForTest(SSLUtil.class)
@PowerMockIgnore({"javax.management.*", "javax.net.ssl.*", "javax.security.*"})
public class ValidateCertTest extends PowerMockTestCase {
	
	Map<String, String> headers, configs;
	APIContext apiContext;
	String requestBody;

	@ObjectFactory
	public IObjectFactory getObjectFactory() {
		return new org.powermock.modules.testng.PowerMockObjectFactory();
	}

	@BeforeMethod
	public void setUp() throws Exception {
		InputStream testClientCertStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("clientCertTest.crt");
		stub(PowerMockito.method(SSLUtil.class, "downloadCertificateFromPath", String.class, Map.class)).toReturn(testClientCertStream);

		// Settings some default values before each methods
		headers = new HashMap<String, String>();
		configs = new HashMap<String, String>();
		apiContext = TestConstants.SANDBOX_CONTEXT;
		
		//configs.put(Constants.PAYPAL_TRUST_CERT_URL, "DigiCertSHA2ExtendedValidationServerCA.crt");
		configs.put(Constants.PAYPAL_WEBHOOK_ID, "0FV983392A0531201");
		apiContext.setConfigurationMap(configs);
		
        headers.put(Constants.PAYPAL_HEADER_CERT_URL, "https://api.sandbox.paypal.com/v1/notifications/certs/CERT-360caa42-fca2a594-1d93a270");
        headers.put(Constants.PAYPAL_HEADER_TRANSMISSION_ID, "afa30d40-ca4a-11e9-ab68-7d4e2605c70c");
        headers.put(Constants.PAYPAL_HEADER_TRANSMISSION_TIME, "2019-08-29T10:49:33Z");
        headers.put(Constants.PAYPAL_HEADER_AUTH_ALGO, "SHA256withRSA");
        headers.put(Constants.PAYPAL_HEADER_TRANSMISSION_SIG, "K7DF5+hOyGS6v0xTZ9PkEO+BFNQmpryxw2hFlXbHgmxpu+883ldEC9HcL6ccEmB8sfy80y/Q3qcZZL1MR8Qi0e1ysylVj/yROgKK6zBsQPoNmgXC8yTiNoAjULuhk5Aoau0Itk3nrkgAfji1zvADlErMFM9VZe2nDvhM3nDMLjCi/K5fRjWp3eGo6Nx17GX/WIEibeKDyS+YdJMex3i+KO4aWmm9zznC/FJ5Y/ntd0MxOJNrM0r0f3y7c3e3sO5pB3oPgN6KzKVS5P6AWHqtS8acD3DjgCKZ1uqKz7q954G1aBz2/m0wRGOFFsv0/D3FE2uIheRRmoQtVSOAX7Aupg==");
        requestBody = "{\"id\":\"WH-7MU294299R542214K-4N1831857K851783H\",\"event_version\":\"1.0\",\"create_time\":\"2019-08-29T10:49:03.439Z\",\"resource_type\":\"payment\",\"event_type\":\"PAYMENTS.PAYMENT.CREATED\",\"summary\":\"Checkout payment is created and approved by buyer\",\"resource\":{\"update_time\":\"2019-08-29T10:48:54Z\",\"create_time\":\"2019-08-29T10:47:51Z\",\"links\":[{\"href\":\"https://api.sandbox.paypal.com/v1/payments/payment/PAYID-LVT22VY7N839502VJ678725M\",\"rel\":\"self\",\"method\":\"GET\"}],\"id\":\"PAYID-LVT22VY7N839502VJ678725M\",\"state\":\"approved\",\"transactions\":[{\"amount\":{\"total\":\"30.11\",\"currency\":\"USD\",\"details\":{\"subtotal\":\"30.00\",\"tax\":\"0.07\",\"shipping\":\"0.03\",\"insurance\":\"0.01\",\"handling_fee\":\"1.00\",\"shipping_discount\":\"-1.00\"}},\"payee\":{\"merchant_id\":\"2BP3WP8PK6566\",\"email\":\"jaypatel512-facilitator@hotmail.com\"},\"description\":\"The payment transaction description.\",\"custom\":\"EBAY_EMS_90048630024435\",\"invoice_number\":\"48787589673111\",\"item_list\":{\"items\":[{\"name\":\"hat\",\"sku\":\"1\",\"description\":\"Brown hat.\",\"price\":\"3.00\",\"currency\":\"USD\",\"tax\":\"0.01\",\"quantity\":5},{\"name\":\"handbag\",\"sku\":\"product34\",\"description\":\"Black handbag.\",\"price\":\"15.00\",\"currency\":\"USD\",\"tax\":\"0.02\",\"quantity\":1}],\"shipping_address\":{\"recipient_name\":\"Brian Robinson\",\"line1\":\"4th Floor\",\"line2\":\"Unit #34\",\"city\":\"San Jose\",\"state\":\"CA\",\"postal_code\":\"95131\",\"country_code\":\"US\",\"default_address\":false,\"preferred_address\":false,\"primary_address\":false,\"disable_for_transaction\":false}},\"related_resources\":[{\"sale\":{\"id\":\"08U30449S6662931K\",\"state\":\"completed\",\"amount\":{\"total\":\"30.11\",\"currency\":\"USD\",\"details\":{\"subtotal\":\"30.00\",\"tax\":\"0.07\",\"shipping\":\"0.03\",\"insurance\":\"0.01\",\"handling_fee\":\"1.00\",\"shipping_discount\":\"-1.00\"}},\"payment_mode\":\"INSTANT_TRANSFER\",\"protection_eligibility\":\"ELIGIBLE\",\"protection_eligibility_type\":\"ITEM_NOT_RECEIVED_ELIGIBLE,UNAUTHORIZED_PAYMENT_ELIGIBLE\",\"transaction_fee\":{\"value\":\"1.17\",\"currency\":\"USD\"},\"parent_payment\":\"PAYID-LVT22VY7N839502VJ678725M\",\"create_time\":\"2019-08-29T10:48:54Z\",\"update_time\":\"2019-08-29T10:48:54Z\",\"links\":[{\"href\":\"https://api.sandbox.paypal.com/v1/payments/sale/08U30449S6662931K\",\"rel\":\"self\",\"method\":\"GET\"},{\"href\":\"https://api.sandbox.paypal.com/v1/payments/sale/08U30449S6662931K/refund\",\"rel\":\"refund\",\"method\":\"POST\"},{\"href\":\"https://api.sandbox.paypal.com/v1/payments/payment/PAYID-LVT22VY7N839502VJ678725M\",\"rel\":\"parent_payment\",\"method\":\"GET\"}]}}]}],\"intent\":\"sale\",\"payer\":{\"payment_method\":\"paypal\",\"status\":\"VERIFIED\",\"payer_info\":{\"email\":\"sb-ahlmo117121@personal.example.com\",\"first_name\":\"John\",\"last_name\":\"Doe\",\"payer_id\":\"WZH5NSHUBE63W\",\"shipping_address\":{\"recipient_name\":\"Brian Robinson\",\"line1\":\"4th Floor\",\"line2\":\"Unit #34\",\"city\":\"San Jose\",\"state\":\"CA\",\"postal_code\":\"95131\",\"country_code\":\"US\",\"default_address\":false,\"preferred_address\":false,\"primary_address\":false,\"disable_for_transaction\":false},\"phone\":\"4084959323\",\"country_code\":\"US\"}},\"cart\":\"1R7827981J4260732\"},\"links\":[{\"href\":\"https://api.sandbox.paypal.com/v1/notifications/webhooks-events/WH-7MU294299R542214K-4N1831857K851783H\",\"rel\":\"self\",\"method\":\"GET\"},{\"href\":\"https://api.sandbox.paypal.com/v1/notifications/webhooks-events/WH-7MU294299R542214K-4N1831857K851783H/resend\",\"rel\":\"resend\",\"method\":\"POST\"}]}";
	}

	@Test(groups = "unit")
	public void testValidEndpoint() throws InvalidKeyException, NoSuchAlgorithmException, SignatureException {
		try {
			boolean result = Event.validateReceivedEvent(apiContext, headers, requestBody);
			Assert.assertTrue(result);
		} catch (PayPalRESTException e) {
			e.printStackTrace();
		}
	}

	@Test(groups = "unit", expectedExceptions = PayPalRESTException.class, expectedExceptionsMessageRegExp = "webhook.id cannot be null" )
	public void testMissingWebhookId() throws PayPalRESTException, InvalidKeyException, NoSuchAlgorithmException, SignatureException {
		//configs.remove(Constants.PAYPAL_WEBHOOK_ID);
		//apiContext.setConfigurationMap(configs);
		apiContext.getConfigurationMap().remove(Constants.PAYPAL_WEBHOOK_ID);
		if (PayPalResource.getConfigurations() != null && PayPalResource.getConfigurations().containsKey(Constants.PAYPAL_WEBHOOK_ID)) {
			PayPalResource.getConfigurations().remove(Constants.PAYPAL_WEBHOOK_ID);
		}
		Event.validateReceivedEvent(apiContext, headers, requestBody);
	}

	@Test(groups = "unit")
	public void testInvalidWebhookId() throws PayPalRESTException, InvalidKeyException, NoSuchAlgorithmException, SignatureException {
		configs.put(Constants.PAYPAL_WEBHOOK_ID, "NotToBeFound");
		apiContext.setConfigurationMap(configs);
		boolean result = Event.validateReceivedEvent(apiContext, headers, requestBody);
		Assert.assertFalse(result);
	}

	@Test(groups = "unit")
	public void testDefaultCert() throws Exception {
		boolean result = Event.validateReceivedEvent(apiContext, headers, requestBody);
		Assert.assertTrue(result);
	}

	@Test(groups = "unit", expectedExceptions= PayPalRESTException.class, expectedExceptionsMessageRegExp="Certificate Not Found")
	public void testInvalidTrustCertLocation() throws PayPalRESTException, InvalidKeyException, NoSuchAlgorithmException, SignatureException {
		configs.put(Constants.PAYPAL_TRUST_CERT_URL, "InvalidCertLocation.crt");
		apiContext.setConfigurationMap(configs);
		Event.validateReceivedEvent(apiContext, headers, requestBody);
	}
	
	@Test(groups = "unit")
	public void testInvalidAuthType() throws PayPalRESTException, InvalidKeyException, NoSuchAlgorithmException, SignatureException {
		configs.put(Constants.PAYPAL_WEBHOOK_CERTIFICATE_AUTHTYPE, "Invalid");
		apiContext.setConfigurationMap(configs);
		Event.validateReceivedEvent(apiContext, headers, requestBody);
	}

	@Test(groups = "unit")
	public void testInvalidRequestBody() throws PayPalRESTException, InvalidKeyException, NoSuchAlgorithmException, SignatureException {
		requestBody = "{ something invalid }";
		Event.validateReceivedEvent(apiContext, headers, requestBody);
	}

	@Test(groups = "unit", expectedExceptions= NoSuchAlgorithmException.class, expectedExceptionsMessageRegExp="NotToBeFound Signature not available")
	public void testInvalidAuthAlgo() throws PayPalRESTException, InvalidKeyException, NoSuchAlgorithmException, SignatureException {
		headers.put(Constants.PAYPAL_HEADER_AUTH_ALGO, "NotToBeFound");
		Event.validateReceivedEvent(apiContext, headers, requestBody);
	}

	@Test(groups = "unit", expectedExceptions = PayPalRESTException.class, expectedExceptionsMessageRegExp = "Headers cannot be null")
	public void testEmptyHeaders() throws PayPalRESTException, InvalidKeyException, NoSuchAlgorithmException, SignatureException {
		Event.validateReceivedEvent(apiContext, null, requestBody);
	}
	
	@Test(groups = "unit")
	public void testEmptyRequestBody() throws PayPalRESTException, InvalidKeyException, NoSuchAlgorithmException, SignatureException {
		Assert.assertFalse(Event.validateReceivedEvent(apiContext, headers, null));
	}
	
}
