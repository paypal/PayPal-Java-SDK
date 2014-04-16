package com.paypal.api.payments;

import com.paypal.core.rest.JSONFormatter;

public class Address  {

	/**
	 * Line 1 of the Address (eg. number, street, etc).
	 */
	private String line1;

	/**
	 * Optional line 2 of the Address (eg. suite, apt #, etc.).
	 */
	private String line2;

	/**
	 * City name.
	 */
	private String city;

	/**
	 * 2 letter country code.
	 */
	private String countryCode;

	/**
	 * Zip code or equivalent is usually required for countries that have them. For list of countries that do not have postal codes please refer to http://en.wikipedia.org/wiki/Postal_code.
	 */
	private String postalCode;

	/**
	 * 2 letter code for US states, and the equivalent for other countries.
	 */
	private String state;

	/**
	 * Phone number in E.123 format.
	 */
	private String phone;

	/**
	 * Default Constructor
	 */
	public Address() {
	}

	/**
	 * Parameterized Constructor
	 */
	public Address(String line1, String city, String countryCode, String state) {
		this.line1 = line1;
		this.city = city;
		this.countryCode = countryCode;
		this.state = state;
	}


	/**
	 * Setter for line1
	 */
	public Address setLine1(String line1) {
		this.line1 = line1;
		return this;
	}

	/**
	 * Getter for line1
	 */
	public String getLine1() {
		return this.line1;
	}


	/**
	 * Setter for line2
	 */
	public Address setLine2(String line2) {
		this.line2 = line2;
		return this;
	}

	/**
	 * Getter for line2
	 */
	public String getLine2() {
		return this.line2;
	}


	/**
	 * Setter for city
	 */
	public Address setCity(String city) {
		this.city = city;
		return this;
	}

	/**
	 * Getter for city
	 */
	public String getCity() {
		return this.city;
	}


	/**
	 * Setter for countryCode
	 */
	public Address setCountryCode(String countryCode) {
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
	 * Setter for postalCode
	 */
	public Address setPostalCode(String postalCode) {
		this.postalCode = postalCode;
		return this;
	}

	/**
	 * Getter for postalCode
	 */
	public String getPostalCode() {
		return this.postalCode;
	}


	/**
	 * Setter for state
	 */
	public Address setState(String state) {
		this.state = state;
		return this;
	}

	/**
	 * Getter for state
	 */
	public String getState() {
		return this.state;
	}


	/**
	 * Setter for phone
	 */
	public Address setPhone(String phone) {
		this.phone = phone;
		return this;
	}

	/**
	 * Getter for phone
	 */
	public String getPhone() {
		return this.phone;
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