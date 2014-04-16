package com.paypal.api.payments;

import com.paypal.core.rest.JSONFormatter;
import com.paypal.api.payments.Address;
import com.paypal.api.payments.Phone;

public class MerchantInfo  {

	/**
	 * Email address of the merchant. 260 characters max.
	 */
	private String email;

	/**
	 * First name of the merchant. 30 characters max.
	 */
	private String firstName;

	/**
	 * Last name of the merchant. 30 characters max.
	 */
	private String lastName;

	/**
	 * Address of the merchant.
	 */
	private Address address;

	/**
	 * Company business name of the merchant. 100 characters max.
	 */
	private String businessName;

	/**
	 * Phone number of the merchant.
	 */
	private Phone phone;

	/**
	 * Fax number of the merchant.
	 */
	private Phone fax;

	/**
	 * Website of the merchant. 2048 characters max.
	 */
	private String website;

	/**
	 * Tax ID of the merchant. 100 characters max.
	 */
	private String taxId;

	/**
	 * Option to display additional information such as business hours. 40 characters max.
	 */
	private String additionalInfo;

	/**
	 * Default Constructor
	 */
	public MerchantInfo() {
	}

	/**
	 * Parameterized Constructor
	 */
	public MerchantInfo(String email) {
		this.email = email;
	}


	/**
	 * Setter for email
	 */
	public MerchantInfo setEmail(String email) {
		this.email = email;
		return this;
	}

	/**
	 * Getter for email
	 */
	public String getEmail() {
		return this.email;
	}


	/**
	 * Setter for firstName
	 */
	public MerchantInfo setFirstName(String firstName) {
		this.firstName = firstName;
		return this;
	}

	/**
	 * Getter for firstName
	 */
	public String getFirstName() {
		return this.firstName;
	}


	/**
	 * Setter for lastName
	 */
	public MerchantInfo setLastName(String lastName) {
		this.lastName = lastName;
		return this;
	}

	/**
	 * Getter for lastName
	 */
	public String getLastName() {
		return this.lastName;
	}


	/**
	 * Setter for address
	 */
	public MerchantInfo setAddress(Address address) {
		this.address = address;
		return this;
	}

	/**
	 * Getter for address
	 */
	public Address getAddress() {
		return this.address;
	}


	/**
	 * Setter for businessName
	 */
	public MerchantInfo setBusinessName(String businessName) {
		this.businessName = businessName;
		return this;
	}

	/**
	 * Getter for businessName
	 */
	public String getBusinessName() {
		return this.businessName;
	}


	/**
	 * Setter for phone
	 */
	public MerchantInfo setPhone(Phone phone) {
		this.phone = phone;
		return this;
	}

	/**
	 * Getter for phone
	 */
	public Phone getPhone() {
		return this.phone;
	}


	/**
	 * Setter for fax
	 */
	public MerchantInfo setFax(Phone fax) {
		this.fax = fax;
		return this;
	}

	/**
	 * Getter for fax
	 */
	public Phone getFax() {
		return this.fax;
	}


	/**
	 * Setter for website
	 */
	public MerchantInfo setWebsite(String website) {
		this.website = website;
		return this;
	}

	/**
	 * Getter for website
	 */
	public String getWebsite() {
		return this.website;
	}


	/**
	 * Setter for taxId
	 */
	public MerchantInfo setTaxId(String taxId) {
		this.taxId = taxId;
		return this;
	}

	/**
	 * Getter for taxId
	 */
	public String getTaxId() {
		return this.taxId;
	}


	/**
	 * Setter for additionalInfo
	 */
	public MerchantInfo setAdditionalInfo(String additionalInfo) {
		this.additionalInfo = additionalInfo;
		return this;
	}

	/**
	 * Getter for additionalInfo
	 */
	public String getAdditionalInfo() {
		return this.additionalInfo;
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