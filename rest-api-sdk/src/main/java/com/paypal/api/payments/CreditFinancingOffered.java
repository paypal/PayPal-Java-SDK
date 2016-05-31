package com.paypal.api.payments;

import com.paypal.base.rest.JSONFormatter;
import com.paypal.api.payments.Currency;

public class CreditFinancingOffered  {

	/**
	 * This is the estimated total payment amount including interest and fees the user will pay during the lifetime of the loan.
	 */
	private Currency totalCost;

	/**
	 * Length of financing terms in month
	 */
	private float term;

	/**
	 * This is the estimated amount per month that the customer will need to pay including fees and interest.
	 */
	private Currency monthlyPayment;

	/**
	 * Estimated interest or fees amount the payer will have to pay during the lifetime of the loan.
	 */
	private Currency totalInterest;

	/**
	 * Status on whether the customer ultimately was approved for and chose to make the payment using the approved installment credit.
	 */
	private Boolean payerAcceptance;

	/**
	 * Indicates whether the cart amount is editable after payer's acceptance on PayPal side
	 */
	private Boolean cartAmountImmutable;

	/**
	 * Default Constructor
	 */
	public CreditFinancingOffered() {
	}

	/**
	 * Parameterized Constructor
	 */
	public CreditFinancingOffered(Currency totalCost, float term, Currency monthlyPayment, Currency totalInterest, Boolean payerAcceptance) {
		this.totalCost = totalCost;
		this.term = term;
		this.monthlyPayment = monthlyPayment;
		this.totalInterest = totalInterest;
		this.payerAcceptance = payerAcceptance;
	}


	/**
	 * Setter for totalCost
	 */
	public CreditFinancingOffered setTotalCost(Currency totalCost) {
		this.totalCost = totalCost;
		return this;
	}

	/**
	 * Getter for totalCost
	 */
	public Currency getTotalCost() {
		return this.totalCost;
	}


	/**
	 * Setter for term
	 */
	public CreditFinancingOffered setTerm(float term) {
		this.term = term;
		return this;
	}

	/**
	 * Getter for term
	 */
	public float getTerm() {
		return this.term;
	}


	/**
	 * Setter for monthlyPayment
	 */
	public CreditFinancingOffered setMonthlyPayment(Currency monthlyPayment) {
		this.monthlyPayment = monthlyPayment;
		return this;
	}

	/**
	 * Getter for monthlyPayment
	 */
	public Currency getMonthlyPayment() {
		return this.monthlyPayment;
	}


	/**
	 * Setter for totalInterest
	 */
	public CreditFinancingOffered setTotalInterest(Currency totalInterest) {
		this.totalInterest = totalInterest;
		return this;
	}

	/**
	 * Getter for totalInterest
	 */
	public Currency getTotalInterest() {
		return this.totalInterest;
	}


	/**
	 * Setter for payerAcceptance
	 */
	public CreditFinancingOffered setPayerAcceptance(Boolean payerAcceptance) {
		this.payerAcceptance = payerAcceptance;
		return this;
	}

	/**
	 * Getter for payerAcceptance
	 */
	public Boolean getPayerAcceptance() {
		return this.payerAcceptance;
	}


	/**
	 * Setter for cartAmountImmutable
	 */
	public CreditFinancingOffered setCartAmountImmutable(Boolean cartAmountImmutable) {
		this.cartAmountImmutable = cartAmountImmutable;
		return this;
	}

	/**
	 * Getter for cartAmountImmutable
	 */
	public Boolean getCartAmountImmutable() {
		return this.cartAmountImmutable;
	}

}
