package com.paypal.api.payments;

import com.paypal.base.rest.JSONFormatter;
import com.paypal.api.payments.Currency;

public class Incentive  {

	/**
	 * Identifier of the instrument in PayPal Wallet
	 */
	private String id;

	/**
	 * Code that identifies the incentive.
	 */
	private String code;

	/**
	 * Name of the incentive.
	 */
	private String name;

	/**
	 * Description of the incentive.
	 */
	private String description;

	/**
	 * Indicates incentive is applicable for this minimum purchase amount.
	 */
	private Currency minimumPurchaseAmount;

	/**
	 * Logo image url for the incentive.
	 */
	private String logoImageUrl;

	/**
	 * expiry date of the incentive.
	 */
	private String expiryDate;

	/**
	 * Specifies type of incentive
	 */
	private String type;

	/**
	 * URI to the associated terms
	 */
	private String terms;

	/**
	 * Default Constructor
	 */
	public Incentive() {
	}


	/**
	 * Setter for id
	 */
	public Incentive setId(String id) {
		this.id = id;
		return this;
	}

	/**
	 * Getter for id
	 */
	public String getId() {
		return this.id;
	}


	/**
	 * Setter for code
	 */
	public Incentive setCode(String code) {
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
	 * Setter for name
	 */
	public Incentive setName(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Getter for name
	 */
	public String getName() {
		return this.name;
	}


	/**
	 * Setter for description
	 */
	public Incentive setDescription(String description) {
		this.description = description;
		return this;
	}

	/**
	 * Getter for description
	 */
	public String getDescription() {
		return this.description;
	}


	/**
	 * Setter for minimumPurchaseAmount
	 */
	public Incentive setMinimumPurchaseAmount(Currency minimumPurchaseAmount) {
		this.minimumPurchaseAmount = minimumPurchaseAmount;
		return this;
	}

	/**
	 * Getter for minimumPurchaseAmount
	 */
	public Currency getMinimumPurchaseAmount() {
		return this.minimumPurchaseAmount;
	}


	/**
	 * Setter for logoImageUrl
	 */
	public Incentive setLogoImageUrl(String logoImageUrl) {
		this.logoImageUrl = logoImageUrl;
		return this;
	}

	/**
	 * Getter for logoImageUrl
	 */
	public String getLogoImageUrl() {
		return this.logoImageUrl;
	}


	/**
	 * Setter for expiryDate
	 */
	public Incentive setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
		return this;
	}

	/**
	 * Getter for expiryDate
	 */
	public String getExpiryDate() {
		return this.expiryDate;
	}


	/**
	 * Setter for type
	 */
	public Incentive setType(String type) {
		this.type = type;
		return this;
	}

	/**
	 * Getter for type
	 */
	public String getType() {
		return this.type;
	}


	/**
	 * Setter for terms
	 */
	public Incentive setTerms(String terms) {
		this.terms = terms;
		return this;
	}

	/**
	 * Getter for terms
	 */
	public String getTerms() {
		return this.terms;
	}

}
