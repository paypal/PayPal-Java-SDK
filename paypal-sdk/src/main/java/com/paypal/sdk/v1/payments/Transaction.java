// This class was generated on Mon, 09 Apr 2018 18:13:17 UTC by version 0.1.0-dev+291f3f of Braintree SDK Generator
// Transaction.java
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
 * An array of payment-related transactions. A transaction defines what the payment is for and who fulfills the payment.
 */
@Model
public class Transaction {

    // Required default constructor
    public Transaction() {}

	/**
	* REQUIRED
	* The payment amount, with details.
	*/
	@SerializedName("amount")
	private Amount amount;

	public Amount amount() { return amount; }
	
	public Transaction amount(Amount amount) {
	    this.amount = amount;
	    return this;
	}

	/**
	* A free-form field for the client's use.
	*/
	@SerializedName("custom")
	private String custom;

	public String custom() { return custom; }
	
	public Transaction custom(String custom) {
	    this.custom = custom;
	    return this;
	}

	/**
	* The purchase description.
	*/
	@SerializedName("description")
	private String description;

	public String description() { return description; }
	
	public Transaction description(String description) {
	    this.description = description;
	    return this;
	}

	/**
	* The invoice number to track this payment.
	*/
	@SerializedName("invoice_number")
	private String invoiceNumber;

	public String invoiceNumber() { return invoiceNumber; }
	
	public Transaction invoiceNumber(String invoiceNumber) {
	    this.invoiceNumber = invoiceNumber;
	    return this;
	}

	/**
	* An array of items that are being purchased.
	*/
	@SerializedName("item_list")
	private ItemList itemList;

	public ItemList itemList() { return itemList; }
	
	public Transaction itemList(ItemList itemList) {
	    this.itemList = itemList;
	    return this;
	}

	/**
	* Optional. A note to the recipient of the funds in this transaction.
	*/
	@SerializedName("note_to_payee")
	private String noteToPayee;

	public String noteToPayee() { return noteToPayee; }
	
	public Transaction noteToPayee(String noteToPayee) {
	    this.noteToPayee = noteToPayee;
	    return this;
	}

	/**
	* The URL to send payment notifications.
	*/
	@SerializedName("notify_url")
	private String notifyUrl;

	public String notifyUrl() { return notifyUrl; }
	
	public Transaction notifyUrl(String notifyUrl) {
	    this.notifyUrl = notifyUrl;
	    return this;
	}

	/**
	* The URL on the merchant site related to this payment.
	*/
	@SerializedName("order_url")
	private String orderUrl;

	public String orderUrl() { return orderUrl; }
	
	public Transaction orderUrl(String orderUrl) {
	    this.orderUrl = orderUrl;
	    return this;
	}

	/**
	* The payee who receives the funds and fulfills the order.
	*/
	@SerializedName("payee")
	private Payee payee;

	public Payee payee() { return payee; }
	
	public Transaction payee(Payee payee) {
	    this.payee = payee;
	    return this;
	}

	/**
	* The payment options for this transaction.
	*/
	@SerializedName("payment_options")
	private PaymentOptions paymentOptions;

	public PaymentOptions paymentOptions() { return paymentOptions; }
	
	public Transaction paymentOptions(PaymentOptions paymentOptions) {
	    this.paymentOptions = paymentOptions;
	    return this;
	}

	/**
	* The purchase order number or ID. Identifies this payment.
	*/
	@SerializedName("purchase_order")
	private String purchaseOrder;

	public String purchaseOrder() { return purchaseOrder; }
	
	public Transaction purchaseOrder(String purchaseOrder) {
	    this.purchaseOrder = purchaseOrder;
	    return this;
	}

	/**
	* Optional. The merchant-provided ID for the purchase unit.
	*/
	@SerializedName("reference_id")
	private String referenceId;

	public String referenceId() { return referenceId; }
	
	public Transaction referenceId(String referenceId) {
	    this.referenceId = referenceId;
	    return this;
	}

	/**
	* An array of payment-related transactions. A transaction defines what the payment is for and who fulfills the payment.
	*/
	@SerializedName(value = "related_resources", listClass = RelatedResources.class)
	private List<RelatedResources> relatedResources;

	public List<RelatedResources> relatedResources() { return relatedResources; }
	
	public Transaction relatedResources(List<RelatedResources> relatedResources) {
	    this.relatedResources = relatedResources;
	    return this;
	}

	/**
	* The soft descriptor to use to charge this funding source. If the string's length is greater than the maximum allowed length, the API truncates the string.
	*/
	@SerializedName("soft_descriptor")
	private String softDescriptor;

	public String softDescriptor() { return softDescriptor; }
	
	public Transaction softDescriptor(String softDescriptor) {
	    this.softDescriptor = softDescriptor;
	    return this;
	}
}
