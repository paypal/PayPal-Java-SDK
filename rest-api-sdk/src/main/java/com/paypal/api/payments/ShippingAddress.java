package com.paypal.api.payments;

import com.paypal.core.rest.JSONFormatter;
import com.paypal.api.payments.Address;

public class ShippingAddress extends Address {

	/**
	 * Name of the recipient at this address.
	 */
	private String recipientName;

	/**
	 * Default Constructor
	 */
	public ShippingAddress() {
	}

	/**
	 * Parameterized Constructor
	 */
	public ShippingAddress(String recipientName) {
		this.recipientName = recipientName;
	}


	/**
	 * Setter for recipientName
	 */
	public ShippingAddress setRecipientName(String recipientName) {
		this.recipientName = recipientName;
		return this;
	}

	/**
	 * Getter for recipientName
	 */
	public String getRecipientName() {
		return this.recipientName;
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