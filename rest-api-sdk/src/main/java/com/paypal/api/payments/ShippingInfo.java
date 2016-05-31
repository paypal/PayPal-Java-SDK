package com.paypal.api.payments;

import com.paypal.base.rest.PayPalModel;


public class ShippingInfo  extends PayPalModel {

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
	private InvoiceAddress address;

	private String email;
	
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
	public ShippingInfo setAddress(InvoiceAddress address) {
		this.address = address;
		return this;
	}

	/**
	 * Getter for address
	 */
	public InvoiceAddress getAddress() {
		return this.address;
	}

	/**
	 * Setter for email
	 */
	public ShippingInfo setEmail(String email) {
		this.email = email;
		return this;
	}

	/**
	 * Getter for email
	 */
	public String getEmail() {
		return this.email;
	}


}
