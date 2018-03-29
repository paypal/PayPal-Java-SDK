// This class was generated on Thu, 29 Mar 2018 19:06:15 UTC by version 0.1.0-dev+2136c8 of Braintree SDK Generator
// CaptureRefundRequest.java
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
 * Refunds a captured payment, by ID. In the JSON request body, include an `amount` object.
 */
public class CaptureRefundRequest extends HttpRequest<DetailedRefund> {

    public CaptureRefundRequest(String captureId) {
        super("/v1/payments/capture/{capture_id}/refund?", "POST", DetailedRefund.class);
        try {
            path(path().replace("{capture_id}", URLEncoder.encode(String.valueOf(captureId), "UTF-8")));
        } catch (UnsupportedEncodingException ignored) {}
        
        header("Content-Type", "application/json");
    }
    public CaptureRefundRequest payPalRequestId(String payPalRequestId) {
        header("PayPal-Request-Id", String.valueOf(payPalRequestId));
        return this;
    }
    
    

    public CaptureRefundRequest requestBody(RefundRequest refundRequest) {
        super.requestBody(refundRequest);
        return this;
    }
}
