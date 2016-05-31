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

public class Capture  extends PayPalResource {

	/**
	 * ID of the capture transaction.
	 */
	private String id;

	/**
	 * Amount being captured. If the amount matches the orginally authorized amount, the state of the authorization changes to `captured`. If not, the state of the authorization changes to `partially_captured`.
	 */
	private Amount amount;

	/**
	 * If set to `true`, all remaining funds held by the authorization will be released in the funding instrument.
	 */
	private Boolean isFinalCapture;

	/**
	 * State of the capture.
	 */
	private String state;

	/**
	 * ID of the payment resource on which this transaction is based.
	 */
	private String parentPayment;

	/**
	 * Transaction fee applicable for this payment.
	 */
	private Currency transactionFee;

	/**
	 * Time of capture as defined in [RFC 3339 Section 5.6](http://tools.ietf.org/html/rfc3339#section-5.6).
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
	public Capture() {
	}


	/**
	 * Setter for id
	 */
	public Capture setId(String id) {
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
	public Capture setAmount(Amount amount) {
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
	 * Setter for isFinalCapture
	 */
	public Capture setIsFinalCapture(Boolean isFinalCapture) {
		this.isFinalCapture = isFinalCapture;
		return this;
	}

	/**
	 * Getter for isFinalCapture
	 */
	public Boolean getIsFinalCapture() {
		return this.isFinalCapture;
	}


	/**
	 * Setter for state
	 */
	public Capture setState(String state) {
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
	public Capture setParentPayment(String parentPayment) {
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
	 * Setter for transactionFee
	 */
	public Capture setTransactionFee(Currency transactionFee) {
		this.transactionFee = transactionFee;
		return this;
	}

	/**
	 * Getter for transactionFee
	 */
	public Currency getTransactionFee() {
		return this.transactionFee;
	}


	/**
	 * Setter for createTime
	 */
	public Capture setCreateTime(String createTime) {
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
	public Capture setUpdateTime(String updateTime) {
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
	public Capture setLinks(List<Links> links) {
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
	 * Obtain the Capture transaction resource for the given identifier.
	 * @param accessToken
	 *            Access Token used for the API call.
	 * @param captureId
	 *            String
	 * @return Capture
	 * @throws PayPalRESTException
	 */
	public static Capture get(String accessToken, String captureId) throws PayPalRESTException {
		APIContext apiContext = new APIContext(accessToken);
		return get(apiContext, captureId);
	}

	/**
	 * Obtain the Capture transaction resource for the given identifier.
	 * @param apiContext
	 *            {@link APIContext} used for the API call.
	 * @param captureId
	 *            String
	 * @return Capture
	 * @throws PayPalRESTException
	 */
	public static Capture get(APIContext apiContext, String captureId) throws PayPalRESTException {
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
		if (captureId == null) {
			throw new IllegalArgumentException("captureId cannot be null");
		}
		Object[] parameters = new Object[] {captureId};
		String pattern = "v1/payments/capture/{0}";
		String resourcePath = RESTUtil.formatURIPath(pattern, parameters);
		String payLoad = "";
		return configureAndExecute(apiContext, HttpMethod.GET, resourcePath, payLoad, Capture.class);
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
		if (refund == null) {
			throw new IllegalArgumentException("refund cannot be null");
		}
		Object[] parameters = new Object[] {this.getId()};
		String pattern = "v1/payments/capture/{0}/refund";
		String resourcePath = RESTUtil.formatURIPath(pattern, parameters);
		String payLoad = refund.toJSON();
		return configureAndExecute(apiContext, HttpMethod.POST, resourcePath, payLoad, Refund.class);
	}


}
