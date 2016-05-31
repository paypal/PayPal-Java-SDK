package com.paypal.api.payments;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.GsonBuilder;
import com.paypal.base.Constants;
import com.paypal.base.rest.APIContext;
import com.paypal.base.rest.HttpMethod;
import com.paypal.base.rest.PayPalRESTException;
import com.paypal.base.rest.PayPalResource;
import com.paypal.base.rest.RESTUtil;
import com.paypal.base.sdk.info.SDKVersionImpl;

public class CreditCard  extends PayPalResource {

	/**
	 * ID of the credit card being saved for later use.
	 */
	private String id;

	/**
	 * Card number.
	 */
	private String number;

	/**
	 * Type of the Card (eg. Visa, Mastercard, etc.).
	 */
	private String type;

	/**
	 * 2 digit card expiry month.
	 */
	private int expireMonth;

	/**
	 * 4 digit card expiry year
	 */
	private int expireYear;

	/**
	 * Card validation code. Only supported when making a Payment but not when saving a credit card for future use.
	 */
	private Integer cvv2;

	/**
	 * Card holder's first name.
	 */
	private String firstName;

	/**
	 * Card holder's last name.
	 */
	private String lastName;

	/**
	 * Billing Address associated with this card.
	 */
	private Address billingAddress;

	/**
	 * A unique identifier of the customer to whom this bank account belongs to. Generated and provided by the facilitator. This is required when creating or using a stored funding instrument in vault.
	 */
	private String externalCustomerId;

	/**
	 * State of the funding instrument.
	 */
	private String state;

	/**
	 * Date/Time until this resource can be used to fund a payment.
	 */
	private String validUntil;

	/**
	 *
	 */
	private List<Links> links;

	/**
	 * Payer ID
	 */
	private String payerId;


	/**
	 * Default Constructor
	 */
	public CreditCard() {
	}

	/**
	 * Parameterized Constructor
	 */
	public CreditCard(String number, String type, int expireMonth, int expireYear) {
		this.number = number;
		this.type = type;
		this.expireMonth = expireMonth;
		this.expireYear = expireYear;
	}


