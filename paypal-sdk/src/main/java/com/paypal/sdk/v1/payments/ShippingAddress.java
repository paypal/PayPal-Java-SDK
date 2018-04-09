// This class was generated on Mon, 09 Apr 2018 18:13:17 UTC by version 0.1.0-dev+291f3f of Braintree SDK Generator
// ShippingAddress.java
// @version 0.1.0-dev+291f3f
// @type object
// @data H4sIAAAAAAAC/7xWTY/bRgy991cQ6iUGZMnrtDn4lmyTdBskG+x624Mb2LSGttiMZpQZKo5S5L8XI8sfqhw0TgFfDJjko/g45Jv5O5rWJUWTyOdclmzWc1TKkfdRHP2OjnGp6Q0WISKKo1dUH/78Qj5zXApbE02iaU6wywFtDlAkyNonURw9dQ7r7bdGcXRHqG6NrqPJCrWnYPhQsSO1N7x1tiQnTD6azA5VimOz7teWsdSd+lpDv8bgAIMF/d+iTKX1l/i/K7OVEVfPM6uoW2HX0a90Jhs7zHJ0mAk5uLm/hcdXT54MryBA3j1Klc18ykZo7TDgUsWOMkkdeUnb9MMQ69MBSI4CrMgIr5g8SOjFNgasA0drtib5sxqNHmdLbbP3Hyor1Pzf/mZenDXrreWNFZpszemxHaZHacOnYWUdvHSEAs8cC7IB9rBFBv8W9vJZm+tgAjQKjJVe7MOrE7EeKk8K2DS8xJZDTR9Jg7JF+GQ4b9+U0rShLTCBB08NYHE9XvTLvs7ZIGys02rDrS2zRYkunC9UJrNGnNWaFJSOM4JH1w9vB1CQ5FbFsETzHjJ0Km7IZM56P1xap8iBODQes3Bsvu16+u+2nzOg4qrvm0/Nhq46g7mz9Cdyxc4LBD/YVdO4dtETeGEd0CcsSk0xmKpYkovBiyOSLXtvwZrkYpTGPUrj05JFmTXqGzj5ioXCpmCJTgoy0tK8kI4Y6wrU/LnZ9LkXlMp3OH4loE95J84dAGwBCdyRVM6QAmt03Yx8iTU5DytnC3jm8DPrC1Euc2u6mrmz9Ek1nv3gsYHZ8+Rq/DgQKFDePcpFSj9J081mk7BUCZugk1k6Hd49vx42scPxaHQ1Gg9vUjKDBF7jJy6qAjSZteRBtX4ewV6O/aV6YL2g7t8eXfuJfjT+Rsti2OScNQzCeH/mcitxYbo/VPwRNRlJYFqXnKHWNbi27lbwgiqGG2PDkgMeZ27WwXSy3BPB7Cjk0HkyyYbfc0mKMbFunYZ/6dsDj8GFWuoo45LJyDxcC52u9lz9xgbHTin24YACkrPfa8dlmISd7RLYWU68Jr7l0dDA90+GcPwID/eNNjSHHUgfTrsJsJLT0ZQEATmanuNrDrijr2Ee2YDdC6+nQ5oJzJ66dXisGDyn6B9xhxrEMNuq1Vn4ZQMJ4Gs0qM77eNZAAvjGKD4PywHRQAV1fR40IAL0NyzRnAX9KyAC9DV94syehS0aSABPc2SNRp0FlxY0iMNkzR4MCym4DyH+rESVx5Ny/dMIPJu1puGyFrq8dEtwHy9na+jvZnCEJTj98lj8evv6+fz2bv7H7d2rRQyLlzcvpovvfVV9jc+7Lz/8AwAA//8=
// DO NOT EDIT
package com.paypal.sdk.v1.payments;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * The shipping address details.
 */
@Model
public class ShippingAddress {

    // Required default constructor
    public ShippingAddress() {}

	/**
	* The city name.
	*/
	@SerializedName("city")
	private String city;

	public String city() { return city; }
	
	public ShippingAddress city(String city) {
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
	
	public ShippingAddress countryCode(String countryCode) {
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
	
	public ShippingAddress line1(String line1) {
	    this.line1 = line1;
	    return this;
	}

	/**
	* The second line of the address. For example, suite or apartment number.
	*/
	@SerializedName("line2")
	private String line2;

	public String line2() { return line2; }
	
	public ShippingAddress line2(String line2) {
	    this.line2 = line2;
	    return this;
	}

	/**
	* The address normalization status. Returned only for payers from Brazil.
	*/
	@SerializedName("normalization_status")
	private String normalizationStatus;

	public String normalizationStatus() { return normalizationStatus; }
	
	public ShippingAddress normalizationStatus(String normalizationStatus) {
	    this.normalizationStatus = normalizationStatus;
	    return this;
	}

	/**
	* The phone number, in [E.123 format](https://www.itu.int/rec/T-REC-E.123-200102-I/en). Maximum length is 50 characters.
	*/
	@SerializedName("phone")
	private String phone;

	public String phone() { return phone; }
	
	public ShippingAddress phone(String phone) {
	    this.phone = phone;
	    return this;
	}

	/**
	* The postal code, which is the zip code or equivalent. Typically required for countries with a postal code or an equivalent. See [postal code](https://en.wikipedia.org/wiki/Postal_code).
	*/
	@SerializedName("postal_code")
	private String postalCode;

	public String postalCode() { return postalCode; }
	
	public ShippingAddress postalCode(String postalCode) {
	    this.postalCode = postalCode;
	    return this;
	}

	/**
	* The name of the recipient at this address.
	*/
	@SerializedName("recipient_name")
	private String recipientName;

	public String recipientName() { return recipientName; }
	
	public ShippingAddress recipientName(String recipientName) {
	    this.recipientName = recipientName;
	    return this;
	}

	/**
	* The [code](/docs/integration/direct/rest/state-codes/) for a US state or the equivalent for other countries. Required for transactions if the address is in one of these countries: [Argentina](/docs/integration/direct/rest/state-codes/#argentina), [Brazil](/docs/integration/direct/rest/state-codes/#brazil), [Canada](/docs/integration/direct/rest/state-codes/#canada), [India](/docs/integration/direct/rest/state-codes/#india), [Italy](/docs/integration/direct/rest/state-codes/#italy), [Japan](/docs/integration/direct/rest/state-codes/#japan), [Mexico](/docs/integration/direct/rest/state-codes/#mexico), [Thailand](/docs/integration/direct/rest/state-codes/#thailand), or [United States](/docs/integration/direct/rest/state-codes/#usa). Maximum length is 40 single-byte characters.
	*/
	@SerializedName("state")
	private String state;

	public String state() { return state; }
	
	public ShippingAddress state(String state) {
	    this.state = state;
	    return this;
	}

	/**
	* The address status.
	*/
	@SerializedName("status")
	private String status;

	public String status() { return status; }
	
	public ShippingAddress status(String status) {
	    this.status = status;
	    return this;
	}

	/**
	* The type of address. For example, `HOME_OR_WORK`, `GIFT`, and so on.
	*/
	@SerializedName("type")
	private String type;

	public String type() { return type; }
	
	public ShippingAddress type(String type) {
	    this.type = type;
	    return this;
	}
}
