package com.paypal.api.payments;

import com.paypal.core.rest.JSONFormatter;

public class RedirectUrls  {

	/**
	 * Url where the payer would be redirected to after approving the payment.
	 */
	private String returnUrl;

	/**
	 * Url where the payer would be redirected to after canceling the payment.
	 */
	private String cancelUrl;

	/**
	 * Default Constructor
	 */
	public RedirectUrls() {
	}


	/**
	 * Setter for returnUrl
	 */
	public RedirectUrls setReturnUrl(String returnUrl) {
		this.returnUrl = returnUrl;
		return this;
	}

	/**
	 * Getter for returnUrl
	 */
	public String getReturnUrl() {
		return this.returnUrl;
	}


	/**
	 * Setter for cancelUrl
	 */
	public RedirectUrls setCancelUrl(String cancelUrl) {
		this.cancelUrl = cancelUrl;
		return this;
	}

	/**
	 * Getter for cancelUrl
	 */
	public String getCancelUrl() {
		return this.cancelUrl;
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