package com.paypal.api.payments;

import com.paypal.core.rest.JSONFormatter;

public class Payee  {

	/**
	 * Email Address associated with the Payee's PayPal Account. If the provided email address is not associated with any PayPal Account, the payee can only receiver PayPal Wallet Payments. Direct Credit Card Payments will be denied due to card compliance requirements.
	 */
	private String email;

	/**
	 * Encrypted PayPal Account identifier for the Payee.
	 */
	private String merchantId;

	/**
	 * Phone number (in E.123 format) associated with the Payee's PayPal Account. If the provided phont number is not associated with any PayPal Account, the payee can only receiver PayPal Wallet Payments. Direct Credit Card Payments will be denied due to card compliance requirements.
	 */
	private String phone;

	/**
	 * Default Constructor
	 */
	public Payee() {
	}

	/**
	 * Parameterized Constructor
	 */
	public Payee(String email, String merchantId, String phone) {
		this.email = email;
		this.merchantId = merchantId;
		this.phone = phone;
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
	 * Setter for phone
	 */
	public Payee setPhone(String phone) {
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