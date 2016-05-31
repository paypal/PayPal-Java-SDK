package com.paypal.api.payments;

import com.paypal.base.rest.JSONFormatter;
import com.paypal.base.rest.PayPalModel;

public class Card3dSecureInfo extends PayPalModel {

	/**
	 * Authorization status from 3ds provider. Should be echoed back in the response
	 */
	private String authStatus;

	/**
	 * Numeric flag to indicate how the payment should be processed in relationship to 3d-secure. If 0 then ignore all 3d values and process as non-3ds 
	 */
	private String eci;

	/**
	 * Cardholder Authentication Verification Value (used by VISA). 
	 */
	private String cavv;

	/**
	 * Transaction identifier from authenticator.
	 */
	private String xid;

	/**
	 * Name of the actual 3ds vendor who processed the 3ds request, e.g. Cardinal
	 */
	private String mpiVendor;

	/**
	 * Default Constructor
	 */
	public Card3dSecureInfo() {
	}


	/**
	 * Setter for authStatus
	 */
	public Card3dSecureInfo setAuthStatus(String authStatus) {
		this.authStatus = authStatus;
		return this;
	}

	/**
	 * Getter for authStatus
	 */
	public String getAuthStatus() {
		return this.authStatus;
	}


	/**
	 * Setter for eci
	 */
	public Card3dSecureInfo setEci(String eci) {
		this.eci = eci;
		return this;
	}

	/**
	 * Getter for eci
	 */
	public String getEci() {
		return this.eci;
	}


	/**
	 * Setter for cavv
	 */
	public Card3dSecureInfo setCavv(String cavv) {
		this.cavv = cavv;
		return this;
	}

	/**
	 * Getter for cavv
	 */
	public String getCavv() {
		return this.cavv;
	}


	/**
	 * Setter for xid
	 */
	public Card3dSecureInfo setXid(String xid) {
		this.xid = xid;
		return this;
	}

	/**
	 * Getter for xid
	 */
	public String getXid() {
		return this.xid;
	}


	/**
	 * Setter for mpiVendor
	 */
	public Card3dSecureInfo setMpiVendor(String mpiVendor) {
		this.mpiVendor = mpiVendor;
		return this;
	}

	/**
	 * Getter for mpiVendor
	 */
	public String getMpiVendor() {
		return this.mpiVendor;
	}

}
