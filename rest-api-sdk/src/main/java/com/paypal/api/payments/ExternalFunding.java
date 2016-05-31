package com.paypal.api.payments;

import com.paypal.base.rest.JSONFormatter;
import com.paypal.api.payments.Amount;

public class ExternalFunding  {

	/**
	 * Unique identifier for the external funding
	 */
	private String referenceId;

	/**
	 * Generic identifier for the external funding
	 */
	private String code;

	/**
	 * Encrypted PayPal Account identifier for the funding account
	 */
	private String fundingAccountId;

	/**
	 * Description of the external funding being applied
	 */
	private String displayText;

	/**
	 * Amount being funded by the external funding account
	 */
	private Amount amount;

	/**
	 * Default Constructor
	 */
	public ExternalFunding() {
	}

	/**
	 * Parameterized Constructor
	 */
	public ExternalFunding(String referenceId, String fundingAccountId, Amount amount) {
		this.referenceId = referenceId;
		this.fundingAccountId = fundingAccountId;
		this.amount = amount;
	}


	/**
	 * Setter for referenceId
	 */
	public ExternalFunding setReferenceId(String referenceId) {
		this.referenceId = referenceId;
		return this;
	}

	/**
	 * Getter for referenceId
	 */
	public String getReferenceId() {
		return this.referenceId;
	}


	/**
	 * Setter for code
	 */
	public ExternalFunding setCode(String code) {
		this.code = code;
		return this;
	}

	/**
	 * Getter for code
	 */
	public String getCode() {
		return this.code;
	}


	/**
	 * Setter for fundingAccountId
	 */
	public ExternalFunding setFundingAccountId(String fundingAccountId) {
		this.fundingAccountId = fundingAccountId;
		return this;
	}

	/**
	 * Getter for fundingAccountId
	 */
	public String getFundingAccountId() {
		return this.fundingAccountId;
	}


	/**
	 * Setter for displayText
	 */
	public ExternalFunding setDisplayText(String displayText) {
		this.displayText = displayText;
		return this;
	}

	/**
	 * Getter for displayText
	 */
	public String getDisplayText() {
		return this.displayText;
	}


	/**
	 * Setter for amount
	 */
	public ExternalFunding setAmount(Amount amount) {
		this.amount = amount;
		return this;
	}

	/**
	 * Getter for amount
	 */
	public Amount getAmount() {
		return this.amount;
	}

}
