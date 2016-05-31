package com.paypal.api.payments;

import com.paypal.base.rest.JSONFormatter;

public class CountryCode  {

	/**
	 * ISO country code based on 2-character IS0-3166-1 codes.
	 */
	private String countryCode;

	/**
	 * Default Constructor
	 */
	public CountryCode() {
	}

	/**
	 * Parameterized Constructor
	 */
	public CountryCode(String countryCode) {
		this.countryCode = countryCode;
	}


	/**
	 * Setter for countryCode
	 */
	public CountryCode setCountryCode(String countryCode) {
		this.countryCode = countryCode;
		return this;
	}

	/**
	 * Getter for countryCode
	 */
	public String getCountryCode() {
		return this.countryCode;
	}

}
