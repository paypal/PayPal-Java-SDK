package com.paypal.api.payments;

import com.paypal.base.rest.PayPalModel;


public class FundingInstrument  extends PayPalModel {

	/**
	 * Credit Card instrument.
	 */
	private CreditCard creditCard;

	/**
	 * PayPal vaulted credit Card instrument.
	 */
	private CreditCardToken creditCardToken;

	/**
	 * Payment Card information.
	 */
	private PaymentCard paymentCard;

	/**
	 * Bank Account information.
	 */
	private ExtendedBankAccount bankAccount;

	/**
	 * Vaulted bank account instrument.
	 */
	private BankToken bankAccountToken;

	/**
	 * PayPal credit funding instrument.
	 */
	private Credit credit;

	/**
	 * Incentive funding instrument.
	 */
	private Incentive incentive;

	/**
	 * External funding instrument.
	 */
	private ExternalFunding externalFunding;

	/**
	 * Carrier account token instrument.
	 */
	private CarrierAccountToken carrierAccountToken;

	/**
	 * Carrier account instrument
	 */
	private CarrierAccount carrierAccount;

	/**
	 * Private Label Card funding instrument. These are store cards provided by merchants to drive business with value to customer with convenience and rewards.
	 */
	private PrivateLabelCard privateLabelCard;

	/**
	 * Billing instrument that references pre-approval information for the payment
	 */
	private Billing billing;

	/**
	 * Alternate Payment  information - Mostly regional payment providers. For e.g iDEAL in Netherlands
	 */
	private AlternatePayment alternatePayment;

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
	 * Setter for paymentCard
	 */
	public FundingInstrument setPaymentCard(PaymentCard paymentCard) {
		this.paymentCard = paymentCard;
		return this;
	}

	/**
	 * Getter for paymentCard
	 */
	public PaymentCard getPaymentCard() {
		return this.paymentCard;
	}


	/**
	 * Setter for bankAccount
	 */
	public FundingInstrument setBankAccount(ExtendedBankAccount bankAccount) {
		this.bankAccount = bankAccount;
		return this;
	}

	/**
	 * Getter for bankAccount
	 */
	public ExtendedBankAccount getBankAccount() {
		return this.bankAccount;
	}


	/**
	 * Setter for bankAccountToken
	 */
	public FundingInstrument setBankAccountToken(BankToken bankAccountToken) {
		this.bankAccountToken = bankAccountToken;
		return this;
	}

	/**
	 * Getter for bankAccountToken
	 */
	public BankToken getBankAccountToken() {
		return this.bankAccountToken;
	}


	/**
	 * Setter for credit
	 */
	public FundingInstrument setCredit(Credit credit) {
		this.credit = credit;
		return this;
	}

	/**
	 * Getter for credit
	 */
	public Credit getCredit() {
		return this.credit;
	}


	/**
	 * Setter for incentive
	 */
	public FundingInstrument setIncentive(Incentive incentive) {
		this.incentive = incentive;
		return this;
	}

	/**
	 * Getter for incentive
	 */
	public Incentive getIncentive() {
		return this.incentive;
	}


	/**
	 * Setter for externalFunding
	 */
	public FundingInstrument setExternalFunding(ExternalFunding externalFunding) {
		this.externalFunding = externalFunding;
		return this;
	}

	/**
	 * Getter for externalFunding
	 */
	public ExternalFunding getExternalFunding() {
		return this.externalFunding;
	}


	/**
	 * Setter for carrierAccountToken
	 */
	public FundingInstrument setCarrierAccountToken(CarrierAccountToken carrierAccountToken) {
		this.carrierAccountToken = carrierAccountToken;
		return this;
	}

	/**
	 * Getter for carrierAccountToken
	 */
	public CarrierAccountToken getCarrierAccountToken() {
		return this.carrierAccountToken;
	}


	/**
	 * Setter for carrierAccount
	 */
	public FundingInstrument setCarrierAccount(CarrierAccount carrierAccount) {
		this.carrierAccount = carrierAccount;
		return this;
	}

	/**
	 * Getter for carrierAccount
	 */
	public CarrierAccount getCarrierAccount() {
		return this.carrierAccount;
	}


	/**
	 * Setter for privateLabelCard
	 */
	public FundingInstrument setPrivateLabelCard(PrivateLabelCard privateLabelCard) {
		this.privateLabelCard = privateLabelCard;
		return this;
	}

	/**
	 * Getter for privateLabelCard
	 */
	public PrivateLabelCard getPrivateLabelCard() {
		return this.privateLabelCard;
	}


	/**
	 * Setter for billing
	 */
	public FundingInstrument setBilling(Billing billing) {
		this.billing = billing;
		return this;
	}

	/**
	 * Getter for billing
	 */
	public Billing getBilling() {
		return this.billing;
	}


	/**
	 * Setter for alternatePayment
	 */
	public FundingInstrument setAlternatePayment(AlternatePayment alternatePayment) {
		this.alternatePayment = alternatePayment;
		return this;
	}

	/**
	 * Getter for alternatePayment
	 */
	public AlternatePayment getAlternatePayment() {
		return this.alternatePayment;
	}


}
