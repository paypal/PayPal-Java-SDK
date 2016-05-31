package com.paypal.api.payments;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import com.paypal.base.rest.OAuthTokenCredential;
import com.paypal.base.rest.PayPalRESTException;
import com.paypal.base.rest.PayPalResource;

@Test
public class CaptureTestCase {

	private static final Logger logger = Logger
			.getLogger(CaptureTestCase.class);

	public static final String AUTHID = "12345";

	public static final String ID = "12345";

	public static final String PARENTPAYMENT = "12345";

	public static final String STATE = "Approved";

	public static final Amount AMOUNT = AmountTestCase.createAmount("120.00");

	public static final String CREATEDTIME = "2013-01-17T18:12:02.347Z";

	private Capture retrievedCapture = null;

	@BeforeTest(groups = "integration")
	public void beforeClass() throws PayPalRESTException {
		File testFile = new File(".",
				"src/test/resources/sdk_config.properties");
		PayPalResource.initConfig(testFile);
		String clientID = "EBWKjlELKMYqRNQ6sYvFo64FtaRLRR5BdHEESmha49TM";
		String clientSecret = "EO422dn3gQLgDbuwqTjzrFgFtaRLRR5BdHEESmha49TM";
		TokenHolder.accessToken = new OAuthTokenCredential(clientID,
				clientSecret).getAccessToken();
	}

	public static Capture createCapture() {
		List<Links> links = new ArrayList<Links>();
		links.add(LinksTestCase.createLinks());
		Capture capture = new Capture();
		capture.setId(ID);
		capture.setParentPayment(PARENTPAYMENT);
		capture.setState(STATE);
		capture.setAmount(AMOUNT);
		capture.setCreateTime(CREATEDTIME);
		capture.setLinks(links);
		return capture;
	}

	@Test(groups = "unit")
	public void testConstruction() {
		Capture capture = createCapture();
		Assert.assertEquals(capture.getId(), ID);
		Assert.assertEquals(capture.getParentPayment(), PARENTPAYMENT);
		Assert.assertEquals(capture.getState(), STATE);
		Assert.assertEquals(capture.getAmount().getCurrency(),
				AMOUNT.getCurrency());
		Assert.assertEquals(capture.getCreateTime(), CREATEDTIME);
		Assert.assertEquals(capture.getLinks().size(), 1);
	}

	@Test(groups = "integration")
	public void testGetCapture() throws PayPalRESTException {
		
		logger.info("**** Get Capture ****");
		Payment payment = getPaymentAgainstAuthorization();

		Payment authPayment = payment.create(TokenHolder.accessToken);
		logger.info("Received AuthPayment: " + authPayment.getId());
		String authorizationId = authPayment.getTransactions().get(0)
				.getRelatedResources().get(0).getAuthorization().getId();
		Authorization authorization = Authorization.get(
				TokenHolder.accessToken, authorizationId);
		Capture capture = new Capture();
		Amount amount = new Amount();
		amount.setCurrency("USD").setTotal("1");
		capture.setAmount(amount).setIsFinalCapture(true);
		Capture responsecapture = authorization.capture(
				TokenHolder.accessToken, capture);
		logger.info("Generated Capture Id = " + responsecapture.getId());
		retrievedCapture = Capture.get(TokenHolder.accessToken,
				responsecapture.getId());
		logger.info("Request = " + Capture.getLastRequest());
		logger.info("Response = " + Capture.getLastResponse());
		logger.info("Retrieved Capture State: " + retrievedCapture.getState());
		
	}

	@Test(groups = "integration", dependsOnMethods = { "testGetCapture" })
	public void testRefundCapture() throws PayPalRESTException {
		
		logger.info("**** Refund Capture ****");
		Refund refund = new Refund();
		Amount amount = new Amount();
		amount.setCurrency("USD").setTotal("1");
		refund.setAmount(amount);
		Refund responseRefund = retrievedCapture.refund(
				TokenHolder.accessToken, refund);
		Assert.assertEquals("completed", responseRefund.getState());
		logger.info("Request = " + Capture.getLastRequest());
		logger.info("Response = " + Capture.getLastResponse());
		logger.info("Refund State: " + responseRefund.getState());
		
	}

	@Test(groups = "integration", expectedExceptions = { IllegalArgumentException.class })
	public void testGetCaptureNullCaptureId() throws PayPalRESTException {
		logger.info("**** Get Capture (Null Capture Id) ****");
		Capture capture = Capture.get(TokenHolder.accessToken, null);
	}

	@Test(groups = "integration", expectedExceptions = { IllegalArgumentException.class })
	public void testCaptureNullRefund() throws PayPalRESTException {
		logger.info("**** Get Capture (Null Refund) ****");
		Payment payment = getPaymentAgainstAuthorization();
		Payment authPayment = payment.create(TokenHolder.accessToken);
		String authorizationId = authPayment.getTransactions().get(0)
				.getRelatedResources().get(0).getAuthorization().getId();
		Authorization authorization = Authorization.get(
				TokenHolder.accessToken, authorizationId);
		Capture capture = new Capture();
		Amount amount = new Amount();
		amount.setCurrency("USD").setTotal("1");
		capture.setAmount(amount).setIsFinalCapture(true);
		Capture responsecapture = authorization.capture(
				TokenHolder.accessToken, capture);
		logger.info("Generated Capture Id = " + responsecapture.getId());
		Capture rCapture = Capture.get(TokenHolder.accessToken,
				responsecapture.getId());
		rCapture.refund(TokenHolder.accessToken, null);
	}

	@Test
	public void testTOJSON() {
		Capture capture = createCapture();
		Assert.assertEquals(capture.toJSON().length() == 0, false);
	}

	@Test
	public void testTOString() {
		Capture capture = createCapture();
		Assert.assertEquals(capture.toString().length() == 0, false);
	}

	private Payment getPaymentAgainstAuthorization() {
		Address billingAddress = AddressTestCase.createAddress();

		CreditCard creditCard = new CreditCard();
		creditCard.setBillingAddress(billingAddress);
		creditCard.setCvv2(874);
		creditCard.setExpireMonth(11);
		creditCard.setExpireYear(2018);
		creditCard.setFirstName("Joe");
		creditCard.setLastName("Shopper");
		creditCard.setNumber("4417119669820331");
		creditCard.setType("visa");

		Amount amount = new Amount();
		amount.setCurrency("USD");
		amount.setTotal("7");

		Transaction transaction = new Transaction();
		transaction.setAmount(amount);
		transaction
				.setDescription("This is the payment transaction description.");
		List<Transaction> transactions = new ArrayList<Transaction>();
		transactions.add(transaction);

		FundingInstrument fundingInstrument = new FundingInstrument();
		fundingInstrument.setCreditCard(creditCard);
		List<FundingInstrument> fundingInstrumentList = new ArrayList<FundingInstrument>();
		fundingInstrumentList.add(fundingInstrument);

		Payer payer = new Payer();
		payer.setFundingInstruments(fundingInstrumentList);
		payer.setPaymentMethod("credit_card");

		Payment payment = new Payment();
		payment.setIntent("authorize");
		payment.setPayer(payer);
		payment.setTransactions(transactions);
		return payment;
	}

}
