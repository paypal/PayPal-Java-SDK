// This class was generated on Tue, 23 Jan 2018 10:55:03 CST by version 0.1.0-dev+20fb1e of Braintree SDK Generator
// MerchantPreferences.java
// @version 0.1.0-dev+20fb1e
// @type object
// @data H4sIAAAAAAAC/8xYX2/bNhB/36c46GUb4FjZH2BA3oq0A7K1SdCmBYqucM7kyeJKkSrvmFQY+t0HUpJt1fbadG3Qp4RH6nh/fve7o/8prrqWipPiCQVVoxO4DFRRIKeIi1nxAoPBpaVzbNKpYlb8Sd1m8ZBYBdOK8a44Ka5qgmbU0270QOUDILQW3RzOnLJRE0Ptb6GJqgYjoDwLg3hgEogtSE2Aq0DUkJNZXj5/+pjhtqZAeakii28ogEIH2LbB3xD4vFRk9ylo8J1pYgMuNksK4CtAa/0taajQWNLQYpdOA4pQ0wrP0nVSU4BL7C7RAkbxDYpRaG0HS2MtZ80+Cgs6bdwKlmiTBWBc3nL0TvLJtKc6ZWkG6HRvn0pxA1NNHPqewTgjBu3aoGQfz4tZ8SAE7PqEHc+Kp4T6wtmuOKnQMiXB22gC6bXgMviWghji4uTVOtUswbjVbnJRKWqF9GK4dyHp/HbGD53YhcFoejqQgoQCGJLLvYKMCKkND6BIrhx5Z7scnEBM4WY4VUWJgSAy/d8IuGjt+9nHwxDFL1LKFtj46GQagd3NqfNnThuFQvxVwDOHq0Of9NrES7or25Yh7rpUiTfGR7bdiHRWNem4hXmewwu0Mak5+SseH/+ios1/qV9Zs71SXvf/0flFLyk3ovnosPbE4Lzs8XxawQeiMIeHVGG0knz7lIsHydTWQ5a/fPTssOmHcvVRk/eaMIbyfuDbE+AiBjsB7kS8W6/Pnz4+RK77GPVOpSghfqYrNYYF07QCt4S7bqRNVEIhN5JvmGQGil+kghyoZNH3g4mz/3ls1/07dpTPq/nTi/Ors/Pnj/aUz9U2RiBQg8ZxtuqG1m3vw27bc5VhQK1JpyHgICGcVbk0j0ZONAzkUlT17AvT7Bb1XI8OX9+NYU4fnJ8+erwTpdFQFSi3iUldwTJKgi6DEQYWlETp0FJveHRi+kr8MKHKEgbOETq83c9Bo7KtS0n5hsZEHVSSQXNIh+GBKEjvD1M5RdfSevXmbfRC21KW4N1qoHgvNACz3JbDSx8zMUXu2eqaSWK7qIiu4SYjGnniwACxhKxgVquBv68PF9c60x9aeT/k0OC7wahhEp1wwr7dPXP4XafdKeaPr9P0a1Tdf5YYpErxooOf309onBdTdTvdbSL+5O5m8nxiKpNoJ42o01q8RR6qVH9bzSOQxOB2gjAR36nFj++nr9jjT2NIj8Fu15t19U6c2Zbu+rJEJvDLv0n1XR6thco4dCrVeyaBo0AW81PDkNU8A05vTeSR/WdrCOs4PMrYg3df/52lNqHYGms2wl13X0kdiI42083Zs4ujX3/+6TcYP4PUYF7/UIu0fFKWmm7IJpvmLXYt2rnyTam94tI4oVXApLzUJpCSMhBLOSo6Soq4/PF+JrycqUkcRsme2W50NR+ZwxOzqlPvAnSQvaKQsTCcM8RgzRuCPy5fbh6g6T0iXTuMB1Xo+R4t5F8oNCnToF3L9+q7On+40cdxqc2NSYOLcXl08ZHRaal5Dr/7vtOEIVBbZDze1Frc/EAySeYMmAhenT27gJTpTW5vb2/nhv3ch1Vp2Je1b6jMsw0GzetELnIi57U0XySXr9+/fv/dvwAAAP//
// DO NOT EDIT
package com.paypal.sdk.billingplans;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * The merchant preferences for a plan. Includes how much it costs to set up the agreement, the URLs where the customer can approve or cancel the agreement, the maximum number of allowed failed payment attempts, whether PayPal automatically bills the outstanding balance in the next billing cycle, and the action if the customer's initial payment fails.
 */