	/**
	 * Setter for id
	 */
	public CreditCard setId(String id) {
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
	 * Setter for number
	 */
	public CreditCard setNumber(String number) {
		this.number = number;
		return this;
	}

	/**
	 * Getter for number
	 */
	public String getNumber() {
		return this.number;
	}


	/**
	 * Setter for type
	 */
	public CreditCard setType(String type) {
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
	 * Setter for expireMonth
	 */
	public CreditCard setExpireMonth(int expireMonth) {
		this.expireMonth = expireMonth;
		return this;
	}

	/**
	 * Getter for expireMonth
	 */
	public int getExpireMonth() {
		return this.expireMonth;
	}


	/**
	 * Setter for expireYear
	 */
	public CreditCard setExpireYear(int expireYear) {
		this.expireYear = expireYear;
		return this;
	}

	/**
	 * Getter for expireYear
	 */
	public int getExpireYear() {
		return this.expireYear;
	}


	/**
	 * Setter for cvv2
	 */
	public CreditCard setCvv2(Integer cvv2) {
		this.cvv2 = cvv2;
		return this;
	}

	/**
	 * Getter for cvv2
	 * Returns -1 if <code>cvv2</code> is null
	 */
	public int getCvv2() {
		if (this.cvv2 == null) {
			return -1;
		} else {
			return this.cvv2;
		}
	}


	/**
	 * Setter for firstName
	 */
	public CreditCard setFirstName(String firstName) {
		this.firstName = firstName;
		return this;
	}

	/**
	 * Getter for firstName
	 */
	public String getFirstName() {
		return this.firstName;
	}


	/**
	 * Setter for lastName
	 */
	public CreditCard setLastName(String lastName) {
		this.lastName = lastName;
		return this;
	}

	/**
	 * Getter for lastName
	 */
	public String getLastName() {
		return this.lastName;
	}


	/**
	 * Setter for billingAddress
	 */
	public CreditCard setBillingAddress(Address billingAddress) {
		this.billingAddress = billingAddress;
		return this;
	}

	/**
	 * Getter for billingAddress
	 */
	public Address getBillingAddress() {
		return this.billingAddress;
	}


	/**
	 * Setter for externalCustomerId
	 */
	public CreditCard setExternalCustomerId(String externalCustomerId) {
		this.externalCustomerId = externalCustomerId;
		return this;
	}

	/**
	 * Getter for externalCustomerId
	 */
	public String getExternalCustomerId() {
		return this.externalCustomerId;
	}


	/**
	 * Setter for state
	 */
	public CreditCard setState(String state) {
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
	 * Setter for validUntil
	 */
	public CreditCard setValidUntil(String validUntil) {
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
	public CreditCard setLinks(List<Links> links) {
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
	 * Setter for payer ID
	 */
	public CreditCard setPayerId(String payerId) {
		this.payerId = payerId;
		return this;
	}

	/**
	 * Getter for payer ID
	 */
	public String getpayerId() {
		return this.payerId;
	}


	/**
	 * Creates a new Credit Card Resource (aka Tokenize).
	 * @param accessToken
	 *            Access Token used for the API call.
	 * @return CreditCard
	 * @throws PayPalRESTException
	 */
	public CreditCard create(String accessToken) throws PayPalRESTException {
		APIContext apiContext = new APIContext(accessToken);
		return create(apiContext);
	}

	/**
	 * Creates a new Credit Card Resource (aka Tokenize).
	 * @param apiContext
	 *            {@link APIContext} used for the API call.
	 * @return CreditCard
	 * @throws PayPalRESTException
	 */
	public CreditCard create(APIContext apiContext) throws PayPalRESTException {
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
		String resourcePath = "v1/vault/credit-cards";
		String payLoad = this.toJSON();
		return configureAndExecute(apiContext, HttpMethod.POST, resourcePath, payLoad, CreditCard.class);
	}


	/**
	 * Obtain the Credit Card resource for the given identifier.
	 * @param accessToken
	 *            Access Token used for the API call.
	 * @param creditCardId
	 *            String
	 * @return CreditCard
	 * @throws PayPalRESTException
	 */
	public static CreditCard get(String accessToken, String creditCardId) throws PayPalRESTException {
		APIContext apiContext = new APIContext(accessToken);
		return get(apiContext, creditCardId);
	}

	/**
	 * Obtain the Credit Card resource for the given identifier.
	 * @param apiContext
	 *            {@link APIContext} used for the API call.
	 * @param creditCardId
	 *            String
	 * @return CreditCard
	 * @throws PayPalRESTException
	 */
	public static CreditCard get(APIContext apiContext, String creditCardId) throws PayPalRESTException {
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
		if (creditCardId == null) {
			throw new IllegalArgumentException("creditCardId cannot be null");
		}
		Object[] parameters = new Object[] {creditCardId};
		String pattern = "v1/vault/credit-cards/{0}";
		String resourcePath = RESTUtil.formatURIPath(pattern, parameters);
		String payLoad = "";
		return configureAndExecute(apiContext, HttpMethod.GET, resourcePath, payLoad, CreditCard.class);
	}


	/**
	 * Delete the Credit Card resource for the given identifier.
	 * @param accessToken
	 *            Access Token used for the API call.

	 * @throws PayPalRESTException
	 */
	public void delete(String accessToken) throws PayPalRESTException {
		APIContext apiContext = new APIContext(accessToken);
		delete(apiContext);
		return;
	}

	/**
	 * Delete the Credit Card resource for the given identifier.
	 * @param apiContext
	 *            {@link APIContext} used for the API call.
	 * @throws PayPalRESTException
	 */
	public void delete(APIContext apiContext) throws PayPalRESTException {
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
			apiContext.setMaskRequestId(true);
		Object[] parameters = new Object[] {this.getId()};
		String pattern = "v1/vault/credit-cards/{0}";
		String resourcePath = RESTUtil.formatURIPath(pattern, parameters);
		String payLoad = "";
		configureAndExecute(apiContext, HttpMethod.DELETE, resourcePath, payLoad, null);
		return;
	}


	/**
	 * Update information in a previously saved card. Only the modified fields need to be passed in the request.
	 * @param accessToken
	 *            Access Token used for the API call.
	 * @param patchRequest
	 *            List<Patch>
	 * @return CreditCard
	 * @throws PayPalRESTException
	 */
	public CreditCard update(String accessToken, List<Patch> patchRequest) throws PayPalRESTException {
		APIContext apiContext = new APIContext(accessToken);
		return update(apiContext, patchRequest);
	}


	/**
	 * Update information in a previously saved card. Only the modified fields need to be passed in the request.
	 * @param apiContext
	 *            {@link APIContext} used for the API call.
	 * @param patchRequest
	 *            List<Patch>
	 * @return CreditCard
	 * @throws PayPalRESTException
	 */
	public CreditCard update(APIContext apiContext, List<Patch> patchRequest) throws PayPalRESTException {
		if (apiContext == null) {
			throw new IllegalArgumentException("APIContext cannot be null");
		}
		if (apiContext.getAccessToken() == null || apiContext.getAccessToken().trim().length() <= 0) {
			throw new IllegalArgumentException("AccessToken cannot be null or empty");
		}
		if (apiContext.getHTTPHeaders() == null) {
			apiContext.setHTTPHeaders(new HashMap<String, String>());
		}
		if (patchRequest == null) {
			throw new IllegalArgumentException("patchRequest cannot be null");
		}
		apiContext.getHTTPHeaders().put(Constants.HTTP_CONTENT_TYPE_HEADER, Constants.HTTP_CONTENT_TYPE_JSON);
		apiContext.setSdkVersion(new SDKVersionImpl());
		if (this.getId() == null) {
			throw new IllegalArgumentException("Id cannot be null");
		}
		Object[] parameters = new Object[] {this.getId()};
		String pattern = "v1/vault/credit-cards/{0}";
		String resourcePath = RESTUtil.formatURIPath(pattern, parameters);
		String payLoad = new GsonBuilder().create().toJson(patchRequest);
		return PayPalResource.configureAndExecute(apiContext, HttpMethod.PATCH, resourcePath, payLoad, CreditCard.class);
	}


	/**
	 * Retrieves a list of Credit Card resources.
	 * @param accessToken
	 *            Access Token used for the API call.
	 * @param containerMap
	 *            Map<String, String>. See https://developer.paypal.com/webapps/developer/docs/api/#list-credit-card-resources
	 * @return CreditCardHistory
	 * @throws PayPalRESTException
	 */
	public static CreditCardHistory list(String accessToken, Map<String, String> containerMap) throws PayPalRESTException {
		APIContext apiContext = new APIContext(accessToken);
		return list(apiContext, containerMap);
	}

	/**
	 * Retrieves a list of Credit Card resources.
	 * @param apiContext
	 *            {@link APIContext} used for the API call.
	 * @param containerMap
	 *            Map<String, String>. See https://developer.paypal.com/webapps/developer/docs/api/#list-credit-card-resources
	 * @return CreditCardHistory
	 * @throws PayPalRESTException
	 */
	public static CreditCardHistory list(APIContext apiContext, Map<String, String> containerMap) throws PayPalRESTException {
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
		String pattern = "v1/vault/credit-cards?merchant_id={0}&external_card_id={1}&external_customer_id={2}&start_time={3}&end_time={4}&page={5}&page_size={6}&sort_order={7}&sort_by={8}&total_required={9}";
		String resourcePath = RESTUtil.formatURIPath(pattern, parameters);
		String payLoad = "";
		CreditCardHistory creditCardHistory = configureAndExecute(apiContext, HttpMethod.GET, resourcePath, payLoad, CreditCardHistory.class);
//		if (creditCardHistory == null) {
//			creditCardHistory = new CreditCardHistory();
//		}

		return creditCardHistory;
	}

	/**
	 * Retrieves a list of Credit Card resources. containerMap (filters) are set to defaults.
	 * @param accessToken
	 *            Access Token used for the API call.
	 * @param containerMap
	 *            Map<String, String>. See https://developer.paypal.com/webapps/developer/docs/api/#list-credit-card-resources
	 * @return CreditCardHistory
	 * @throws PayPalRESTException
	 */
	public static CreditCardHistory list(String accessToken) throws PayPalRESTException {
		APIContext apiContext = new APIContext(accessToken);

		Map<String, String> parameters = new HashMap<String, String>();
		parameters.put("merchant_id", "");
		parameters.put("external_card_id", "");
		parameters.put("external_customer_id", "");
		parameters.put("start_time", "");
		parameters.put("end_time", "");
		parameters.put("page", "1");
		parameters.put("page_size", "10");
		parameters.put("sort_order", "asc");
		parameters.put("sort_by", "create_time");
		parameters.put("total_required", "true");

		return list(apiContext, parameters);
	}

}
