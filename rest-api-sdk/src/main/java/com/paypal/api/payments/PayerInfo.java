package com.paypal.api.payments;

import com.paypal.base.rest.PayPalModel;


public class PayerInfo  extends PayPalModel {

	/**
	 * Email address representing the payer. 127 characters max.
	 */
	private String email;

	/**
	 * External Remember Me id representing the payer
	 */
	private String externalRememberMeId;

	/**
	 * Account Number representing the Payer
	 */
	private String accountNumber;

	/**
	 * Salutation of the payer.
	 */
	private String salutation;

	/**
	 * First name of the payer.
	 */
	private String firstName;

	/**
	 * Middle name of the payer.
	 */
	private String middleName;

	/**
	 * Last name of the payer.
	 */
	private String lastName;

	/**
	 * Suffix of the payer.
	 */
	private String suffix;

	/**
	 * PayPal assigned encrypted Payer ID.
	 */
	private String payerId;

	/**
	 * Phone number representing the payer. 20 characters max.
	 */
	private String phone;

	/**
	 * Phone type
	 */
	private String phoneType;

	/**
	 * Birth date of the Payer in ISO8601 format (yyyy-mm-dd).
	 */
	private String birthDate;

	/**
	 * Payer’s tax ID. Only supported when the `payment_method` is set to `paypal`.
	 */
	private String taxId;

	/**
	 * Payer’s tax ID type. Allowed values: `BR_CPF` or `BR_CNPJ`. Only supported when the `payment_method` is set to `paypal`.
	 */
	private String taxIdType;

	/**
	 * Two-letter registered country code of the payer to identify the buyer country.
	 */
	private String countryCode;

	/**
	 * Billing address of the Payer.
	 */
	private Address billingAddress;

	/**
	 * Shipping address of payer PayPal account.
	 */
	private ShippingAddress shippingAddress;

	/**
	 * Default Constructor
	 */
	public PayerInfo() {
	}


	/**
	 * Setter for email
	 */
	public PayerInfo setEmail(String email) {
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
	 * Setter for externalRememberMeId
	 */
	public PayerInfo setExternalRememberMeId(String externalRememberMeId) {
		this.externalRememberMeId = externalRememberMeId;
		return this;
	}

	/**
	 * Getter for externalRememberMeId
	 */
	public String getExternalRememberMeId() {
		return this.externalRememberMeId;
	}


	/**
	 * Setter for accountNumber
	 */
	public PayerInfo setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
		return this;
	}

	/**
	 * Getter for accountNumber
	 */
	public String getAccountNumber() {
		return this.accountNumber;
	}


	/**
	 * Setter for salutation
	 */
	public PayerInfo setSalutation(String salutation) {
		this.salutation = salutation;
		return this;
	}

	/**
	 * Getter for salutation
	 */
	public String getSalutation() {
		return this.salutation;
	}


	/**
	 * Setter for firstName
	 */
	public PayerInfo setFirstName(String firstName) {
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
	 * Setter for middleName
	 */
	public PayerInfo setMiddleName(String middleName) {
		this.middleName = middleName;
		return this;
	}

	/**
	 * Getter for middleName
	 */
	public String getMiddleName() {
		return this.middleName;
	}


	/**
	 * Setter for lastName
	 */
	public PayerInfo setLastName(String lastName) {
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
	 * Setter for suffix
	 */
	public PayerInfo setSuffix(String suffix) {
		this.suffix = suffix;
		return this;
	}

	/**
	 * Getter for suffix
	 */
	public String getSuffix() {
		return this.suffix;
	}


	/**
	 * Setter for payerId
	 */
	public PayerInfo setPayerId(String payerId) {
		this.payerId = payerId;
		return this;
	}

	/**
	 * Getter for payerId
	 */
	public String getPayerId() {
		return this.payerId;
	}


	/**
	 * Setter for phone
	 */
	public PayerInfo setPhone(String phone) {
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
	 * Setter for phoneType
	 */
	public PayerInfo setPhoneType(String phoneType) {
		this.phoneType = phoneType;
		return this;
	}

	/**
	 * Getter for phoneType
	 */
	public String getPhoneType() {
		return this.phoneType;
	}


	/**
	 * Setter for birthDate
	 */
	public PayerInfo setBirthDate(String birthDate) {
		this.birthDate = birthDate;
		return this;
	}

	/**
	 * Getter for birthDate
	 */
	public String getBirthDate() {
		return this.birthDate;
	}


	/**
	 * Setter for taxId
	 */
	public PayerInfo setTaxId(String taxId) {
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
	 * Setter for taxIdType
	 */
	public PayerInfo setTaxIdType(String taxIdType) {
		this.taxIdType = taxIdType;
		return this;
	}

	/**
	 * Getter for taxIdType
	 */
	public String getTaxIdType() {
		return this.taxIdType;
	}


	/**
	 * Setter for countryCode
	 */
	public PayerInfo setCountryCode(String countryCode) {
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
	 * Setter for billingAddress
	 */
	public PayerInfo setBillingAddress(Address billingAddress) {
		this.billingAddress = billingAddress;
		return this;
	}

	/**
	 * Getter for billingAddress
	 */
	public Address getBillingAddress() {
		return this.billingAddress;
	}


	/**
	 * Setter for shippingAddress
	 */
	public PayerInfo setShippingAddress(ShippingAddress shippingAddress) {
		this.shippingAddress = shippingAddress;
		return this;
	}

	/**
	 * Getter for shippingAddress
	 */
	public ShippingAddress getShippingAddress() {
		return this.shippingAddress;
	}

}
