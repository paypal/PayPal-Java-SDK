// This class was generated on Tue, 23 Jan 2018 17:16:08 CST by version 0.1.0-dev+20fb1e of Braintree SDK Generator
// Payer.java
// @version 0.1.0-dev+20fb1e
// @type object
// @data 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
// DO NOT EDIT
package com.paypal.sdk.billingagreements;

import java.util.List;

import com.braintreepayments.http.annotations.*;
/**
 * The customer who funds the payment.
 */
@Model
public class Payer {

    // Required default constructor
    public Payer() {}

	/**
	* An array of funding instruments.
	*/
	@SerializedName(value = "funding_instruments", listClass = FundingInstrument.class)
	private List<FundingInstrument> fundingInstruments;

	public List<FundingInstrument> fundingInstruments() { return fundingInstruments; }
	
	public Payer fundingInstruments(List<FundingInstrument> fundingInstruments) {
	    this.fundingInstruments = fundingInstruments;
	    return this;
	}

	/**
	* The ID of the customer-selected funding option for the payment. Value is `funding_instruments` or `funding_option_id`.
	*/
	@SerializedName("funding_option_id")
	private String fundingOptionId;

	public String fundingOptionId() { return fundingOptionId; }
	
	public Payer fundingOptionId(String fundingOptionId) {
	    this.fundingOptionId = fundingOptionId;
	    return this;
	}

	/**
	* Information about the customer.
	*/
	@SerializedName("payer_info")
	private PayerInformation payerInfo;

	public PayerInformation payerInfo() { return payerInfo; }
	
	public Payer payerInfo(PayerInformation payerInfo) {
	    this.payerInfo = payerInfo;
	    return this;
	}

	/**
	* REQUIRED
	* The payment method.
	*/
	@SerializedName("payment_method")
	private String paymentMethod;

	public String paymentMethod() { return paymentMethod; }
	
	public Payer paymentMethod(String paymentMethod) {
	    this.paymentMethod = paymentMethod;
	    return this;
	}
}
