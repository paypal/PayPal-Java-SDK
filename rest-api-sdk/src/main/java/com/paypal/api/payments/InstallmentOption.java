package com.paypal.api.payments;

import com.paypal.base.rest.JSONFormatter;
import com.paypal.api.payments.Currency;
import com.paypal.api.payments.Percentage;

public class InstallmentOption  {

	/**
	 * Number of installments
	 */
	private int term;

	/**
	 * Monthly payment
	 */
	private Currency monthlyPayment;

	/**
	 * Discount amount applied to the payment, if any
	 */
	private Currency discountAmount;

	/**
	 * Discount percentage applied to the payment, if any
	 */
	private Percentage discountPercentage;

	/**
	 * Default Constructor
	 */
	public InstallmentOption() {
	}

	/**
	 * Parameterized Constructor
	 */
	public InstallmentOption(int term, Currency monthlyPayment) {
		this.term = term;
		this.monthlyPayment = monthlyPayment;
	}


	/**
	 * Setter for term
	 */
	public InstallmentOption setTerm(int term) {
		this.term = term;
		return this;
	}

	/**
	 * Getter for term
	 */
	public int getTerm() {
		return this.term;
	}


	/**
	 * Setter for monthlyPayment
	 */
	public InstallmentOption setMonthlyPayment(Currency monthlyPayment) {
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
	 * Setter for discountAmount
	 */
	public InstallmentOption setDiscountAmount(Currency discountAmount) {
		this.discountAmount = discountAmount;
		return this;
	}

	/**
	 * Getter for discountAmount
	 */
	public Currency getDiscountAmount() {
		return this.discountAmount;
	}


	/**
	 * Setter for discountPercentage
	 */
	public InstallmentOption setDiscountPercentage(Percentage discountPercentage) {
		this.discountPercentage = discountPercentage;
		return this;
	}

	/**
	 * Getter for discountPercentage
	 */
	public Percentage getDiscountPercentage() {
		return this.discountPercentage;
	}

}
