package com.paypal.api.payments;

import java.util.HashMap;
import java.util.List;

import com.paypal.base.Constants;
import com.paypal.base.rest.APIContext;
import com.paypal.base.rest.HttpMethod;
import com.paypal.base.rest.PayPalRESTException;
import com.paypal.base.rest.PayPalResource;
import com.paypal.base.rest.RESTUtil;
import com.paypal.base.sdk.info.SDKVersionImpl;

public class Authorization  extends PayPalResource {

	/**
	 * ID of the authorization transaction.
	 */
	private String id;

	/**
	 * Amount being authorized.
	 */
	private Amount amount;

	/**
	 * Specifies the payment mode of the transaction.
	 */
	private String paymentMode;

	/**
	 * State of the authorization.
	 */
	private String state;

	/**
	 * Reason code, `AUTHORIZATION`, for a transaction state of `pending`.
	 */
	private String reasonCode;

	/**
	 * [DEPRECATED] Reason code for the transaction state being Pending.Obsolete. use reason_code field instead.
	 */
	private String pendingReason;

	/**
	 * The level of seller protection in force for the transaction. Only supported when the `payment_method` is set to `paypal`. Allowed values:<br>  `ELIGIBLE`- Merchant is protected by PayPal's Seller Protection Policy for Unauthorized Payments and Item Not Received.<br> `PARTIALLY_ELIGIBLE`- Merchant is protected by PayPal's Seller Protection Policy for Item Not Received or Unauthorized Payments. Refer to `protection_eligibility_type` for specifics. <br> `INELIGIBLE`- Merchant is not protected under the Seller Protection Policy.
	 */
	private String protectionEligibility;

	/**
	 * The kind of seller protection in force for the transaction. This property is returned only when the `protection_eligibility` property is set to `ELIGIBLE`or `PARTIALLY_ELIGIBLE`. Only supported when the `payment_method` is set to `paypal`. Allowed values:<br> `ITEM_NOT_RECEIVED_ELIGIBLE`- Sellers are protected against claims for items not received.<br> `UNAUTHORIZED_PAYMENT_ELIGIBLE`- Sellers are protected against claims for unauthorized payments.<br> One or both of the allowed values can be returned.
	 */
	private String protectionEligibilityType;

	/**
	 * Fraud Management Filter (FMF) details applied for the payment that could result in accept, deny, or pending action. Returned in a payment response only if the merchant has enabled FMF in the profile settings and one of the fraud filters was triggered based on those settings. See [Fraud Management Filters Summary](https://developer.paypal.com/docs/classic/fmf/integration-guide/FMFSummary/) for more information.
	 */
	private FmfDetails fmfDetails;

	/**
	 * ID of the Payment resource that this transaction is based on.
	 */
	private String parentPayment;

	/**
	 * Authorization expiration time and date as defined in [RFC 3339 Section 5.6](http://tools.ietf.org/html/rfc3339#section-5.6).
	 */
	private String validUntil;

	/**
	 * Time of authorization as defined in [RFC 3339 Section 5.6](http://tools.ietf.org/html/rfc3339#section-5.6).
	 */
	private String createTime;

	/**
	 * Time that the resource was last updated.
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
	public Authorization() {
	}

	/**
	 * Parameterized Constructor
	 */
	public Authorization(Amount amount) {
		this.amount = amount;
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
	 * Setter for paymentMode
	 */
	public Authorization setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
		return this;
	}

	/**
	 * Getter for paymentMode
	 */
	public String getPaymentMode() {
		return this.paymentMode;
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
	 * Setter for reasonCode
	 */
	public Authorization setReasonCode(String reasonCode) {
		this.reasonCode = reasonCode;
		return this;
	}

	/**
	 * Getter for reasonCode
	 */
	public String getReasonCode() {
		return this.reasonCode;
	}


	/**
	 * Setter for pendingReason
	 */
	public Authorization setPendingReason(String pendingReason) {
		this.pendingReason = pendingReason;
		return this;
	}

	/**
	 * Getter for pendingReason
	 */
	public String getPendingReason() {
		return this.pendingReason;
	}


	/**
	 * Setter for protectionEligibility
	 */
	public Authorization setProtectionEligibility(String protectionEligibility) {
		this.protectionEligibility = protectionEligibility;
		return this;
	}

	/**
	 * Getter for protectionEligibility
	 */
	public String getProtectionEligibility() {
		return this.protectionEligibility;
	}


	/**
	 * Setter for protectionEligibilityType
	 */
	public Authorization setProtectionEligibilityType(String protectionEligibilityType) {
		this.protectionEligibilityType = protectionEligibilityType;
		return this;
	}

	/**
	 * Getter for protectionEligibilityType
	 */
	public String getProtectionEligibilityType() {
		return this.protectionEligibilityType;
	}


	/**
	 * Setter for fmfDetails
	 */
	public Authorization setFmfDetails(FmfDetails fmfDetails) {
		this.fmfDetails = fmfDetails;
		return this;
	}

	/**
	 * Getter for fmfDetails
	 */
	public FmfDetails getFmfDetails() {
		return this.fmfDetails;
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
		if (authorizationId == null) {
			throw new IllegalArgumentException("authorizationId cannot be null");
		}
		Object[] parameters = new Object[] {authorizationId};
		String pattern = "v1/payments/authorization/{0}";
		String resourcePath = RESTUtil.formatURIPath(pattern, parameters);
		String payLoad = "";
		return configureAndExecute(apiContext, HttpMethod.GET, resourcePath, payLoad, Authorization.class);
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
		if (capture == null) {
			throw new IllegalArgumentException("capture cannot be null");
		}
		Object[] parameters = new Object[] {this.getId()};
		String pattern = "v1/payments/authorization/{0}/capture";
		String resourcePath = RESTUtil.formatURIPath(pattern, parameters);
		String payLoad = capture.toJSON();
		return configureAndExecute(apiContext, HttpMethod.POST, resourcePath, payLoad, Capture.class);
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
		String pattern = "v1/payments/authorization/{0}/void";
		String resourcePath = RESTUtil.formatURIPath(pattern, parameters);
		String payLoad = "";
		return configureAndExecute(apiContext, HttpMethod.POST, resourcePath, payLoad, Authorization.class);
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
		String pattern = "v1/payments/authorization/{0}/reauthorize";
		String resourcePath = RESTUtil.formatURIPath(pattern, parameters);
		String payLoad = this.toJSON();
		return configureAndExecute(apiContext, HttpMethod.POST, resourcePath, payLoad, Authorization.class);
	}


}
