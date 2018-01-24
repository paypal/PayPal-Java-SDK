// This class was generated on Tue, 23 Jan 2018 17:16:08 CST by version 0.1.0-dev+20fb1e of Braintree SDK Generator
// MoneyTypeWithCurrencyCodeQualifiedValue.java
// @version 0.1.0-dev+20fb1e
// @type object
// @data H4sIAAAAAAAC/6ySb2vUQBDG3/sphn2lkMuqCMK9KxShSv9giyCl2Lndye3gZjednfQM0u8uudylPSuI4MsMk2fn+T3PT3M1dGSW5jQnGkCHjmDDGsD1IpTcAC57grseIzdMHu4x9mQq8wWFcRXpDNvxd1OZTzQ8fhxTccKdck5maY4m4SYLYIzQcMLkGOOkthCKqOShYYq+1PAhC9APbLtIFawwYnJUQYdDS0nB91QBJg8lQ061qcyRCA6Tj9eV+Uzoz1MczLLBWGgc3PUs5OfBheSORJmKWV7PBIoKp/Vza3sSBxafDA+tXgWCaw1CtHABBZ2SwMnl+eLd2zfvD6nevAyqXVla6+me4nhT3eHQYaxdbq3PrlhOSmvBUdx6FnJqhYravdBiFCr21T9hUOl/o5D6GB+qv6LYh//IYT95DmG2ul2p4ZTXQWFFgAm2rki2hdjtMRWI/J3g9uPF11vQgAooBCnrWB52GOMAzQiUc8IIY5dgAt1FdASeHLcY550/q1+dHT9RL/3K8z178uNNGTTkvmDyGnY11EAgO3CQ+nZFArmZ39q+XKZiH4ZbQSGC65PLcxiTn7JeWrvZbGouuc6ytlyyDbklWxSTR/FlzvXbNtc6aPtfor15ePELAAD//w==
// DO NOT EDIT
package com.paypal.sdk.billingagreements;

import com.braintreepayments.http.annotations.*;
/**
 * A type for all financial value-related fields. For example, balance, payment due, and so on.
 */
@Model
public class MoneyTypeWithCurrencyCodeQualifiedValue {

    // Required default constructor
    public MoneyTypeWithCurrencyCodeQualifiedValue() {}

	/**
	* REQUIRED
	* The [three-character ISO-4217 currency code](https://developer.paypal.com/docs/integration/direct/rest/currency-codes/).
	*/
	@SerializedName("currency")
	private String currency;

	public String currency() { return currency; }
	
	public MoneyTypeWithCurrencyCodeQualifiedValue currency(String currency) {
	    this.currency = currency;
	    return this;
	}

	/**
	* REQUIRED
	* The currency value. Might be an integer for currencies like `JPY` that are not typically fractional or a three-place decimal fraction for currencies like `TND` that are subdivided into thousandths. For the required number of decimal places for a currency code, see [ISO 4217](http://www.iso.org/iso/home/standards/currency_codes.htm).
	*/
	@SerializedName("value")
	private String value;

	public String value() { return value; }
	
	public MoneyTypeWithCurrencyCodeQualifiedValue value(String value) {
	    this.value = value;
	    return this;
	}
}
