package com.paypal.sdk.billingplans.request;

import com.braintreepayments.http.HttpResponse;
import com.paypal.sdk.TestHarness;
import com.paypal.sdk.billingplans.*;
import com.paypal.sdk.payments.Amount;
import com.paypal.sdk.payments.JsonPatch;
import com.paypal.sdk.payments.Payment;
import com.paypal.sdk.payments.PaymentUpdateRequest;
import com.paypal.sdk.payments.request.PaymentCreateRequestTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertTrue;

public class PlanUpdateRequestTest extends TestHarness {

    @Test
    public void testActivatePlan() throws IOException {
        HttpResponse<Plan> response = PlanCreateRequestTest.createPlan(client());
        assertEquals(response.statusCode(), 201);
        Plan createdPlan = response.result();

        Plan plan = new Plan();
        plan.state("ACTIVE");
        PlanUpdateRequest updateRequest = new PlanUpdateRequest(createdPlan.id());
        List<JsonPatch> body = new ArrayList<>();
        body.add(new JsonPatch()
                .path("/")
                .op("replace")
                .value(plan));
        updateRequest.requestBody(body);
        HttpResponse<Void> updatedResponse = client().execute(updateRequest);
        assertEquals(updatedResponse.statusCode(), 200);

        PlanGetRequest getPlanRequest = new PlanGetRequest(createdPlan.id());
        HttpResponse<Plan> getPlanResponse = client().execute(getPlanRequest);
        Plan retrievedPlan = getPlanResponse.result();
        assertEquals(retrievedPlan.state(), "ACTIVE");
    }

    @Test
    public void testPlanUpdateRequest() throws IOException {
        HttpResponse<Plan> response = PlanCreateRequestTest.createPlan(client());
        assertEquals(201, response.statusCode());
        Plan createdPlan = response.result();

        MerchantPreferences merchantPreferences = new MerchantPreferences();
        merchantPreferences.cancelUrl("http://example.com/cancel/new");
        merchantPreferences.setupFee(new Currency().currency("USD").value("5"));

        PlanUpdateRequest updateRequest = new PlanUpdateRequest(createdPlan.id());
        List<JsonPatch> body = new ArrayList<>();
        body.add(new JsonPatch()
                .path("/merchant-preferences")
                .op("replace")
                .value(merchantPreferences));
        updateRequest.requestBody(body);
        HttpResponse<Void> updatedResponse = client().execute(updateRequest);
        assertEquals(updatedResponse.statusCode(), 200);

        PlanGetRequest getPlanRequest = new PlanGetRequest(createdPlan.id());
        HttpResponse<Plan> getPlanResponse = client().execute(getPlanRequest);
        Plan retrievedPlan = getPlanResponse.result();
        assertEquals(retrievedPlan.merchantPreferences().cancelUrl(), "http://example.com/cancel/new");
        assertEquals(retrievedPlan.merchantPreferences().setupFee().currency(), "USD");
        assertEquals(retrievedPlan.merchantPreferences().setupFee().value(), "5");
    }
}
