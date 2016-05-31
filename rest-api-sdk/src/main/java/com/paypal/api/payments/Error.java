package com.paypal.api.payments;

import java.util.List;

import com.paypal.base.rest.PayPalModel;

public class Error  extends PayPalModel {

	/**
	 * Human readable, unique name of the error.
	 */
	private String name;

	/**
	 * Reference ID of the purchase_unit associated with this error
	 */
	private String purchaseUnitReferenceId;

	/**
	 * Message describing the error.
	 */
	private String message;

	/**
	 * PayPal internal error code.
	 */
	private String code;

	/**
	 * Additional details of the error
	 */
	private List<ErrorDetails> details;

	/**
	 * response codes returned from a payment processor such as avs, cvv, etc. Only supported when the `payment_method` is set to `credit_card`.
	 */
	private ProcessorResponse processorResponse;

	/**
	 * Fraud filter details.  Only supported when the `payment_method` is set to `credit_card`
	 */
	private FmfDetails fmfDetails;

	/**
	 * URI for detailed information related to this error for the developer.
	 */
	private String informationLink;

	/**
	 * PayPal internal identifier used for correlation purposes.
	 */
	private String debugId;

	/**
	 * 
	 */
	private List<DefinitionsLinkdescription> links;

	/**
	 * Default Constructor
	 */
	public Error() {
	}

	/**
	 * Parameterized Constructor
	 */
	public Error(String name, String message, String informationLink, String debugId) {
		this.name = name;
		this.message = message;
		this.informationLink = informationLink;
		this.debugId = debugId;
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
	 * Setter for purchaseUnitReferenceId
	 */
	public Error setPurchaseUnitReferenceId(String purchaseUnitReferenceId) {
		this.purchaseUnitReferenceId = purchaseUnitReferenceId;
		return this;
	}

	/**
	 * Getter for purchaseUnitReferenceId
	 */
	public String getPurchaseUnitReferenceId() {
		return this.purchaseUnitReferenceId;
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
	 * Setter for code
	 */
	public Error setCode(String code) {
		this.code = code;
		return this;
	}

	/**
	 * Getter for code
	 */
	public String getCode() {
		return this.code;
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
	 * Setter for processorResponse
	 */
	public Error setProcessorResponse(ProcessorResponse processorResponse) {
		this.processorResponse = processorResponse;
		return this;
	}

	/**
	 * Getter for processorResponse
	 */
	public ProcessorResponse getProcessorResponse() {
		return this.processorResponse;
	}


	/**
	 * Setter for fmfDetails
	 */
	public Error setFmfDetails(FmfDetails fmfDetails) {
		this.fmfDetails = fmfDetails;
		return this;
	}

	/**
	 * Getter for fmfDetails
	 */
	public FmfDetails getFmfDetails() {
		return this.fmfDetails;
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
	 * Setter for links
	 */
	public Error setLinks(List<DefinitionsLinkdescription> links) {
		this.links = links;
		return this;
	}

	/**
	 * Getter for links
	 */
	public List<DefinitionsLinkdescription> getLinks() {
		return this.links;
	}
	
	public String toString() {
		return "name: " + this.name + "\tmessage: " + this.message + "\tdetails: " + this.details + "\tdebug-id: " + this.debugId + "\tinformation-link: " + this.informationLink;
	}

}
