package com.paypal.api.payments;

import com.paypal.base.rest.JSONFormatter;
import com.paypal.api.payments.InstallmentOption;
import java.util.List;

public class InstallmentInfo  {

	/**
	 * Installment id.
	 */
	private String installmentId;

	/**
	 * Credit card network.
	 */
	private String network;

	/**
	 * Credit card issuer.
	 */
	private String issuer;

	/**
	 * List of available installment options and the cost associated with each one.
	 */
	private List<InstallmentOption> installmentOptions;

	/**
	 * Default Constructor
	 */
	public InstallmentInfo() {
	}

	/**
	 * Parameterized Constructor
	 */
	public InstallmentInfo(List<InstallmentOption> installmentOptions) {
		this.installmentOptions = installmentOptions;
	}


	/**
	 * Setter for installmentId
	 */
	public InstallmentInfo setInstallmentId(String installmentId) {
		this.installmentId = installmentId;
		return this;
	}

	/**
	 * Getter for installmentId
	 */
	public String getInstallmentId() {
		return this.installmentId;
	}


	/**
	 * Setter for network
	 */
	public InstallmentInfo setNetwork(String network) {
		this.network = network;
		return this;
	}

	/**
	 * Getter for network
	 */
	public String getNetwork() {
		return this.network;
	}


	/**
	 * Setter for issuer
	 */
	public InstallmentInfo setIssuer(String issuer) {
		this.issuer = issuer;
		return this;
	}

	/**
	 * Getter for issuer
	 */
	public String getIssuer() {
		return this.issuer;
	}


	/**
	 * Setter for installmentOptions
	 */
	public InstallmentInfo setInstallmentOptions(List<InstallmentOption> installmentOptions) {
		this.installmentOptions = installmentOptions;
		return this;
	}

	/**
	 * Getter for installmentOptions
	 */
	public List<InstallmentOption> getInstallmentOptions() {
		return this.installmentOptions;
	}

}
