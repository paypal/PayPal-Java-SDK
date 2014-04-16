package com.paypal.api.payments;

import com.paypal.core.rest.JSONFormatter;
import com.paypal.api.payments.Currency;

public class InvoicingSearch  {

	/**
	 * Initial letters of the email address.
	 */
	private String email;

	/**
	 * Initial letters of the recipient's first name.
	 */
	private String recipientFirstName;

	/**
	 * Initial letters of the recipient's last name.
	 */
	private String recipientLastName;

	/**
	 * Initial letters of the recipient's business name.
	 */
	private String recipientBusinessName;

	/**
	 * The invoice number that appears on the invoice.
	 */
	private String number;

	/**
	 * Status of the invoice.
	 */
	private String status;

	/**
	 * Lower limit of total amount.
	 */
	private Currency lowerTotalAmount;

	/**
	 * Upper limit of total amount.
	 */
	private Currency upperTotalAmount;

	/**
	 * Start invoice date.
	 */
	private String startInvoiceDate;

	/**
	 * End invoice date.
	 */
	private String endInvoiceDate;

	/**
	 * Start invoice due date.
	 */
	private String startDueDate;

	/**
	 * End invoice due date.
	 */
	private String endDueDate;

	/**
	 * Start invoice payment date.
	 */
	private String startPaymentDate;

	/**
	 * End invoice payment date.
	 */
	private String endPaymentDate;

	/**
	 * Start invoice creation date.
	 */
	private String startCreationDate;

	/**
	 * End invoice creation date.
	 */
	private String endCreationDate;

	/**
	 * Offset of the search results.
	 */
	private float page;

	/**
	 * Page size of the search results.
	 */
	private float pageSize;

	/**
	 * A flag indicating whether total count is required in the response.
	 */
	private Boolean totalCountRequired;

	/**
	 * Default Constructor
	 */
	public InvoicingSearch() {
	}


	/**
	 * Setter for email
	 */
	public InvoicingSearch setEmail(String email) {
		this.email = email;
		return this;
	}

	/**
	 * Getter for email
	 */
	public String getEmail() {
		return this.email;
	}


	/**
	 * Setter for recipientFirstName
	 */
	public InvoicingSearch setRecipientFirstName(String recipientFirstName) {
		this.recipientFirstName = recipientFirstName;
		return this;
	}

	/**
	 * Getter for recipientFirstName
	 */
	public String getRecipientFirstName() {
		return this.recipientFirstName;
	}


	/**
	 * Setter for recipientLastName
	 */
	public InvoicingSearch setRecipientLastName(String recipientLastName) {
		this.recipientLastName = recipientLastName;
		return this;
	}

	/**
	 * Getter for recipientLastName
	 */
	public String getRecipientLastName() {
		return this.recipientLastName;
	}


	/**
	 * Setter for recipientBusinessName
	 */
	public InvoicingSearch setRecipientBusinessName(String recipientBusinessName) {
		this.recipientBusinessName = recipientBusinessName;
		return this;
	}

	/**
	 * Getter for recipientBusinessName
	 */
	public String getRecipientBusinessName() {
		return this.recipientBusinessName;
	}


	/**
	 * Setter for number
	 */
	public InvoicingSearch setNumber(String number) {
		this.number = number;
		return this;
	}

	/**
	 * Getter for number
	 */
	public String getNumber() {
		return this.number;
	}


	/**
	 * Setter for status
	 */
	public InvoicingSearch setStatus(String status) {
		this.status = status;
		return this;
	}

	/**
	 * Getter for status
	 */
	public String getStatus() {
		return this.status;
	}


	/**
	 * Setter for lowerTotalAmount
	 */
	public InvoicingSearch setLowerTotalAmount(Currency lowerTotalAmount) {
		this.lowerTotalAmount = lowerTotalAmount;
		return this;
	}

	/**
	 * Getter for lowerTotalAmount
	 */
	public Currency getLowerTotalAmount() {
		return this.lowerTotalAmount;
	}


