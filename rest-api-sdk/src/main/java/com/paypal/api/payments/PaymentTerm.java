package com.paypal.api.payments;

import com.paypal.core.rest.JSONFormatter;

public class PaymentTerm  {

	/**
	 * Terms by which the invoice payment is due.
	 */
	private String termType;

	/**
	 * Date on which invoice payment is due. It must be always a future date. Date format: yyyy-MM-dd z. For example, 2014-02-27 PST
	 */
	private String dueDate;

	/**
	 * Default Constructor
	 */
	public PaymentTerm() {
	}


	/**
	 * Setter for termType
	 */
	public PaymentTerm setTermType(String termType) {
		this.termType = termType;
		return this;
	}

	/**
	 * Getter for termType
	 */
	public String getTermType() {
		return this.termType;
	}


	/**
	 * Setter for dueDate
	 */
	public PaymentTerm setDueDate(String dueDate) {
		this.dueDate = dueDate;
		return this;
	}

	/**
	 * Getter for dueDate
	 */
	public String getDueDate() {
		return this.dueDate;
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