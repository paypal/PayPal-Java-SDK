// This class was generated on Thu, 29 Mar 2018 19:06:15 UTC by version 0.1.0-dev+2136c8 of Braintree SDK Generator
// SaleGetRequest.java
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
 * Shows details for a sale, by ID. Returns only sales that were created through the REST API.
 */
public class SaleGetRequest extends HttpRequest<Sale> {

    public SaleGetRequest(String saleId) {
        super("/v1/payments/sale/{sale_id}?", "GET", Sale.class);
        try {
            path(path().replace("{sale_id}", URLEncoder.encode(String.valueOf(saleId), "UTF-8")));
        } catch (UnsupportedEncodingException ignored) {}
        
        header("Content-Type", "application/json");
    }
    
}
