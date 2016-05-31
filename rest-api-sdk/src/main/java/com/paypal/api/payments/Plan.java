package com.paypal.api.payments;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.GsonBuilder;
import com.paypal.base.Constants;
import com.paypal.base.rest.APIContext;
import com.paypal.base.rest.HttpMethod;
import com.paypal.base.rest.JSONFormatter;
import com.paypal.base.rest.PayPalRESTException;
import com.paypal.base.rest.PayPalResource;
import com.paypal.base.rest.RESTUtil;
import com.paypal.base.sdk.info.SDKVersionImpl;

public class Plan  extends PayPalResource {

	/**
	 * Identifier of the billing plan. 128 characters max.
	 */
	private String id;

	/**
	 * Name of the billing plan. 128 characters max.
	 */
	private String name;

	/**
	 * Description of the billing plan. 128 characters max.
	 */
	private String description;

	/**
	 * Type of the billing plan. Allowed values: `FIXED`, `INFINITE`.
	 */
	private String type;

	/**
	 * Status of the billing plan. Allowed values: `CREATED`, `ACTIVE`, `INACTIVE`, and `DELETED`.
	 */
	private String state;

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
		return configureAndExecute(apiContext, HttpMethod.GET, resourcePath, payLoad, Plan.class);
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
		return configureAndExecute(apiContext, HttpMethod.POST, resourcePath, payLoad, Plan.class);
	}


	/**
	 * Replace specific fields within a billing plan by passing the ID of the billing plan to the request URI. In addition, pass a patch object in the request JSON that specifies the operation to perform, field to update, and new value for each update.
	 * @param accessToken
	 *            Access Token used for the API call.
	 * @param patchRequest
	 *            PatchRequest
	 * @throws PayPalRESTException
	 */
	public void update(String accessToken, List<Patch> patchRequest) throws PayPalRESTException {
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
		String pattern = "v1/payments/billing-plans/{0}";
		String resourcePath = RESTUtil.formatURIPath(pattern, parameters);
		String payLoad = JSONFormatter.toJSON(patchRequest);
		configureAndExecute(apiContext, HttpMethod.PATCH, resourcePath, payLoad, null);
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
	public static PlanList list(String accessToken, Map<String, String> containerMap) throws PayPalRESTException {
		APIContext apiContext = new APIContext(accessToken);
		return list(apiContext, containerMap);
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
	public static PlanList list(APIContext apiContext, Map<String, String> containerMap) throws PayPalRESTException {
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
		PlanList plans = configureAndExecute(apiContext, HttpMethod.GET, resourcePath, payLoad, PlanList.class);
//		if (plans == null) {
//			plans = new PlanList();
//		}
		
		return plans;
	}

}
