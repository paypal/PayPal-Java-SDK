// This class was generated on Mon, 09 Apr 2018 18:13:18 UTC by version 0.1.0-dev+291f3f of Braintree SDK Generator
// AuthorizationCaptureRequest.java
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
 * Captures and processes an authorization, by ID. The original payment call must specify an intent of `authorize`.
 */
public class AuthorizationCaptureRequest extends HttpRequest<Capture> {

    public AuthorizationCaptureRequest(String authorizationId) {
        super("/v1/payments/authorization/{authorization_id}/capture?", "POST", Capture.class);
        try {
            path(path().replace("{authorization_id}", URLEncoder.encode(String.valueOf(authorizationId), "UTF-8")));
        } catch (UnsupportedEncodingException ignored) {}
        
        header("Content-Type", "application/json");
    }
    

    public AuthorizationCaptureRequest requestBody(Capture capture) {
        super.requestBody(capture);
        return this;
    }
}
