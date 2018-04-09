// This class was generated on Mon, 09 Apr 2018 18:13:17 UTC by version 0.1.0-dev+291f3f of Braintree SDK Generator
// PaymentOptions.java
// @version 0.1.0-dev+291f3f
// @type object
// @data H4sIAAAAAAAC/6ST32obPRDF77+nGHRtnMB35zsTu60pcYyzCZS2mIk0mxXVSuqMNkaUvHvR7jrOPxdKr2yNzp79nSPtL1XlSGqmIuaWfNqFmGzwoibqFtninaM1tkWgJuoz5eNiQaLZ9mo1U1VDMFrAaAF1YEiNFUiMXlCX6VRN1JwZ8/Da84naEpor77Ka1eiEyuBnZ5nM02DDIRInS6JmX5+AJbH192850bmwJ7M7BGopNcG8oD8pOZ1pkLwfCaoyqS05AyaQgA8JMEaXIQVIDYFmMjaBRjavHKdwi64jsDL71p2f/6871//SsHL2+UoHM/yjm/V2eV1tVxfVcjHsnR03p3BJrBv06YjT4AMBQmSqiclrguChCfuCl2FftD1oJym0xAU8Yp6O3i8xTkGt1tfVfF3tPtysF6v1x9311c32YvknPB6OWiA1+AogYhbY29QAerBeUtHXnTfW34OEjjVNQDrdAArgi4YDwwbzBh3coUOvaQpz5w7FCyATRA6aRMgcvF2ewqewpwfiyVHac42UgNCi79AB04Olfe/TIv8gUxgi9WzHdAJtJ6V5bxz14UYJSMJE5RlbD/PxStjhrDIl0KGNjhL95QlcXi4Xq3m13G3mX94pfjOmFsDnhdi2JWMxUSlh7vMT0PP48ia/lUP8Gq0j8z7r2eFG/+OX7zvnHr8//vcbAAD//w==
// DO NOT EDIT
package com.paypal.sdk.v1.payments;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * The payment options for this transaction.
 */
@Model
public class PaymentOptions {

    // Required default constructor
    public PaymentOptions() {}

	/**
	* The payment method for this transaction. This field does not apply to the credit card payment method. Value is:<ul><li><code>UNRESTRICTED</code>. Merchant does not have a preference on how they want the customer to pay.</li><li><code>INSTANT_FUNDING_SOURCE</code>. Merchant requires that the customer pays with an instant funding source, such as a credit card or PayPal balance. All payments are processed instantly. However, payments that require a manual review are marked as pending. Merchants must handle the pending state as if the payment is not yet complete.</li><li><code>IMMEDIATE_PAY</code>. Processes all payments immediately. Any payment that requires a manual review is marked failed.</li></ul>
	*/
	@SerializedName("allowed_payment_method")
	private String allowedPaymentMethod;

	public String allowedPaymentMethod() { return allowedPaymentMethod; }
	
	public PaymentOptions allowedPaymentMethod(String allowedPaymentMethod) {
	    this.allowedPaymentMethod = allowedPaymentMethod;
	    return this;
	}
}
