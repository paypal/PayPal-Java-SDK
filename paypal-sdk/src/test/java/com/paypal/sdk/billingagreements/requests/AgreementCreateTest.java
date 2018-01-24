package com.paypal.sdk.billingagreements.requests;

import com.braintreepayments.http.HttpClient;
import com.braintreepayments.http.HttpResponse;
import com.paypal.sdk.TestHarness;
import com.paypal.sdk.billingagreements.*;
import com.paypal.sdk.billingplans.Plan;
import com.paypal.sdk.billingplans.PlanGetRequest;
import com.paypal.sdk.billingplans.PlanUpdateRequest;
import com.paypal.sdk.billingplans.request.PlanCreateRequestTest;
import com.paypal.sdk.payments.JsonPatch;
import org.testng.annotations.Test;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

public class AgreementCreateTest extends TestHarness {

    @Test
    public void testAgreementCreateRequest() throws IOException {
        Plan createdAndActivatedPlan = createAndActivatePlan(client());
        Agreement createdAgreement = createAgreement(client(), createdAndActivatedPlan);
        assertEquals(createdAgreement.plan().id(), createdAndActivatedPlan.id());
        assertEquals(createdAgreement.name(), "Name of Agreement");
        assertEquals(createdAgreement.links().size(), 2);
    }

    public static Agreement createAgreement(HttpClient client, Plan plan) throws IOException {
        Agreement agreement = new Agreement()
                .name("Name of Agreement")
                .description("Agreement Description")
                .startDate(startDateForAgreement())
                .payer(new Payer().paymentMethod("paypal").payerInfo(new PayerInformation().email("payer@example.com")))
                .plan(new com.paypal.sdk.billingagreements.Plan().id(plan.id()))
                .shippingAddress(new SimplePostalAddress()
                        .line1("Hotel Staybridge")
                        .line2("Crooke Street")
                        .city("San Jose")
                        .state("CA")
                        .postalCode("95112")
                        .countryCode("US"))
                .overrideMerchantPreferences(new MerchantPreferences()
                        .setupFee(new MoneyTypeWithCurrencyCodeQualifiedValue()
                                .value("3").currency("USD"))
                        .returnUrl("https://example.com/return")
                        .cancelUrl("https://example.com/cancel")
                        .autoBillAmount("YES")
                        .initialFailAmountAction("CONTINUE")
                        .maxFailAttempts("11"));

        AgreementCreateRequest agreementCreateRequest = new AgreementCreateRequest();
        agreementCreateRequest.requestBody(agreement);

        HttpResponse<Agreement> agreementResponse = client.execute(agreementCreateRequest);
        assertEquals(agreementResponse.statusCode(), 201);
        assertNotNull(agreementResponse.result());
        Agreement createdAgreement = agreementResponse.result();
        return createdAgreement;
    }

    public static Plan createAndActivatePlan(HttpClient client) throws IOException {
        HttpResponse<Plan> response = PlanCreateRequestTest.createPlan(client);
        assertEquals(response.statusCode(), 201);
        com.paypal.sdk.billingplans.Plan createdPlan = response.result();

        com.paypal.sdk.billingplans.Plan plan = new com.paypal.sdk.billingplans.Plan();
        plan.state("ACTIVE");
        PlanUpdateRequest updateRequest = new PlanUpdateRequest(createdPlan.id());
        List<com.paypal.sdk.payments.JsonPatch> body = new ArrayList<>();
        body.add(new JsonPatch()
                .path("/")
                .op("replace")
                .value(plan));
        updateRequest.requestBody(body);
        HttpResponse<Void> updatedResponse = client.execute(updateRequest);
        assertEquals(updatedResponse.statusCode(), 200);

        PlanGetRequest getPlanRequest = new PlanGetRequest(createdPlan.id());
        HttpResponse<com.paypal.sdk.billingplans.Plan> getPlanResponse = client.execute(getPlanRequest);
        Plan retrievedPlan = getPlanResponse.result();
        assertEquals(retrievedPlan.state(), "ACTIVE");
        return retrievedPlan;
    }

    private static String startDateForAgreement() {
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        cal.add(Calendar.DATE, 10);
        Date date = cal.getTime();
        return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX").format(date);
    }
}
