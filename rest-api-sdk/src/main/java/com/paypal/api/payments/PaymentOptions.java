package com.paypal.api.payments;

import com.paypal.base.rest.PayPalModel;


public class PaymentOptions  extends PayPalModel {

	/**
	 * Optional payment method type. If specified, the transaction will go through for only instant payment. Only for use with the paypal payment_method, not relevant for the credit_card payment_method.
	 */
	private String allowedPaymentMethod;

	/**
	 * Indicator if this payment request is a recurring payment. Only supported when the `payment_method` is set to `credit_card`
	 */
	private Boolean recurringFlag;

	/**
	 * Indicator if fraud management filters (fmf) should be skipped for this transaction. Only supported when the `payment_method` is set to `credit_card`
	 */
	private Boolean skipFmf;

	/**
	 * Default Constructor
	 */
	public PaymentOptions() {
	}


	/**
	 * Setter for allowedPaymentMethod
	 */
	public PaymentOptions setAllowedPaymentMethod(String allowedPaymentMethod) {
		this.allowedPaymentMethod = allowedPaymentMethod;
		return this;
	}

	/**
	 * Getter for allowedPaymentMethod
	 */
	public String getAllowedPaymentMethod() {
		return this.allowedPaymentMethod;
	}


	/**
	 * Setter for recurringFlag
	 */
	public PaymentOptions setRecurringFlag(Boolean recurringFlag) {
		this.recurringFlag = recurringFlag;
		return this;
	}

	/**
	 * Getter for recurringFlag
	 */
	public Boolean getRecurringFlag() {
		return this.recurringFlag;
	}


	/**
	 * Setter for skipFmf
	 */
	public PaymentOptions setSkipFmf(Boolean skipFmf) {
		this.skipFmf = skipFmf;
		return this;
	}

	/**
	 * Getter for skipFmf
	 */
	public Boolean getSkipFmf() {
		return this.skipFmf;
	}


}
