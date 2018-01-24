package com.paypal.sdk.billingplans.request;

import com.braintreepayments.http.HttpClient;
import com.braintreepayments.http.HttpResponse;
import com.paypal.sdk.TestHarness;
import com.paypal.sdk.billingplans.ChargeModel;
import com.paypal.sdk.billingplans.Currency;
import com.paypal.sdk.billingplans.MerchantPreferences;
import com.paypal.sdk.billingplans.PaymentDefinition;
import com.paypal.sdk.billingplans.Plan;
import com.paypal.sdk.billingplans.PlanCreateRequest;

import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Arrays;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

public class PlanCreateRequestTest extends TestHarness {

    private static Plan buildRequestBody() throws IOException {
        Plan plan = new Plan()
                .paymentDefinitions(Arrays.asList(
                        new PaymentDefinition()
                                .amount(new Currency()
                                        .currency("USD")
                                        .value("100"))
                                .frequency("MONTH")
                                .cycles("12")
                                .frequencyInterval("2")
                                .type("REGULAR")
                                .name("Regular Payments")
                                .chargeModels(Arrays.asList(
                                        new ChargeModel()
                                                .type("SHIPPING")
                                                .amount(new Currency().currency("USD").value("10")),
                                        new ChargeModel()
                                                .type("TAX")
                                                .amount(new Currency().currency("USD").value("12"))))))
                .merchantPreferences(new MerchantPreferences()
                        .returnUrl("https://example.com/return")
                        .cancelUrl("https://example.com/cancel"))
                .name("T-Shirt of the Month Club Plan")
                .description("T-Shirt Billing Plan")
                .type("fixed");
        return plan;
    }

    public static HttpResponse<Plan> createPlan(HttpClient client) throws IOException {
        PlanCreateRequest request = new PlanCreateRequest();
        request.requestBody(buildRequestBody());

        return client.execute(request);
    }

    @Test
    public void testPlanCreateRequest() throws IOException {
        HttpResponse<Plan> response = createPlan(client());
        assertEquals(response.statusCode(), 201);
        assertNotNull(response.result());
        Plan plan = response.result();
        assertEquals(plan.state(), "CREATED");
        assertNotNull(plan.id());
        assertEquals(plan.name(), "T-Shirt of the Month Club Plan");
    }
}
