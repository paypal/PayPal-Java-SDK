package com.paypal.sdk.billingagreements.requests;

import com.braintreepayments.http.HttpResponse;
import com.paypal.sdk.TestHarness;
import com.paypal.sdk.billingagreements.Agreement;
import com.paypal.sdk.billingagreements.AgreementExecuteRequest;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

public class AgreementExecuteTest extends TestHarness {

    @Test(enabled = false)
    public void testAgreementExecuteRequest() throws IOException {
        String token = "EC-3JK566866G768414U";

        AgreementExecuteRequest request = new AgreementExecuteRequest(token);
        request.requestBody("");

        HttpResponse<Agreement> response = client().execute(request);
        assertEquals(response.statusCode(), 200);
        assertNotNull(response.result());
        Agreement activatedAgreement = response.result();
        assertNotNull(activatedAgreement.id());
        assertEquals(activatedAgreement.state(), "Active");
    }
}
