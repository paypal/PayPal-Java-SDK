package com.paypal.api.payments;

import com.paypal.core.rest.JSONFormatter;
import com.paypal.api.payments.ErrorDetails;
import java.util.List;

public class Error  {

	/**
	 * Human readable, unique name of the error.
	 */
	private String name;

	/**
	 * PayPal internal identifier used for correlation purposes.
	 */
	private String debugId;

	/**
	 * Message describing the error.
	 */
	private String message;

	/**
	 * URI for detailed information related to this error for the developer.
	 */
	private String informationLink;

	/**
	 * Additional details of the error
	 */
	private List<ErrorDetails> details;

	/**
	 * Default Constructor
	 */
	public Error() {
	}

	/**
	 * Parameterized Constructor
	 */
	public Error(String name, String message, String informationLink) {
		this.name = name;
		this.message = message;
		this.informationLink = informationLink;
	}


	/**
	 * Setter for name
	 */
	public Error setName(String name) {
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
	 * Setter for debugId
	 */
	public Error setDebugId(String debugId) {
		this.debugId = debugId;
		return this;
	}

	/**
	 * Getter for debugId
	 */
	public String getDebugId() {
		return this.debugId;
	}


	/**
	 * Setter for message
	 */
	public Error setMessage(String message) {
		this.message = message;
		return this;
	}

	/**
	 * Getter for message
	 */
	public String getMessage() {
		return this.message;
	}


	/**
	 * Setter for informationLink
	 */
	public Error setInformationLink(String informationLink) {
		this.informationLink = informationLink;
		return this;
	}

	/**
	 * Getter for informationLink
	 */
	public String getInformationLink() {
		return this.informationLink;
	}


	/**
	 * Setter for details
	 */
	public Error setDetails(List<ErrorDetails> details) {
		this.details = details;
		return this;
	}

	/**
	 * Getter for details
	 */
	public List<ErrorDetails> getDetails() {
		return this.details;
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