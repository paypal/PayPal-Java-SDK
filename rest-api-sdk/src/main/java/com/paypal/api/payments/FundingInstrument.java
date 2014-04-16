package com.paypal.api.payments;

import com.paypal.core.rest.JSONFormatter;
import com.paypal.api.payments.CreditCard;
import com.paypal.api.payments.CreditCardToken;

public class FundingInstrument  {

	/**
	 * Credit Card information.
	 */
	private CreditCard creditCard;

	/**
	 * Credit Card information.
	 */
	private CreditCardToken creditCardToken;

	/**
	 * Default Constructor
	 */
	public FundingInstrument() {
	}


	/**
	 * Setter for creditCard
	 */
	public FundingInstrument setCreditCard(CreditCard creditCard) {
		this.creditCard = creditCard;
		return this;
	}

	/**
	 * Getter for creditCard
	 */
	public CreditCard getCreditCard() {
		return this.creditCard;
	}


	/**
	 * Setter for creditCardToken
	 */
	public FundingInstrument setCreditCardToken(CreditCardToken creditCardToken) {
		this.creditCardToken = creditCardToken;
		return this;
	}

	/**
	 * Getter for creditCardToken
	 */
	public CreditCardToken getCreditCardToken() {
		return this.creditCardToken;
	}

	/**
	 * Returns a JSON string corresponding to object state
	 *
	 * @return JSON representation
	 */
	public String toJSON() {
		return JSONFormatter.toJSON(this);
	}

	@Override
	public String toString() {
		return toJSON();
	}
}