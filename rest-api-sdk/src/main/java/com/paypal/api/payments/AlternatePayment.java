package com.paypal.api.payments;

import com.paypal.base.rest.JSONFormatter;
import com.paypal.base.rest.PayPalModel;

public class AlternatePayment extends PayPalModel {

	/**
	 * The unique identifier of the alternate payment account.
	 */
	private String alternatePaymentAccountId;

	/**
	 * The unique identifier of the payer
	 */
	private String externalCustomerId;

	/**
	 * Alternate Payment provider id. This is an optional attribute needed only for certain alternate providers e.g Ideal
	 */
	private String alternatePaymentProviderId;

	/**
	 * Default Constructor
	 */
	public AlternatePayment() {
	}

	/**
	 * Parameterized Constructor
	 */
	public AlternatePayment(String alternatePaymentAccountId) {
		this.alternatePaymentAccountId = alternatePaymentAccountId;
	}


	/**
	 * Setter for alternatePaymentAccountId
	 */
	public AlternatePayment setAlternatePaymentAccountId(String alternatePaymentAccountId) {
		this.alternatePaymentAccountId = alternatePaymentAccountId;
		return this;
	}

	/**
	 * Getter for alternatePaymentAccountId
	 */
	public String getAlternatePaymentAccountId() {
		return this.alternatePaymentAccountId;
	}


	/**
	 * Setter for externalCustomerId
	 */
	public AlternatePayment setExternalCustomerId(String externalCustomerId) {
		this.externalCustomerId = externalCustomerId;
		return this;
	}

	/**
	 * Getter for externalCustomerId
	 */
	public String getExternalCustomerId() {
		return this.externalCustomerId;
	}


	/**
	 * Setter for alternatePaymentProviderId
	 */
	public AlternatePayment setAlternatePaymentProviderId(String alternatePaymentProviderId) {
		this.alternatePaymentProviderId = alternatePaymentProviderId;
		return this;
	}

	/**
	 * Getter for alternatePaymentProviderId
	 */
	public String getAlternatePaymentProviderId() {
		return this.alternatePaymentProviderId;
	}

}
