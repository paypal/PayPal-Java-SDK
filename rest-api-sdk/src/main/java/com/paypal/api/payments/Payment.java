package com.paypal.api.payments;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.paypal.base.rest.JSONFormatter;
import com.paypal.base.Constants;
import com.paypal.base.rest.APIContext;
import com.paypal.base.rest.HttpMethod;
import com.paypal.base.rest.JSONFormatter;
import com.paypal.base.rest.PayPalRESTException;
import com.paypal.base.rest.PayPalResource;
import com.paypal.base.rest.RESTUtil;
import com.paypal.base.sdk.info.SDKVersionImpl;

public class Payment  extends PayPalResource {

	/**
	 * ID of the created payment, the 'transaction ID'
	 */
	private String id;

	/**
	 * Payment intent.
	 */
	private String intent;

	/**
	 * Source of the funds for this payment represented by a PayPal account or a direct credit card.
	 */
	private Payer payer;

	/**
	 * Information that the merchant knows about the payer.  This information is not definitive and only serves as a hint to the UI or any pre-processing logic.
	 */
	private PotentialPayerInfo potentialPayerInfo;

	/**
	 * Receiver of funds for this payment. **Readonly for PayPal external REST payments.**
	 */
	private Payee payee;

	/**
	 * ID of the cart to execute the payment.
	 */
	private String cart;

	/**
	 * Transactional details including the amount and item details.
	 */
	private List<Transaction> transactions;

	/**
	 * Applicable for advanced payments like multi seller payment (MSP) to support partial failures
	 */
	private List<Error> failedTransactions;

	/**
	 * Collection of PayPal generated billing agreement tokens.
	 */
	private List<BillingAgreementToken> billingAgreementTokens;

	/**
	 * Credit financing offered to payer on PayPal side. Returned in payment after payer opts-in
	 */
	private CreditFinancingOffered creditFinancingOffered;

	/**
	 * Instructions for the payer to complete this payment.
	 */
	private PaymentInstruction paymentInstruction;

	/**
	 * Payment state.
	 */
	private String state;

	/**
	 * PayPal generated identifier for the merchant's payment experience profile. Refer to [this](https://developer.paypal.com/webapps/developer/docs/api/#payment-experience) link to create experience profile ID.
	 */
	private String experienceProfileId;

	/**
	 * free-form field for the use of clients to pass in a message to the payer
	 */
	private String noteToPayer;

	/**
	 * Set of redirect URLs you provide only for PayPal-based payments.
	 */
	private RedirectUrls redirectUrls;

	/**
	 * Failure reason code returned when the payment failed for some valid reasons.
	 */
	private String failureReason;

	/**
	 * Payment creation time as defined in [RFC 3339 Section 5.6](http://tools.ietf.org/html/rfc3339#section-5.6).
	 */
	private String createTime;

	/**
	 * Payment update time as defined in [RFC 3339 Section 5.6](http://tools.ietf.org/html/rfc3339#section-5.6).
	 */
	private String updateTime;

	/**
	 * 
	 */
	private List<Links> links;

	/**
	 * Returns the last request sent to the Service
	 *
	 * @return Last request sent to the server
	 */
	public static String getLastRequest() {
		return PayPalResource.getLastRequest();
	}

	/**
	 * Returns the last response returned by the Service
	 *
	 * @return Last response got from the Service
	 */
	public static String getLastResponse() {
		return PayPalResource.getLastResponse();
	}

	/**
	 * Default Constructor
	 */
	public Payment() {
	}

	/**
	 * Parameterized Constructor
	 */
	public Payment(String intent, Payer payer) {
		this.intent = intent;
		this.payer = payer;
	}


	/**
	 * Setter for id
	 */
	public Payment setId(String id) {
		this.id = id;
		return this;
	}

	/**
	 * Getter for id
	 */
	public String getId() {
		return this.id;
	}


	/**
	 * Setter for intent
	 */
	public Payment setIntent(String intent) {
		this.intent = intent;
		return this;
	}

	/**
	 * Getter for intent
	 */
	public String getIntent() {
		return this.intent;
	}


	/**
	 * Setter for payer
	 */
	public Payment setPayer(Payer payer) {
		this.payer = payer;
		return this;
	}

	/**
	 * Getter for payer
	 */
	public Payer getPayer() {
		return this.payer;
	}


	/**
	 * Setter for potentialPayerInfo
	 */
	public Payment setPotentialPayerInfo(PotentialPayerInfo potentialPayerInfo) {
		this.potentialPayerInfo = potentialPayerInfo;
		return this;
	}

	/**
	 * Getter for potentialPayerInfo
	 */
	public PotentialPayerInfo getPotentialPayerInfo() {
		return this.potentialPayerInfo;
	}


