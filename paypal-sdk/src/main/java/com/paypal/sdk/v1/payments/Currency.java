// This class was generated on Sat, 07 Apr 2018 21:37:44 UTC by version 0.1.0-dev+843c6b-dirty of Braintree SDK Generator
// Currency.java
// @version 0.1.0-dev+843c6b-dirty
// @type object
// @data H4sIAAAAAAAC/6yR0WsUMRDG3/0rhvhiYW+jIgj7VvDlELzDFl+OUqbJ7O1gLomTSWWR/u+Slu2dHiKCj/Nlvsk3v/lhrudMZjCuilB0s+nMFxTGu0Cf8NBeTGc+0nwsPlBxwlk5RTOY64lg8QJGD3hINSqMSQBBBWNB13p705lLEZyfPnzdmc+EfhPDbIYRQ6EmfKss5J+FraRMokzFDLvnqEWF4/486MkKx8An4nnwnU5CtHITCjolgfXVZvXu7Zv3x5Vc8nTzyvrkiuWotBdsA6xnIadWqKhdmletudiLHrY4bzGAT1QgJoVSc06igCEso5nKPyFRqb8RiTWEh+6vWO4xVPqFyaKcA3k6Xg/r6EL1VEAngpLJ8cjkIdbDHQmkETzvWQvg2Kh5cnzAAIUyCmqSx+s36+5PQCfVXAZrKfbf+Stn8ox9kr1tlV1fbW6b6+WlU76n20euF/8D183Di58AAAD//w==
// DO NOT EDIT
package com.paypal.sdk.v1.payments;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * The currency and amount for a transaction.
 */
@Model
public class Currency {

    // Required default constructor
    public Currency() {}

	/**
	* REQUIRED
	* The [three-character ISO-4217 currency code](/docs/integration/direct/rest/currency-codes/). PayPal does not support all currencies.
	*/
	@SerializedName("currency")
	private String currency;

	public String currency() { return currency; }
	
	public Currency currency(String currency) {
	    this.currency = currency;
	    return this;
	}

	/**
	* REQUIRED
	* The amount. Includes the specified number of digits after decimal separator for the [ISO-4217 currency code](https://en.wikipedia.org/wiki/ISO_4217#Active_codes).
	*/
	@SerializedName("value")
	private String value;

	public String value() { return value; }
	
	public Currency value(String value) {
	    this.value = value;
	    return this;
	}
}
