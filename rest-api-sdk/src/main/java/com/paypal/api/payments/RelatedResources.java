package com.paypal.api.payments;

import com.paypal.core.rest.JSONFormatter;
import com.paypal.api.payments.Sale;
import com.paypal.api.payments.Authorization;
import com.paypal.api.payments.Capture;
import com.paypal.api.payments.Refund;

public class RelatedResources  {

	/**
	 * A sale transaction
	 */
	private Sale sale;

	/**
	 * An authorization transaction
	 */
	private Authorization authorization;

	/**
	 * A capture transaction
	 */
	private Capture capture;

	/**
	 * A refund transaction
	 */
	private Refund refund;

	/**
	 * Default Constructor
	 */
	public RelatedResources() {
	}


	/**
	 * Setter for sale
	 */
	public RelatedResources setSale(Sale sale) {
		this.sale = sale;
		return this;
	}

	/**
	 * Getter for sale
	 */
	public Sale getSale() {
		return this.sale;
	}


	/**
	 * Setter for authorization
	 */
	public RelatedResources setAuthorization(Authorization authorization) {
		this.authorization = authorization;
		return this;
	}

	/**
	 * Getter for authorization
	 */
	public Authorization getAuthorization() {
		return this.authorization;
	}


	/**
	 * Setter for capture
	 */
	public RelatedResources setCapture(Capture capture) {
		this.capture = capture;
		return this;
	}

	/**
	 * Getter for capture
	 */
	public Capture getCapture() {
		return this.capture;
	}


	/**
	 * Setter for refund
	 */
	public RelatedResources setRefund(Refund refund) {
		this.refund = refund;
		return this;
	}

	/**
	 * Getter for refund
	 */
	public Refund getRefund() {
		return this.refund;
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