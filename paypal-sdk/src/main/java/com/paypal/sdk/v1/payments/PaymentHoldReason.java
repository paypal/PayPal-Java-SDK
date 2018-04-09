// This class was generated on Sat, 07 Apr 2018 21:37:44 UTC by version 0.1.0-dev+843c6b-dirty of Braintree SDK Generator
// PaymentHoldReason.java
// @version 0.1.0-dev+843c6b-dirty
// @type object
// @data H4sIAAAAAAAC/6RSwW4TMRC98xUjc6HSNuGcW6QUtQLRiEZIKKqyU3vSNTj2MjOmLKj/jry73RDaG0f7vZl57+n9NpuuJbMwLXYHirprUnA7JpQUTWU+I3u8C/QRD4VkKvOeuuNjRWLZt+pTNAuzaQjGNedMAZUc7H3EaD0GUMYoaAtXKnhovG3ARxuyIxAMJBVg1iax/4UjyWKrmXskOmDa5+hkBpsE0qQHYJKU2RI4UvRBKshCoA0dkavVDN4lBvqJhzZQBZpg2w+PM7BPDAhPck8U3L6Zu2Rljq2fj75k/vqEsrsnPTvevVoBk2aO5MDH/qs+4deQ7r6S1Rl8SRksRsAgaZrfXi43F9fLGwg+fpO/7zeolFDOe2B+NskefWoCm4pDJUgt8ZBgz9IGdSL+kwZCXaJ/UgUtpx/ekRRgiLvupQxLKJYqCHQpl4MDodddlsxMZZbM2A2FeluZT4TuOobOLPYYhMrH9+yZ3PSx5iJWPYlZbKcqirKP98/b93JFj4V8GX/e0QEaPK2xW2OAMiJjdaxvPUWF4m4GN6SQYujA73t8PNJPgChqFvAC9eXFh1X9vxnEHMLj7eOrPwAAAP//
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
	private String paymentHoldReason;

	public String paymentHoldReason() { return paymentHoldReason; }
	
	public PaymentHoldReason paymentHoldReason(String paymentHoldReason) {
	    this.paymentHoldReason = paymentHoldReason;
	    return this;
	}
}
