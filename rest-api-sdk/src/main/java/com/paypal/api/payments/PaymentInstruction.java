package com.paypal.api.payments;

import com.paypal.base.rest.JSONFormatter;
import com.paypal.api.payments.RecipientBankingInstruction;
import com.paypal.api.payments.Currency;
import com.paypal.api.payments.DefinitionsLinkdescription;
import java.util.List;
import com.paypal.base.rest.PayPalRESTException;
import com.paypal.base.rest.PayPalResource;
import com.paypal.base.rest.OAuthTokenCredential;
import com.paypal.base.rest.PayPalModel;
import com.paypal.base.rest.HttpMethod;
import com.paypal.base.rest.RESTUtil;
import com.paypal.base.rest.QueryParameters;
import com.paypal.base.rest.APIContext;
import com.paypal.base.Constants;
import com.paypal.base.SDKVersion;
import java.io.File;
import java.io.InputStream;
import java.util.Map;
import java.util.HashMap;
import java.util.Properties;

public class PaymentInstruction extends PayPalModel {

	/**
	 * ID of payment instruction
	 */
	private String referenceNumber;

	/**
	 * Type of payment instruction
	 */
	private String instructionType;

	/**
	 * Recipient bank Details.
	 */
	private RecipientBankingInstruction recipientBankingInstruction;

	/**
	 * Amount to be transferred
	 */
	private Currency amount;

	/**
	 * Date by which payment should be received
	 */
	private String paymentDueDate;

	/**
	 * Additional text regarding payment handling
	 */
	private String note;

	/**
	 * 
	 */
	private List<Links> links;

	/**
	 * Returns the last request sent to the Service
	 *
	 * @return Last request sent to the server
	 */
	public static String getLastRequest() {
		return PayPalResource.getLastRequest();
	}

	/**
	 * Returns the last response returned by the Service
	 *
	 * @return Last response got from the Service
	 */
	public static String getLastResponse() {
		return PayPalResource.getLastResponse();
	}

	/**
	 * Initialize using InputStream(of a Properties file)
	 *
	 * @param is
	 *            InputStream
	 * @throws PayPalRESTException
	 * @return OAuthTokenCredential instance using client ID and client secret loaded from configuration.
	 */
	public static OAuthTokenCredential initConfig(InputStream is) throws PayPalRESTException {
		return PayPalResource.initConfig(is);
	}

	/**
	 * Initialize using a File(Properties file)
	 *
	 * @param file
	 *            File object of a properties entity
	 * @throws PayPalRESTException
	 * @return OAuthTokenCredential instance using client ID and client secret loaded from configuration.
	 */
	public static OAuthTokenCredential initConfig(File file) throws PayPalRESTException {
		return PayPalResource.initConfig(file);
	}

	/**
	 * Initialize using Properties
	 *
	 * @param properties
	 *            Properties object
	 * @return OAuthTokenCredential instance using client ID and client secret loaded from configuration.
	 */
	public static OAuthTokenCredential initConfig(Properties properties) {
		return PayPalResource.initConfig(properties);
	}
	/**
	 * Default Constructor
	 */
	public PaymentInstruction() {
	}

	/**
	 * Parameterized Constructor
	 */
	public PaymentInstruction(String referenceNumber, String instructionType, RecipientBankingInstruction recipientBankingInstruction, Currency amount) {
		this.referenceNumber = referenceNumber;
		this.instructionType = instructionType;
		this.recipientBankingInstruction = recipientBankingInstruction;
		this.amount = amount;
	}


	/**
	 * Setter for referenceNumber
	 */
	public PaymentInstruction setReferenceNumber(String referenceNumber) {
		this.referenceNumber = referenceNumber;
		return this;
	}

	/**
	 * Getter for referenceNumber
	 */
	public String getReferenceNumber() {
		return this.referenceNumber;
	}


	/**
	 * Setter for instructionType
	 */
	public PaymentInstruction setInstructionType(String instructionType) {
		this.instructionType = instructionType;
		return this;
	}

	/**
	 * Getter for instructionType
	 */
	public String getInstructionType() {
		return this.instructionType;
	}


	/**
	 * Setter for recipientBankingInstruction
	 */
	public PaymentInstruction setRecipientBankingInstruction(RecipientBankingInstruction recipientBankingInstruction) {
		this.recipientBankingInstruction = recipientBankingInstruction;
		return this;
	}

	/**
	 * Getter for recipientBankingInstruction
	 */
	public RecipientBankingInstruction getRecipientBankingInstruction() {
		return this.recipientBankingInstruction;
	}


	/**
	 * Setter for amount
	 */
	public PaymentInstruction setAmount(Currency amount) {
		this.amount = amount;
		return this;
	}

	/**
	 * Getter for amount
	 */
	public Currency getAmount() {
		return this.amount;
	}


	/**
	 * Setter for paymentDueDate
	 */
	public PaymentInstruction setPaymentDueDate(String paymentDueDate) {
		this.paymentDueDate = paymentDueDate;
		return this;
	}

	/**
	 * Getter for paymentDueDate
	 */
	public String getPaymentDueDate() {
		return this.paymentDueDate;
	}


	/**
	 * Setter for note
	 */
	public PaymentInstruction setNote(String note) {
		this.note = note;
		return this;
	}

	/**
	 * Getter for note
	 */
	public String getNote() {
		return this.note;
	}


	/**
	 * Setter for links
	 */
	public PaymentInstruction setLinks(List<Links> links) {
		this.links = links;
		return this;
	}

	/**
	 * Getter for links
	 */
	public List<Links> getLinks() {
		return this.links;
	}

}
