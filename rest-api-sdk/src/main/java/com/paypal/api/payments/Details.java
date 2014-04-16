package com.paypal.api.payments;

import com.paypal.core.rest.JSONFormatter;

public class Details  {

	/**
	 * Amount being charged for shipping.
	 */
	private String shipping;

	/**
	 * Sub-total (amount) of items being paid for.
	 */
	private String subtotal;

	/**
	 * Amount being charged as tax.
	 */
	private String tax;

	/**
	 * Fee charged by PayPal. In case of a refund, this is the fee amount refunded to the original receipient of the payment.
	 */
	private String fee;

	/**
	 * Default Constructor
	 */
	public Details() {
	}


	/**
	 * Setter for shipping
	 */
	public Details setShipping(String shipping) {
		this.shipping = shipping;
		return this;
	}

	/**
	 * Getter for shipping
	 */
	public String getShipping() {
		return this.shipping;
	}


	/**
	 * Setter for subtotal
	 */
	public Details setSubtotal(String subtotal) {
		this.subtotal = subtotal;
		return this;
	}

	/**
	 * Getter for subtotal
	 */
	public String getSubtotal() {
		return this.subtotal;
	}


	/**
	 * Setter for tax
	 */
	public Details setTax(String tax) {
		this.tax = tax;
		return this;
	}

	/**
	 * Getter for tax
	 */
	public String getTax() {
		return this.tax;
	}


	/**
	 * Setter for fee
	 */
	public Details setFee(String fee) {
		this.fee = fee;
		return this;
	}

	/**
	 * Getter for fee
	 */
	public String getFee() {
		return this.fee;
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