package com.paypal.api.payments;

import com.paypal.core.rest.JSONFormatter;
import com.paypal.api.payments.Payer;
import com.paypal.api.payments.Transaction;
import java.util.List;
import com.paypal.api.payments.RedirectUrls;
import com.paypal.api.payments.Links;
import java.util.Map;
import com.paypal.core.rest.PayPalRESTException;
import com.paypal.core.rest.PayPalResource;
import com.paypal.core.rest.HttpMethod;
import com.paypal.core.rest.RESTUtil;
import com.paypal.core.rest.QueryParameters;
import com.paypal.core.rest.APIContext;
import java.io.File;
import java.io.InputStream;
import java.util.Properties;

public class Payment  {

	/**
	 * Identifier of the payment resource created.
	 */
	private String id;
	
	/**
	 * Time the resource was created.
	 */
	private String createTime;
	
	/**
	 * Time the resource was last updated.
	 */
	private String updateTime;
	
	/**
	 * Intent of the payment - Sale or Authorization or Order.
	 */
	private String intent;
	
	/**
	 * Source of the funds for this payment represented by a PayPal account or a direct credit card.
	 */
	private Payer payer;
	
	/**
	 * A payment can have more than one transaction, with each transaction establishing a contract between the payer and a payee
	 */
	private List<Transaction> transactions;
	
	/**
	 * state of the payment
	 */
	private String state;
	
	/**
	 * Redirect urls required only when using payment_method as PayPal - the only settings supported are return and cancel urls.
	 */
	private RedirectUrls redirectUrls;
	
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
	 * Initialize using InputStream(of a Properties file)
	 * 
	 * @param is
	 *            InputStream
	 * @throws PayPalRESTException
	 */
	public static void initConfig(InputStream is) throws PayPalRESTException {
		PayPalResource.initConfig(is);
	}

	/**
	 * Initialize using a File(Properties file)
	 * 
	 * @param file
	 *            File object of a properties entity
	 * @throws PayPalRESTException
	 */
	public static void initConfig(File file) throws PayPalRESTException {
		PayPalResource.initConfig(file);
	}

	/**
	 * Initialize using Properties
	 * 
	 * @param properties
	 *            Properties object
	 */
	public static void initConfig(Properties properties) {
		PayPalResource.initConfig(properties);
	}
	/**
	 * Default Constructor
	 */
	public Payment() {
	}

	/**
	 * Parameterized Constructor
	 */
	public Payment(String intent, Payer payer, List<Transaction> transactions) {
		this.intent = intent;
		this.payer = payer;
		this.transactions = transactions;
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
		if (apiContext.getAccessToken() == null || apiContext.getAccessToken().trim().length() <= 0) {
			throw new IllegalArgumentException("AccessToken cannot be null or empty");
		}
		String resourcePath = "v1/payments/payment";
		String payLoad = this.toJSON();
		return PayPalResource.configureAndExecute(apiContext, HttpMethod.POST, resourcePath, payLoad, Payment.class);
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
		if (apiContext.getAccessToken() == null || apiContext.getAccessToken().trim().length() <= 0) {
			throw new IllegalArgumentException("AccessToken cannot be null or empty");
		}
		if (paymentId == null) {
			throw new IllegalArgumentException("paymentId cannot be null");
		}
		Object[] parameters = new Object[] {paymentId};
		String pattern = "v1/payments/payment/{0}";
		String resourcePath = RESTUtil.formatURIPath(pattern, parameters);
		String payLoad = "";
		return PayPalResource.configureAndExecute(apiContext, HttpMethod.GET, resourcePath, payLoad, Payment.class);
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
		if (apiContext.getAccessToken() == null || apiContext.getAccessToken().trim().length() <= 0) {
			throw new IllegalArgumentException("AccessToken cannot be null or empty");
		}
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
		return PayPalResource.configureAndExecute(apiContext, HttpMethod.POST, resourcePath, payLoad, Payment.class);
	}
	

	/**
	 * Retrieves a list of Payment resources.
	 * @param accessToken
	 *            Access Token used for the API call.
	 * @param containerMap
	 *      Map containing the query strings with the 
	 *      following values as keys:
	 *      count,
	 *      start_id,
	 *      start_index,
	 *      start_time,
	 *      end_time,
	 *      payee_id,
	 *      sort_by,
	 *      sort_order,
	 *      All other keys in the map are ignored by the SDK
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
	 *      Map containing the query strings with the 
	 *      following values as keys:
	 *      count,
	 *      start_id,
	 *      start_index,
	 *      start_time,
	 *      end_time,
	 *      payee_id,
	 *      sort_by,
	 *      sort_order,
	 *      All other keys in the map are ignored by the SDK
	 * @return PaymentHistory
	 * @throws PayPalRESTException
	 */
	public static PaymentHistory list(APIContext apiContext, Map<String, String> containerMap) throws PayPalRESTException {
		if (apiContext.getAccessToken() == null || apiContext.getAccessToken().trim().length() <= 0) {
			throw new IllegalArgumentException("AccessToken cannot be null or empty");
		}
		if (containerMap == null) {
			throw new IllegalArgumentException("containerMap cannot be null");
		}
		Object[] parameters = new Object[] {containerMap};
		String pattern = "v1/payments/payment?count={0}&start_id={1}&start_index={2}&start_time={3}&end_time={4}&payee_id={5}&sort_by={6}&sort_order={7}";
		String resourcePath = RESTUtil.formatURIPath(pattern, parameters);
		String payLoad = "";
		return PayPalResource.configureAndExecute(apiContext, HttpMethod.GET, resourcePath, payLoad, PaymentHistory.class);
	}
	
