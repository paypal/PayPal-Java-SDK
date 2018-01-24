// This class was generated on Tue, 23 Jan 2018 17:16:08 CST by version 0.1.0-dev+20fb1e of Braintree SDK Generator
// Terms.java
// @version 0.1.0-dev+20fb1e
// @type object
// @data H4sIAAAAAAAC/+xUXWvcOhB9v79i8NO94LXvvRQK+xYIhW3JB00olBA2Y2l2PVSWHGmUjSn970X27iaOU9qSECjkUUfSzJxzhvM1O+9ayubZOfkmZHn2CT1jZegYmwRnefaBurvDIQXluRV2Nn2qCVqDFiT9LrI8O/Aeu6Hkv3n2kVCfWNNl8xWaQAm4juxJ74FT71rywhSy+cV+mCNnqQPpWoINSw0qek9WdaCcJriOaHjFpOEGTaTp0Ni4aGXp0a5pRODBxZjMwdBw5TygMbBii1YxmqHLzJNBIQ0rJqNDAe+cB7rFpjWUQ4UGraIcWuwasgI6Ug5oNQQHzv6WMuLjD4UJ4tmup4x3Ao3Y3gOntl1I7YlmqkaPSsjD4uxk9ub//96Oxb78uxZpw7wsNd2QSTMVLXYtmkK5ptROhZKt0NpjKl5q9qSk9BSk3BWapUKh/OeJKthozLf8p1LsduJOhx0yFWFPtX9SwBGva4GKAC30rMj3+7B9xxTA8BeCq/enn69AahRAT2CdpN1hhcZ0sEqCsrNoIK0SDEK3BhWBJsUNmv2bx6ufHx/eqx5ipfmGNek0kwOpXQxotdTbLZSawG+FAxubijy41b5X3zkMez02N4dABBeLsxNIzg9ez8tys9kUHFzh/Lrk4MraNVQGQavR67D3ddn7WtTSPIu1l79gbhU78kvSLAkcuTy5Gtu9sJoVCgXY1CQ1DbKpGMQ15EGhhfS3R4eYALYgNYc+3F5md1mPKPXH6dYuDpO9adBnid0Hsz0xexu8XVZsDNv1ctBxROnR69ccfs3h1xz+k3LYqW1zCiOLx/jU6DtVhBsKg7hNnzgpgSuCNhpDGnRMjV86f1PwjPhsgSmRNFOfU8+j+F/fAQAA//8=
// DO NOT EDIT
package com.paypal.sdk.billingagreements;

import com.braintreepayments.http.annotations.*;
/**
 * The plan terms.
 */
@Model
public class Terms {

    // Required default constructor
    public Terms() {}

	/**
	* REQUIRED
	* A type for all financial value-related fields. For example, balance, payment due, and so on.
	*/
	@SerializedName("amount_range")
	private MoneyTypeWithCurrencyCodeQualifiedValue amountRange;

	public MoneyTypeWithCurrencyCodeQualifiedValue amountRange() { return amountRange; }
	
	public Terms amountRange(MoneyTypeWithCurrencyCodeQualifiedValue amountRange) {
	    this.amountRange = amountRange;
	    return this;
	}

	/**
	* REQUIRED
	* Indicates whether the customer can edit the amount in this term.
	*/
	@SerializedName("buyer_editable")
	private String buyerEditable;

	public String buyerEditable() { return buyerEditable; }
	
	public Terms buyerEditable(String buyerEditable) {
	    this.buyerEditable = buyerEditable;
	    return this;
	}

	/**
	* The ID of the terms.
	*/
	@SerializedName("id")
	private String id;

	public String id() { return id; }
	
	public Terms id(String id) {
	    this.id = id;
	    return this;
	}

	/**
	* REQUIRED
	* A type for all financial value-related fields. For example, balance, payment due, and so on.
	*/
	@SerializedName("max_billing_amount")
	private MoneyTypeWithCurrencyCodeQualifiedValue maxBillingAmount;

	public MoneyTypeWithCurrencyCodeQualifiedValue maxBillingAmount() { return maxBillingAmount; }
	
	public Terms maxBillingAmount(MoneyTypeWithCurrencyCodeQualifiedValue maxBillingAmount) {
	    this.maxBillingAmount = maxBillingAmount;
	    return this;
	}

	/**
	* REQUIRED
	* The number of times that money can be pulled during this term.
	*/
	@SerializedName("occurrences")
	private String occurrences;

	public String occurrences() { return occurrences; }
	
	public Terms occurrences(String occurrences) {
	    this.occurrences = occurrences;
	    return this;
	}

	/**
	* REQUIRED
	* The term type.
	*/
	@SerializedName("type")
	private String type;

	public String type() { return type; }
	
	public Terms type(String type) {
	    this.type = type;
	    return this;
	}
}
