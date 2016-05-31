package com.paypal.api.payments;

import java.util.List;

import com.paypal.base.rest.PayPalModel;

public class BankAccount  extends PayPalModel {

	/**
	 * ID of the bank account being saved for later use.
	 */
	private String id;

	/**
	 * Account number in either IBAN (max length 34) or BBAN (max length 17) format.
	 */
	private String accountNumber;

	/**
	 * Type of the bank account number (International or Basic Bank Account Number). For more information refer to http://en.wikipedia.org/wiki/International_Bank_Account_Number.
	 */
	private String accountNumberType;

	/**
	 * Routing transit number (aka Bank Code) of the bank (typically for domestic use only - for international use, IBAN includes bank code). For more information refer to http://en.wikipedia.org/wiki/Bank_code.
	 */
	private String routingNumber;

	/**
	 * Type of the bank account.
	 */
	private String accountType;

	/**
	 * A customer designated name.
	 */
	private String accountName;

	/**
	 * Type of the check when this information was obtained through a check by the facilitator or merchant.
	 */
	private String checkType;

	/**
	 * How the check was obtained from the customer, if check was the source of the information provided.
	 */
	private String authType;

	/**
	 * Time at which the authorization (or check) was captured. Use this field if the user authorization needs to be captured due to any privacy requirements.
	 */
	private String authCaptureTimestamp;

	/**
	 * Name of the bank.
	 */
	private String bankName;

	/**
	 * 2 letter country code of the Bank.
	 */
	private String countryCode;

	/**
	 * Account holder's first name.
	 */
	private String firstName;

	/**
	 * Account holder's last name.
	 */
	private String lastName;

	/**
	 * Birth date of the bank account holder.
	 */
	private String birthDate;

	/**
	 * Billing address.
	 */
	private Address billingAddress;

	/**
	 * State of this funding instrument.
	 */
	private String state;

	/**
	 * Confirmation status of a bank account.
	 */
	private String confirmationStatus;

	/**
	 * [DEPRECATED] Use external_customer_id instead.
	 */
	private String payerId;

	/**
	 * A unique identifier of the customer to whom this bank account belongs to. Generated and provided by the facilitator. This is required when creating or using a stored funding instrument in vault.
	 */
	private String externalCustomerId;

	/**
	 * A unique identifier of the merchant for which this bank account has been stored for. Generated and provided by the facilitator so it can be used to restrict the usage of the bank account to the specific merchnt.
	 */
	private String merchantId;

	/**
	 * Time the resource was created.
	 */
	private String createTime;

	/**
	 * Time the resource was last updated.
	 */
	private String updateTime;

	/**
	 * Date/Time until this resource can be used to fund a payment.
	 */
	private String validUntil;

	/**
	 * 
	 */
	private List<DefinitionsLinkdescription> links;

	/**
	 * Default Constructor
	 */
	public BankAccount() {
	}

	/**
	 * Parameterized Constructor
	 */
	public BankAccount(String accountNumber, String accountNumberType) {
		this.accountNumber = accountNumber;
		this.accountNumberType = accountNumberType;
	}


