package com.paypal.api.payments;

import com.paypal.base.rest.JSONFormatter;
import com.paypal.base.rest.PayPalModel;

public class Billing extends PayPalModel {

	/**
	 * Identifier of the instrument in PayPal Wallet
	 */
	private String billingAgreementId;

	/**
	 * Default Constructor
	 */
	public Billing() {
	}


	/**
	 * Setter for billingAgreementId
	 */
	public Billing setBillingAgreementId(String billingAgreementId) {
		this.billingAgreementId = billingAgreementId;
		return this;
	}

	/**
	 * Getter for billingAgreementId
	 */
	public String getBillingAgreementId() {
		return this.billingAgreementId;
	}

}
