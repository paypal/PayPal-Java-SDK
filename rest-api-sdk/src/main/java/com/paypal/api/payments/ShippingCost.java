package com.paypal.api.payments;

import com.paypal.core.rest.JSONFormatter;
import com.paypal.api.payments.Currency;
import com.paypal.api.payments.Tax;

public class ShippingCost  {

	/**
	 * Shipping cost in amount. Range of 0 to 999999.99.
	 */
	private Currency amount;

	/**
	 * Tax percentage on shipping amount.
	 */
	private Tax tax;

	/**
	 * Default Constructor
	 */
	public ShippingCost() {
	}


	/**
	 * Setter for amount
	 */
	public ShippingCost setAmount(Currency amount) {
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
	 * Setter for tax
	 */
	public ShippingCost setTax(Tax tax) {
		this.tax = tax;
		return this;
	}

	/**
	 * Getter for tax
	 */
	public Tax getTax() {
		return this.tax;
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