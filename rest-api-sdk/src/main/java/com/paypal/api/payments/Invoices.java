package com.paypal.api.payments;

import com.paypal.core.rest.JSONFormatter;
import com.paypal.api.payments.Invoice;
import java.util.List;

public class Invoices  {

	/**
	 * 
	 */
	private int totalCount;

	/**
	 * List of invoices belonging to a merchant.
	 */
	private List<Invoice> invoices;

	/**
	 * Default Constructor
	 */
	public Invoices() {
	}


	/**
	 * Setter for totalCount
	 */
	public Invoices setTotalCount(int totalCount) {
		this.totalCount = totalCount;
		return this;
	}

	/**
	 * Getter for totalCount
	 */
	public int getTotalCount() {
		return this.totalCount;
	}


	/**
	 * Setter for invoices
	 */
	public Invoices setInvoices(List<Invoice> invoices) {
		this.invoices = invoices;
		return this;
	}

	/**
	 * Getter for invoices
	 */
	public List<Invoice> getInvoices() {
		return this.invoices;
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