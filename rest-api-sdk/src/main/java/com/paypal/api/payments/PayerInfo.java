package com.paypal.api.payments;

import com.paypal.core.rest.JSONFormatter;
import com.paypal.api.payments.Address;

public class PayerInfo  {

	/**
	 * Email address representing the Payer.
	 */
	private String email;

	/**
	 * First Name of the Payer from their PayPal Account.
	 */
	private String firstName;

	/**
	 * Last Name of the Payer from their PayPal Account.
	 */
	private String lastName;

	/**
	 * PayPal assigned Payer ID.
	 */
	private String payerId;

	/**
	 * Phone number representing the Payer.
	 */
	private String phone;

	/**
	 * Shipping address of the Payer from their PayPal Account.
	 */
	private Address shippingAddress;

	/**
	 * Default Constructor
	 */
	public PayerInfo() {
	}


	/**
	 * Setter for email
	 */
	public PayerInfo setEmail(String email) {
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
	 * Setter for firstName
	 */
	public PayerInfo setFirstName(String firstName) {
		this.firstName = firstName;
		return this;
	}

	/**
	 * Getter for firstName
	 */
	public String getFirstName() {
		return this.firstName;
	}


	/**
	 * Setter for lastName
	 */
	public PayerInfo setLastName(String lastName) {
		this.lastName = lastName;
		return this;
	}

	/**
	 * Getter for lastName
	 */
	public String getLastName() {
		return this.lastName;
	}


	/**
	 * Setter for payerId
	 */
	public PayerInfo setPayerId(String payerId) {
		this.payerId = payerId;
		return this;
	}

	/**
	 * Getter for payerId
	 */
	public String getPayerId() {
		return this.payerId;
	}


	/**
	 * Setter for phone
	 */
	public PayerInfo setPhone(String phone) {
		this.phone = phone;
		return this;
	}

	/**
	 * Getter for phone
	 */
	public String getPhone() {
		return this.phone;
	}


	/**
	 * Setter for shippingAddress
	 */
	public PayerInfo setShippingAddress(Address shippingAddress) {
		this.shippingAddress = shippingAddress;
		return this;
	}

	/**
	 * Getter for shippingAddress
	 */
	public Address getShippingAddress() {
		return this.shippingAddress;
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