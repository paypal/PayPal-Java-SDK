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

public class Authorization  {

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
	 * Amount being authorized for.
	 */
	private Amount amount;
	
	/**
	 * State of the authorization transaction.
	 */
	private String state;
	
	/**
	 * ID of the Payment resource that this transaction is based on.
	 */
	private String parentPayment;
	
	/**
	 * Date/Time until which funds may be captured against this resource.
	 */
	private String validUntil;
	
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
	public Authorization() {
	}


	/**
	 * Setter for id
	 */
	public Authorization setId(String id) {
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
	public Authorization setCreateTime(String createTime) {
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
	public Authorization setUpdateTime(String updateTime) {
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
	public Authorization setAmount(Amount amount) {
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
	public Authorization setState(String state) {
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
	public Authorization setParentPayment(String parentPayment) {
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
	 * Setter for validUntil
	 */
	public Authorization setValidUntil(String validUntil) {
		this.validUntil = validUntil;
		return this;
	}
	
	/**
	 * Getter for validUntil
	 */
	public String getValidUntil() {
		return this.validUntil;
	}


	/**
	 * Setter for links
	 */
	public Authorization setLinks(List<Links> links) {
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
	 * Obtain the Authorization transaction resource for the given identifier.
	 * @param accessToken
	 *            Access Token used for the API call.
	 * @param authorizationId
	 *            String
	 * @return Authorization
	 * @throws PayPalRESTException
	 */
	public static Authorization get(String accessToken, String authorizationId) throws PayPalRESTException {
		APIContext apiContext = new APIContext(accessToken);
		return get(apiContext, authorizationId);
	}
	
	/**
	 * Obtain the Authorization transaction resource for the given identifier.
	 * @param apiContext
	 *            {@link APIContext} used for the API call.
	 * @param authorizationId
	 *            String
	 * @return Authorization
	 * @throws PayPalRESTException
	 */
	public static Authorization get(APIContext apiContext, String authorizationId) throws PayPalRESTException {
		if (apiContext.getAccessToken() == null || apiContext.getAccessToken().trim().length() <= 0) {
			throw new IllegalArgumentException("AccessToken cannot be null or empty");
		}
		if (authorizationId == null) {
			throw new IllegalArgumentException("authorizationId cannot be null");
		}
		Object[] parameters = new Object[] {authorizationId};
		String pattern = "v1/payments/authorization/{0}";
		String resourcePath = RESTUtil.formatURIPath(pattern, parameters);
		String payLoad = "";
		return PayPalResource.configureAndExecute(apiContext, HttpMethod.GET, resourcePath, payLoad, Authorization.class);
	}
	

	/**
	 * Creates (and processes) a new Capture Transaction added as a related resource.
	 * @param accessToken
	 *            Access Token used for the API call.
	 * @param capture
	 *            Capture
	 * @return Capture
	 * @throws PayPalRESTException
	 */
	public Capture capture(String accessToken, Capture capture) throws PayPalRESTException {
		APIContext apiContext = new APIContext(accessToken);
		return capture(apiContext, capture);
	}
	
	/**
	 * Creates (and processes) a new Capture Transaction added as a related resource.
	 * @param apiContext
	 *            {@link APIContext} used for the API call.
	 * @param capture
	 *            Capture
	 * @return Capture
	 * @throws PayPalRESTException
	 */
	public Capture capture(APIContext apiContext, Capture capture) throws PayPalRESTException {
		if (apiContext.getAccessToken() == null || apiContext.getAccessToken().trim().length() <= 0) {
			throw new IllegalArgumentException("AccessToken cannot be null or empty");
		}
		if (this.getId() == null) {
			throw new IllegalArgumentException("Id cannot be null");
		}
		if (capture == null) {
			throw new IllegalArgumentException("capture cannot be null");
		}
		Object[] parameters = new Object[] {this.getId()};
		String pattern = "v1/payments/authorization/{0}/capture";
		String resourcePath = RESTUtil.formatURIPath(pattern, parameters);
		String payLoad = capture.toJSON();
		return PayPalResource.configureAndExecute(apiContext, HttpMethod.POST, resourcePath, payLoad, Capture.class);
	}
	

	/**
	 * Voids (cancels) an Authorization.
	 * @param accessToken
	 *            Access Token used for the API call.
	 * @return Authorization
	 * @throws PayPalRESTException
	 */
	public Authorization doVoid(String accessToken) throws PayPalRESTException {
		APIContext apiContext = new APIContext(accessToken);
		return doVoid(apiContext);
	}
	
	/**
	 * Voids (cancels) an Authorization.
	 * @param apiContext
	 *            {@link APIContext} used for the API call.
	 * @return Authorization
	 * @throws PayPalRESTException
	 */
	public Authorization doVoid(APIContext apiContext) throws PayPalRESTException {
		if (apiContext.getAccessToken() == null || apiContext.getAccessToken().trim().length() <= 0) {
			throw new IllegalArgumentException("AccessToken cannot be null or empty");
		}
		if (this.getId() == null) {
			throw new IllegalArgumentException("Id cannot be null");
		}
		Object[] parameters = new Object[] {this.getId()};
		String pattern = "v1/payments/authorization/{0}/void";
		String resourcePath = RESTUtil.formatURIPath(pattern, parameters);
		String payLoad = "";
		return PayPalResource.configureAndExecute(apiContext, HttpMethod.POST, resourcePath, payLoad, Authorization.class);
	}
	

	/**
	 * Reauthorizes an expired Authorization.
	 * @param accessToken
	 *            Access Token used for the API call.
	 * @return Authorization
	 * @throws PayPalRESTException
	 */
	public Authorization reauthorize(String accessToken) throws PayPalRESTException {
		APIContext apiContext = new APIContext(accessToken);
		return reauthorize(apiContext);
	}
	
	/**
	 * Reauthorizes an expired Authorization.
	 * @param apiContext
	 *            {@link APIContext} used for the API call.
	 * @return Authorization
	 * @throws PayPalRESTException
	 */
	public Authorization reauthorize(APIContext apiContext) throws PayPalRESTException {
		if (apiContext.getAccessToken() == null || apiContext.getAccessToken().trim().length() <= 0) {
			throw new IllegalArgumentException("AccessToken cannot be null or empty");
		}
		if (this.getId() == null) {
			throw new IllegalArgumentException("Id cannot be null");
		}
		Object[] parameters = new Object[] {this.getId()};
		String pattern = "v1/payments/authorization/{0}/reauthorize";
		String resourcePath = RESTUtil.formatURIPath(pattern, parameters);
		String payLoad = this.toJSON();
		return PayPalResource.configureAndExecute(apiContext, HttpMethod.POST, resourcePath, payLoad, Authorization.class);
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