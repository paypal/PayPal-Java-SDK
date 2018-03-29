// This class was generated on Thu, 29 Mar 2018 19:06:15 UTC by version 0.1.0-dev+2136c8 of Braintree SDK Generator
// Capture.java
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
 * The capture transaction details.
 */
@Model
public class Capture {

    // Required default constructor
    public Capture() {}

	/**
	* The payment amount, with details.
	*/
	@SerializedName("amount")
	private Amount amount;

	public Amount amount() { return amount; }
	
	public Capture amount(Amount amount) {
	    this.amount = amount;
	    return this;
	}

	/**
	* The date and time of the capture, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6).
	*/
	@SerializedName("create_time")
	private String createTime;

	public String createTime() { return createTime; }
	
	public Capture createTime(String createTime) {
	    this.createTime = createTime;
	    return this;
	}

	/**
	* The ID of the capture transaction.
	*/
	@SerializedName("id")
	private String id;

	public String id() { return id; }
	
	public Capture id(String id) {
	    this.id = id;
	    return this;
	}

	/**
	* The invoice number to track this payment.
	*/
	@SerializedName("invoice_number")
	private String invoiceNumber;

	public String invoiceNumber() { return invoiceNumber; }
	
	public Capture invoiceNumber(String invoiceNumber) {
	    this.invoiceNumber = invoiceNumber;
	    return this;
	}

	/**
	* Indicates whether to release all remaining held funds.
	*/
	@SerializedName("is_final_capture")
	private Boolean isFinalCapture;

	public Boolean isFinalCapture() { return isFinalCapture; }
	
	public Capture isFinalCapture(Boolean isFinalCapture) {
	    this.isFinalCapture = isFinalCapture;
	    return this;
	}

	/**
	* An array of request-related [HATEOAS links](/docs/api/overview/#hateoas-links).
	*/
	@SerializedName(value = "links", listClass = LinkDescriptionObject.class)
	private List<LinkDescriptionObject> links;

	public List<LinkDescriptionObject> links() { return links; }
	
	public Capture links(List<LinkDescriptionObject> links) {
	    this.links = links;
	    return this;
	}

	/**
	* The ID of the payment on which this transaction is based.
	*/
	@SerializedName("parent_payment")
	private String parentPayment;

	public String parentPayment() { return parentPayment; }
	
	public Capture parentPayment(String parentPayment) {
	    this.parentPayment = parentPayment;
	    return this;
	}

	/**
	* The reason code that describes why the transaction state is pending or reversed.
	*/
	@SerializedName("reason_code")
	private String reasonCode;

	public String reasonCode() { return reasonCode; }
	
	public Capture reasonCode(String reasonCode) {
	    this.reasonCode = reasonCode;
	    return this;
	}

	/**
	* The capture state. Value is:<ul><li><code>pending</code>. The capture is pending.</li><li><code>completed</code>. The capture has successfully completed.</li><li><code>refunded</code>. The capture was fully refunded.</li><li><code>partially_refunded</code>. The capture was partially refunded.</li><li><code>denied</code>. PayPal has declined to process this transaction.</li></ul>
	*/
	@SerializedName("state")
	private String state;

	public String state() { return state; }
	
	public Capture state(String state) {
	    this.state = state;
	    return this;
	}

	/**
	* The currency and amount for a transaction.
	*/
	@SerializedName("transaction_fee")
	private Currency transactionFee;

	public Currency transactionFee() { return transactionFee; }
	
	public Capture transactionFee(Currency transactionFee) {
	    this.transactionFee = transactionFee;
	    return this;
	}

	/**
	* The date and time when the resource was last updated, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6).
	*/
	@SerializedName("update_time")
	private String updateTime;

	public String updateTime() { return updateTime; }
	
	public Capture updateTime(String updateTime) {
	    this.updateTime = updateTime;
	    return this;
	}
}
