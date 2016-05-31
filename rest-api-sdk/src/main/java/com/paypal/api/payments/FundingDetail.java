package com.paypal.api.payments;

import com.paypal.base.rest.JSONFormatter;

public class FundingDetail  {

	/**
	 * Expected clearing time
	 */
	private String clearingTime;

	/**
	 * [DEPRECATED] Hold-off duration of the payment. payment_debit_date should be used instead.
	 */
	private String paymentHoldDate;

	/**
	 * Date when funds will be debited from the payer's account
	 */
	private String paymentDebitDate;

	/**
	 * Processing type of the payment card
	 */
	private String processingType;

	/**
	 * Default Constructor
	 */
	public FundingDetail() {
	}


	/**
	 * Setter for clearingTime
	 */
	public FundingDetail setClearingTime(String clearingTime) {
		this.clearingTime = clearingTime;
		return this;
	}

	/**
	 * Getter for clearingTime
	 */
	public String getClearingTime() {
		return this.clearingTime;
	}


	/**
	 * Setter for paymentHoldDate
	 */
	public FundingDetail setPaymentHoldDate(String paymentHoldDate) {
		this.paymentHoldDate = paymentHoldDate;
		return this;
	}

	/**
	 * Getter for paymentHoldDate
	 */
	public String getPaymentHoldDate() {
		return this.paymentHoldDate;
	}


	/**
	 * Setter for paymentDebitDate
	 */
	public FundingDetail setPaymentDebitDate(String paymentDebitDate) {
		this.paymentDebitDate = paymentDebitDate;
		return this;
	}

	/**
	 * Getter for paymentDebitDate
	 */
	public String getPaymentDebitDate() {
		return this.paymentDebitDate;
	}


	/**
	 * Setter for processingType
	 */
	public FundingDetail setProcessingType(String processingType) {
		this.processingType = processingType;
		return this;
	}

	/**
	 * Getter for processingType
	 */
	public String getProcessingType() {
		return this.processingType;
	}

}
