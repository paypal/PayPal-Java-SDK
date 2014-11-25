package com.paypal.api.payments;

import java.io.File;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import com.paypal.core.Constants;
import com.paypal.core.rest.APIContext;
import com.paypal.core.rest.HttpMethod;
import com.paypal.core.rest.JSONFormatter;
import com.paypal.core.rest.OAuthTokenCredential;
import com.paypal.core.rest.PayPalRESTException;
import com.paypal.core.rest.PayPalResource;
import com.paypal.core.rest.RESTUtil;
import com.paypal.sdk.info.SDKVersionImpl;

public class Plan  {

	/**
	 * Identifier of the billing plan.
	 */
	private String id;

	/**
	 * Name of the billing plan.
	 */
	private String name;

	/**
	 * Description of the billing plan.
	 */
	private String description;

	/**
	 * Type of the billing plan. Possible types include: FIXED and INFINITE.
	 */
	private String type;

	/**
	 * Status of the billing plan. Possible states include: CREATED, ACTIVE, and INACTIVE.
	 */
	private String state;

	/**
	 * Details of the merchant who is creating this billing plan.
	 */
	private Payee payee;

	/**
	 * Time when the billing plan was created. Format YYYY-MM-DDTimeTimezone, as defined in [ISO8601](http://tools.ietf.org/html/rfc3339#section-5.6).
	 */
	private String createTime;

	/**
	 * Time when this billing plan was updated. Format YYYY-MM-DDTimeTimezone, as defined in [ISO8601](http://tools.ietf.org/html/rfc3339#section-5.6).
	 */
	private String updateTime;

	/**
	 * Array of payment definitions for this billing plan.
	 */
	private List<PaymentDefinition> paymentDefinitions;

	/**
	 * Array of terms for this billing plan.
	 */
	private List<Terms> terms;

	/**
	 * Specific preferences such as: set up fee, max fail attempts, autobill amount, and others that are configured for this billing plan.
	 */
	private MerchantPreferences merchantPreferences;

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
	 * @return OAuthTokenCredential instance using client ID and client secret loaded from configuration.
	 */
	public static OAuthTokenCredential initConfig(InputStream is) throws PayPalRESTException {
		return PayPalResource.initConfig(is);
	}

	/**
	 * Initialize using a File(Properties file)
	 *
	 * @param file
	 *            File object of a properties entity
	 * @throws PayPalRESTException
	 * @return OAuthTokenCredential instance using client ID and client secret loaded from configuration.
	 */
	public static OAuthTokenCredential initConfig(File file) throws PayPalRESTException {
		return PayPalResource.initConfig(file);
	}

	/**
	 * Initialize using Properties
	 *
	 * @param properties
	 *            Properties object
	 * @return OAuthTokenCredential instance using client ID and client secret loaded from configuration.
	 */
	public static OAuthTokenCredential initConfig(Properties properties) {
		return PayPalResource.initConfig(properties);
	}
	/**
	 * Default Constructor
	 */
	public Plan() {
	}

	/**
	 * Parameterized Constructor
	 */
	public Plan(String name, String description, String type) {
		this.name = name;
		this.description = description;
		this.type = type;
	}


