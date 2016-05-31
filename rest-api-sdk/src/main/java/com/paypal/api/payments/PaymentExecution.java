package com.paypal.api.payments;

import java.util.List;

import com.paypal.base.rest.PayPalModel;

public class PaymentExecution  extends PayPalModel {

	/**
	 * The ID of the Payer, passed in the `return_url` by PayPal.
	 */
	private String payerId;

	/**
	 * Carrier account id for a carrier billing payment. For a carrier billing payment, payer_id is not applicable.
	 */
	private String carrierAccountId;

	/**
	 * Transactional details including the amount and item details.
	 */
	private List<Transactions> transactions;

	/**
	 * Default Constructor
	 */
	public PaymentExecution() {
	}


	/**
	 * Setter for payerId
	 */
	public PaymentExecution setPayerId(String payerId) {
		this.payerId = payerId;
		return this;
	}

	/**
	 * Getter for payerId
	 */
	public String getPayerId() {
		return this.payerId;
	}


	/**
	 * Setter for carrierAccountId
	 */
	public PaymentExecution setCarrierAccountId(String carrierAccountId) {
		this.carrierAccountId = carrierAccountId;
		return this;
	}

	/**
	 * Getter for carrierAccountId
	 */
	public String getCarrierAccountId() {
		return this.carrierAccountId;
	}


	/**
	 * Setter for transactions
	 */
	public PaymentExecution setTransactions(List<Transactions> transactions) {
		this.transactions = transactions;
		return this;
	}

	/**
	 * Getter for transactions
	 */
	public List<Transactions> getTransactions() {
		return this.transactions;
	}


}
