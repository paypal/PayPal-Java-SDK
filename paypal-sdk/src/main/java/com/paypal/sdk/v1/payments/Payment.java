// This class was generated on Mon, 09 Apr 2018 18:13:17 UTC by version 0.1.0-dev+291f3f of Braintree SDK Generator
// Payment.java
// @version 0.1.0-dev+291f3f
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
