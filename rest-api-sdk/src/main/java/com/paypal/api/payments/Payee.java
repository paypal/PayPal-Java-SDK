package com.paypal.api.payments;

import com.paypal.base.rest.PayPalModel;


public class Payee  extends PayPalModel {

	/**
	 * Email Address associated with the Payee's PayPal Account. If the provided email address is not associated with any PayPal Account, the payee can only receiver PayPal Wallet Payments. Direct Credit Card Payments will be denied due to card compliance requirements.
	 */
	private String email;

	/**
	 * Encrypted PayPal account identifier for the Payee.
	 */
	private String merchantId;

	/**
	 * First Name of the Payee.
	 */
	private String firstName;

	/**
	 * Last Name of the Payee.
	 */
	private String lastName;

	/**
	 * Unencrypted PayPal account Number of the Payee
	 */
	private String accountNumber;

	/**
	 * Information related to the Payer. In case of PayPal Wallet payment, this information will be filled in by PayPal after the user approves the payment using their PayPal Wallet. 
	 */
	private Phone phone;

	/**
	 * Default Constructor
	 */
	public Payee() {
	}


	/**
	 * Setter for email
	 */
	public Payee setEmail(String email) {
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
	 * Setter for merchantId
	 */
	public Payee setMerchantId(String merchantId) {
		this.merchantId = merchantId;
		return this;
	}

	/**
	 * Getter for merchantId
	 */
	public String getMerchantId() {
		return this.merchantId;
	}


	/**
	 * Setter for firstName
	 */
	public Payee setFirstName(String firstName) {
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
	public Payee setLastName(String lastName) {
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
	 * Setter for accountNumber
	 */
	public Payee setAccountNumber(String accountNumber) {
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
	 * Setter for phone
	 */
	public Payee setPhone(Phone phone) {
		this.phone = phone;
		return this;
	}

	/**
	 * Getter for phone
	 */
	public Phone getPhone() {
		return this.phone;
	}

}
