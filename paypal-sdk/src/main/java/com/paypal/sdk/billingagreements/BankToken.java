// This class was generated on Tue, 23 Jan 2018 17:16:08 CST by version 0.1.0-dev+20fb1e of Braintree SDK Generator
// BankToken.java
// @version 0.1.0-dev+20fb1e
// @type object
// @data H4sIAAAAAAAC/7ySQW/aQBCF7/0Voz2BZKGefXMLh6pSiwr0UlXW2DuGFetZd3YXakX892hNAoEoRFGk3Oy3zzvfG787tew7Urn6gryFpdsSq0z9RjFYWfqBbTpTmfpO/fllSr4W0wXjWOWqgJA+g8YJIFTpnhpFT+ArMlQE0ZOG4KCJrAGhw74lDhOVqUIE++P8z5n6Rah/su1V3qD1lIR/0QjpkzAX15EEQ17lf07kPojh9XPqRFIafQF/1i4zLDcE36bgGggbgh1GG0g/yfIW2CDxipWjtYfsVWD6H0gYbVlHH1xLck3/guFWlEcn7DcO3J79oH5wsBZZY6BSqCEhrqnk2FYkF+FumG4F1EaoDqCpMgEe7kht26E16XkCi9h1TtL/dGz7oaYLw2tLMIviYH7so4dCCGG0mM2L8XFBWNcuphPDw6hk7wgZVmwcw2i2Gr+3xcMC/x4+3QMAAP//
// DO NOT EDIT
package com.paypal.sdk.billingagreements;

import com.braintreepayments.http.annotations.*;
/**
 * A token for a bank card. Can be used to fund a payment.
 */
@Model
public class BankToken {

    // Required default constructor
    public BankToken() {}

	/**
	* REQUIRED
	* The ID of the vaulted bank card.
	*/
	@SerializedName("bank_id")
	private String bankId;

	public String bankId() { return bankId; }
	
	public BankToken bankId(String bankId) {
	    this.bankId = bankId;
	    return this;
	}

	/**
	* REQUIRED
	* The ID of the customer who owns the bank card.
	*/
	@SerializedName("external_customer_id")
	private String externalCustomerId;

	public String externalCustomerId() { return externalCustomerId; }
	
	public BankToken externalCustomerId(String externalCustomerId) {
	    this.externalCustomerId = externalCustomerId;
	    return this;
	}

	/**
	* The ID of the direct debit mandate to validate. Supported only for Single Euro Payments Area (SEPA) bank accounts in the European Union (EU).
	*/
	@SerializedName("mandate_reference_number")
	private String mandateReferenceNumber;

	public String mandateReferenceNumber() { return mandateReferenceNumber; }
	
	public BankToken mandateReferenceNumber(String mandateReferenceNumber) {
	    this.mandateReferenceNumber = mandateReferenceNumber;
	    return this;
	}
}
