package com.paypal.sdk.billingagreements.requests;

import com.braintreepayments.http.HttpResponse;
import com.paypal.sdk.TestHarness;

import java.util.ArrayList;
import java.util.List;

import com.paypal.sdk.billingagreements.*;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.assertEquals;

public class AgreementUpdateTest extends TestHarness {

    @Test(enabled = false)
    public void testAgreementUpdateRequest() throws IOException {
        String executedAgreementId = "I-4ANMVNT6VV6T";

        AgreementUpdateRequest request = new AgreementUpdateRequest(executedAgreementId);

        Agreement agreement = new Agreement()
                .description("Updated description")
                .startDate("2019-12-22T09:13:49Z")
                .shippingAddress(new SimplePostalAddress()
                        .line1("Hotel Blue Diamond")
                        .line2("Church Street")
                        .city("San Jose")
                        .state("CA")
                        .postalCode("95112")
                        .countryCode("US"));
        List<JsonPatch> body = new ArrayList<>();
        body.add(new JsonPatch()
                .path("/")
                .op("replace")
                .value(agreement));
        request.requestBody(body);
        HttpResponse<Void> response = client().execute(request);
        assertEquals(response.statusCode(), 200);

        AgreementGetRequest getAgreementRequest = new AgreementGetRequest(executedAgreementId);
        HttpResponse<Agreement> retrievedAgreementResponse = client().execute(getAgreementRequest);
        assertEquals(retrievedAgreementResponse.statusCode(), 200);
        Agreement retrievedAgreement = retrievedAgreementResponse.result();
        assertEquals(retrievedAgreement.description(), "Updated description");
    }
}
