// This class was generated on Tue, 23 Jan 2018 17:16:08 CST by version 0.1.0-dev+20fb1e of Braintree SDK Generator
// AgreementSuspendRequest.java
// @version 0.1.0-dev+20fb1e
// @type request
// @data H4sIAAAAAAAC/6STT28TMRDF73wKa86mWxAn36IG1ApBA4m4oKqarCdZo41tZmYRqyjfHZnd5q9UhHrct8/2782zt/AZNwQOcM1EG4p6JZ1kih4sTElqDllDiuBgPuhi0CxD24a4NvtF1ix7cze9AgtfOuJ+howbUmIB9/3Bwi2hJz5XPyTenGsz1OZE28Kiz4VQlENcg4VvyAGXLZ2TP4YC/ZH68cdFgkVD5m5q0spoQwd4o8mMoUuACTP2w5nXFr4S+vvY9uBW2AoV4WcXmDw45Y4szDhlYg0k4GLXtruHwUOiwyb7AJP9gXNFJfMEl/i5UFK8j/7Ye4j4rO00/MT4w/fTDOqOuQD9XX0xmP+axigcj+Pf3cWkdBJoFC57Y0JJ0awSn5U3oNcNxjW9FHjob1dcklMUGvYpsoWbFJXiWCpgzm2osRBWPyRFsHCrmj+RNsmDg9n9fAHDdQYH1a83Vca+AEs1vp7X+wxSbY8v8a46PMH3vzPVSr7cmE5ukidwb6/f7V79AQAA//8=
// DO NOT EDIT
package com.paypal.sdk.billingagreements;

import com.braintreepayments.http.*;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
/**
 * Suspends a billing agreement, by ID.
 */
public class AgreementSuspendRequest extends HttpRequest<Void> {

    public AgreementSuspendRequest(String agreementId) {
        super("/v1/payments/billing-agreements/{agreement_id}/suspend?", "POST", Void.class);
        try {
            path(path().replace("{agreement_id}", URLEncoder.encode(String.valueOf(agreementId), "UTF-8")));
        } catch (UnsupportedEncodingException ignored) {}
        
        header("Content-Type", "application/json");
    }
    

    public AgreementSuspendRequest requestBody(AgreementStateDescriptor agreementStateDescriptor) {
        super.requestBody(agreementStateDescriptor);
        return this;
    }
}