	/**
	 * Setter for id
	 */
	public BankAccount setId(String id) {
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
	 * Setter for accountNumber
	 */
	public BankAccount setAccountNumber(String accountNumber) {
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
	 * Setter for accountNumberType
	 */
	public BankAccount setAccountNumberType(String accountNumberType) {
		this.accountNumberType = accountNumberType;
		return this;
	}

	/**
	 * Getter for accountNumberType
	 */
	public String getAccountNumberType() {
		return this.accountNumberType;
	}


	/**
	 * Setter for routingNumber
	 */
	public BankAccount setRoutingNumber(String routingNumber) {
		this.routingNumber = routingNumber;
		return this;
	}

	/**
	 * Getter for routingNumber
	 */
	public String getRoutingNumber() {
		return this.routingNumber;
	}


	/**
	 * Setter for accountType
	 */
	public BankAccount setAccountType(String accountType) {
		this.accountType = accountType;
		return this;
	}

	/**
	 * Getter for accountType
	 */
	public String getAccountType() {
		return this.accountType;
	}


	/**
	 * Setter for accountName
	 */
	public BankAccount setAccountName(String accountName) {
		this.accountName = accountName;
		return this;
	}

	/**
	 * Getter for accountName
	 */
	public String getAccountName() {
		return this.accountName;
	}


	/**
	 * Setter for checkType
	 */
	public BankAccount setCheckType(String checkType) {
		this.checkType = checkType;
		return this;
	}

	/**
	 * Getter for checkType
	 */
	public String getCheckType() {
		return this.checkType;
	}


	/**
	 * Setter for authType
	 */
	public BankAccount setAuthType(String authType) {
		this.authType = authType;
		return this;
	}

	/**
	 * Getter for authType
	 */
	public String getAuthType() {
		return this.authType;
	}


	/**
	 * Setter for authCaptureTimestamp
	 */
	public BankAccount setAuthCaptureTimestamp(String authCaptureTimestamp) {
		this.authCaptureTimestamp = authCaptureTimestamp;
		return this;
	}

	/**
	 * Getter for authCaptureTimestamp
	 */
	public String getAuthCaptureTimestamp() {
		return this.authCaptureTimestamp;
	}


	/**
	 * Setter for bankName
	 */
	public BankAccount setBankName(String bankName) {
		this.bankName = bankName;
		return this;
	}

	/**
	 * Getter for bankName
	 */
	public String getBankName() {
		return this.bankName;
	}


	/**
	 * Setter for countryCode
	 */
	public BankAccount setCountryCode(String countryCode) {
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
	 * Setter for firstName
	 */
	public BankAccount setFirstName(String firstName) {
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
	public BankAccount setLastName(String lastName) {
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
	 * Setter for birthDate
	 */
	public BankAccount setBirthDate(String birthDate) {
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
	 * Setter for billingAddress
	 */
	public BankAccount setBillingAddress(Address billingAddress) {
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
	 * Setter for state
	 */
	public BankAccount setState(String state) {
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
	 * Setter for confirmationStatus
	 */
	public BankAccount setConfirmationStatus(String confirmationStatus) {
		this.confirmationStatus = confirmationStatus;
		return this;
	}

	/**
	 * Getter for confirmationStatus
	 */
	public String getConfirmationStatus() {
		return this.confirmationStatus;
	}


	/**
	 * Setter for payerId
	 */
	public BankAccount setPayerId(String payerId) {
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
	 * Setter for externalCustomerId
	 */
	public BankAccount setExternalCustomerId(String externalCustomerId) {
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
	 * Setter for merchantId
	 */
	public BankAccount setMerchantId(String merchantId) {
		this.merchantId = merchantId;
		return this;
	}

	/**
	 * Getter for merchantId
	 */
	public String getMerchantId() {
		return this.merchantId;
	}


	/**
	 * Setter for createTime
	 */
	public BankAccount setCreateTime(String createTime) {
		this.createTime = createTime;
		return this;
	}

	/**
	 * Getter for createTime
	 */
	public String getCreateTime() {
		return this.createTime;
	}


	/**
	 * Setter for updateTime
	 */
	public BankAccount setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
		return this;
	}

	/**
	 * Getter for updateTime
	 */
	public String getUpdateTime() {
		return this.updateTime;
	}


	/**
	 * Setter for validUntil
	 */
	public BankAccount setValidUntil(String validUntil) {
		this.validUntil = validUntil;
		return this;
	}

	/**
	 * Getter for validUntil
	 */
	public String getValidUntil() {
		return this.validUntil;
	}


	/**
	 * Setter for links
	 */
	public BankAccount setLinks(List<DefinitionsLinkdescription> links) {
		this.links = links;
		return this;
	}

	/**
	 * Getter for links
	 */
	public List<DefinitionsLinkdescription> getLinks() {
		return this.links;
	}



}
