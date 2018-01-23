// This class was generated on Tue, 23 Jan 2018 10:55:03 CST by version 0.1.0-dev+20fb1e of Braintree SDK Generator
// Currency.java
// @version 0.1.0-dev+20fb1e
// @type object
// @data H4sIAAAAAAAC/6yS0YrUTBCF7/+nKPrqFzJpFUGYO3ERVnFncQdBhkUq3ZXp1k53rKrMEGTfXTK7k3EdQQQvc1I5qXO++m7WY09maV4PzJTdaCrzETlik+gKu+mNqcw7Gk8PFySOY6+xZLM060DQoBCU5gs5hbYwYErQxozZRUywwzTQgimhkoc2UvJSgQwuAAo0mDA7qqDHsaOs4AeqALMHKVBybSrzihnH+zWfVuYDoV/lNJpli0loEr4NkcnPwjWXnlgjiVlu5oCiHPP2PJ47BT/F/Ek8j7vRwEQLF5DRKTFc3qwWL54/ewnHz8AVT7f/B9VeltZ62lGadqp7HHtMtSud9cWJjVlpyziZWx+ZnFomUXs0WkxGYp/8VQ3Kwy8t5CGlu+qPVRxIPerhqJyXMEc9jNTwPm6DQkOAGQ6piA+38DAXSSDFrwRvrz+BBlRAJshFQcc+OkxphHaqM5aMCaYjAk8udphm/bd+66uLk58MjY+76MlPOxTQUAbB7DVIDW8KgwYCfigK8tA1xFDa+U99Qkdyf8OPYVYgRLC5vFnBRPrEdr/f11FKXXhroxQbSkdWFLNH9jKD/HwAWQft/gnL27v/fgAAAP//
// DO NOT EDIT
package com.paypal.sdk.billingplans;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * The base object for all financial value-related fields, such as balance, payment due, and so on.
 */
@Model
public class Currency {

    // Required default constructor
    public Currency() {}

	/**
	* REQUIRED
	* The [three-character ISO-4217 currency code](https://developer.paypal.com/docs/integration/direct/rest/currency-codes/).
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
	* The currency value. Might be an integer for currencies like JPY that are not typically fractional or a decimal fraction for currencies like TND that are subdivided into thousandths. For the required number of decimal places for a currency code, see [ISO 4217](https://www.iso.org/iso/home/standards/currency_codes.htm).
	*/
	@SerializedName("value")
	private String value;

	public String value() { return value; }
	
	public Currency value(String value) {
	    this.value = value;
	    return this;
	}
}
