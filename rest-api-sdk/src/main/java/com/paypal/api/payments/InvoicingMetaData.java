package com.paypal.api.payments;

import com.paypal.core.rest.JSONFormatter;

public class InvoicingMetaData  {

	/**
	 * Date when the resource was created.
	 */
	private String createdDate;

	/**
	 * Email address of the account that created the resource.
	 */
	private String createdBy;

	/**
	 * Date when the resource was cancelled.
	 */
	private String cancelledDate;

	/**
	 * Actor who cancelled the resource.
	 */
	private String cancelledBy;

	/**
	 * Date when the resource was last edited.
	 */
	private String lastUpdatedDate;

	/**
	 * Email address of the account that last edited the resource.
	 */
	private String lastUpdatedBy;

	/**
	 * Date when the resource was first sent.
	 */
	private String firstSentDate;

	/**
	 * Date when the resource was last sent.
	 */
	private String lastSentDate;

	/**
	 * Email address of the account that last sent the resource.
	 */
	private String lastSentBy;

	/**
	 * Default Constructor
	 */
	public InvoicingMetaData() {
	}


	/**
	 * Setter for createdDate
	 */
	public InvoicingMetaData setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
		return this;
	}

	/**
	 * Getter for createdDate
	 */
	public String getCreatedDate() {
		return this.createdDate;
	}


	/**
	 * Setter for createdBy
	 */
	public InvoicingMetaData setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
		return this;
	}

	/**
	 * Getter for createdBy
	 */
	public String getCreatedBy() {
		return this.createdBy;
	}


	/**
	 * Setter for cancelledDate
	 */
	public InvoicingMetaData setCancelledDate(String cancelledDate) {
		this.cancelledDate = cancelledDate;
		return this;
	}

	/**
	 * Getter for cancelledDate
	 */
	public String getCancelledDate() {
		return this.cancelledDate;
	}


	/**
	 * Setter for cancelledBy
	 */
	public InvoicingMetaData setCancelledBy(String cancelledBy) {
		this.cancelledBy = cancelledBy;
		return this;
	}

	/**
	 * Getter for cancelledBy
	 */
	public String getCancelledBy() {
		return this.cancelledBy;
	}


	/**
	 * Setter for lastUpdatedDate
	 */
	public InvoicingMetaData setLastUpdatedDate(String lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
		return this;
	}

	/**
	 * Getter for lastUpdatedDate
	 */
	public String getLastUpdatedDate() {
		return this.lastUpdatedDate;
	}


	/**
	 * Setter for lastUpdatedBy
	 */
	public InvoicingMetaData setLastUpdatedBy(String lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
		return this;
	}

	/**
	 * Getter for lastUpdatedBy
	 */
	public String getLastUpdatedBy() {
		return this.lastUpdatedBy;
	}


	/**
	 * Setter for firstSentDate
	 */
	public InvoicingMetaData setFirstSentDate(String firstSentDate) {
		this.firstSentDate = firstSentDate;
		return this;
	}

	/**
	 * Getter for firstSentDate
	 */
	public String getFirstSentDate() {
		return this.firstSentDate;
	}


	/**
	 * Setter for lastSentDate
	 */
	public InvoicingMetaData setLastSentDate(String lastSentDate) {
		this.lastSentDate = lastSentDate;
		return this;
	}

	/**
	 * Getter for lastSentDate
	 */
	public String getLastSentDate() {
		return this.lastSentDate;
	}


	/**
	 * Setter for lastSentBy
	 */
	public InvoicingMetaData setLastSentBy(String lastSentBy) {
		this.lastSentBy = lastSentBy;
		return this;
	}

	/**
	 * Getter for lastSentBy
	 */
	public String getLastSentBy() {
		return this.lastSentBy;
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