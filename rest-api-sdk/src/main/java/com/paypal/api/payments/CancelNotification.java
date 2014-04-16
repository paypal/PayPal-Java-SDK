package com.paypal.api.payments;

import com.paypal.core.rest.JSONFormatter;

public class CancelNotification  {

	/**
	 * Subject of the notification.
	 */
	private String subject;

	/**
	 * Note to the payer.
	 */
	private String note;

	/**
	 * A flag indicating whether a copy of the email has to be sent to the merchant.
	 */
	private Boolean sendToMerchant;

	/**
	 * A flag indicating whether a copy of the email has to be sent to the payer.
	 */
	private Boolean sendToPayer;

	/**
	 * Default Constructor
	 */
	public CancelNotification() {
	}


	/**
	 * Setter for subject
	 */
	public CancelNotification setSubject(String subject) {
		this.subject = subject;
		return this;
	}

	/**
	 * Getter for subject
	 */
	public String getSubject() {
		return this.subject;
	}


	/**
	 * Setter for note
	 */
	public CancelNotification setNote(String note) {
		this.note = note;
		return this;
	}

	/**
	 * Getter for note
	 */
	public String getNote() {
		return this.note;
	}


	/**
	 * Setter for sendToMerchant
	 */
	public CancelNotification setSendToMerchant(Boolean sendToMerchant) {
		this.sendToMerchant = sendToMerchant;
		return this;
	}

	/**
	 * Getter for sendToMerchant
	 */
	public Boolean getSendToMerchant() {
		return this.sendToMerchant;
	}


	/**
	 * Setter for sendToPayer
	 */
	public CancelNotification setSendToPayer(Boolean sendToPayer) {
		this.sendToPayer = sendToPayer;
		return this;
	}

	/**
	 * Getter for sendToPayer
	 */
	public Boolean getSendToPayer() {
		return this.sendToPayer;
	}

	/**
	 * Returns a JSON string corresponding to object state
	 *
	 * @return JSON representation
	 */
	public String toJSON() {
		return JSONFormatter.toJSON(this);
	}

	@Override
	public String toString() {
		return toJSON();
	}
}