package com.paypal.api.payments;

import com.paypal.core.rest.JSONFormatter;
import com.paypal.api.payments.Currency;

public class CustomAmount  {

	/**
	 * Custom amount label. 25 characters max.
	 */
	private String label;

	/**
	 * Custom amount value. Range of 0 to 999999.99.
	 */
	private Currency amount;

	/**
	 * Default Constructor
	 */
	public CustomAmount() {
	}


	/**
	 * Setter for label
	 */
	public CustomAmount setLabel(String label) {
		this.label = label;
		return this;
	}

	/**
	 * Getter for label
	 */
	public String getLabel() {
		return this.label;
	}


	/**
	 * Setter for amount
	 */
	public CustomAmount setAmount(Currency amount) {
		this.amount = amount;
		return this;
	}

	/**
	 * Getter for amount
	 */
	public Currency getAmount() {
		return this.amount;
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