	/**
	 * Setter for payee
	 */
	public Payment setPayee(Payee payee) {
		this.payee = payee;
		return this;
	}

	/**
	 * Getter for payee
	 */
	public Payee getPayee() {
		return this.payee;
	}


	/**
	 * Setter for cart
	 */
	public Payment setCart(String cart) {
		this.cart = cart;
		return this;
	}

	/**
	 * Getter for cart
	 */
	public String getCart() {
		return this.cart;
	}


	/**
	 * Setter for transactions
	 */
	public Payment setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
		return this;
	}

	/**
	 * Getter for transactions
	 */
	public List<Transaction> getTransactions() {
		return this.transactions;
	}


	/**
	 * Setter for failedTransactions
	 */
	public Payment setFailedTransactions(List<Error> failedTransactions) {
		this.failedTransactions = failedTransactions;
		return this;
	}

	/**
	 * Getter for failedTransactions
	 */
	public List<Error> getFailedTransactions() {
		return this.failedTransactions;
	}


	/**
	 * Setter for billingAgreementTokens
	 */
	public Payment setBillingAgreementTokens(List<BillingAgreementToken> billingAgreementTokens) {
		this.billingAgreementTokens = billingAgreementTokens;
		return this;
	}

	/**
	 * Getter for billingAgreementTokens
	 */
	public List<BillingAgreementToken> getBillingAgreementTokens() {
		return this.billingAgreementTokens;
	}


	/**
	 * Setter for creditFinancingOffered
	 */
	public Payment setCreditFinancingOffered(CreditFinancingOffered creditFinancingOffered) {
		this.creditFinancingOffered = creditFinancingOffered;
		return this;
	}

	/**
	 * Getter for creditFinancingOffered
	 */
	public CreditFinancingOffered getCreditFinancingOffered() {
		return this.creditFinancingOffered;
	}


	/**
	 * Setter for paymentInstruction
	 */
	public Payment setPaymentInstruction(PaymentInstruction paymentInstruction) {
		this.paymentInstruction = paymentInstruction;
		return this;
	}

	/**
	 * Getter for paymentInstruction
	 */
	public PaymentInstruction getPaymentInstruction() {
		return this.paymentInstruction;
	}


	/**
	 * Setter for state
	 */
	public Payment setState(String state) {
		this.state = state;
		return this;
	}

	/**
	 * Getter for state
	 */
	public String getState() {
		return this.state;
	}


	/**
	 * Setter for experienceProfileId
	 */
	public Payment setExperienceProfileId(String experienceProfileId) {
		this.experienceProfileId = experienceProfileId;
		return this;
	}

	/**
	 * Getter for experienceProfileId
	 */
	public String getExperienceProfileId() {
		return this.experienceProfileId;
	}


	/**
	 * Setter for noteToPayer
	 */
	public Payment setNoteToPayer(String noteToPayer) {
		this.noteToPayer = noteToPayer;
		return this;
	}

	/**
	 * Getter for noteToPayer
	 */
	public String getNoteToPayer() {
		return this.noteToPayer;
	}


	/**
	 * Setter for redirectUrls
	 */
	public Payment setRedirectUrls(RedirectUrls redirectUrls) {
		this.redirectUrls = redirectUrls;
		return this;
	}

	/**
	 * Getter for redirectUrls
	 */
	public RedirectUrls getRedirectUrls() {
		return this.redirectUrls;
	}


	/**
	 * Setter for failureReason
	 */
	public Payment setFailureReason(String failureReason) {
		this.failureReason = failureReason;
		return this;
	}

	/**
	 * Getter for failureReason
	 */
	public String getFailureReason() {
		return this.failureReason;
	}


	/**
	 * Setter for createTime
	 */
	public Payment setCreateTime(String createTime) {
		this.createTime = createTime;
		return this;
	}

	/**
	 * Getter for createTime
	 */
	public String getCreateTime() {
		return this.createTime;
	}


	/**
	 * Setter for updateTime
	 */
	public Payment setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
		return this;
	}

	/**
	 * Getter for updateTime
	 */
	public String getUpdateTime() {
		return this.updateTime;
	}


	/**
	 * Setter for links
	 */
	public Payment setLinks(List<Links> links) {
		this.links = links;
		return this;
	}

	/**
	 * Getter for links
	 */
	public List<Links> getLinks() {
		return this.links;
	}


	/**
	 * Creates (and processes) a new Payment Resource.
	 * @param accessToken
	 *            Access Token used for the API call.
	 * @return Payment
	 * @throws PayPalRESTException
	 */
	public Payment create(String accessToken) throws PayPalRESTException {
		APIContext apiContext = new APIContext(accessToken);
		return create(apiContext);
	}

	/**
	 * Creates (and processes) a new Payment Resource.
	 * @param apiContext
	 *            {@link APIContext} used for the API call.
	 * @return Payment
	 * @throws PayPalRESTException
	 */
	public Payment create(APIContext apiContext) throws PayPalRESTException {
		if (apiContext == null) {
			throw new IllegalArgumentException("APIContext cannot be null");
		}
		if (apiContext.getAccessToken() == null || apiContext.getAccessToken().trim().length() <= 0) {
			throw new IllegalArgumentException("AccessToken cannot be null or empty");
		}
		if (apiContext.getHTTPHeaders() == null) {
			apiContext.setHTTPHeaders(new HashMap<String, String>());
		}
		apiContext.getHTTPHeaders().put(Constants.HTTP_CONTENT_TYPE_HEADER, Constants.HTTP_CONTENT_TYPE_JSON);
		apiContext.setSdkVersion(new SDKVersionImpl());
		String resourcePath = "v1/payments/payment";
		String payLoad = this.toJSON();
		return configureAndExecute(apiContext, HttpMethod.POST, resourcePath, payLoad, Payment.class);
	}


	/**
	 * Obtain the Payment resource for the given identifier.
	 * @param accessToken
	 *            Access Token used for the API call.
	 * @param paymentId
	 *            String
	 * @return Payment
	 * @throws PayPalRESTException
	 */
	public static Payment get(String accessToken, String paymentId) throws PayPalRESTException {
		APIContext apiContext = new APIContext(accessToken);
		return get(apiContext, paymentId);
	}

	/**
	 * Obtain the Payment resource for the given identifier.
	 * @param apiContext
	 *            {@link APIContext} used for the API call.
	 * @param paymentId
	 *            String
	 * @return Payment
	 * @throws PayPalRESTException
	 */
	public static Payment get(APIContext apiContext, String paymentId) throws PayPalRESTException {
		if (apiContext == null) {
			throw new IllegalArgumentException("APIContext cannot be null");
		}
		if (apiContext.getAccessToken() == null || apiContext.getAccessToken().trim().length() <= 0) {
			throw new IllegalArgumentException("AccessToken cannot be null or empty");
		}
		if (apiContext.getHTTPHeaders() == null) {
			apiContext.setHTTPHeaders(new HashMap<String, String>());
		}
		apiContext.getHTTPHeaders().put(Constants.HTTP_CONTENT_TYPE_HEADER, Constants.HTTP_CONTENT_TYPE_JSON);
		apiContext.setSdkVersion(new SDKVersionImpl());
		if (paymentId == null) {
			throw new IllegalArgumentException("paymentId cannot be null");
		}
		Object[] parameters = new Object[] {paymentId};
		String pattern = "v1/payments/payment/{0}";
		String resourcePath = RESTUtil.formatURIPath(pattern, parameters);
		String payLoad = "";
		return configureAndExecute(apiContext, HttpMethod.GET, resourcePath, payLoad, Payment.class);
	}


	/**
	 * Executes the payment (after approved by the Payer) associated with this resource when the payment method is PayPal.
	 * @param accessToken
	 *            Access Token used for the API call.
	 * @param paymentExecution
	 *            PaymentExecution
	 * @return Payment
	 * @throws PayPalRESTException
	 */
	public Payment execute(String accessToken, PaymentExecution paymentExecution) throws PayPalRESTException {
		APIContext apiContext = new APIContext(accessToken);
		return execute(apiContext, paymentExecution);
	}

	/**
	 * Executes the payment (after approved by the Payer) associated with this resource when the payment method is PayPal.
	 * @param apiContext
	 *            {@link APIContext} used for the API call.
	 * @param paymentExecution
	 *            PaymentExecution
	 * @return Payment
	 * @throws PayPalRESTException
	 */
	public Payment execute(APIContext apiContext, PaymentExecution paymentExecution) throws PayPalRESTException {
		if (apiContext == null) {
			throw new IllegalArgumentException("APIContext cannot be null");
		}
		if (apiContext.getAccessToken() == null || apiContext.getAccessToken().trim().length() <= 0) {
			throw new IllegalArgumentException("AccessToken cannot be null or empty");
		}
		if (apiContext.getHTTPHeaders() == null) {
			apiContext.setHTTPHeaders(new HashMap<String, String>());
		}
		apiContext.getHTTPHeaders().put(Constants.HTTP_CONTENT_TYPE_HEADER, Constants.HTTP_CONTENT_TYPE_JSON);
		apiContext.setSdkVersion(new SDKVersionImpl());
		if (this.getId() == null) {
			throw new IllegalArgumentException("Id cannot be null");
		}
		if (paymentExecution == null) {
			throw new IllegalArgumentException("paymentExecution cannot be null");
		}
		Object[] parameters = new Object[] {this.getId()};
		String pattern = "v1/payments/payment/{0}/execute";
		String resourcePath = RESTUtil.formatURIPath(pattern, parameters);
		String payLoad = paymentExecution.toJSON();
		return configureAndExecute(apiContext, HttpMethod.POST, resourcePath, payLoad, Payment.class);
	}
	
	/**
	 * Partially update a payment resource by by passing the payment_id in the request URI. In addition, pass a patch_request_object in the body of the request JSON that specifies the operation to perform, path of the target location, and new value to apply. Please note that it is not possible to use patch after execute has been called.
	 * @param accessToken
	 *            Access Token used for the API call.
	 * @param patchRequest
	 *            List<Patch>
	 * @return 
	 * @throws PayPalRESTException
	 */
	public void update(String accessToken, List<Patch> patchRequest) throws PayPalRESTException {
		APIContext apiContext = new APIContext(accessToken);
		update(apiContext, patchRequest);
		return;
	}

	/**
	 * Partially update a payment resource by by passing the payment_id in the request URI. In addition, pass a patch_request_object in the body of the request JSON that specifies the operation to perform, path of the target location, and new value to apply. Please note that it is not possible to use patch after execute has been called.
	 * @param apiContext
	 *            {@link APIContext} used for the API call.
	 * @param patchRequest
	 *            List<Patch>
	 * @return 
	 * @throws PayPalRESTException
	 */
	public void update(APIContext apiContext, List<Patch> patchRequest) throws PayPalRESTException {
		if (apiContext == null) {
			throw new IllegalArgumentException("APIContext cannot be null");
		}
		if (apiContext.getAccessToken() == null || apiContext.getAccessToken().trim().length() <= 0) {
			throw new IllegalArgumentException("AccessToken cannot be null or empty");
		}
		if (apiContext.getHTTPHeaders() == null) {
			apiContext.setHTTPHeaders(new HashMap<String, String>());
		}
		apiContext.getHTTPHeaders().put(Constants.HTTP_CONTENT_TYPE_HEADER, Constants.HTTP_CONTENT_TYPE_JSON);
		apiContext.setSdkVersion(new SDKVersionImpl());
		if (this.getId() == null) {
			throw new IllegalArgumentException("Id cannot be null");
		}
		if (patchRequest == null) {
			throw new IllegalArgumentException("patchRequest cannot be null");
		}
		Object[] parameters = new Object[] {this.getId()};
		String pattern = "v1/payments/payment/{0}";
		String resourcePath = RESTUtil.formatURIPath(pattern, parameters);
		String payLoad = JSONFormatter.toJSON(patchRequest);
		PayPalResource.configureAndExecute(apiContext, HttpMethod.PATCH, resourcePath, payLoad, null);
		return;
	}


	/**
	 * Retrieves a list of Payment resources.
	 * @param accessToken
	 *            Access Token used for the API call.
	 * @param containerMap
	 *            Map<String, String>
	 * @return PaymentHistory
	 * @throws PayPalRESTException
	 */
	public static PaymentHistory list(String accessToken, Map<String, String> containerMap) throws PayPalRESTException {
		APIContext apiContext = new APIContext(accessToken);
		return list(apiContext, containerMap);
	}

	/**
	 * Retrieves a list of Payment resources.
	 * @param apiContext
	 *            {@link APIContext} used for the API call.
	 * @param containerMap
	 *            Map<String, String>
	 * @return PaymentHistory
	 * @throws PayPalRESTException
	 */
	public static PaymentHistory list(APIContext apiContext, Map<String, String> containerMap) throws PayPalRESTException {
		if (apiContext == null) {
			throw new IllegalArgumentException("APIContext cannot be null");
		}
		if (apiContext.getAccessToken() == null || apiContext.getAccessToken().trim().length() <= 0) {
			throw new IllegalArgumentException("AccessToken cannot be null or empty");
		}
		if (apiContext.getHTTPHeaders() == null) {
			apiContext.setHTTPHeaders(new HashMap<String, String>());
		}
		apiContext.getHTTPHeaders().put(Constants.HTTP_CONTENT_TYPE_HEADER, Constants.HTTP_CONTENT_TYPE_JSON);
		apiContext.setSdkVersion(new SDKVersionImpl());
		if (containerMap == null) {
			throw new IllegalArgumentException("containerMap cannot be null");
		}
		Object[] parameters = new Object[] {containerMap};
		String pattern = "v1/payments/payment?count={0}&start_id={1}&start_index={2}&start_time={3}&end_time={4}&payee_id={5}&sort_by={6}&sort_order={7}";
		String resourcePath = RESTUtil.formatURIPath(pattern, parameters);
		String payLoad = "";
		PaymentHistory paymentHistory = configureAndExecute(apiContext, HttpMethod.GET, resourcePath, payLoad, PaymentHistory.class);
//		if (paymentHistory == null) {
//			paymentHistory = new PaymentHistory();
//		}
		
		return paymentHistory;
	}


}
