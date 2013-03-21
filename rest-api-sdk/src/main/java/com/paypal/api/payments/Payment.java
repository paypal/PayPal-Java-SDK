package com.paypal.api.payments;
import com.paypal.api.payments.Payer;
import java.util.List;
import com.paypal.api.payments.Transaction;
import com.paypal.api.payments.RedirectUrls;
import com.paypal.api.payments.Link;
import com.paypal.api.payments.Resource;
import com.paypal.core.rest.PayPalResource;
import com.paypal.core.rest.HttpMethod;
import com.paypal.core.rest.PayPalRESTException;
import com.paypal.core.rest.RESTUtil;
import com.paypal.core.rest.QueryParameters;
import com.paypal.core.rest.JSONFormatter;
import com.paypal.core.rest.APIContext;
import java.io.File;
import java.io.InputStream;
import java.util.Properties;
import java.util.Map;

/**
 * 
 */
public class Payment extends Resource {
	public enum Intent {
		SALE
	}

	/**
	 * 
	 */ 
	private String id;

	/**
	 * 
	 */ 
	private String createTime;

	/**
	 * 
	 */ 
	private String updateTime;

	/**
	 * 
	 */ 
	private String state;

	/**
	 * 
	 */ 
	private String intent;

	/**
	 * 
	 */ 
	private Payer payer;

	/**
	 * 
	 */ 
	private List<Transaction> transactions;

	/**
	 * 
	 */ 
	private RedirectUrls redirectUrls;

	/**
	 * 
	 */ 
	private List<Link> links;

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
	 * Constructor
	 */
	public Payment() {

	}	

	/**
	 * Getter for id
	 */
	public String getId() {
		return id;
	}
	
	/**
	 * Setter for id;
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * Getter for createTime
	 */
	public String getCreateTime() {
		return createTime;
	}
	
	/**
	 * Setter for createTime;
	 */
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	/**
	 * Getter for updateTime
	 */
	public String getUpdateTime() {
		return updateTime;
	}
	
