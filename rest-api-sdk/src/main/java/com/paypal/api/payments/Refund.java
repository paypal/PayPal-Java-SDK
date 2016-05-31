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

public class Refund  extends PayPalResource {

	/**
	 * ID of the refund transaction. 17 characters max.
	 */
	private String id;

	/**
	 * Details including both refunded amount (to payer) and refunded fee (to payee). 10 characters max.
	 */
	private Amount amount;

	/**
	 * State of the refund.
	 */
	private String state;

	/**
	 * Reason description for the Sale transaction being refunded.
	 */
	private String reason;

	/**
	 * ID of the Sale transaction being refunded. 
	 */
	private String saleId;

	/**
	 * ID of the sale transaction being refunded.
	 */
	private String captureId;

	/**
	 * ID of the payment resource on which this transaction is based.
	 */
	private String parentPayment;

	/**
	 * Description of what is being refunded for.
	 */
	private String description;

	/**
	 * Time of refund as defined in [RFC 3339 Section 5.6](http://tools.ietf.org/html/rfc3339#section-5.6).
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
	 * Setter for reason
	 */
	public Refund setReason(String reason) {
		this.reason = reason;
		return this;
	}

	/**
	 * Getter for reason
	 */
	public String getReason() {
		return this.reason;
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
	 * Setter for description
	 */
	public Refund setDescription(String description) {
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
	 * Setter for updateTime
	 */
	public Refund setUpdateTime(String updateTime) {
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
		if (refundId == null) {
			throw new IllegalArgumentException("refundId cannot be null");
		}
		Object[] parameters = new Object[] {refundId};
		String pattern = "v1/payments/refund/{0}";
		String resourcePath = RESTUtil.formatURIPath(pattern, parameters);
		String payLoad = "";
		return configureAndExecute(apiContext, HttpMethod.GET, resourcePath, payLoad, Refund.class);
	}


}
