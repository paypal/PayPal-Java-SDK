// This class was generated on Mon, 09 Apr 2018 18:13:17 UTC by version 0.1.0-dev+291f3f of Braintree SDK Generator
// PaymentHoldReason.java
// @version 0.1.0-dev+291f3f
// @type object
// @data H4sIAAAAAAAC/6RSwW4TMRC98xUjc6HSNuGcW6QUtQLRiEZIKKqyU3vSNTj2MjOmLKj/jry73RDKrUf7vTfz3uj9NpuuJbMwLXYHirprUnA7JpQUTWU+I3u8C/QRD4VkKvOeuuNjRWLZt+pTNAuzaQjGMedMAZUc7H3EaD0GUMYoaAtXKnhovG3ARxuyIxAMJBVg1iax/4UjyWKrmXskOmDa5+hkBpsE0qQHYJKU2RI4UvRBKshCoA0dkavVDN4lBvqJhzZQBZpg24tHDewTA8KT3RMHt2/mLlmZY+vnYy6Zvz6h7O5Jz457r1bApJkjOfCx/6pP+DWku69kdQZfUgaLETBImvTby+Xm4np5A8HHb/L3/gaVEsp5D8zPJttjTk1gU0moBKklHi7Ys7RBnYj/XAOhLqd/cgUtpx/ekRRgOHfdWxmGUCxVEOhSLgsHQu+7DJmZyiyZsRsK9bYynwjddQydWewxCJWP79kzueljzcWsehKz2E5VFGUf75+3b2rlsYP/b+3zWg7QEGON3RoDFImMbbG+9RQVSqAZ3JBCiqEDv+/xcUmvAFHULOAF6suLD6v6pbFjDuHx9vHVHwAAAP//
// DO NOT EDIT
package com.paypal.sdk.v1.payments;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * The payment-related financial transactions, which include sales, authorizations, captures, and refunds. To show resource details, use the resource ID. For example, to [show details for a related authorization](/docs/api/payments/#authorization_get), use the ID returned in the `authorization` object. You can also use the [HATEOAS links](/docs/api/hateoas-links/) for a resource to complete operations for that resource. For example, a `sale` object provides a `refund` link that enables you to refund the sale.
 */
@Model
public class PaymentHoldReason {

    // Required default constructor
    public PaymentHoldReason() {}

	/**
	* The reason that PayPal holds the recipient fund. Set only if the payment hold status is `HELD`.
	*/
	@SerializedName("payment_hold_reason")
	private String reason;

	public String reason() { return reason; }
	
	public PaymentHoldReason reason(String reason) {
	    this.reason = reason;
	    return this;
	}
}
