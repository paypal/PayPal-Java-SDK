// This class was generated on Thu, 29 Mar 2018 19:06:15 UTC by version 0.1.0-dev+2136c8 of Braintree SDK Generator
// OrderVoidRequest.java
// @version 0.1.0-dev+2136c8
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
 * Voids, or cancels, an order, by ID. You cannot void an order if the payment has already been partially or fully captured.
 */
public class OrderVoidRequest extends HttpRequest<Order> {

    public OrderVoidRequest(String orderId) {
        super("/v1/payments/orders/{order_id}/do-void?", "POST", Order.class);
        try {
            path(path().replace("{order_id}", URLEncoder.encode(String.valueOf(orderId), "UTF-8")));
        } catch (UnsupportedEncodingException ignored) {}
        
        header("Content-Type", "application/json");
    }
    public OrderVoidRequest payPalRequestId(String payPalRequestId) {
        header("PayPal-Request-Id", String.valueOf(payPalRequestId));
        return this;
    }
    
    
}
