package com.paypal.api.payments;

import com.paypal.core.rest.JSONFormatter;
import com.paypal.api.payments.Address;

public class BillingInfo  {

	/**
	 * Email address of the invoice recipient. 260 characters max.
	 */
	private String email;

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
	 * Language of the email sent to the payer. Will only be used if payer doesn't have a PayPal account.
	 */
	private String language;

	/**
	 * Option to display additional information such as business hours. 40 characters max.
	 */
	private String additionalInfo;

	/**
	 * Default Constructor
	 */
	public BillingInfo() {
	}

	/**
	 * Parameterized Constructor
	 */
	public BillingInfo(String email) {
		this.email = email;
	}


	/**
	 * Setter for email
	 */
	public BillingInfo setEmail(String email) {
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
	public BillingInfo setFirstName(String firstName) {
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
	public BillingInfo setLastName(String lastName) {
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
	public BillingInfo setBusinessName(String businessName) {
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
	public BillingInfo setAddress(Address address) {
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
	 * Setter for language
	 */
	public BillingInfo setLanguage(String language) {
		this.language = language;
		return this;
	}

	/**
	 * Getter for language
	 */
	public String getLanguage() {
		return this.language;
	}


	/**
	 * Setter for additionalInfo
	 */
	public BillingInfo setAdditionalInfo(String additionalInfo) {
		this.additionalInfo = additionalInfo;
		return this;
	}

	/**
	 * Getter for additionalInfo
	 */
	public String getAdditionalInfo() {
		return this.additionalInfo;
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