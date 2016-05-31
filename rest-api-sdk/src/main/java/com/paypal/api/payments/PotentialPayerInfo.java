package com.paypal.api.payments;

import com.paypal.base.rest.JSONFormatter;
import com.paypal.api.payments.Address;

public class PotentialPayerInfo  {

	/**
	 * Email address representing the potential payer.
	 */
	private String email;

	/**
	 * ExternalRememberMe id representing the potential payer
	 */
	private String externalRememberMeId;

	/**
	 * Account Number representing the potential payer
	 */
	private String accountNumber;

	/**
	 * Billing address of the potential payer.
	 */
	private Address billingAddress;

	/**
	 * Default Constructor
	 */
	public PotentialPayerInfo() {
	}


	/**
	 * Setter for email
	 */
	public PotentialPayerInfo setEmail(String email) {
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
	 * Setter for externalRememberMeId
	 */
	public PotentialPayerInfo setExternalRememberMeId(String externalRememberMeId) {
		this.externalRememberMeId = externalRememberMeId;
		return this;
	}

	/**
	 * Getter for externalRememberMeId
	 */
	public String getExternalRememberMeId() {
		return this.externalRememberMeId;
	}


	/**
	 * Setter for accountNumber
	 */
	public PotentialPayerInfo setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
		return this;
	}

	/**
	 * Getter for accountNumber
	 */
	public String getAccountNumber() {
		return this.accountNumber;
	}


	/**
	 * Setter for billingAddress
	 */
	public PotentialPayerInfo setBillingAddress(Address billingAddress) {
		this.billingAddress = billingAddress;
		return this;
	}

	/**
	 * Getter for billingAddress
	 */
	public Address getBillingAddress() {
		return this.billingAddress;
	}

}