	/**
	 * Setter for id
	 */
	public Plan setId(String id) {
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
	 * Setter for name
	 */
	public Plan setName(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Getter for name
	 */
	public String getName() {
		return this.name;
	}


	/**
	 * Setter for description
	 */
	public Plan setDescription(String description) {
		this.description = description;
		return this;
	}

	/**
	 * Getter for description
	 */
	public String getDescription() {
		return this.description;
	}


	/**
	 * Setter for type
	 */
	public Plan setType(String type) {
		this.type = type;
		return this;
	}

	/**
	 * Getter for type
	 */
	public String getType() {
		return this.type;
	}


	/**
	 * Setter for state
	 */
	public Plan setState(String state) {
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
	 * Setter for payee
	 */
	public Plan setPayee(Payee payee) {
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
	 * Setter for createTime
	 */
	public Plan setCreateTime(String createTime) {
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
	public Plan setUpdateTime(String updateTime) {
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
	 * Setter for paymentDefinitions
	 */
	public Plan setPaymentDefinitions(List<PaymentDefinition> paymentDefinitions) {
		this.paymentDefinitions = paymentDefinitions;
		return this;
	}

	/**
	 * Getter for paymentDefinitions
	 */
	public List<PaymentDefinition> getPaymentDefinitions() {
		return this.paymentDefinitions;
	}


	/**
	 * Setter for terms
	 */
	public Plan setTerms(List<Terms> terms) {
		this.terms = terms;
		return this;
	}

	/**
	 * Getter for terms
	 */
	public List<Terms> getTerms() {
		return this.terms;
	}


	/**
	 * Setter for merchantPreferences
	 */
	public Plan setMerchantPreferences(MerchantPreferences merchantPreferences) {
		this.merchantPreferences = merchantPreferences;
		return this;
	}

	/**
	 * Getter for merchantPreferences
	 */
	public MerchantPreferences getMerchantPreferences() {
		return this.merchantPreferences;
	}


	/**
	 * Setter for links
	 */
	public Plan setLinks(List<Links> links) {
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
	 * Retrieve the details for a particular billing plan by passing the billing plan ID to the request URI.
	 * @param accessToken
	 *            Access Token used for the API call.
	 * @param planId
	 *            String
	 * @return Plan
	 * @throws PayPalRESTException
	 */
	public static Plan get(String accessToken, String planId) throws PayPalRESTException {
		APIContext apiContext = new APIContext(accessToken);
		return get(apiContext, planId);
	}

	/**
	 * Retrieve the details for a particular billing plan by passing the billing plan ID to the request URI.
	 * @param apiContext
	 *            {@link APIContext} used for the API call.
	 * @param planId
	 *            String
	 * @return Plan
	 * @throws PayPalRESTException
	 */
	public static Plan get(APIContext apiContext, String planId) throws PayPalRESTException {
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
		if (planId == null) {
			throw new IllegalArgumentException("planId cannot be null");
		}
		Object[] parameters = new Object[] {planId};
		String pattern = "v1/payments/billing-plans/{0}";
		String resourcePath = RESTUtil.formatURIPath(pattern, parameters);
		String payLoad = "";
		return PayPalResource.configureAndExecute(apiContext, HttpMethod.GET, resourcePath, payLoad, Plan.class);
	}


	/**
	 * Create a new billing plan by passing the details for the plan, including the plan name, description, and type, to the request URI.
	 * @param accessToken
	 *            Access Token used for the API call.
	 * @return Plan
	 * @throws PayPalRESTException
	 */
	public Plan create(String accessToken) throws PayPalRESTException {
		APIContext apiContext = new APIContext(accessToken);
		return create(apiContext);
	}

	/**
	 * Create a new billing plan by passing the details for the plan, including the plan name, description, and type, to the request URI.
	 * @param apiContext
	 *            {@link APIContext} used for the API call.
	 * @return Plan
	 * @throws PayPalRESTException
	 */
	public Plan create(APIContext apiContext) throws PayPalRESTException {
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
		String resourcePath = "v1/payments/billing-plans";
		String payLoad = this.toJSON();
		return PayPalResource.configureAndExecute(apiContext, HttpMethod.POST, resourcePath, payLoad, Plan.class);
	}


	/**
	 * Replace specific fields within a billing plan by passing the ID of the billing plan to the request URI. In addition, pass a patch object in the request JSON that specifies the operation to perform, field to update, and new value for each update.
	 * @param accessToken
	 *            Access Token used for the API call.
	 * @param patchRequest
	 *            PatchRequest
	 * @return 
	 * @throws PayPalRESTException
	 */
	public void update(String accessToken, PatchRequest patchRequest) throws PayPalRESTException {
		APIContext apiContext = new APIContext(accessToken);
		update(apiContext, patchRequest);
		return;
	}

	/**
	 * Replace specific fields within a billing plan by passing the ID of the billing plan to the request URI. In addition, pass a patch object in the request JSON that specifies the operation to perform, field to update, and new value for each update.
	 * @param apiContext
	 *            {@link APIContext} used for the API call.
	 * @param patchRequest
	 *            PatchRequest
	 * @return 
	 * @throws PayPalRESTException
	 */
	public void update(APIContext apiContext, PatchRequest patchRequest) throws PayPalRESTException {
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
		String pattern = "v1/payments/billing-plans/{0}";
		String resourcePath = RESTUtil.formatURIPath(pattern, parameters);
		// put patchRequest in array
		PatchRequest[] patchRequestArray = new PatchRequest[] { patchRequest };
		String payLoad = JSONFormatter.toJSON(patchRequestArray);
		PayPalResource.configureAndExecute(apiContext, HttpMethod.PATCH, resourcePath, payLoad, null);
		return;
	}


	/**
	 * List billing plans according to optional query string parameters specified.
	 * @param accessToken
	 *            Access Token used for the API call.
	 * @param containerMap
	 *            Map<String, String>
	 * @return PlanList
	 * @throws PayPalRESTException
	 */
	public static PlanList plans(String accessToken, Map<String, String> containerMap) throws PayPalRESTException {
		APIContext apiContext = new APIContext(accessToken);
		return plans(apiContext, containerMap);
	}

	/**
	 * List billing plans according to optional query string parameters specified.
	 * @param apiContext
	 *            {@link APIContext} used for the API call.
	 * @param containerMap
	 *            Map<String, String>
	 * @return PlanList
	 * @throws PayPalRESTException
	 */
	public static PlanList plans(APIContext apiContext, Map<String, String> containerMap) throws PayPalRESTException {
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
		String pattern = "v1/payments/billing-plans?page_size={0}&status={1}&page={2}&total_required={3}";
		String resourcePath = RESTUtil.formatURIPath(pattern, parameters);
		String payLoad = "";
		return PayPalResource.configureAndExecute(apiContext, HttpMethod.GET, resourcePath, payLoad, PlanList.class);
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