	/**
	 * Setter for upperTotalAmount
	 */
	public InvoicingSearch setUpperTotalAmount(Currency upperTotalAmount) {
		this.upperTotalAmount = upperTotalAmount;
		return this;
	}

	/**
	 * Getter for upperTotalAmount
	 */
	public Currency getUpperTotalAmount() {
		return this.upperTotalAmount;
	}


	/**
	 * Setter for startInvoiceDate
	 */
	public InvoicingSearch setStartInvoiceDate(String startInvoiceDate) {
		this.startInvoiceDate = startInvoiceDate;
		return this;
	}

	/**
	 * Getter for startInvoiceDate
	 */
	public String getStartInvoiceDate() {
		return this.startInvoiceDate;
	}


	/**
	 * Setter for endInvoiceDate
	 */
	public InvoicingSearch setEndInvoiceDate(String endInvoiceDate) {
		this.endInvoiceDate = endInvoiceDate;
		return this;
	}

	/**
	 * Getter for endInvoiceDate
	 */
	public String getEndInvoiceDate() {
		return this.endInvoiceDate;
	}


	/**
	 * Setter for startDueDate
	 */
	public InvoicingSearch setStartDueDate(String startDueDate) {
		this.startDueDate = startDueDate;
		return this;
	}

	/**
	 * Getter for startDueDate
	 */
	public String getStartDueDate() {
		return this.startDueDate;
	}


	/**
	 * Setter for endDueDate
	 */
	public InvoicingSearch setEndDueDate(String endDueDate) {
		this.endDueDate = endDueDate;
		return this;
	}

	/**
	 * Getter for endDueDate
	 */
	public String getEndDueDate() {
		return this.endDueDate;
	}


	/**
	 * Setter for startPaymentDate
	 */
	public InvoicingSearch setStartPaymentDate(String startPaymentDate) {
		this.startPaymentDate = startPaymentDate;
		return this;
	}

	/**
	 * Getter for startPaymentDate
	 */
	public String getStartPaymentDate() {
		return this.startPaymentDate;
	}


	/**
	 * Setter for endPaymentDate
	 */
	public InvoicingSearch setEndPaymentDate(String endPaymentDate) {
		this.endPaymentDate = endPaymentDate;
		return this;
	}

	/**
	 * Getter for endPaymentDate
	 */
	public String getEndPaymentDate() {
		return this.endPaymentDate;
	}


	/**
	 * Setter for startCreationDate
	 */
	public InvoicingSearch setStartCreationDate(String startCreationDate) {
		this.startCreationDate = startCreationDate;
		return this;
	}

	/**
	 * Getter for startCreationDate
	 */
	public String getStartCreationDate() {
		return this.startCreationDate;
	}


	/**
	 * Setter for endCreationDate
	 */
	public InvoicingSearch setEndCreationDate(String endCreationDate) {
		this.endCreationDate = endCreationDate;
		return this;
	}

	/**
	 * Getter for endCreationDate
	 */
	public String getEndCreationDate() {
		return this.endCreationDate;
	}


	/**
	 * Setter for page
	 */
	public InvoicingSearch setPage(float page) {
		this.page = page;
		return this;
	}

	/**
	 * Getter for page
	 */
	public float getPage() {
		return this.page;
	}


	/**
	 * Setter for pageSize
	 */
	public InvoicingSearch setPageSize(float pageSize) {
		this.pageSize = pageSize;
		return this;
	}

	/**
	 * Getter for pageSize
	 */
	public float getPageSize() {
		return this.pageSize;
	}


	/**
	 * Setter for totalCountRequired
	 */
	public InvoicingSearch setTotalCountRequired(Boolean totalCountRequired) {
		this.totalCountRequired = totalCountRequired;
		return this;
	}

	/**
	 * Getter for totalCountRequired
	 */
	public Boolean getTotalCountRequired() {
		return this.totalCountRequired;
	}

	/**
	 * Returns a JSON string corresponding to object state
	 *
	 * @return JSON representation
	 */
	public String toJSON() {
		return JSONFormatter.toJSON(this);
	}

	@Override
	public String toString() {
		return toJSON();
	}
}