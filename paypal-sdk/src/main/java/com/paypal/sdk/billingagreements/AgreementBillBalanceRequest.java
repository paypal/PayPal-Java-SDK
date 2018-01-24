// This class was generated on Tue, 23 Jan 2018 17:16:08 CST by version 0.1.0-dev+20fb1e of Braintree SDK Generator
// AgreementBillBalanceRequest.java
// @version 0.1.0-dev+20fb1e
// @type request
// @data H4sIAAAAAAAC/6RUTW/TQBC98ytGc97WBXHyLTSgBkQTSMQFVdXYO4kXbXbd3TFgRfnvaG03H45UhDhFeX4z896bsXd4T1vGHGkTmLfs5Low1l4VZMmVjAqnHMtgajHeYY7vjLURpGIYGLD2AcjBoV5B0cJseg0z1/E+Luf3EPip4ShQeN0qMK60jeZU5rvGZMF5YZCKBHQ3sOB+TGCK3nVTuqnGWuM2QGWqA3K6gw/Tgba+ST9OQ9mEwK5sr1Hhl4ZDu6BAWxYOEfPvDwrvmDSHMfrBh+0YW5BUZ9gOV22dcosSjNugwm8UDBWWx3k+Go0KP3E7PLiIdFUxzKbg1yMnyfKvypQViO98n8aePE1CoLaXcaPwK5OeO9tiviYbOQFPjQmsMZfQsMJF8DUHMRwxd421+4eew1H6JgdPk4OGpZAwPOv14SWfMXEf9Sn36PpF2nkeE9DH/8+x9LsU6KovsvqnNAbgNI6/rzOd55mhAbhc5ehgj/vspZcVuQ3/r+B+f/vEirV3kfs+CVZ4652wG5aKVNfWlJQUZj+id6jwTqT+zFJ5jTku5ssV9heOOWY/X2c1tUlwzIaX7ergIWa707veZ6NvxfvfNZfCOp1NE2+9Zszf3Lzdv/oDAAD//w==
// DO NOT EDIT
package com.paypal.sdk.billingagreements;

import com.braintreepayments.http.*;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
/**
 * Bills the balance for an agreement, by ID. In the JSON request body, include an optional note that describes the reason for the billing action and the agreement amount and currency.
 */
public class AgreementBillBalanceRequest extends HttpRequest<Void> {

    public AgreementBillBalanceRequest(String agreementId) {
        super("/v1/payments/billing-agreements/{agreement_id}/bill-balance?", "POST", Void.class);
        try {
            path(path().replace("{agreement_id}", URLEncoder.encode(String.valueOf(agreementId), "UTF-8")));
        } catch (UnsupportedEncodingException ignored) {}
        
        header("Content-Type", "application/json");
    }
    

    public AgreementBillBalanceRequest requestBody(AgreementStateDescriptor agreementStateDescriptor) {
        super.requestBody(agreementStateDescriptor);
        return this;
    }
}
