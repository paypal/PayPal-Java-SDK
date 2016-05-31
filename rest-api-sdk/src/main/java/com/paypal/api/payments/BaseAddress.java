package com.paypal.api.payments;

import com.paypal.base.rest.PayPalModel;

public class BaseAddress extends PayPalModel {

	/**
	 * Line 1 of the BaseAddress (e.g., Number, street, etc). 100 characters max.
	 */
	private String line1;

	/**
	 * Line 2 of the BaseAddress (e.g., Suite, apt #, etc). 100 characters max.
	 */
	private String line2;

	/**
	 * City name. 50 characters max.
	 */
	private String city;

	/**
	 * [2-letter country code](https://developer.paypal.com/docs/classic/api/country_codes/). 2 characters max.
	 */
	private String countryCode;

	/**
	 * Zip code or equivalent is usually required for countries that have them. 20 characters max. **Required in certain countries.**
	 */
	private String postalCode;

	/**
	 * 2-letter code for US states, and the equivalent for other countries. 100 characters max.
	 */
	private String state;

	/**
	 * BaseAddress normalization status, returned only for payers from Brazil.
	 */
	private String normalizationStatus;

	/**
	 * BaseAddress status
	 */
	private String status;

	/**
	 * Default Constructor
	 */
	public BaseAddress() {
	}

	/**
	 * Parameterized Constructor
	 */
	public BaseAddress(String line1, String countryCode) {
		this.line1 = line1;
		this.countryCode = countryCode;
	}


	/**
	 * Setter for line1
	 */
	public BaseAddress setLine1(String line1) {
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
	public BaseAddress setLine2(String line2) {
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
	public BaseAddress setCity(String city) {
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
	public BaseAddress setCountryCode(String countryCode) {
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
	public BaseAddress setPostalCode(String postalCode) {
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
	public BaseAddress setState(String state) {
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
	 * Setter for normalizationStatus
	 */
	public BaseAddress setNormalizationStatus(String normalizationStatus) {
		this.normalizationStatus = normalizationStatus;
		return this;
	}

	/**
	 * Getter for normalizationStatus
	 */
	public String getNormalizationStatus() {
		return this.normalizationStatus;
	}


	/**
	 * Setter for status
	 */
	public BaseAddress setStatus(String status) {
		this.status = status;
		return this;
	}

	/**
	 * Getter for status
	 */
	public String getStatus() {
		return this.status;
	}
}
