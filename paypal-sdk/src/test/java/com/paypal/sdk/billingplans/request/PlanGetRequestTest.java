package com.paypal.sdk.billingplans.request;

import com.braintreepayments.http.HttpResponse;
import com.paypal.sdk.TestHarness;
import com.paypal.sdk.billingplans.Plan;
import com.paypal.sdk.billingplans.PlanGetRequest;

import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

public class PlanGetRequestTest extends TestHarness {

    @Test
    public void testPlanCreateRequest() throws IOException {
        HttpResponse<Plan> response = PlanCreateRequestTest.createPlan(client());
        assertEquals(response.statusCode(), 201);
        assertNotNull(response.result());
        Plan createdPlan = response.result();

        PlanGetRequest getPlanRequest = new PlanGetRequest(createdPlan.id());
        HttpResponse<Plan> getPlanResponse = client().execute(getPlanRequest);
        Plan retrievedPlan = getPlanResponse.result();
        assertEquals(retrievedPlan.state(), "CREATED");
        assertEquals(retrievedPlan.id(), createdPlan.id());
        assertEquals(createdPlan.name(), "T-Shirt of the Month Club Plan");
    }
}
