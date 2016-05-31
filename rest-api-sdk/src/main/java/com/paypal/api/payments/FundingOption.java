package com.paypal.api.payments;

import com.paypal.base.rest.JSONFormatter;
import com.paypal.api.payments.FundingSource;
import java.util.List;
import com.paypal.api.payments.FundingInstrument;
import com.paypal.api.payments.CurrencyConversion;
import com.paypal.api.payments.InstallmentInfo;
import com.paypal.api.payments.DefinitionsLinkdescription;

public class FundingOption  {

	/**
	 * id of the funding option.
	 */
	private String id;

	/**
	 * List of funding sources that contributes to a payment.
	 */
	private List<FundingSource> fundingSources;

	/**
	 * Backup funding instrument which will be used for payment if primary fails.
	 */
	private FundingInstrument backupFundingInstrument;

	/**
	 * Currency conversion applicable to this funding option.
	 */
	private CurrencyConversion currencyConversion;

	/**
	 * Installment options available for a funding option.
	 */
	private InstallmentInfo installmentInfo;

	/**
	 * 
	 */
	private List<DefinitionsLinkdescription> links;

	/**
	 * Default Constructor
	 */
	public FundingOption() {
	}

	/**
	 * Parameterized Constructor
	 */
	public FundingOption(String id, List<FundingSource> fundingSources) {
		this.id = id;
		this.fundingSources = fundingSources;
	}


	/**
	 * Setter for id
	 */
	public FundingOption setId(String id) {
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
	 * Setter for fundingSources
	 */
	public FundingOption setFundingSources(List<FundingSource> fundingSources) {
		this.fundingSources = fundingSources;
		return this;
	}

	/**
	 * Getter for fundingSources
	 */
	public List<FundingSource> getFundingSources() {
		return this.fundingSources;
	}


	/**
	 * Setter for backupFundingInstrument
	 */
	public FundingOption setBackupFundingInstrument(FundingInstrument backupFundingInstrument) {
		this.backupFundingInstrument = backupFundingInstrument;
		return this;
	}

	/**
	 * Getter for backupFundingInstrument
	 */
	public FundingInstrument getBackupFundingInstrument() {
		return this.backupFundingInstrument;
	}


	/**
	 * Setter for currencyConversion
	 */
	public FundingOption setCurrencyConversion(CurrencyConversion currencyConversion) {
		this.currencyConversion = currencyConversion;
		return this;
	}

	/**
	 * Getter for currencyConversion
	 */
	public CurrencyConversion getCurrencyConversion() {
		return this.currencyConversion;
	}


	/**
	 * Setter for installmentInfo
	 */
	public FundingOption setInstallmentInfo(InstallmentInfo installmentInfo) {
		this.installmentInfo = installmentInfo;
		return this;
	}

	/**
	 * Getter for installmentInfo
	 */
	public InstallmentInfo getInstallmentInfo() {
		return this.installmentInfo;
	}


	/**
	 * Setter for links
	 */
	public FundingOption setLinks(List<DefinitionsLinkdescription> links) {
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
