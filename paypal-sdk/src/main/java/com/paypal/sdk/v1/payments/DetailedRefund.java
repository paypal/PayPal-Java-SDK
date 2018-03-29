// This class was generated on Thu, 29 Mar 2018 19:06:15 UTC by version 0.1.0-dev+2136c8 of Braintree SDK Generator
// DetailedRefund.java
// @version 0.1.0-dev+2136c8
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
