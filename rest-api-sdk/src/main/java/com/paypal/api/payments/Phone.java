package com.paypal.api.payments;

import com.paypal.core.rest.JSONFormatter;

public class Phone  {

	/**
	 * Country code (in E.164 format). Assume length is n.
	 */
	private String countryCode;

	/**
	 * In-country phone number (in E.164 format). Maximum (15 - n) digits.
	 */
	private String nationalNumber;

	/**
	 * Default Constructor
	 */
	public Phone() {
	}

	/**
	 * Parameterized Constructor
	 */
	public Phone(String countryCode, String nationalNumber) {
		this.countryCode = countryCode;
		this.nationalNumber = nationalNumber;
	}


	/**
	 * Setter for countryCode
	 */
	public Phone setCountryCode(String countryCode) {
		this.countryCode = countryCode;
		return this;
	}

	/**
	 * Getter for countryCode
	 */
	public String getCountryCode() {
		return this.countryCode;
	}


	/**
	 * Setter for nationalNumber
	 */
	public Phone setNationalNumber(String nationalNumber) {
		this.nationalNumber = nationalNumber;
		return this;
	}

	/**
	 * Getter for nationalNumber
	 */
	public String getNationalNumber() {
		return this.nationalNumber;
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