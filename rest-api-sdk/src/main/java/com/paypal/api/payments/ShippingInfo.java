package com.paypal.api.payments;

import com.paypal.core.rest.JSONFormatter;
import com.paypal.api.payments.Address;

public class ShippingInfo  {

	/**
	 * First name of the invoice recipient. 30 characters max.
	 */
	private String firstName;

	/**
	 * Last name of the invoice recipient. 30 characters max.
	 */
	private String lastName;

	/**
	 * Company business name of the invoice recipient. 100 characters max.
	 */
	private String businessName;

	/**
	 * Address of the invoice recipient.
	 */
	private Address address;

	/**
	 * Default Constructor
	 */
	public ShippingInfo() {
	}


	/**
	 * Setter for firstName
	 */
	public ShippingInfo setFirstName(String firstName) {
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
	public ShippingInfo setLastName(String lastName) {
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
	 * Setter for businessName
	 */
	public ShippingInfo setBusinessName(String businessName) {
		this.businessName = businessName;
		return this;
	}

	/**
	 * Getter for businessName
	 */
	public String getBusinessName() {
		return this.businessName;
	}


	/**
	 * Setter for address
	 */
	public ShippingInfo setAddress(Address address) {
		this.address = address;
		return this;
	}

	/**
	 * Getter for address
	 */
	public Address getAddress() {
		return this.address;
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