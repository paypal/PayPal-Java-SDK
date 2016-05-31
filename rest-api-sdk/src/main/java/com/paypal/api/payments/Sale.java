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

public class Sale  extends PayPalResource {

	/**
	 * ID of the sale transaction.
	 */
	private String id;

	/**
	 * Identifier of the purchased unit associated with this object.
	 */
	private String purchaseUnitReferenceId;

	/**
	 * Amount being collected.
	 */
	private Amount amount;

	/**
	 * Specifies payment mode of the transaction. Only supported when the `payment_method` is set to `paypal`.
	 */
	private String paymentMode;

	/**
	 * State of the sale.
	 */
	private String state;

	/**
	 * Reason code for the transaction state being Pending or Reversed. Only supported when the `payment_method` is set to `paypal`.
	 */
	private String reasonCode;

	/**
	 * The level of seller protection in force for the transaction. Only supported when the `payment_method` is set to `paypal`. 
	 */
	private String protectionEligibility;

	/**
	 * The kind of seller protection in force for the transaction. It is returned only when protection_eligibility is ELIGIBLE or PARTIALLY_ELIGIBLE. Only supported when the `payment_method` is set to `paypal`.
	 */
	private String protectionEligibilityType;

	/**
	 * Expected clearing time for eCheck transactions. Only supported when the `payment_method` is set to `paypal`.
	 */
	private String clearingTime;

	/**
	 * Status of the Recipient Fund. For now, it will be returned only when fund status is held
	 */
	private String paymentHoldStatus;

	/**
	 * Reasons for PayPal holding recipient fund. It is set only if payment hold status is held
	 */
	private List<String> paymentHoldReasons;

	/**
	 * Transaction fee charged by PayPal for this transaction.
	 */
	private Currency transactionFee;

	/**
	 * Net amount the merchant receives for this transaction in their receivable currency. Returned only in cross-currency use cases where a merchant bills a buyer in a non-primary currency for that buyer.
	 */
	private Currency receivableAmount;

	/**
	 * Exchange rate applied for this transaction. Returned only in cross-currency use cases where a merchant bills a buyer in a non-primary currency for that buyer.
	 */
	private String exchangeRate;

	/**
	 * Fraud Management Filter (FMF) details applied for the payment that could result in accept, deny, or pending action. Returned in a payment response only if the merchant has enabled FMF in the profile settings and one of the fraud filters was triggered based on those settings. See [Fraud Management Filters Summary](/docs/classic/fmf/integration-guide/FMFSummary/) for more information.
	 */
	private FmfDetails fmfDetails;

	/**
	 * Receipt id is a payment identification number returned for guest users to identify the payment.
	 */
	private String receiptId;

	/**
	 * ID of the payment resource on which this transaction is based.
	 */
	private String parentPayment;

	/**
	 * Response codes returned by the processor concerning the submitted payment. Only supported when the `payment_method` is set to `credit_card`.
	 */
	private ProcessorResponse processorResponse;

	/**
	 * ID of the billing agreement used as reference to execute this transaction.
	 */
	private String billingAgreementId;

	/**
	 * Time of sale as defined in [RFC 3339 Section 5.6](http://tools.ietf.org/html/rfc3339#section-5.6)
	 */
	private String createTime;

