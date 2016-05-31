package com.paypal.api.payments;

import com.paypal.base.rest.JSONFormatter;

public class ProcessorResponse  {

	/**
	 * Paypal normalized response code, generated from the processor's specific response code
	 */
	private String responseCode;

	/**
	 * Address Verification System response code. https://developer.paypal.com/webapps/developer/docs/classic/api/AVSResponseCodes/
	 */
	private String avsCode;

	/**
	 * CVV System response code. https://developer.paypal.com/webapps/developer/docs/classic/api/AVSResponseCodes/
	 */
	private String cvvCode;

	/**
	 * Provides merchant advice on how to handle declines related to recurring payments
	 */
	private String adviceCode;

	/**
	 * Response back from the authorization. Provided by the processor
	 */
	private String eciSubmitted;

	/**
	 * Visa Payer Authentication Service status. Will be return from processor
	 */
	private String vpas;

	/**
	 * Default Constructor
	 */
	public ProcessorResponse() {
	}

	/**
	 * Parameterized Constructor
	 */
	public ProcessorResponse(String responseCode) {
		this.responseCode = responseCode;
	}


	/**
	 * Setter for responseCode
	 */
	public ProcessorResponse setResponseCode(String responseCode) {
		this.responseCode = responseCode;
		return this;
	}

	/**
	 * Getter for responseCode
	 */
	public String getResponseCode() {
		return this.responseCode;
	}


	/**
	 * Setter for avsCode
	 */
	public ProcessorResponse setAvsCode(String avsCode) {
		this.avsCode = avsCode;
		return this;
	}

	/**
	 * Getter for avsCode
	 */
	public String getAvsCode() {
		return this.avsCode;
	}


	/**
	 * Setter for cvvCode
	 */
	public ProcessorResponse setCvvCode(String cvvCode) {
		this.cvvCode = cvvCode;
		return this;
	}

	/**
	 * Getter for cvvCode
	 */
	public String getCvvCode() {
		return this.cvvCode;
	}


	/**
	 * Setter for adviceCode
	 */
	public ProcessorResponse setAdviceCode(String adviceCode) {
		this.adviceCode = adviceCode;
		return this;
	}

	/**
	 * Getter for adviceCode
	 */
	public String getAdviceCode() {
		return this.adviceCode;
	}


	/**
	 * Setter for eciSubmitted
	 */
	public ProcessorResponse setEciSubmitted(String eciSubmitted) {
		this.eciSubmitted = eciSubmitted;
		return this;
	}

	/**
	 * Getter for eciSubmitted
	 */
	public String getEciSubmitted() {
		return this.eciSubmitted;
	}


	/**
	 * Setter for vpas
	 */
	public ProcessorResponse setVpas(String vpas) {
		this.vpas = vpas;
		return this;
	}

	/**
	 * Getter for vpas
	 */
	public String getVpas() {
		return this.vpas;
	}

}
