// This class was generated on Mon, 09 Apr 2018 18:13:17 UTC by version 0.1.0-dev+291f3f of Braintree SDK Generator
// RedirectUrls.java
// @version 0.1.0-dev+291f3f
// @type object
// @data H4sIAAAAAAAC/8SRwUr0MBSF9/9TXO6y9B9cdzfgTtFhGN2IyJ321AYySb1JlCDz7hKGVsssXCi4zEk4nO/LO+/yCG5Y0RlFG5+S2sA134sa2VvcyKFcc81XyJ+HS4RWzRiNd9zwmgIi+Z6mFrrbXgeKg0TKPtGo/tV0oN4rbSRvxP7fS0BHo+QDXAwrrnmtKvm05qLmLaS7dTZz04sNKMFLMopuDjbqR2g0CNw8zBwhqnHP5wCtuBa20C1QFvESajegYNDbAAXFAWUtlEyYMdGR9BFKA8grhQF0KgzT+0K3oqqa1n9RQNK2Prk4S6iqn2pwydpj/a0LRUzqzlws4t9wIWP5ePyljMfjvw8AAAD//w==
// DO NOT EDIT
package com.paypal.sdk.v1.payments;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * A set of redirect URLs that you provide for PayPal-based payments.
 */
@Model
public class RedirectUrls {

    // Required default constructor
    public RedirectUrls() {}

	/**
	* The URL where the payer is redirected after he or she cancels the payment. **Required for PayPal account payments**.
	*/
	@SerializedName("cancel_url")
	private String cancelUrl;

	public String cancelUrl() { return cancelUrl; }
	
	public RedirectUrls cancelUrl(String cancelUrl) {
	    this.cancelUrl = cancelUrl;
	    return this;
	}

	/**
	* The URL where the payer is redirected after he or she approves the payment. **Required for PayPal account payments**.
	*/
	@SerializedName("return_url")
	private String returnUrl;

	public String returnUrl() { return returnUrl; }
	
	public RedirectUrls returnUrl(String returnUrl) {
	    this.returnUrl = returnUrl;
	    return this;
	}
}
