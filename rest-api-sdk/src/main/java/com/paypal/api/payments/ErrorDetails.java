package com.paypal.api.payments;

import com.paypal.core.rest.JSONFormatter;

public class ErrorDetails  {

	/**
	 * Name of the field that caused the error.
	 */
	private String field;

	/**
	 * Reason for the error.
	 */
	private String issue;

	/**
	 * Default Constructor
	 */
	public ErrorDetails() {
	}

	/**
	 * Parameterized Constructor
	 */
	public ErrorDetails(String field, String issue) {
		this.field = field;
		this.issue = issue;
	}


	/**
	 * Setter for field
	 */
	public ErrorDetails setField(String field) {
		this.field = field;
		return this;
	}

	/**
	 * Getter for field
	 */
	public String getField() {
		return this.field;
	}


	/**
	 * Setter for issue
	 */
	public ErrorDetails setIssue(String issue) {
		this.issue = issue;
		return this;
	}

	/**
	 * Getter for issue
	 */
	public String getIssue() {
		return this.issue;
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