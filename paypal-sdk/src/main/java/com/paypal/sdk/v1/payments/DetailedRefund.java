// This class was generated on Sat, 07 Apr 2018 21:37:44 UTC by version 0.1.0-dev+843c6b-dirty of Braintree SDK Generator
// DetailedRefund.java
// @version 0.1.0-dev+843c6b-dirty
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
	* The invoice number to track this payment.
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
