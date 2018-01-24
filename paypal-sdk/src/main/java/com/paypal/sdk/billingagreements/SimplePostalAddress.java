// This class was generated on Tue, 23 Jan 2018 17:16:08 CST by version 0.1.0-dev+20fb1e of Braintree SDK Generator
// SimplePostalAddress.java
// @version 0.1.0-dev+20fb1e
// @type object
// @data H4sIAAAAAAAC/7xWTW8bRwy991cQ20sErLSOU+Sgm+2gQRokNmK7F9VoqBlKy3o0s+ZwI2+K/PdiZmV9WAZqFYUvApbDxyUf377R38VV11AxLi550TiCixAVHZxYKxRjURa/ozBOHX3GRUoryuIjdZuHdxSNcKMcfDEuTiD2ZZq+DPZlYMlagwkokYZzQfZkYcbkbBzBuwA+KLSRYBYE0AN7JfGYam5qjOB6lTFFc7tEsWDCokHlKTvWDoJ3XapGMdczwSuyh6YOnkZFWZyIYNcPe1QWXwjtuXddMZ6hi5QCdy0L2XXgQkJDokyxGE/WNEUV9vN9Xgxrt8PNKrDLz1VNkA7A4+KwplTaRz351rkf5b83Flqv0v1pgqXdBncP9hud6DIMTY2CRkngw+U5vHn99u3wNSTIzavKBhOrtKy55GVVloWMVkJRq1X5YcqN1QC0RgW25JVnTBE0UdHnQBAQmnPwoz/ao6M3ZuqCub1rg1J+7n9NVAl+3kc+B6VxH66243C1VTa9OivmvRAqnApnRXCEHpnOe9j701WtTQjQ2yykx7nXH5/IjUm/FtjnuTQ0Q0ffyIENi/TKtO6YW8k0rBrsJZ0AX8+Ov+63fVazR1gGcXbJq1jWvKT9QuuTxiU4RxYaYUPw6uz6YgAL0jrYEqbob8Gg2DIPYyTEOJwGsSSggj6iSWuLK9arx7S/iD4de3q9I8yHyL4iZyxRIZ1DmGXi1ubwaxCge0zmU4JvF1OSEqIKkfbTxwDBj15spOO9kY73RjpveosbZdVGMsHbZ0wXW1YqARsUXZDX9bj/bcwn7O6Zc/Ymv+8su/H9Na4uh3RewrJmU6dvMg38nZte/mneu5a/oSOvI7jqGjboXAey6nv1MaQvJrlJvmBwuzL0d8l2lUsimFxsUm5e1apNHFcV+dGSb7khyzgKMq/SU3WxmWPwQpRGRd0l8yHyhD8/x4YzfG3C+YKF60vIYch+RFsc5YSgNW1xO4Iv25xvGwfwjk7TFtlDWAs40qbMGCYnMk/27/GQpn/GB9SghMmp4Hd2B+GnGZLAZ+jRHvZykyEJ/MFbPgzLCZGhiq47DJoQCfobNugPgv6VEAn6ie7ZhIOwiwxJ4Ksa2aG3B8F1BRqUSVmTa89KFi5TSjyoUBtxMIJPeM+LdgGO/FyzRfxyBJH93NFw2inB+r9J/F++zpsfP/0DAAD//w==
// DO NOT EDIT
package com.paypal.sdk.billingagreements;

import com.braintreepayments.http.annotations.*;
/**
 * A simple postal address with coarse-grained fields. Do not use for an international address. Use for backward compatibility only. Does not contain phone.
 */
@Model
public class SimplePostalAddress {

    // Required default constructor
    public SimplePostalAddress() {}

	/**
	* REQUIRED
	* The city name.
	*/
	@SerializedName("city")
	private String city;

	public String city() { return city; }
	
	public SimplePostalAddress city(String city) {
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
	
	public SimplePostalAddress countryCode(String countryCode) {
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
	
	public SimplePostalAddress line1(String line1) {
	    this.line1 = line1;
	    return this;
	}

	/**
	* Optional. The second line of the address. For example, suite, apartment number, and so on.
	*/
	@SerializedName("line2")
	private String line2;

	public String line2() { return line2; }
	
	public SimplePostalAddress line2(String line2) {
	    this.line2 = line2;
	    return this;
	}

	/**
	* The postal code, which is the zip code or equivalent. Typically required for countries with a postal code or an equivalent. See [Postal code](https://en.wikipedia.org/wiki/Postal_code).
	*/
	@SerializedName("postal_code")
	private String postalCode;

	public String postalCode() { return postalCode; }
	
	public SimplePostalAddress postalCode(String postalCode) {
	    this.postalCode = postalCode;
	    return this;
	}

	/**
	* The [code](/docs/integration/direct/rest/state-codes/) for a US state or the equivalent for other countries. Required for transactions if the address is in one of these countries: [Argentina](/docs/integration/direct/rest/state-codes/#argentina), [Brazil](/docs/integration/direct/rest/state-codes/#brazil), [Canada](/docs/integration/direct/rest/state-codes/#canada), [India](/docs/integration/direct/rest/state-codes/#india), [Italy](/docs/integration/direct/rest/state-codes/#italy), [Japan](/docs/integration/direct/rest/state-codes/#japan), [Mexico](/docs/integration/direct/rest/state-codes/#mexico), [Thailand](/docs/integration/direct/rest/state-codes/#thailand), or [United States](/docs/integration/direct/rest/state-codes/#usa). Maximum length is 40 single-byte characters.
	*/
	@SerializedName("state")
	private String state;

	public String state() { return state; }
	
	public SimplePostalAddress state(String state) {
	    this.state = state;
	    return this;
	}
}
