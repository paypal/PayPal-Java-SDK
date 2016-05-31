package com.paypal.api.payments;

import com.paypal.base.rest.JSONFormatter;
import com.paypal.base.rest.PayPalModel;
import com.paypal.api.payments.CountryCode;

public class CarrierAccount extends PayPalModel{

	/**
	 * ID that identifies the payer�s carrier account. Can be used in subsequent REST API calls, e.g. for making payments.
	 */
	private String id;

	/**
	 * The payer�s phone number in E.164 format.
	 */
	private String phoneNumber;

	/**
	 * User identifier as created by the merchant.
	 */
	private String externalCustomerId;

	/**
	 * The method of obtaining the phone number (USER_PROVIDED or READ_FROM_DEVICE).
	 */
	private String phoneSource;

	/**
	 * The country where the phone number is registered. Specified in 2-character IS0-3166-1 format.
	 */
	private CountryCode countryCode;

	/**
	 * Default Constructor
	 */
	public CarrierAccount() {
	}

	/**
	 * Parameterized Constructor
	 */
	public CarrierAccount(String externalCustomerId, CountryCode countryCode) {
		this.externalCustomerId = externalCustomerId;
		this.countryCode = countryCode;
	}


	/**
	 * Setter for id
	 */
	public CarrierAccount setId(String id) {
		this.id = id;
		return this;
	}

	/**
	 * Getter for id
	 */
	public String getId() {
		return this.id;
	}


	/**
	 * Setter for phoneNumber
	 */
	public CarrierAccount setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
		return this;
	}

	/**
	 * Getter for phoneNumber
	 */
	public String getPhoneNumber() {
		return this.phoneNumber;
	}


	/**
	 * Setter for externalCustomerId
	 */
	public CarrierAccount setExternalCustomerId(String externalCustomerId) {
		this.externalCustomerId = externalCustomerId;
		return this;
	}

	/**
	 * Getter for externalCustomerId
	 */
	public String getExternalCustomerId() {
		return this.externalCustomerId;
	}


	/**
	 * Setter for phoneSource
	 */
	public CarrierAccount setPhoneSource(String phoneSource) {
		this.phoneSource = phoneSource;
		return this;
	}

	/**
	 * Getter for phoneSource
	 */
	public String getPhoneSource() {
		return this.phoneSource;
	}


	/**
	 * Setter for countryCode
	 */
	public CarrierAccount setCountryCode(CountryCode countryCode) {
		this.countryCode = countryCode;
		return this;
	}

	/**
	 * Getter for countryCode
	 */
	public CountryCode getCountryCode() {
		return this.countryCode;
	}

}