@Model
public class MerchantPreferences {

    // Required default constructor
    public MerchantPreferences() {}

	/**
	* The payment types that are accepted for this plan. Read-only and reserved for future use.
	*/
	@SerializedName("accepted_payment_type")
	private String acceptedPaymentType;

	public String acceptedPaymentType() { return acceptedPaymentType; }
	
	public MerchantPreferences acceptedPaymentType(String acceptedPaymentType) {
	    this.acceptedPaymentType = acceptedPaymentType;
	    return this;
	}

	/**
	* Indicates whether PayPal automatically bills the outstanding balance in the next billing cycle. The outstanding balance is the total amount of any previously failed scheduled payments. Value is:<ul><li><code>NO</code>. PayPal does not automatically bill the customer the outstanding balance. Default is <code>NO</code>.</li><li><code>YES</code>. PayPal automatically bills the customer the outstanding balance.</li><ul>
	*/
	@SerializedName("auto_bill_amount")
	private String autoBillAmount;

	public String autoBillAmount() { return autoBillAmount; }
	
	public MerchantPreferences autoBillAmount(String autoBillAmount) {
	    this.autoBillAmount = autoBillAmount;
	    return this;
	}

	/**
	* REQUIRED
	* The URL where the customer can cancel the agreement.
	*/
	@SerializedName("cancel_url")
	private String cancelUrl;

	public String cancelUrl() { return cancelUrl; }
	
	public MerchantPreferences cancelUrl(String cancelUrl) {
	    this.cancelUrl = cancelUrl;
	    return this;
	}

	/**
	* The character set for this plan. Read-only and reserved for future use.
	*/
	@SerializedName("char_set")
	private String charSet;

	public String charSet() { return charSet; }
	
	public MerchantPreferences charSet(String charSet) {
	    this.charSet = charSet;
	    return this;
	}

	/**
	* The action if the customer's initial payment fails. Value is:<ul><li><code>CONTINUE</code>. The agreement remains active and the failed payment amount is added to the outstanding balance. If auto-billing is enabled, PayPal automatically bills the outstanding balance in the next billing cycle. Default is `CONTINUE`.</li><li><code>CANCEL</code> PayPal creates the agreement but sets its state to pending until the initial payment clears. If the initial payment clears, the pending agreement becomes active. If the initial payment fails, the pending agreement is canceled.</li></ul><blockquote><strong>Note:</strong> You can use the `setup_fee` value as the initial amount to trigger the `initial_fail_amount_action`.</blockquote>
	*/
	@SerializedName("initial_fail_amount_action")
	private String initialFailAmountAction;

	public String initialFailAmountAction() { return initialFailAmountAction; }
	
	public MerchantPreferences initialFailAmountAction(String initialFailAmountAction) {
	    this.initialFailAmountAction = initialFailAmountAction;
	    return this;
	}

	/**
	* The maximum number of allowed failed payment attempts. Default is `0`, which allows infinite failed payment attempts.
	*/
	@SerializedName("max_fail_attempts")
	private String maxFailAttempts;

	public String maxFailAttempts() { return maxFailAttempts; }
	
	public MerchantPreferences maxFailAttempts(String maxFailAttempts) {
	    this.maxFailAttempts = maxFailAttempts;
	    return this;
	}

	/**
	* The URL where the customer is notified that the agreement was created. Read-only and reserved for future use.
	*/
	@SerializedName("notify_url")
	private String notifyUrl;

	public String notifyUrl() { return notifyUrl; }
	
	public MerchantPreferences notifyUrl(String notifyUrl) {
	    this.notifyUrl = notifyUrl;
	    return this;
	}

	/**
	* REQUIRED
	* The URL where the customer can approve the agreement.
	*/
	@SerializedName("return_url")
	private String returnUrl;

	public String returnUrl() { return returnUrl; }
	
	public MerchantPreferences returnUrl(String returnUrl) {
	    this.returnUrl = returnUrl;
	    return this;
	}

	/**
	* The base object for all financial value-related fields, such as balance, payment due, and so on.
	*/
	@SerializedName("setup_fee")
	private Currency setupFee;

	public Currency setupFee() { return setupFee; }
	
	public MerchantPreferences setupFee(Currency setupFee) {
	    this.setupFee = setupFee;
	    return this;
	}
}