	/**
	 * Time the resource was last updated in UTC ISO8601 format.
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
	public Sale() {
	}

	/**
	 * Parameterized Constructor
	 */
	public Sale(String id, Amount amount, String state, String parentPayment, String createTime) {
		this.id = id;
		this.amount = amount;
		this.state = state;
		this.parentPayment = parentPayment;
		this.createTime = createTime;
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
	 * Setter for purchaseUnitReferenceId
	 */
	public Sale setPurchaseUnitReferenceId(String purchaseUnitReferenceId) {
		this.purchaseUnitReferenceId = purchaseUnitReferenceId;
		return this;
	}

	/**
	 * Getter for purchaseUnitReferenceId
	 */
	public String getPurchaseUnitReferenceId() {
		return this.purchaseUnitReferenceId;
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
	 * Setter for paymentMode
	 */
	public Sale setPaymentMode(String paymentMode) {
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
	 * Setter for reasonCode
	 */
	public Sale setReasonCode(String reasonCode) {
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
	 * Setter for protectionEligibility
	 */
	public Sale setProtectionEligibility(String protectionEligibility) {
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
	public Sale setProtectionEligibilityType(String protectionEligibilityType) {
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
	 * Setter for clearingTime
	 */
	public Sale setClearingTime(String clearingTime) {
		this.clearingTime = clearingTime;
		return this;
	}

	/**
	 * Getter for clearingTime
	 */
	public String getClearingTime() {
		return this.clearingTime;
	}


	/**
	 * Setter for paymentHoldStatus
	 */
	public Sale setPaymentHoldStatus(String paymentHoldStatus) {
		this.paymentHoldStatus = paymentHoldStatus;
		return this;
	}

	/**
	 * Getter for paymentHoldStatus
	 */
	public String getPaymentHoldStatus() {
		return this.paymentHoldStatus;
	}


	/**
	 * Setter for paymentHoldReasons
	 */
	public Sale setPaymentHoldReasons(List<String> paymentHoldReasons) {
		this.paymentHoldReasons = paymentHoldReasons;
		return this;
	}

	/**
	 * Getter for paymentHoldReasons
	 */
	public List<String> getPaymentHoldReasons() {
		return this.paymentHoldReasons;
	}


	/**
	 * Setter for transactionFee
	 */
	public Sale setTransactionFee(Currency transactionFee) {
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
	 * Setter for receivableAmount
	 */
	public Sale setReceivableAmount(Currency receivableAmount) {
		this.receivableAmount = receivableAmount;
		return this;
	}

	/**
	 * Getter for receivableAmount
	 */
	public Currency getReceivableAmount() {
		return this.receivableAmount;
	}


	/**
	 * Setter for exchangeRate
	 */
	public Sale setExchangeRate(String exchangeRate) {
		this.exchangeRate = exchangeRate;
		return this;
	}

	/**
	 * Getter for exchangeRate
	 */
	public String getExchangeRate() {
		return this.exchangeRate;
	}


	/**
	 * Setter for fmfDetails
	 */
	public Sale setFmfDetails(FmfDetails fmfDetails) {
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
	 * Setter for receiptId
	 */
	public Sale setReceiptId(String receiptId) {
		this.receiptId = receiptId;
		return this;
	}

	/**
	 * Getter for receiptId
	 */
	public String getReceiptId() {
		return this.receiptId;
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
	 * Setter for processorResponse
	 */
	public Sale setProcessorResponse(ProcessorResponse processorResponse) {
		this.processorResponse = processorResponse;
		return this;
	}

	/**
	 * Getter for processorResponse
	 */
	public ProcessorResponse getProcessorResponse() {
		return this.processorResponse;
	}


	/**
	 * Setter for billingAgreementId
	 */
	public Sale setBillingAgreementId(String billingAgreementId) {
		this.billingAgreementId = billingAgreementId;
		return this;
	}

	/**
	 * Getter for billingAgreementId
	 */
	public String getBillingAgreementId() {
		return this.billingAgreementId;
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
		if (saleId == null) {
			throw new IllegalArgumentException("saleId cannot be null");
		}
		Object[] parameters = new Object[] {saleId};
		String pattern = "v1/payments/sale/{0}";
		String resourcePath = RESTUtil.formatURIPath(pattern, parameters);
		String payLoad = "";
		return configureAndExecute(apiContext, HttpMethod.GET, resourcePath, payLoad, Sale.class);
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
		String pattern = "v1/payments/sale/{0}/refund";
		String resourcePath = RESTUtil.formatURIPath(pattern, parameters);
		String payLoad = refund.toJSON();
		return configureAndExecute(apiContext, HttpMethod.POST, resourcePath, payLoad, Refund.class);
	}


}
