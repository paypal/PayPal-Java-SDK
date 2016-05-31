package com.paypal.api.payments;

import com.paypal.base.rest.JSONFormatter;
import com.paypal.base.rest.PayPalModel;

public class CarrierAccountToken extends PayPalModel {

	/**
	 * ID of a previously saved carrier account resource.
	 */
	private String carrierAccountId;

	/**
	 * The unique identifier of the payer used when saving this carrier account instrument.
	 */
	private String externalCustomerId;

	/**
	 * Default Constructor
	 */
	public CarrierAccountToken() {
	}

	/**
	 * Parameterized Constructor
	 */
	public CarrierAccountToken(String carrierAccountId, String externalCustomerId) {
		this.carrierAccountId = carrierAccountId;
		this.externalCustomerId = externalCustomerId;
	}


	/**
	 * Setter for carrierAccountId
	 */
	public CarrierAccountToken setCarrierAccountId(String carrierAccountId) {
		this.carrierAccountId = carrierAccountId;
		return this;
	}

	/**
	 * Getter for carrierAccountId
	 */
	public String getCarrierAccountId() {
		return this.carrierAccountId;
	}


	/**
	 * Setter for externalCustomerId
	 */
	public CarrierAccountToken setExternalCustomerId(String externalCustomerId) {
		this.externalCustomerId = externalCustomerId;
		return this;
	}

	/**
	 * Getter for externalCustomerId
	 */
	public String getExternalCustomerId() {
		return this.externalCustomerId;
	}

}
