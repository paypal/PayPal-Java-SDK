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

public class Sale  {

	/**
	 * Identifier of the authorization transaction.
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
	 * Amount being collected.
	 */
	private Amount amount;
	
	/**
	 * State of the sale transaction.
	 */
	private String state;
	
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
	public Sale() {
	}

	/**
	 * Parameterized Constructor
	 */
	public Sale(Amount amount, String state, String parentPayment) {
		this.amount = amount;
		this.state = state;
		this.parentPayment = parentPayment;
	}
	

	/**
	 * Setter for id
	 */
	public Sale setId(String id) {
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
	public Sale setCreateTime(String createTime) {
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
	public Sale setUpdateTime(String updateTime) {
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
	 * Setter for amount
	 */
	public Sale setAmount(Amount amount) {
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
	public Sale setState(String state) {
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
	 * Setter for parentPayment
	 */
	public Sale setParentPayment(String parentPayment) {
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
	public Sale setLinks(List<Links> links) {
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
	 * Obtain the Sale transaction resource for the given identifier.
	 * @param accessToken
	 *            Access Token used for the API call.
	 * @param saleId
	 *            String
	 * @return Sale
	 * @throws PayPalRESTException
	 */
	public static Sale get(String accessToken, String saleId) throws PayPalRESTException {
		APIContext apiContext = new APIContext(accessToken);
		return get(apiContext, saleId);
	}
	
	/**
	 * Obtain the Sale transaction resource for the given identifier.
	 * @param apiContext
	 *            {@link APIContext} used for the API call.
	 * @param saleId
	 *            String
	 * @return Sale
	 * @throws PayPalRESTException
	 */
	public static Sale get(APIContext apiContext, String saleId) throws PayPalRESTException {
		if (apiContext.getAccessToken() == null || apiContext.getAccessToken().trim().length() <= 0) {
			throw new IllegalArgumentException("AccessToken cannot be null or empty");
		}
		if (saleId == null) {
			throw new IllegalArgumentException("saleId cannot be null");
		}
		Object[] parameters = new Object[] {saleId};
		String pattern = "v1/payments/sale/{0}";
		String resourcePath = RESTUtil.formatURIPath(pattern, parameters);
		String payLoad = "";
		return PayPalResource.configureAndExecute(apiContext, HttpMethod.GET, resourcePath, payLoad, Sale.class);
	}
	

	/**
	 * Creates (and processes) a new Refund Transaction added as a related resource.
	 * @param accessToken
	 *            Access Token used for the API call.
	 * @param refund
	 *            Refund
	 * @return Refund
	 * @throws PayPalRESTException
	 */
	public Refund refund(String accessToken, Refund refund) throws PayPalRESTException {
		APIContext apiContext = new APIContext(accessToken);
		return refund(apiContext, refund);
	}
	
	/**
	 * Creates (and processes) a new Refund Transaction added as a related resource.
	 * @param apiContext
	 *            {@link APIContext} used for the API call.
	 * @param refund
	 *            Refund
	 * @return Refund
	 * @throws PayPalRESTException
	 */
	public Refund refund(APIContext apiContext, Refund refund) throws PayPalRESTException {
		if (apiContext.getAccessToken() == null || apiContext.getAccessToken().trim().length() <= 0) {
			throw new IllegalArgumentException("AccessToken cannot be null or empty");
		}
		if (this.getId() == null) {
			throw new IllegalArgumentException("Id cannot be null");
		}
		if (refund == null) {
			throw new IllegalArgumentException("refund cannot be null");
		}
		Object[] parameters = new Object[] {this.getId()};
		String pattern = "v1/payments/sale/{0}/refund";
		String resourcePath = RESTUtil.formatURIPath(pattern, parameters);
		String payLoad = refund.toJSON();
		return PayPalResource.configureAndExecute(apiContext, HttpMethod.POST, resourcePath, payLoad, Refund.class);
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