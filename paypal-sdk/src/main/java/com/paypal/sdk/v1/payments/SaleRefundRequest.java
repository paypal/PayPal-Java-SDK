// This class was generated on Mon, 09 Apr 2018 18:13:18 UTC by version 0.1.0-dev+291f3f of Braintree SDK Generator
// SaleRefundRequest.java
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
 * Refunds a sale, by ID. For a full refund, do not include the `amount` object in the JSON request body. For a partial refund, include an `amount` object in the JSON request body.
 */
public class SaleRefundRequest extends HttpRequest<DetailedRefund> {

    public SaleRefundRequest(String saleId) {
        super("/v1/payments/sale/{sale_id}/refund?", "POST", DetailedRefund.class);
        try {
            path(path().replace("{sale_id}", URLEncoder.encode(String.valueOf(saleId), "UTF-8")));
        } catch (UnsupportedEncodingException ignored) {}
        
        header("Content-Type", "application/json");
    }
    public SaleRefundRequest paypalRequestId(String paypalRequestId) {
        header("PayPal-Request-Id", String.valueOf(paypalRequestId));
        return this;
    }
    
    

    public SaleRefundRequest requestBody(RefundRequest refundRequest) {
        super.requestBody(refundRequest);
        return this;
    }
}
