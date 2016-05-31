package com.paypal.api.payments;

import java.util.List;

import com.paypal.base.rest.PayPalModel;


public class CartBase  extends PayPalModel {

	/**
	 * Merchant identifier to the purchase unit. Optional parameter
	 */
	private String referenceId;

	/**
	 * Amount being collected.
	 */
	private Amount amount;

	/**
	 * Recipient of the funds in this transaction.
	 */
	private Payee payee;

	/**
	 * Description of transaction.
	 */
	private String description;

	/**
	 * Note to the recipient of the funds in this transaction.
	 */
	private String noteToPayee;

	/**
	 * Free-form field for the use of clients. Only supported when the `payment_method` is set to `paypal`.
	 */
	private String custom;

	/**
	 * Invoice number used to track the payment. Only supported when the `payment_method` is set to `paypal`.
	 */
	private String invoiceNumber;

	/**
	 * Soft descriptor used when charging this funding source. If length exceeds max length, the value will be truncated
	 */
	private String softDescriptor;

	/**
	 * Soft descriptor city used when charging this funding source. If length exceeds max length, the value will be truncated. Only supported when the `payment_method` is set to `credit_card`
	 */
	private String softDescriptorCity;

	/**
	 * Payment options requested for this purchase unit
	 */
	private PaymentOptions paymentOptions;

	/**
	 * Items and related shipping address within a transaction.
	 */
	private ItemList itemList;

	/**
	 * URL to send payment notifications
	 */
	private String notifyUrl;

	/**
	 * Url on merchant site pertaining to this payment.
	 */
	private String orderUrl;

	/**
	 * List of external funding being applied to the purchase unit. Each external_funding unit should have a unique reference_id
	 */
	private List<ExternalFunding> externalFunding;

	/**
	 * Default Constructor
	 */
	public CartBase() {
	}

	/**
	 * Parameterized Constructor
	 */
	public CartBase(Amount amount) {
		this.amount = amount;
	}


	/**
	 * Setter for referenceId
	 */
	public CartBase setReferenceId(String referenceId) {
		this.referenceId = referenceId;
		return this;
	}

	/**
	 * Getter for referenceId
	 */
	public String getReferenceId() {
		return this.referenceId;
	}


	/**
	 * Setter for amount
	 */
	public CartBase setAmount(Amount amount) {
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
	 * Setter for payee
	 */
	public CartBase setPayee(Payee payee) {
		this.payee = payee;
		return this;
	}

	/**
	 * Getter for payee
	 */
	public Payee getPayee() {
		return this.payee;
	}


	/**
	 * Setter for description
	 */
	public CartBase setDescription(String description) {
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
	 * Setter for noteToPayee
	 */
	public CartBase setNoteToPayee(String noteToPayee) {
		this.noteToPayee = noteToPayee;
		return this;
	}

	/**
	 * Getter for noteToPayee
	 */
	public String getNoteToPayee() {
		return this.noteToPayee;
	}


	/**
	 * Setter for custom
	 */
	public CartBase setCustom(String custom) {
		this.custom = custom;
		return this;
	}

	/**
	 * Getter for custom
	 */
	public String getCustom() {
		return this.custom;
	}


	/**
	 * Setter for invoiceNumber
	 */
	public CartBase setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
		return this;
	}

	/**
	 * Getter for invoiceNumber
	 */
	public String getInvoiceNumber() {
		return this.invoiceNumber;
	}


	/**
	 * Setter for softDescriptor
	 */
	public CartBase setSoftDescriptor(String softDescriptor) {
		this.softDescriptor = softDescriptor;
		return this;
	}

	/**
	 * Getter for softDescriptor
	 */
	public String getSoftDescriptor() {
		return this.softDescriptor;
	}


	/**
	 * Setter for softDescriptorCity
	 */
	public CartBase setSoftDescriptorCity(String softDescriptorCity) {
		this.softDescriptorCity = softDescriptorCity;
		return this;
	}

	/**
	 * Getter for softDescriptorCity
	 */
	public String getSoftDescriptorCity() {
		return this.softDescriptorCity;
	}


	/**
	 * Setter for paymentOptions
	 */
	public CartBase setPaymentOptions(PaymentOptions paymentOptions) {
		this.paymentOptions = paymentOptions;
		return this;
	}

	/**
	 * Getter for paymentOptions
	 */
	public PaymentOptions getPaymentOptions() {
		return this.paymentOptions;
	}


	/**
	 * Setter for itemList
	 */
	public CartBase setItemList(ItemList itemList) {
		this.itemList = itemList;
		return this;
	}

	/**
	 * Getter for itemList
	 */
	public ItemList getItemList() {
		return this.itemList;
	}


	/**
	 * Setter for notifyUrl
	 */
	public CartBase setNotifyUrl(String notifyUrl) {
		this.notifyUrl = notifyUrl;
		return this;
	}

	/**
	 * Getter for notifyUrl
	 */
	public String getNotifyUrl() {
		return this.notifyUrl;
	}


	/**
	 * Setter for orderUrl
	 */
	public CartBase setOrderUrl(String orderUrl) {
		this.orderUrl = orderUrl;
		return this;
	}

	/**
	 * Getter for orderUrl
	 */
	public String getOrderUrl() {
		return this.orderUrl;
	}


	/**
	 * Setter for externalFunding
	 */
	public CartBase setExternalFunding(List<ExternalFunding> externalFunding) {
		this.externalFunding = externalFunding;
		return this;
	}

	/**
	 * Getter for externalFunding
	 */
	public List<ExternalFunding> getExternalFunding() {
		return this.externalFunding;
	}

}
