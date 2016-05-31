package com.paypal.api.payments;

import com.paypal.base.rest.JSONFormatter;

public class PrivateLabelCard  {

	/**
	 * encrypted identifier of the private label card instrument.
	 */
	private String id;

	/**
	 * last 4 digits of the card number.
	 */
	private String cardNumber;

	/**
	 * Merchants providing private label store cards have associated issuer account. This value indicates encrypted account number of the associated issuer account.
	 */
	private String issuerId;

	/**
	 * Merchants providing private label store cards have associated issuer account. This value indicates name on the issuer account.
	 */
	private String issuerName;

	/**
	 * This value indicates URL to access PLCC program logo image
	 */
	private String imageKey;

	/**
	 * Default Constructor
	 */
	public PrivateLabelCard() {
	}


	/**
	 * Setter for id
	 */
	public PrivateLabelCard setId(String id) {
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
	 * Setter for cardNumber
	 */
	public PrivateLabelCard setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
		return this;
	}

	/**
	 * Getter for cardNumber
	 */
	public String getCardNumber() {
		return this.cardNumber;
	}


	/**
	 * Setter for issuerId
	 */
	public PrivateLabelCard setIssuerId(String issuerId) {
		this.issuerId = issuerId;
		return this;
	}

	/**
	 * Getter for issuerId
	 */
	public String getIssuerId() {
		return this.issuerId;
	}


	/**
	 * Setter for issuerName
	 */
	public PrivateLabelCard setIssuerName(String issuerName) {
		this.issuerName = issuerName;
		return this;
	}

	/**
	 * Getter for issuerName
	 */
	public String getIssuerName() {
		return this.issuerName;
	}


	/**
	 * Setter for imageKey
	 */
	public PrivateLabelCard setImageKey(String imageKey) {
		this.imageKey = imageKey;
		return this;
	}

	/**
	 * Getter for imageKey
	 */
	public String getImageKey() {
		return this.imageKey;
	}

}
