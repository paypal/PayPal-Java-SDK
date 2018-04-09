// This class was generated on Mon, 09 Apr 2018 18:13:18 UTC by version 0.1.0-dev+291f3f of Braintree SDK Generator
// CaptureRefundRequest.java
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
    public CaptureRefundRequest paypalRequestId(String paypalRequestId) {
        header("PayPal-Request-Id", String.valueOf(paypalRequestId));
        return this;
    }
    
    

    public CaptureRefundRequest requestBody(RefundRequest refundRequest) {
        super.requestBody(refundRequest);
        return this;
    }
}
