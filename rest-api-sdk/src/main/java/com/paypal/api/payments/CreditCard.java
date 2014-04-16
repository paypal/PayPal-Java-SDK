package com.paypal.api.payments;

import com.paypal.core.rest.JSONFormatter;
import com.paypal.api.payments.Address;
import com.paypal.api.payments.Links;
import java.util.List;
import java.util.Map;
import com.paypal.core.rest.PayPalRESTException;
import com.paypal.core.rest.PayPalResource;
import com.paypal.core.rest.HttpMethod;
import com.paypal.core.rest.RESTUtil;
import com.paypal.core.rest.QueryParameters;
import com.paypal.core.rest.APIContext;
import com.paypal.core.Constants;
import com.paypal.core.SDKVersion;
import com.paypal.sdk.info.SDKVersionImpl;
import java.io.File;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Properties;

public class CreditCard  {

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
	 * card expiry month with value 1 - 12.
	 */
	private int expireMonth;

	/**
	 * 4 digit card expiry year
	 */
	private int expireYear;

	/**
	 * Card validation code. Only supported when making a Payment but not when saving a credit card for future use.
	 */
	private String cvv2;

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
	 * A unique identifier of the payer generated and provided by the facilitator. This is required when creating or using a tokenized funding instrument.
	 */
	private String payerId;

	/**
	 * State of the funding instrument.
	 */
	private String state;

	/**
	 * Date/Time until this resource can be used fund a payment.
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
	public CreditCard setCvv2(String cvv2) {
		this.cvv2 = cvv2;
		return this;
	}

	/**
	 * Getter for cvv2
	 */
	public String getCvv2() {
		return this.cvv2;
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
	 * Setter for payerId
	 */
	public CreditCard setPayerId(String payerId) {
		this.payerId = payerId;
		return this;
	}

	/**
	 * Getter for payerId
	 */
	public String getPayerId() {
		return this.payerId;
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
		String resourcePath = "v1/vault/credit-card";
		String payLoad = this.toJSON();
		return PayPalResource.configureAndExecute(apiContext, HttpMethod.POST, resourcePath, payLoad, CreditCard.class);
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
		String pattern = "v1/vault/credit-card/{0}";
		String resourcePath = RESTUtil.formatURIPath(pattern, parameters);
		String payLoad = "";
		return PayPalResource.configureAndExecute(apiContext, HttpMethod.GET, resourcePath, payLoad, CreditCard.class);
	}


	/**
	 * Delete the Credit Card resource for the given identifier.
	 * @param accessToken
	 *            Access Token used for the API call.
	 * @return 
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
	 * @return 
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
		String pattern = "v1/vault/credit-card/{0}";
		String resourcePath = RESTUtil.formatURIPath(pattern, parameters);
		String payLoad = "";
		PayPalResource.configureAndExecute(apiContext, HttpMethod.DELETE, resourcePath, payLoad, null);
		return;
	}


	/**
	 * Update information in a previously saved card. Only the modified fields need to be passed in the request.
	 * @param accessToken
	 *            Access Token used for the API call.
	 * @return CreditCard
	 * @throws PayPalRESTException
	 */
	public CreditCard update(String accessToken) throws PayPalRESTException {
		APIContext apiContext = new APIContext(accessToken);
		return update(apiContext);
	}

	/**
	 * Update information in a previously saved card. Only the modified fields need to be passed in the request.
	 * @param apiContext
	 *            {@link APIContext} used for the API call.
	 * @return CreditCard
	 * @throws PayPalRESTException
	 */
	public CreditCard update(APIContext apiContext) throws PayPalRESTException {
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
		Object[] parameters = new Object[] {this.getId()};
		String pattern = "v1/vault/credit-card/{0}";
		String resourcePath = RESTUtil.formatURIPath(pattern, parameters);
		String payLoad = this.toJSON();
		return PayPalResource.configureAndExecute(apiContext, HttpMethod.PATCH, resourcePath, payLoad, CreditCard.class);
	}


	/**
	 * Retrieves a list of Credit Card resources.
	 * @param accessToken
	 *            Access Token used for the API call.
	 * @param containerMap
	 *            Map<String, String>
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
	 *            Map<String, String>
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
		String pattern = "v1/vault/credit-card?count={0}&start_id={1}&start_index={2}&start_time={3}&end_time={4}&payer_id={5}";
		String resourcePath = RESTUtil.formatURIPath(pattern, parameters);
		String payLoad = "";
		return PayPalResource.configureAndExecute(apiContext, HttpMethod.GET, resourcePath, payLoad, CreditCardHistory.class);
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