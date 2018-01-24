// This class was generated on Tue, 23 Jan 2018 17:16:08 CST by version 0.1.0-dev+20fb1e of Braintree SDK Generator
// PaymentCardToken.java
// @version 0.1.0-dev+20fb1e
// @type object
// @data H4sIAAAAAAAC/7yUT4+UQBDF736KSp9x4xpPc9u4F2OiGzPZhBgDNdPF0LHpxupq147Z726agVkZ0Phnszeo9yjejwd8V9vUk9qoG0wdOYHXyBq2/jM5VahbZIM7S++wyx5VqLeUHk6uKezZ9GK8Uxt1BZIvg8YzIPTjvn3eJy3mIwc7ghhIg3hootMPvgtVqCtmTMc4Lwr1gVC/dzapTYM2UB58iYZJnwY37HtiMRTU5uMJxDihA/EyPX3rDVPVeSftjORMmFNtW4LBkGAwQMO+A2kJvmK0QnogvIBbtJHAhKNeX9aZsb58Wf8vmYvW3hd/jJcIeY1unC/hGh/5uTYHIxNntq5jFmAc1GVZlnWuuUN5ZLogbNxhDU6IHdpqH4P4jrgy+oxy1bDEfXMNvhnAJifctR78nQsgrQmzF/ev6ITjv8FZDPJqRjNNlvGzMlQGQ2XhBJM/Mxe7Hf2iuicqanx6Vb7leUdL7Xf1TOGfvg/J8s/Bx8Ey7fHnlnp6jGCf7p/9AAAA//8=
// DO NOT EDIT
package com.paypal.sdk.billingagreements;

import com.braintreepayments.http.annotations.*;
/**
 * A token for a payment card that can be used to fund a payment.
 */
@Model
public class PaymentCardToken {

    // Required default constructor
    public PaymentCardToken() {}

	/**
	* The expiry month from the vaulted card. Value is from `1` to `12`.
	*/
	@SerializedName("expire_month")
	private Integer expireMonth;

	public Integer expireMonth() { return expireMonth; }
	
	public PaymentCardToken expireMonth(Integer expireMonth) {
	    this.expireMonth = expireMonth;
	    return this;
	}

	/**
	* The four-digit expiry year from the vaulted card, in `YYYY` format.
	*/
	@SerializedName("expire_year")
	private Integer expireYear;

	public Integer expireYear() { return expireYear; }
	
	public PaymentCardToken expireYear(Integer expireYear) {
	    this.expireYear = expireYear;
	    return this;
	}

	/**
	* REQUIRED
	* The ID of the customer who owns this payment card.
	*/
	@SerializedName("external_customer_id")
	private String externalCustomerId;

	public String externalCustomerId() { return externalCustomerId; }
	
	public PaymentCardToken externalCustomerId(String externalCustomerId) {
	    this.externalCustomerId = externalCustomerId;
	    return this;
	}

	/**
	* The last four digits of the card number from the vaulted card.
	*/
	@SerializedName("last4")
	private String last4;

	public String last4() { return last4; }
	
	public PaymentCardToken last4(String last4) {
	    this.last4 = last4;
	    return this;
	}

	/**
	* REQUIRED
	* The ID of the vaulted payment card.
	*/
	@SerializedName("payment_card_id")
	private String paymentCardId;

	public String paymentCardId() { return paymentCardId; }
	
	public PaymentCardToken paymentCardId(String paymentCardId) {
	    this.paymentCardId = paymentCardId;
	    return this;
	}

	/**
	* REQUIRED
	* The card type.
	*/
	@SerializedName("type")
	private String type;

	public String type() { return type; }
	
	public PaymentCardToken type(String type) {
	    this.type = type;
	    return this;
	}
}
