package com.paypal.api.payments;

import com.paypal.base.rest.JSONFormatter;
import com.paypal.api.payments.DefinitionsLinkdescription;
import java.util.List;

public class CurrencyConversion  {

	/**
	 * Date of validity for the conversion rate.
	 */
	private String conversionDate;

	/**
	 * 3 letter currency code
	 */
	private String fromCurrency;

	/**
	 * Amount participating in currency conversion, set to 1 as default 
	 */
	private String fromAmount;

	/**
	 * 3 letter currency code
	 */
	private String toCurrency;

	/**
	 * Amount resulting from currency conversion.
	 */
	private String toAmount;

	/**
	 * Field indicating conversion type applied.
	 */
	private String conversionType;

	/**
	 * Allow Payer to change conversion type.
	 */
	private Boolean conversionTypeChangeable;

	/**
	 * Base URL to web applications endpoint
	 */
	private String webUrl;

	/**
	 * 
	 */
	private List<DefinitionsLinkdescription> links;

	/**
	 * Default Constructor
	 */
	public CurrencyConversion() {
	}

	/**
	 * Parameterized Constructor
	 */
	public CurrencyConversion(String fromCurrency, String fromAmount, String toCurrency, String toAmount) {
		this.fromCurrency = fromCurrency;
		this.fromAmount = fromAmount;
		this.toCurrency = toCurrency;
		this.toAmount = toAmount;
	}


	/**
	 * Setter for conversionDate
	 */
	public CurrencyConversion setConversionDate(String conversionDate) {
		this.conversionDate = conversionDate;
		return this;
	}

	/**
	 * Getter for conversionDate
	 */
	public String getConversionDate() {
		return this.conversionDate;
	}


	/**
	 * Setter for fromCurrency
	 */
	public CurrencyConversion setFromCurrency(String fromCurrency) {
		this.fromCurrency = fromCurrency;
		return this;
	}

	/**
	 * Getter for fromCurrency
	 */
	public String getFromCurrency() {
		return this.fromCurrency;
	}


	/**
	 * Setter for fromAmount
	 */
	public CurrencyConversion setFromAmount(String fromAmount) {
		this.fromAmount = fromAmount;
		return this;
	}

	/**
	 * Getter for fromAmount
	 */
	public String getFromAmount() {
		return this.fromAmount;
	}


	/**
	 * Setter for toCurrency
	 */
	public CurrencyConversion setToCurrency(String toCurrency) {
		this.toCurrency = toCurrency;
		return this;
	}

	/**
	 * Getter for toCurrency
	 */
	public String getToCurrency() {
		return this.toCurrency;
	}


	/**
	 * Setter for toAmount
	 */
	public CurrencyConversion setToAmount(String toAmount) {
		this.toAmount = toAmount;
		return this;
	}

	/**
	 * Getter for toAmount
	 */
	public String getToAmount() {
		return this.toAmount;
	}


	/**
	 * Setter for conversionType
	 */
	public CurrencyConversion setConversionType(String conversionType) {
		this.conversionType = conversionType;
		return this;
	}

	/**
	 * Getter for conversionType
	 */
	public String getConversionType() {
		return this.conversionType;
	}


	/**
	 * Setter for conversionTypeChangeable
	 */
	public CurrencyConversion setConversionTypeChangeable(Boolean conversionTypeChangeable) {
		this.conversionTypeChangeable = conversionTypeChangeable;
		return this;
	}

	/**
	 * Getter for conversionTypeChangeable
	 */
	public Boolean getConversionTypeChangeable() {
		return this.conversionTypeChangeable;
	}


	/**
	 * Setter for webUrl
	 */
	public CurrencyConversion setWebUrl(String webUrl) {
		this.webUrl = webUrl;
		return this;
	}

	/**
	 * Getter for webUrl
	 */
	public String getWebUrl() {
		return this.webUrl;
	}


	/**
	 * Setter for links
	 */
	public CurrencyConversion setLinks(List<DefinitionsLinkdescription> links) {
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
