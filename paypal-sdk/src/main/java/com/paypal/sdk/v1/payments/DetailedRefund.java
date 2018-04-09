// This class was generated on Mon, 09 Apr 2018 18:13:17 UTC by version 0.1.0-dev+291f3f of Braintree SDK Generator
// DetailedRefund.java
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
 * The refund transaction details.
 */
@Model
public class DetailedRefund {

    // Required default constructor
    public DetailedRefund() {}

	/**
	* The payment amount, with details.
	*/
	@SerializedName("amount")
	private Amount amount;

	public Amount amount() { return amount; }
	
	public DetailedRefund amount(Amount amount) {
	    this.amount = amount;
	    return this;
	}

	/**
	* The ID of the sale transaction being refunded.
	*/
	@SerializedName("capture_id")
	private String captureId;

	public String captureId() { return captureId; }
	
	public DetailedRefund captureId(String captureId) {
	    this.captureId = captureId;
	    return this;
	}

	/**
	* The date and time when the refund was created, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6).
	*/
	@SerializedName("create_time")
	private String createTime;

	public String createTime() { return createTime; }
	
	public DetailedRefund createTime(String createTime) {
	    this.createTime = createTime;
	    return this;
	}

	/**
	* The note to the payer in this transaction.
	*/
	@SerializedName("custom")
	private String custom;

	public String custom() { return custom; }
	
	public DetailedRefund custom(String custom) {
	    this.custom = custom;
	    return this;
	}

	/**
	* The refund description.
	*/
	@SerializedName("description")
	private String description;

	public String description() { return description; }
	
	public DetailedRefund description(String description) {
	    this.description = description;
	    return this;
	}

	/**
	* The ID of the refund transaction.
	*/
	@SerializedName("id")
	private String id;

	public String id() { return id; }
	
	public DetailedRefund id(String id) {
	    this.id = id;
	    return this;
	}

	/**
	* Your own invoice or tracking ID number. Value is a string of single-byte alphanumeric characters.
	*/
	@SerializedName("invoice_number")
	private String invoiceNumber;

	public String invoiceNumber() { return invoiceNumber; }
	
	public DetailedRefund invoiceNumber(String invoiceNumber) {
	    this.invoiceNumber = invoiceNumber;
	    return this;
	}

	/**
	* An array of request-related [HATEOAS links](/docs/api/overview/#hateoas-links).
	*/
	@SerializedName(value = "links", listClass = LinkDescriptionObject.class)
	private List<LinkDescriptionObject> links;

	public List<LinkDescriptionObject> links() { return links; }
	
	public DetailedRefund links(List<LinkDescriptionObject> links) {
	    this.links = links;
	    return this;
	}

	/**
	* The ID of the payment on which this transaction is based.
	*/
	@SerializedName("parent_payment")
	private String parentPayment;

	public String parentPayment() { return parentPayment; }
	
	public DetailedRefund parentPayment(String parentPayment) {
	    this.parentPayment = parentPayment;
	    return this;
	}

	/**
	* The reason that the transaction is being refunded.
	*/
	@SerializedName("reason")
	private String reason;

	public String reason() { return reason; }
	
	public DetailedRefund reason(String reason) {
	    this.reason = reason;
	    return this;
	}

	/**
	* The currency and amount for a transaction.
	*/
	@SerializedName("refund_from_received_amount")
	private Currency refundFromReceivedAmount;

	public Currency refundFromReceivedAmount() { return refundFromReceivedAmount; }
	
	public DetailedRefund refundFromReceivedAmount(Currency refundFromReceivedAmount) {
	    this.refundFromReceivedAmount = refundFromReceivedAmount;
	    return this;
	}

	/**
	* The currency and amount for a transaction.
	*/
	@SerializedName("refund_from_transaction_fee")
	private Currency refundFromTransactionFee;

	public Currency refundFromTransactionFee() { return refundFromTransactionFee; }
	
	public DetailedRefund refundFromTransactionFee(Currency refundFromTransactionFee) {
	    this.refundFromTransactionFee = refundFromTransactionFee;
	    return this;
	}

	/**
	* The ID of the sale transaction being refunded.
	*/
	@SerializedName("sale_id")
	private String saleId;

	public String saleId() { return saleId; }
	
	public DetailedRefund saleId(String saleId) {
	    this.saleId = saleId;
	    return this;
	}

	/**
	* The state of the refund.
	*/
	@SerializedName("state")
	private String state;

	public String state() { return state; }
	
	public DetailedRefund state(String state) {
	    this.state = state;
	    return this;
	}

	/**
	* The currency and amount for a transaction.
	*/
	@SerializedName("total_refunded_amount")
	private Currency totalRefundedAmount;

	public Currency totalRefundedAmount() { return totalRefundedAmount; }
	
	public DetailedRefund totalRefundedAmount(Currency totalRefundedAmount) {
	    this.totalRefundedAmount = totalRefundedAmount;
	    return this;
	}

	/**
	* The date and time when the resource was last updated, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6).
	*/
	@SerializedName("update_time")
	private String updateTime;

	public String updateTime() { return updateTime; }
	
	public DetailedRefund updateTime(String updateTime) {
	    this.updateTime = updateTime;
	    return this;
	}
}
