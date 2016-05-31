package com.paypal.api.payments;

import com.paypal.base.rest.JSONFormatter;

public class RecipientBankingInstruction  {

	/**
	 * Name of the financial institution.
	 */
	private String bankName;

	/**
	 * Name of the account holder
	 */
	private String accountHolderName;

	/**
	 * bank account number
	 */
	private String accountNumber;

	/**
	 * bank routing number
	 */
	private String routingNumber;

	/**
	 * IBAN equivalent of the bank
	 */
	private String internationalBankAccountNumber;

	/**
	 * BIC identifier of the financial institution
	 */
	private String bankIdentifierCode;

	/**
	 * Default Constructor
	 */
	public RecipientBankingInstruction() {
	}

	/**
	 * Parameterized Constructor
	 */
	public RecipientBankingInstruction(String bankName, String accountHolderName, String internationalBankAccountNumber) {
		this.bankName = bankName;
		this.accountHolderName = accountHolderName;
		this.internationalBankAccountNumber = internationalBankAccountNumber;
	}


	/**
	 * Setter for bankName
	 */
	public RecipientBankingInstruction setBankName(String bankName) {
		this.bankName = bankName;
		return this;
	}

	/**
	 * Getter for bankName
	 */
	public String getBankName() {
		return this.bankName;
	}


	/**
	 * Setter for accountHolderName
	 */
	public RecipientBankingInstruction setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
		return this;
	}

	/**
	 * Getter for accountHolderName
	 */
	public String getAccountHolderName() {
		return this.accountHolderName;
	}


	/**
	 * Setter for accountNumber
	 */
	public RecipientBankingInstruction setAccountNumber(String accountNumber) {
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
	 * Setter for routingNumber
	 */
	public RecipientBankingInstruction setRoutingNumber(String routingNumber) {
		this.routingNumber = routingNumber;
		return this;
	}

	/**
	 * Getter for routingNumber
	 */
	public String getRoutingNumber() {
		return this.routingNumber;
	}


	/**
	 * Setter for internationalBankAccountNumber
	 */
	public RecipientBankingInstruction setInternationalBankAccountNumber(String internationalBankAccountNumber) {
		this.internationalBankAccountNumber = internationalBankAccountNumber;
		return this;
	}

	/**
	 * Getter for internationalBankAccountNumber
	 */
	public String getInternationalBankAccountNumber() {
		return this.internationalBankAccountNumber;
	}


	/**
	 * Setter for bankIdentifierCode
	 */
	public RecipientBankingInstruction setBankIdentifierCode(String bankIdentifierCode) {
		this.bankIdentifierCode = bankIdentifierCode;
		return this;
	}

	/**
	 * Getter for bankIdentifierCode
	 */
	public String getBankIdentifierCode() {
		return this.bankIdentifierCode;
	}

}
