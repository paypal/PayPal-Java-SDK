// This class was generated on Sat, 07 Apr 2018 21:37:44 UTC by version 0.1.0-dev+843c6b-dirty of Braintree SDK Generator
// Payment.java
// @version 0.1.0-dev+843c6b-dirty
// @type object
// @data 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
// DO NOT EDIT
package com.paypal.sdk.v1.payments;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * A payment. Use this object to create, process, and manage payments.
 */
@Model
public class Payment {

    // Required default constructor
    public Payment() {}

	/**
	* Use the application context resource to customize payment flow experience for your buyers.
	*/
	@SerializedName("application_context")
	private ApplicationContext applicationContext;

	public ApplicationContext applicationContext() { return applicationContext; }
	
	public Payment applicationContext(ApplicationContext applicationContext) {
	    this.applicationContext = applicationContext;
	    return this;
	}

	/**
	* The date and time when the payment was created, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6).
	*/
	@SerializedName("create_time")
	private String createTime;

	public String createTime() { return createTime; }
	
	public Payment createTime(String createTime) {
	    this.createTime = createTime;
	    return this;
	}

	/**
	* The PayPal-generated ID for the merchant's payment experience profile. For information, see [create web experience profile](/docs/api/payment-experience/#web-profiles_create).
	*/
	@SerializedName("experience_profile_id")
	private String experienceProfileId;

	public String experienceProfileId() { return experienceProfileId; }
	
	public Payment experienceProfileId(String experienceProfileId) {
	    this.experienceProfileId = experienceProfileId;
	    return this;
	}

	/**
	* The reason code for a payment failure.
	*/
	@SerializedName("failure_reason")
	private String failureReason;

	public String failureReason() { return failureReason; }
	
	public Payment failureReason(String failureReason) {
	    this.failureReason = failureReason;
	    return this;
	}

	/**
	* The ID of the payment.
	*/
	@SerializedName("id")
	private String id;

	public String id() { return id; }
	
	public Payment id(String id) {
	    this.id = id;
	    return this;
	}

	/**
	* REQUIRED
	* The payment intent. Value is:<ul><li><code>sale</code>. Makes an immediate payment.</li><li><code>authorize</code>. [Authorizes a payment for capture later](/docs/integration/direct/payments/capture-payment/).</li><li><code>order</code>. [Creates an order](/docs/integration/direct/payments/orders/).</li></ul>
	*/
	@SerializedName("intent")
	private String intent;

	public String intent() { return intent; }
	
	public Payment intent(String intent) {
	    this.intent = intent;
	    return this;
	}

	/**
	* An array of request-related [HATEOAS links](/docs/api/overview/#hateoas-links).
	*/
	@SerializedName(value = "links", listClass = LinkDescriptionObject.class)
	private List<LinkDescriptionObject> links;

	public List<LinkDescriptionObject> links() { return links; }
	
	public Payment links(List<LinkDescriptionObject> links) {
	    this.links = links;
	    return this;
	}

	/**
	* A free-form field that clients can use to send a note to the payer.
	*/
	@SerializedName("note_to_payer")
	private String noteToPayer;

	public String noteToPayer() { return noteToPayer; }
	
	public Payment noteToPayer(String noteToPayer) {
	    this.noteToPayer = noteToPayer;
	    return this;
	}

	/**
	* REQUIRED
	* The payer. The payer funds the payment.
	*/
	@SerializedName("payer")
	private Payer payer;

	public Payer payer() { return payer; }
	
	public Payment payer(Payer payer) {
	    this.payer = payer;
	    return this;
	}

	/**
	* A set of redirect URLs that you provide for PayPal-based payments.
	*/
	@SerializedName("redirect_urls")
	private RedirectUrls redirectUrls;

	public RedirectUrls redirectUrls() { return redirectUrls; }
	
	public Payment redirectUrls(RedirectUrls redirectUrls) {
	    this.redirectUrls = redirectUrls;
	    return this;
	}

	/**
	* The state of the payment, authorization, or order transaction. Value is:<ul><li><code>created</code>. The transaction was successfully created.</li><li><code>approved</code>. The buyer approved the transaction.</li><li><code>failed</code>. The transaction request failed.</li></ul>
	*/
	@SerializedName("state")
	private String state;

	public String state() { return state; }
	
	public Payment state(String state) {
	    this.state = state;
	    return this;
	}

	/**
	* An array of payment-related transactions. A transaction defines what the payment is for and who fulfills the payment. For update and execute payment calls, the **`transactions`** object accepts the **`amount`** object only.
	*/
	@SerializedName(value = "transactions", listClass = Transaction.class)
	private List<Transaction> transactions;

	public List<Transaction> transactions() { return transactions; }
	
	public Payment transactions(List<Transaction> transactions) {
	    this.transactions = transactions;
	    return this;
	}

	/**
	* The date and time when the payment was updated, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6).
	*/
	@SerializedName("update_time")
	private String updateTime;

	public String updateTime() { return updateTime; }
	
	public Payment updateTime(String updateTime) {
	    this.updateTime = updateTime;
	    return this;
	}
}
