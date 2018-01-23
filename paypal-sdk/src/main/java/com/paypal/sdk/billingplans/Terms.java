// This class was generated on Tue, 23 Jan 2018 10:55:03 CST by version 0.1.0-dev+20fb1e of Braintree SDK Generator
// Terms.java
// @version 0.1.0-dev+20fb1e
// @type object
// @data H4sIAAAAAAAC/+xWXWvcOBR9319x8dMueOzdZWFh3pYNC7OlSWhCoYQwXEt3Rmplyb26ytSU/vciz1ccJ7QlIfQhjz6yrs6HfPDn4rLvqJgXl8RtLMriLbLFxtEpthkuyuIV9ceHE4qKbSc2+LzJEEjeCKvAIIagc+iroiz+YcZ+O/r3snhDqM+864v5Cl2kDHxMlkkfgHMOHbFYisX86kDq38RMXvVTXtiG5GXJ6Nc04nhnYcq3wUgQmvekZGCNzsHKevTKooMbdIlmTA6FNKwsOR1LiEkZwAgNOvSKSuiwb8kL6EQloNcQA4QfEy6cHtQdha1fT1Wrox9HxbfAqdorMUw0UwYZlRDD4uJs9teff/wN+22ggqbrX41IF+d1remGXOZUddh36CoV2loHFWvrhdaMeXitLZOSmilKvR80y4Ni/dsjXfDJuS/lN60Yghr5sEemJhykDq9U8NqujUBDgB4GVcTDVdi9ZymCsx8I/j9/B2JQAJnABwHpO6vQuR5W2U4bPDrIdwg0KduiO+D3zrs8PTnOi6nR9sZq0plDADEhRfRaTKzgv93nxDujwKe2IYawOpzUOVS0/fBwHGYJkQiuFhdnkJM+ZrvZbCobQxV4XdsYahNaqqOg18g6HoJcDkFWRtonyfL6O9JsUk+8JG0lg6NYJ0vjfBdeW4VCETaGxNDWN5WihJYYFHrIewd02w1gPYixcWiu57msVo8kDY/Ta7o4yfnKvlMfW6N3uD3cpS1+WjbWOevXy61FI7b3Lr/06kuvvvTqT9+rQe0OpzjKdIxPkz3aIraluHW3DZ76oVEbgi45Rxp0ygc/d59KXr6tZwfc/3earxc9jeO/fAUAAP//
// DO NOT EDIT
package com.paypal.sdk.billingplans;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * The terms for the plan.
 */
@Model
public class Terms {

    // Required default constructor
    public Terms() {}

	/**
	* REQUIRED
	* The base object for all financial value-related fields, such as balance, payment due, and so on.
	*/
	@SerializedName("amount_range")
	private Currency amountRange;

	public Currency amountRange() { return amountRange; }
	
	public Terms amountRange(Currency amountRange) {
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
	* The base object for all financial value-related fields, such as balance, payment due, and so on.
	*/
	@SerializedName("max_billing_amount")
	private Currency maxBillingAmount;

	public Currency maxBillingAmount() { return maxBillingAmount; }
	
	public Terms maxBillingAmount(Currency maxBillingAmount) {
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
