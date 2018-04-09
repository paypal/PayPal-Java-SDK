// This class was generated on Mon, 09 Apr 2018 18:13:18 UTC by version 0.1.0-dev+291f3f of Braintree SDK Generator
// CaptureGetRequest.java
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
 * Shows details for a captured payment, by ID.
 */
public class CaptureGetRequest extends HttpRequest<Capture> {

    public CaptureGetRequest(String captureId) {
        super("/v1/payments/capture/{capture_id}?", "GET", Capture.class);
        try {
            path(path().replace("{capture_id}", URLEncoder.encode(String.valueOf(captureId), "UTF-8")));
        } catch (UnsupportedEncodingException ignored) {}
        
        header("Content-Type", "application/json");
    }
    
}
