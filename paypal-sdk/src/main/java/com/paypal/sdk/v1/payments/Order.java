// This class was generated on Mon, 09 Apr 2018 18:13:17 UTC by version 0.1.0-dev+291f3f of Braintree SDK Generator
// Order.java
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
 * The order transaction details.
 */
@Model
public class Order {

    // Required default constructor
    public Order() {}

	/**
	* REQUIRED
	* The payment amount, with details.
	*/
	@SerializedName("amount")
	private Amount amount;

	public Amount amount() { return amount; }
	
	public Order amount(Amount amount) {
	    this.amount = amount;
	    return this;
	}

	/**
	* The date and time when the resource was created, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6).
	*/
	@SerializedName("create_time")
	private String createTime;

	public String createTime() { return createTime; }
	
	public Order createTime(String createTime) {
	    this.createTime = createTime;
	    return this;
	}

	/**
	* The Fraud Management Filter (FMF) details that are applied to the payment that result in an accept, deny, or pending action. Returned in a payment response only if the merchant has enabled FMF in the profile settings and one of the fraud filters was triggered based on those settings. For more information, see [Fraud Management Filters Summary](/docs/classic/fmf/integration-guide/FMFSummary/).
	*/
	@SerializedName("fmf_details")
	private FmfDetails fmfDetails;

	public FmfDetails fmfDetails() { return fmfDetails; }
	
	public Order fmfDetails(FmfDetails fmfDetails) {
	    this.fmfDetails = fmfDetails;
	    return this;
	}

	/**
	* The ID of the order transaction.
	*/
	@SerializedName("id")
	private String id;

	public String id() { return id; }
	
	public Order id(String id) {
	    this.id = id;
	    return this;
	}

	/**
	* An array of request-related [HATEOAS links](/docs/api/overview/#hateoas-links).
	*/
	@SerializedName(value = "links", listClass = LinkDescriptionObject.class)
	private List<LinkDescriptionObject> links;

	public List<LinkDescriptionObject> links() { return links; }
	
	public Order links(List<LinkDescriptionObject> links) {
	    this.links = links;
	    return this;
	}

	/**
	* The ID of the payment on which this transaction is based.
	*/
	@SerializedName("parent_payment")
	private String parentPayment;

	public String parentPayment() { return parentPayment; }
	
	public Order parentPayment(String parentPayment) {
	    this.parentPayment = parentPayment;
	    return this;
	}

	/**
	* The transaction payment mode.
	*/
	@SerializedName("payment_mode")
	private String paymentMode;

	public String paymentMode() { return paymentMode; }
	
	public Order paymentMode(String paymentMode) {
	    this.paymentMode = paymentMode;
	    return this;
	}

	/**
	* Deprecated. The reason code for the pending transaction state. Obsolete. Use `reason_code` instead.
	*/
	@SerializedName("pending_reason")
	private String pendingReason;

	public String pendingReason() { return pendingReason; }
	
	public Order pendingReason(String pendingReason) {
	    this.pendingReason = pendingReason;
	    return this;
	}

	/**
	* The level of seller protection in effect for the transaction.
	*/
	@SerializedName("protection_eligibility")
	private String protectionEligibility;

	public String protectionEligibility() { return protectionEligibility; }
	
	public Order protectionEligibility(String protectionEligibility) {
	    this.protectionEligibility = protectionEligibility;
	    return this;
	}

	/**
	* The kind of seller protection in effect for the transaction. Returned only when the `protection_eligibility` property is `ELIGIBLE` or `PARTIALLY_ELIGIBLE`. Supported only for PayPal payments. One or both of these values can be returned:<ul><li><code>ITEM_NOT_RECEIVED_ELIGIBLE</code>. Sellers are protected against claims for items not received.</li><li><code>UNAUTHORIZED_PAYMENT_ELIGIBLE</code>. Sellers are protected against claims for unauthorized payments.</li></ul>
	*/
	@SerializedName("protection_eligibility_type")
	private String protectionEligibilityType;

	public String protectionEligibilityType() { return protectionEligibilityType; }
	
	public Order protectionEligibilityType(String protectionEligibilityType) {
	    this.protectionEligibilityType = protectionEligibilityType;
	    return this;
	}

	/**
	* The reason code that describes why the transaction state is pending or reversed. Eventually, this parameter will replace the `pending_reason` parameter. Supported only for PayPal payments.
	*/
	@SerializedName("reason_code")
	private String reasonCode;

	public String reasonCode() { return reasonCode; }
	
	public Order reasonCode(String reasonCode) {
	    this.reasonCode = reasonCode;
	    return this;
	}

	/**
	* The ID of the purchase unit that is associated with this object. Obsolete. Used only in `cart_base`.
	*/
	@SerializedName("reference_id")
	private String referenceId;

	public String referenceId() { return referenceId; }
	
	public Order referenceId(String referenceId) {
	    this.referenceId = referenceId;
	    return this;
	}

	/**
	* The order transaction state. Value is:<ul><li><code>pending</code>. The order was created but no authorizations/captures were made against the order.</li><li><code>authorized</code>. The order has only been authorized. No capture was made against the order.</li><li><code>captured</code>. The order has at least one capture initiated.</li><li><code>completed</code>. The order is complete as a capture was made against the order with <code>is_final_capture</code> set to <code>TRUE</code>. No more authorizations/captures can be made against this order.</li><li><code>voided</code>. The order was voided. No more authorizations/captures can be made against this order.</li></ul>
	*/
	@SerializedName("state")
	private String state;

	public String state() { return state; }
	
	public Order state(String state) {
	    this.state = state;
	    return this;
	}

	/**
	* The date and time when the resource was last updated, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6).
	*/
	@SerializedName("update_time")
	private String updateTime;

	public String updateTime() { return updateTime; }
	
	public Order updateTime(String updateTime) {
	    this.updateTime = updateTime;
	    return this;
	}
}
