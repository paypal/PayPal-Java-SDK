// This class was generated on Mon, 09 Apr 2018 18:13:17 UTC by version 0.1.0-dev+291f3f of Braintree SDK Generator
// Authorization.java
// @version 0.1.0-dev+291f3f
// @type object
// @data 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
// DO NOT EDIT
package com.paypal.sdk.v1.payments;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * The authorization details.
 */
@Model
public class Authorization {

    // Required default constructor
    public Authorization() {}

	/**
	* REQUIRED
	* The payment amount, with details.
	*/
	@SerializedName("amount")
	private Amount amount;

	public Amount amount() { return amount; }
	
	public Authorization amount(Amount amount) {
	    this.amount = amount;
	    return this;
	}

	/**
	* The date and time when the authorization was created, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6).
	*/
	@SerializedName("create_time")
	private String createTime;

	public String createTime() { return createTime; }
	
	public Authorization createTime(String createTime) {
	    this.createTime = createTime;
	    return this;
	}

	/**
	* The Fraud Management Filter (FMF) details that are applied to the payment that result in an accept, deny, or pending action. Returned in a payment response only if the merchant has enabled FMF in the profile settings and one of the fraud filters was triggered based on those settings. For more information, see [Fraud Management Filters Summary](/docs/classic/fmf/integration-guide/FMFSummary/).
	*/
	@SerializedName("fmf_details")
	private FmfDetails fmfDetails;

	public FmfDetails fmfDetails() { return fmfDetails; }
	
	public Authorization fmfDetails(FmfDetails fmfDetails) {
	    this.fmfDetails = fmfDetails;
	    return this;
	}

	/**
	* The ID of the authorization.
	*/
	@SerializedName("id")
	private String id;

	public String id() { return id; }
	
	public Authorization id(String id) {
	    this.id = id;
	    return this;
	}

	/**
	* An array of request-related [HATEOAS links](/docs/api/overview/#hateoas-links).
	*/
	@SerializedName(value = "links", listClass = LinkDescriptionObject.class)
	private List<LinkDescriptionObject> links;

	public List<LinkDescriptionObject> links() { return links; }
	
	public Authorization links(List<LinkDescriptionObject> links) {
	    this.links = links;
	    return this;
	}

	/**
	* The ID of the payment on which this transaction is based.
	*/
	@SerializedName("parent_payment")
	private String parentPayment;

	public String parentPayment() { return parentPayment; }
	
	public Authorization parentPayment(String parentPayment) {
	    this.parentPayment = parentPayment;
	    return this;
	}

	/**
	* The payment mode of the authorization.
	*/
	@SerializedName("payment_mode")
	private String paymentMode;

	public String paymentMode() { return paymentMode; }
	
	public Authorization paymentMode(String paymentMode) {
	    this.paymentMode = paymentMode;
	    return this;
	}

	/**
	* Deprecated. The reason code for the pending transaction state. Obsolete. Use `reason_code` instead.
	*/
	@SerializedName("pending_reason")
	private String pendingReason;

	public String pendingReason() { return pendingReason; }
	
	public Authorization pendingReason(String pendingReason) {
	    this.pendingReason = pendingReason;
	    return this;
	}

	/**
	* The processor-provided response codes that describe the submitted payment. Supported only when the `payment_method` is `credit_card`.
	*/
	@SerializedName("processor_response")
	private ProcessorResponse processorResponse;

	public ProcessorResponse processorResponse() { return processorResponse; }
	
	public Authorization processorResponse(ProcessorResponse processorResponse) {
	    this.processorResponse = processorResponse;
	    return this;
	}

	/**
	* The level of seller protection present for the transaction. Supported for the PayPal payment method only. Value is:<ul><li><code>ELIGIBLE</code>. Merchant is protected by PayPal's Seller Protection Policy for Unauthorized Payments and Item Not Received.</li><li><code>PARTIALLY_ELIGIBLE</code>. Merchant is protected by PayPal's Seller Protection Policy for Item Not Received or Unauthorized Payments. For details, see `protection_eligibility_type`.</li><li><code>INELIGIBLE</code>. Merchant is not protected under the Seller Protection Policy.</li></ul>
	*/
	@SerializedName("protection_eligibility")
	private String protectionEligibility;

	public String protectionEligibility() { return protectionEligibility; }
	
	public Authorization protectionEligibility(String protectionEligibility) {
	    this.protectionEligibility = protectionEligibility;
	    return this;
	}

	/**
	* The type of seller protection present for the transaction. Returned only when the `protection_eligibility` property is `ELIGIBLE` or `PARTIALLY_ELIGIBLE`. Supported for the PayPal payment method only.<br/><br/>Returns one or both of the allowed values.<br/><br/>Value is:<ul><li><code>ITEM_NOT_RECEIVED_ELIGIBLE</code>. Sellers are protected against claims for items not received.</li><li><code>UNAUTHORIZED_PAYMENT_ELIGIBLE</code>. Sellers are protected against claims for unauthorized payments.</li></ul>
	*/
	@SerializedName("protection_eligibility_type")
	private String protectionEligibilityType;

	public String protectionEligibilityType() { return protectionEligibilityType; }
	
	public Authorization protectionEligibilityType(String protectionEligibilityType) {
	    this.protectionEligibilityType = protectionEligibilityType;
	    return this;
	}

	/**
	* The reason code for the pending transaction state.
	*/
	@SerializedName("reason_code")
	private String reasonCode;

	public String reasonCode() { return reasonCode; }
	
	public Authorization reasonCode(String reasonCode) {
	    this.reasonCode = reasonCode;
	    return this;
	}

	/**
	* The receipt ID, which identifies the payment. Value is 16-digit numeric payment ID number that is returned for guest users.
	*/
	@SerializedName("receipt_id")
	private String receiptId;

	public String receiptId() { return receiptId; }
	
	public Authorization receiptId(String receiptId) {
	    this.receiptId = receiptId;
	    return this;
	}

	/**
	* The ID of the purchase or transaction unit that corresponds to this authorization transaction.
	*/
	@SerializedName("reference_id")
	private String referenceId;

	public String referenceId() { return referenceId; }
	
	public Authorization referenceId(String referenceId) {
	    this.referenceId = referenceId;
	    return this;
	}

	/**
	* The authorization state.
	*/
	@SerializedName("state")
	private String state;

	public String state() { return state; }
	
	public Authorization state(String state) {
	    this.state = state;
	    return this;
	}

	/**
	* The date and time when the authorization was last updated, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6).
	*/
	@SerializedName("update_time")
	private String updateTime;

	public String updateTime() { return updateTime; }
	
	public Authorization updateTime(String updateTime) {
	    this.updateTime = updateTime;
	    return this;
	}

	/**
	* The date and time when the authorization expires, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6).
	*/
	@SerializedName("valid_until")
	private String validUntil;

	public String validUntil() { return validUntil; }
	
	public Authorization validUntil(String validUntil) {
	    this.validUntil = validUntil;
	    return this;
	}
}
