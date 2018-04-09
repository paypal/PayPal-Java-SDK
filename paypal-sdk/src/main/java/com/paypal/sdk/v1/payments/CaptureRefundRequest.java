// This class was generated on Sat, 07 Apr 2018 21:37:44 UTC by version 0.1.0-dev+843c6b-dirty of Braintree SDK Generator
// CaptureRefundRequest.java
// @version 0.1.0-dev+843c6b-dirty
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
