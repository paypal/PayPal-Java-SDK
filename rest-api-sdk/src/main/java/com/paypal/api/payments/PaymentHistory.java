package com.paypal.api.payments;

import com.paypal.core.rest.JSONFormatter;
import com.paypal.api.payments.Payment;
import java.util.List;

public class PaymentHistory  {

	/**
	 * A list of Payment resources
	 */
	private List<Payment> payments;

	/**
	 * Number of items returned in each range of results. Note that the last results range could have fewer items than the requested number of items.
	 */
	private int count;

	/**
	 * Identifier of the next element to get the next range of results.
	 */
	private String nextId;

	/**
	 * Default Constructor
	 */
	public PaymentHistory() {
	}


	/**
	 * Setter for payments
	 */
	public PaymentHistory setPayments(List<Payment> payments) {
		this.payments = payments;
		return this;
	}

	/**
	 * Getter for payments
	 */
	public List<Payment> getPayments() {
		return this.payments;
	}


	/**
	 * Setter for count
	 */
	public PaymentHistory setCount(int count) {
		this.count = count;
		return this;
	}

	/**
	 * Getter for count
	 */
	public int getCount() {
		return this.count;
	}


	/**
	 * Setter for nextId
	 */
	public PaymentHistory setNextId(String nextId) {
		this.nextId = nextId;
		return this;
	}

	/**
	 * Getter for nextId
	 */
	public String getNextId() {
		return this.nextId;
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