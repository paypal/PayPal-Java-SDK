package com.paypal.sdk.billingplans.request;

import com.braintreepayments.http.HttpResponse;
import com.paypal.sdk.TestHarness;
import com.paypal.sdk.billingplans.Plan;
import com.paypal.sdk.billingplans.PlanGetRequest;
import com.paypal.sdk.billingplans.PlanList;
import com.paypal.sdk.billingplans.PlanListRequest;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertTrue;

public class PlanListRequestTest extends TestHarness {

    @Test
    public void testPlanListRequest() throws IOException {
        HttpResponse<Plan> response = PlanCreateRequestTest.createPlan(client());
        assertEquals(response.statusCode(), 201);
        assertNotNull(response.result());
        Plan createdPlan = response.result();

        PlanListRequest listPlanRequest = new PlanListRequest();
        HttpResponse<PlanList> listPlanResponse = client().execute(listPlanRequest);

        assertEquals(listPlanResponse.statusCode(), 200);
        PlanList planList = listPlanResponse.result();

        Plan firstPlan = planList.plans().get(0);
        assertNotNull(firstPlan.id());
        assertNotNull(firstPlan.name());
    }
}
