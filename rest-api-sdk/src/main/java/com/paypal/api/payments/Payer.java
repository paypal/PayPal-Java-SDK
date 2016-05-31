package com.paypal.api.payments;

import java.util.List;

import com.paypal.base.rest.PayPalModel;

public class Payer  extends PayPalModel {

	/**
	 * Payment method being used - PayPal Wallet payment, Bank Direct Debit  or Direct Credit card.
	 */
	private String paymentMethod;

	/**
	 * Status of payer's PayPal Account.
	 */
	private String status;

	/**
	 * Type of account relationship payer has with PayPal.
	 */
	private String accountType;

	/**
	 * Duration since the payer established account relationship with PayPal in days.
	 */
	private String accountAge;

	/**
	 * List of funding instruments to fund the payment. 'OneOf' funding_instruments,funding_option_id to be used to identify the specifics of payment method passed.
	 */
	private List<FundingInstrument> fundingInstruments;

	/**
	 * Id of user selected funding option for the payment.'OneOf' funding_instruments,funding_option_id to be used to identify the specifics of payment method passed.
	 */
	private String fundingOptionId;

	/**
	 * Default funding option available for the payment 
	 */
	private FundingOption fundingOption;

	/**
	 * Funding option related to default funding option.
	 */
	private FundingOption relatedFundingOption;

	/**
	 * Information related to the Payer. 
	 */
	private PayerInfo payerInfo;

	/**
	 * Default Constructor
	 */
	public Payer() {
	}


	/**
	 * Setter for paymentMethod
	 */
	public Payer setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
		return this;
	}

	/**
	 * Getter for paymentMethod
	 */
	public String getPaymentMethod() {
		return this.paymentMethod;
	}


	/**
	 * Setter for status
	 */
	public Payer setStatus(String status) {
		this.status = status;
		return this;
	}

	/**
	 * Getter for status
	 */
	public String getStatus() {
		return this.status;
	}


	/**
	 * Setter for accountType
	 */
	public Payer setAccountType(String accountType) {
		this.accountType = accountType;
		return this;
	}

	/**
	 * Getter for accountType
	 */
	public String getAccountType() {
		return this.accountType;
	}


	/**
	 * Setter for accountAge
	 */
	public Payer setAccountAge(String accountAge) {
		this.accountAge = accountAge;
		return this;
	}

	/**
	 * Getter for accountAge
	 */
	public String getAccountAge() {
		return this.accountAge;
	}


	/**
	 * Setter for fundingInstruments
	 */
	public Payer setFundingInstruments(List<FundingInstrument> fundingInstruments) {
		this.fundingInstruments = fundingInstruments;
		return this;
	}

	/**
	 * Getter for fundingInstruments
	 */
	public List<FundingInstrument> getFundingInstruments() {
		return this.fundingInstruments;
	}


	/**
	 * Setter for fundingOptionId
	 */
	public Payer setFundingOptionId(String fundingOptionId) {
		this.fundingOptionId = fundingOptionId;
		return this;
	}

	/**
	 * Getter for fundingOptionId
	 */
	public String getFundingOptionId() {
		return this.fundingOptionId;
	}


	/**
	 * Setter for fundingOption
	 */
	public Payer setFundingOption(FundingOption fundingOption) {
		this.fundingOption = fundingOption;
		return this;
	}

	/**
	 * Getter for fundingOption
	 */
	public FundingOption getFundingOption() {
		return this.fundingOption;
	}


	/**
	 * Setter for relatedFundingOption
	 */
	public Payer setRelatedFundingOption(FundingOption relatedFundingOption) {
		this.relatedFundingOption = relatedFundingOption;
		return this;
	}

	/**
	 * Getter for relatedFundingOption
	 */
	public FundingOption getRelatedFundingOption() {
		return this.relatedFundingOption;
	}


	/**
	 * Setter for payerInfo
	 */
	public Payer setPayerInfo(PayerInfo payerInfo) {
		this.payerInfo = payerInfo;
		return this;
	}

	/**
	 * Getter for payerInfo
	 */
	public PayerInfo getPayerInfo() {
		return this.payerInfo;
	}


}
