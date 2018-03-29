// This class was generated on Thu, 29 Mar 2018 19:06:15 UTC by version 0.1.0-dev+2136c8 of Braintree SDK Generator
// SaleRefundRequest.java
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
    public SaleRefundRequest payPalRequestId(String payPalRequestId) {
        header("PayPal-Request-Id", String.valueOf(payPalRequestId));
        return this;
    }
    
    

    public SaleRefundRequest requestBody(RefundRequest refundRequest) {
        super.requestBody(refundRequest);
        return this;
    }
}
