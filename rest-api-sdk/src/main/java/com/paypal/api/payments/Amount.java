package com.paypal.api.payments;

import com.paypal.base.rest.PayPalModel;


public class Amount  extends PayPalModel {

	/**
	 * 3-letter [currency code](https://developer.paypal.com/docs/integration/direct/rest_api_payment_country_currency_support/). PayPal does not support all currencies.
	 */
	private String currency;

	/**
	 * Total amount charged from the payer to the payee. In case of a refund, this is the refunded amount to the original payer from the payee. 10 characters max with support for 2 decimal places.
	 */
	private String total;

	/**
	 * Additional details of the payment amount.
	 */
	private Details details;

	/**
	 * Default Constructor
	 */
	public Amount() {
	}

	/**
	 * Parameterized Constructor
	 */
	public Amount(String currency, String total) {
		this.currency = currency;
		this.total = total;
	}


	/**
	 * Setter for currency
	 */
	public Amount setCurrency(String currency) {
		this.currency = currency;
		return this;
	}

	/**
	 * Getter for currency
	 */
	public String getCurrency() {
		return this.currency;
	}


	/**
	 * Setter for total
	 */
	public Amount setTotal(String total) {
		this.total = total;
		return this;
	}

	/**
	 * Getter for total
	 */
	public String getTotal() {
		return this.total;
	}


	/**
	 * Setter for details
	 */
	public Amount setDetails(Details details) {
		this.details = details;
		return this;
	}

	/**
	 * Getter for details
	 */
	public Details getDetails() {
		return this.details;
	}


}
