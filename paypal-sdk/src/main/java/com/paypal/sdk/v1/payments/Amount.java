// This class was generated on Mon, 09 Apr 2018 18:13:17 UTC by version 0.1.0-dev+291f3f of Braintree SDK Generator
// Amount.java
// @version 0.1.0-dev+291f3f
// @type object
// @data H4sIAAAAAAAC/+yX32vbTgzA379/hfDTd8GN020wyNtgDMrYWtayl66Ei0+2Bec7V6dbakb/9+HYTuJ4LS3dwh7yFPTjdJI+JxH/jK7qCqN5pEoXrERx9E0xqaXBL6ps9FEcfcJ6K3xAnzJVQs5G8+iqQKhUXaIVaCPEsCIpQKMoMn4axdF7ZlW3t8zi6CsqfW5NHc0zZTw2ittAjHqjuGBXIQuhj+bXm/y8MNl8nF8amNGm9SDPHeU432spGPEkLRSrVJDh7PL85O3r03fQH4PUabz5P9Eu9QlZwZxVEyDRxJhKwugl6Z1PGmefvJrChaovlAHt0IN1Aj5UlWMBZUwfmvB5LREOex2xwZj7eA/bomv3uD1bw7Y7W924OUprasSmjtYN1NIFARmR/vtsc8pksWJVDdLf1Y4LaKzQWCFDnMJndUdlKMGgzaUA8nA6gw16H8OqoLQAsqkJGv38e5jN3qTBrH+xlQy10iX+QAuachIPS8wc47otGlMqlYHKkZVpeybpDw1DXD3TfeX6+1TWPNUnXpf0BbwQ0d5je4hToaw2ZPNFhjhAtWcY0+odjrCalNt9gRoy157uNko/dyVK4TQ4a+rpYciS9YGVTYdYd7VjphvrEeoAaoPtcbIHguoLqqrWsmW6oxwj7Y1HogfbqX3LF5p82v01G9PatT6ODXrP40T+e2vWh6U4UWbIeKv8DdrO2P0X25RCgqWfwlm2lhhvA3rZoARDtvOJQQryULXJ1s0rmEy4q2UyOU75QcCLuhswb+UxblF3RyJ/gMjNU5iMJvHhMRzMYIMiRw3i+q8lRFjWG4Gn8NExMGbBah8DY8Xo0Ypfu3RRpFCyc77z7oM6ppxsu6yagMc38dJv6Zv7/34BAAD//w==
// DO NOT EDIT
package com.paypal.sdk.v1.payments;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * The payment amount, with details.
 */
@Model
public class Amount {

    // Required default constructor
    public Amount() {}

	/**
	* REQUIRED
	* The [three-character ISO-4217 currency code](/docs/integration/direct/rest/currency-codes/). PayPal does not support all currencies.
	*/
	@SerializedName("currency")
	private String currency;

	public String currency() { return currency; }
	
	public Amount currency(String currency) {
	    this.currency = currency;
	    return this;
	}

	/**
	* The additional details about the payment amount.
	*/
	@SerializedName("details")
	private AmountDetails details;

	public AmountDetails details() { return details; }
	
	public Amount details(AmountDetails details) {
	    this.details = details;
	    return this;
	}

	/**
	* REQUIRED
	* The total amount charged to the payee by the payer. For refunds, represents the amount that the payee refunds to the original payer. Maximum length is 10 characters, which includes:<ul><li>Seven digits before the decimal point.</li><li>The decimal point.</li><li>Two digits after the decimal point.</li></ul>
	*/
	@SerializedName("total")
	private String total;

	public String total() { return total; }
	
	public Amount total(String total) {
	    this.total = total;
	    return this;
	}
}
