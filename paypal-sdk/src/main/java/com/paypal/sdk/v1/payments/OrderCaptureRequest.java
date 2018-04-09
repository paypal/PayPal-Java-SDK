// This class was generated on Mon, 09 Apr 2018 18:13:18 UTC by version 0.1.0-dev+291f3f of Braintree SDK Generator
// OrderCaptureRequest.java
// @version 0.1.0-dev+291f3f
// @type request
// @data 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
// DO NOT EDIT
package com.paypal.sdk.v1.payments;

import com.braintreepayments.http.*;
import java.util.*;
import java.util.stream.Collectors;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
/**
 * Captures a payment for an order, by ID. To use this call, the original payment call must specify an `order` intent. In the JSON request body, include the payment amount and indicate whether this capture is the final capture for the authorization.
 */
public class OrderCaptureRequest extends HttpRequest<Capture> {

    public OrderCaptureRequest(String orderId) {
        super("/v1/payments/orders/{order_id}/capture?", "POST", Capture.class);
        try {
            path(path().replace("{order_id}", URLEncoder.encode(String.valueOf(orderId), "UTF-8")));
        } catch (UnsupportedEncodingException ignored) {}
        
        header("Content-Type", "application/json");
    }
    

    public OrderCaptureRequest requestBody(Capture capture) {
        super.requestBody(capture);
        return this;
    }
}
