package com.paypal.api.payments;

import com.paypal.core.rest.JSONFormatter;
import com.paypal.api.payments.Amount;
import com.paypal.api.payments.Links;
import java.util.List;
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

public class Refund  {

	/**
	 * Identifier of the refund transaction.
	 */
	private String id;
	
	/**
	 * Time the resource was created.
	 */
	private String createTime;
	
	/**
	 * Details including both refunded amount (to Payer) and refunded fee (to Payee).If amount is not specified, it's assumed to be full refund.
	 */
	private Amount amount;
	
	/**
	 * State of the refund transaction.
	 */
	private String state;
	
	/**
	 * ID of the Sale transaction being refunded. 
	 */
	private String saleId;
	
	/**
	 * ID of the Capture transaction being refunded. 
	 */
	private String captureId;
	
	/**
	 * ID of the Payment resource that this transaction is based on.
	 */
	private String parentPayment;
	
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
	public Refund() {
	}


	/**
	 * Setter for id
	 */
	public Refund setId(String id) {
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
	public Refund setCreateTime(String createTime) {
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
	 * Setter for amount
	 */
	public Refund setAmount(Amount amount) {
		this.amount = amount;
		return this;
	}
	
	/**
	 * Getter for amount
	 */
	public Amount getAmount() {
		return this.amount;
	}


	/**
	 * Setter for state
	 */
	public Refund setState(String state) {
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
	 * Setter for saleId
	 */
	public Refund setSaleId(String saleId) {
		this.saleId = saleId;
		return this;
	}
	
	/**
	 * Getter for saleId
	 */
	public String getSaleId() {
		return this.saleId;
	}


	/**
	 * Setter for captureId
	 */
	public Refund setCaptureId(String captureId) {
		this.captureId = captureId;
		return this;
	}
	
	/**
	 * Getter for captureId
	 */
	public String getCaptureId() {
		return this.captureId;
	}


	/**
	 * Setter for parentPayment
	 */
	public Refund setParentPayment(String parentPayment) {
		this.parentPayment = parentPayment;
		return this;
	}
	
	/**
	 * Getter for parentPayment
	 */
	public String getParentPayment() {
		return this.parentPayment;
	}


	/**
	 * Setter for links
	 */
	public Refund setLinks(List<Links> links) {
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
	 * Obtain the Refund transaction resource for the given identifier.
	 * @param accessToken
	 *            Access Token used for the API call.
	 * @param refundId
	 *            String
	 * @return Refund
	 * @throws PayPalRESTException
	 */
	public static Refund get(String accessToken, String refundId) throws PayPalRESTException {
		APIContext apiContext = new APIContext(accessToken);
		return get(apiContext, refundId);
	}
	
	/**
	 * Obtain the Refund transaction resource for the given identifier.
	 * @param apiContext
	 *            {@link APIContext} used for the API call.
	 * @param refundId
	 *            String
	 * @return Refund
	 * @throws PayPalRESTException
	 */
	public static Refund get(APIContext apiContext, String refundId) throws PayPalRESTException {
		if (apiContext.getAccessToken() == null || apiContext.getAccessToken().trim().length() <= 0) {
			throw new IllegalArgumentException("AccessToken cannot be null or empty");
		}
		if (refundId == null) {
			throw new IllegalArgumentException("refundId cannot be null");
		}
		Object[] parameters = new Object[] {refundId};
		String pattern = "v1/payments/refund/{0}";
		String resourcePath = RESTUtil.formatURIPath(pattern, parameters);
		String payLoad = "";
		return PayPalResource.configureAndExecute(apiContext, HttpMethod.GET, resourcePath, payLoad, Refund.class);
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