	/**
	 * Setter for updateTime;
	 */
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}
	/**
	 * Getter for state
	 */
	public String getState() {
		return state;
	}
	
	/**
	 * Setter for state;
	 */
	public void setState(String state) {
		this.state = state;
	}
	/**
	 * Getter for intent
	 */
	public String getIntent() {
		return intent;
	}
	
	/**
	 * Setter for intent;
	 */
	public void setIntent(String intent) {
		this.intent = intent;
	}
	
	/**
	 * Setter for intent;
	 */
	public void setIntent(Intent intent) {
		this.intent = intent.toString().toLowerCase();
	}
	
	/**
	 * Getter for payer
	 */
	public Payer getPayer() {
		return payer;
	}
	
	/**
	 * Setter for payer;
	 */
	public void setPayer(Payer payer) {
		this.payer = payer;
	}
	/**
	 * Getter for transactions
	 */
	public List<Transaction> getTransactions() {
		return transactions;
	}
	
	/**
	 * Setter for transactions;
	 */
	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}
	/**
	 * Getter for redirectUrls
	 */
	public RedirectUrls getRedirectUrls() {
		return redirectUrls;
	}
	
	/**
	 * Setter for redirectUrls;
	 */
	public void setRedirectUrls(RedirectUrls redirectUrls) {
		this.redirectUrls = redirectUrls;
	}
	/**
	 * Getter for links
	 */
	public List<Link> getLinks() {
		return links;
	}
	
	/**
	 * Setter for links;
	 */
	public void setLinks(List<Link> links) {
		this.links = links;
	}



	/**
	 * Get call for Payment.
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
		String pattern = "v1/payments/payment?count={0}&start_id={1}&start_index={2}&start_time={3}&end_time={4}&payee_id={5}&sort_by={6}&sort_order={7}";
		Object[] parameters = new Object[] { containerMap };
		String resourcePath = RESTUtil.formatURIPath(pattern, parameters);
		String payLoad = "";
		return PayPalResource.configureAndExecute(accessToken, HttpMethod.GET, resourcePath, payLoad, PaymentHistory.class);
	}
	

	/**
	 * Get call for Payment.
	 * @param accessToken
	 *			AccessToken used for the API call
	 * @param queryParameters
	 *			Container for query strings
	 * @HttpMethod GET
	 * @URIpath v1/payments/payment?count=:count&start_id=:start_id&start_index=:start_index&start_time=:start_time&end_time=:end_time&payee_id=:payee_id&sort_by=:sort_by&sort_order=:sort_order
	 * @return PaymentHistory
	 */
	public static PaymentHistory get(String accessToken, QueryParameters queryParameters) throws PayPalRESTException {
		String pattern = "v1/payments/payment?count={0}&start_id={1}&start_index={2}&start_time={3}&end_time={4}&payee_id={5}&sort_by={6}&sort_order={7}";
		Object[] parameters = new Object[] { queryParameters };
		String resourcePath = RESTUtil.formatURIPath(pattern, parameters);
		String payLoad = "";
		return PayPalResource.configureAndExecute(accessToken, HttpMethod.GET, resourcePath, payLoad, PaymentHistory.class);
	}

	/**
	 * Create call for Payment.
	 * @param accessToken
	 *			AccessToken used for the API call
	 * @HttpMethod POST
	 * @URIpath v1/payments/payment
	 * @return Payment
	 */
	public Payment create(String accessToken) throws PayPalRESTException {
		APIContext apiContext = new APIContext(accessToken);
		return create(apiContext);
	}
	
	/**
	 * Create call for Payment.
	 * @param apiContext
	 *			APIContext used for the API call
	 * @HttpMethod POST
	 * @URIpath v1/payments/payment
	 * @return Payment
	 */
	public Payment create(APIContext apiContext) throws PayPalRESTException {
		String resourcePath = "v1/payments/payment";
		String payLoad = this.toJSON();	
		return PayPalResource.configureAndExecute(apiContext, HttpMethod.POST, resourcePath, payLoad, Payment.class);
	}

	/**
	 * Get call for Payment.
	 * @param accessToken
	 *			AccessToken used for the API call
	 * @param paymentId
	 * @HttpMethod GET
	 * @URIpath v1/payments/payment/:paymentId
	 * @return Payment
	 */
	public static Payment get(String accessToken, String paymentId) throws PayPalRESTException {
		if ((paymentId == null) || (paymentId.length() <= 0)) {
			throw new IllegalArgumentException("paymentId cannot be null or empty");
		}
		String pattern = "v1/payments/payment/{0}";
		Object[] parameters = new Object[] {  paymentId };
		String resourcePath = RESTUtil.formatURIPath(pattern, parameters);
		String payLoad = "";
		return PayPalResource.configureAndExecute(accessToken, HttpMethod.GET, resourcePath, payLoad, Payment.class);
	}

	/**
	 * Execute call for Payment.
	 * @param accessToken
	 *			AccessToken used for the API call
	 * @param paymentExecution
	 * @HttpMethod POST
	 * @URIpath v1/payments/payment/:paymentId/execute
	 * @return Payment
	 */
	public Payment execute(String accessToken, PaymentExecution paymentExecution) throws PayPalRESTException {
		APIContext apiContext = new APIContext(accessToken);
		return execute(apiContext, paymentExecution);
	}
	
	/**
	 * Execute call for Payment.
	 * @param apiContext
	 *			APIContext used for the API call
	 * @param paymentExecution
	 * @HttpMethod POST
	 * @URIpath v1/payments/payment/:paymentId/execute
	 * @return Payment
	 */
	public Payment execute(APIContext apiContext, PaymentExecution paymentExecution) throws PayPalRESTException {
		if (paymentExecution == null) {
			throw new IllegalArgumentException("paymentExecution cannot be null");
		}
		if (this.getId() == null) {
			throw new IllegalArgumentException("Id cannot be null");
		}
		String pattern = "v1/payments/payment/{0}/execute";
		Object[] parameters = new Object[] { this.getId() };
		String resourcePath = RESTUtil.formatURIPath(pattern, parameters);
		String payLoad = paymentExecution.toJSON();	
		return PayPalResource.configureAndExecute(apiContext, HttpMethod.POST, resourcePath, payLoad, Payment.class);
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