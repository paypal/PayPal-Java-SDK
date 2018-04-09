// This class was generated on Mon, 09 Apr 2018 18:13:17 UTC by version 0.1.0-dev+291f3f of Braintree SDK Generator
// Address.java
// @version 0.1.0-dev+291f3f
// @type object
// @data H4sIAAAAAAAC/7xW32/bRgx+319BaC81IEuOu/XBb23WdlmQJkic7cELYlqiLS6nO+WOqqMM/d+HOyn+MbtY3QF+MSCS3x0/HvnRf0fjpqJoFGGeW3IuiqPf0TLOFH3C0juiODqnZv3xC7nMciVsdDSKxgXBjJVivYDuCDAWXMFVtWmbGwsIFTYlaUmiOHprLTbt3YM4uibML7VqotEclSNveKzZUr4yXFlTkRUmF40mq6ydWNaL3aQzlmYr8c6wm7x3gMaS/m9SulbqS/zfmZlai23uM5PTdobbjt1MJ7I0/axAi5mQhbObS3h98uZN/wQ85O5VmpvMpayFFhY9Ls3ZUiapJSdpd3zfx7q0B1KgAOekhedMDsTXoo3xD2hpwUYnf9aDwetspkz28FgbofDd/mZOrNGL1vLJCI1ac7pph/HGsf7q0AgfLaHAO8uCrIEdtEjvb2Ef33VnrU2AOgdtZCf29nxPrIPaUQ6sAy8xVV/RZ1KQm9Jf6d+77clQhi7BBG4dBcD0dDjdTfu0YI2wNFblS+5smSkrtP59odaZ0WKNUpRDZTkjeHV6e9WDkqQweQwz1A+Qoc3jQCazxrn+zNicLIhF7TDzz+a6qqf/LvshDSq2/r7+VKzpZKsxXyy7HTln6wS8H8w8FK4b9wQ+GAv0hGWlKAZdlzOyMTixRNKydwaMTo5GabhDabiXkqPM6PwbOLmahfykYIVWvKp1NI+kI9rYEhU/h0m/d4JSuy2OXwnYpfwi0VsAaAEJXJPUVlMORqsmtHyFDVkHc2tKeGfxmdWRKFeF0dua+WLZJRU8q8ZjDZP3ycnwtSdQoty9KkQqN0rT5XKZsNQJa6+TWTruX78/7YfY/nAwOBkM+2cp6V4CF/jEZV2CIr2QwqvWzwNYybE7Vg2ME1S722PbvqcewR+0LIZlwVlg4Nv7matW4nx3P9b8GZVf0TBuKs5QqQZsl3cneF4V/cZYshR+p69PDuOgt065IYLJRsi68qSTJT9wRTljYuwi9V/p1ZpH70gl9Z2+XcwXy54d/C2rNsBXi7b953N7EyYqlMhXfV2jEGCkoI3a+rHbqPnmcgDeUiX/iqzBrOTK0fqYEUze2oVf8RoPSfpHfEH1Ypi0M34QfhYgHnyKGvPDLs8CxIPPdM6HYdkjAlRQNYdBPcJDf8MK9UHQvzzCQy/oiTNzELYMEA8eF8gKdX4QXDpQL/adNbnVLJTDjQ9xBx1UO9wrcj8NwLFeKOrPGqHjC5549+Zwdobd2fQOPwT79/X018uL9/eX1/d/XF6fT2OYfjz7MJ5+73+Rr/G5+/LDPwAAAP//
// DO NOT EDIT
package com.paypal.sdk.v1.payments;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * The billing address or shipping address for a payment.
 */
@Model
public class Address {

    // Required default constructor
    public Address() {}

	/**
	* The city name.
	*/
	@SerializedName("city")
	private String city;

	public String city() { return city; }
	
	public Address city(String city) {
	    this.city = city;
	    return this;
	}

	/**
	* REQUIRED
	* The [two-character ISO 3166-1 code](/docs/integration/direct/rest/country-codes/) that identifies the country or region.<blockquote><strong>Note:</strong> The country code for Great Britain is <code>GB</code> and not <code>UK</code> as used in the top-level domain names for that country. Use the `C2` country code for China worldwide for comparable uncontrolled price (CUP) method, bank card, and cross-border transactions.</blockquote>
	*/
	@SerializedName("country_code")
	private String countryCode;

	public String countryCode() { return countryCode; }
	
	public Address countryCode(String countryCode) {
	    this.countryCode = countryCode;
	    return this;
	}

	/**
	* REQUIRED
	* The first line of the address. For example, number, street, and so on.
	*/
	@SerializedName("line1")
	private String line1;

	public String line1() { return line1; }
	
	public Address line1(String line1) {
	    this.line1 = line1;
	    return this;
	}

	/**
	* The second line of the address. For example, suite or apartment number.
	*/
	@SerializedName("line2")
	private String line2;

	public String line2() { return line2; }
	
	public Address line2(String line2) {
	    this.line2 = line2;
	    return this;
	}

	/**
	* The address normalization status. Returned only for payers from Brazil.
	*/
	@SerializedName("normalization_status")
	private String normalizationStatus;

	public String normalizationStatus() { return normalizationStatus; }
	
	public Address normalizationStatus(String normalizationStatus) {
	    this.normalizationStatus = normalizationStatus;
	    return this;
	}

	/**
	* The phone number, in [E.123 format](https://www.itu.int/rec/T-REC-E.123-200102-I/en). Maximum length is 50 characters.
	*/
	@SerializedName("phone")
	private String phone;

	public String phone() { return phone; }
	
	public Address phone(String phone) {
	    this.phone = phone;
	    return this;
	}

	/**
	* The postal code, which is the zip code or equivalent. Typically required for countries with a postal code or an equivalent. See [postal code](https://en.wikipedia.org/wiki/Postal_code).
	*/
	@SerializedName("postal_code")
	private String postalCode;

	public String postalCode() { return postalCode; }
	
	public Address postalCode(String postalCode) {
	    this.postalCode = postalCode;
	    return this;
	}

	/**
	* The [code](/docs/integration/direct/rest/state-codes/) for a US state or the equivalent for other countries. Required for transactions if the address is in one of these countries: [Argentina](/docs/integration/direct/rest/state-codes/#argentina), [Brazil](/docs/integration/direct/rest/state-codes/#brazil), [Canada](/docs/integration/direct/rest/state-codes/#canada), [India](/docs/integration/direct/rest/state-codes/#india), [Italy](/docs/integration/direct/rest/state-codes/#italy), [Japan](/docs/integration/direct/rest/state-codes/#japan), [Mexico](/docs/integration/direct/rest/state-codes/#mexico), [Thailand](/docs/integration/direct/rest/state-codes/#thailand), or [United States](/docs/integration/direct/rest/state-codes/#usa). Maximum length is 40 single-byte characters.
	*/
	@SerializedName("state")
	private String state;

	public String state() { return state; }
	
	public Address state(String state) {
	    this.state = state;
	    return this;
	}

	/**
	* The address status.
	*/
	@SerializedName("status")
	private String status;

	public String status() { return status; }
	
	public Address status(String status) {
	    this.status = status;
	    return this;
	}

	/**
	* The type of address. For example, `HOME_OR_WORK`, `GIFT`, and so on.
	*/
	@SerializedName("type")
	private String type;

	public String type() { return type; }
	
	public Address type(String type) {
	    this.type = type;
	    return this;
	}
}