	/**
	 * Get call for Payment.
	 * @deprecated
	 * @param accessToken
	 *			AccessToken used for the API call
	 * @param containerMap
	 *      Map containing the query strings with the 
	 *      following values as keys:
	 *      count,
	 *      start_id,
	 *      start_index,
	 *      start_time,
	 *      end_time,
	 *      payee_id,
	 *      sort_by,
	 *      sort_order,
	 *      All other keys in the map are ignored by the SDK
	 * @HttpMethod GET
	 * @URIpath v1/payments/payment?count=:count&start_id=:start_id&start_index=:start_index&start_time=:start_time&end_time=:end_time&payee_id=:payee_id&sort_by=:sort_by&sort_order=:sort_order
	 * @return PaymentHistory
	 */
	public static PaymentHistory get(String accessToken, Map<String, String> containerMap) throws PayPalRESTException {
		return list(accessToken, containerMap);
	}
	
	/**
	 * Get call for Payment.
	 * @deprecated
	 * @param apiContext
	 *			{@link APIContext} to be used for the call.
	 * @param containerMap
	 *      Map containing the query strings with the 
	 *      following values as keys:
	 *      count,
	 *      start_id,
	 *      start_index,
	 *      start_time,
	 *      end_time,
	 *      payee_id,
	 *      sort_by,
	 *      sort_order,
	 *      All other keys in the map are ignored by the SDK
	 * @HttpMethod GET
	 * @URIpath v1/payments/payment?count=:count&start_id=:start_id&start_index=:start_index&start_time=:start_time&end_time=:end_time&payee_id=:payee_id&sort_by=:sort_by&sort_order=:sort_order
	 * @return PaymentHistory
	 */
	public static PaymentHistory get(APIContext apiContext, Map<String, String> containerMap) throws PayPalRESTException {
		return list(apiContext, containerMap);
	}
	

	/**
	 * Get call for Payment.
	 * @deprecated
	 * @param accessToken
	 *			AccessToken used for the API call
	 * @param queryParameters
	 *			Container for query strings
	 * @HttpMethod GET
	 * @URIpath v1/payments/payment?count=:count&start_id=:start_id&start_index=:start_index&start_time=:start_time&end_time=:end_time&payee_id=:payee_id&sort_by=:sort_by&sort_order=:sort_order
	 * @return PaymentHistory
	 */
	public static PaymentHistory get(String accessToken, QueryParameters queryParameters) throws PayPalRESTException {
		return list(accessToken, queryParameters);
	}
	
	/**
	 * Get call for Payment.
	 * @deprecated
	 * @param apiContext
	 *			{@link APIContext} to be used for the call.
	 * @param queryParameters
	 *			Container for query strings
	 * @HttpMethod GET
	 * @URIpath v1/payments/payment?count=:count&start_id=:start_id&start_index=:start_index&start_time=:start_time&end_time=:end_time&payee_id=:payee_id&sort_by=:sort_by&sort_order=:sort_order
	 * @return PaymentHistory
	 */
	public static PaymentHistory get(APIContext apiContext, QueryParameters queryParameters) throws PayPalRESTException {
		return list(apiContext, queryParameters);
	}
	
	/**
	 * Retrieves a list of Payment resources.
	 * @deprecated
	 */
	public static PaymentHistory list(String accessToken, QueryParameters queryParameters) throws PayPalRESTException {
		APIContext apiContext = new APIContext(accessToken);
		return list(apiContext, queryParameters);
	}
	
	/**
	 * Retrieves a list of Payment resources.
	 * @deprecated
	 */
	public static PaymentHistory list(APIContext apiContext, QueryParameters queryParameters) throws PayPalRESTException {
		if (apiContext.getAccessToken() == null || apiContext.getAccessToken().trim().length() <= 0) {
			throw new IllegalArgumentException("AccessToken cannot be null or empty");
		}
		if (queryParameters == null) {
			throw new IllegalArgumentException("queryParameters cannot be null");
		}
		Object[] parameters = new Object[] {queryParameters};
		String pattern = "v1/payments/payment?count={0}&start_id={1}&start_index={2}&start_time={3}&end_time={4}&payee_id={5}&sort_by={6}&sort_order={7}";
		String resourcePath = RESTUtil.formatURIPath(pattern, parameters);
		String payLoad = "";
		return PayPalResource.configureAndExecute(apiContext, HttpMethod.GET, resourcePath, payLoad, PaymentHistory.class);
	}
	
	/**
	 * Returns a JSON string corresponding to object state
	 * 
	 * @return JSON representation
	 */
	public String toJSON() {
		return JSONFormatter.toJSON(this);
	}

	@Override
	public String toString() {
		return toJSON();
	}
}