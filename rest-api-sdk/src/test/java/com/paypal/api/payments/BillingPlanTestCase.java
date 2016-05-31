package com.paypal.api.payments;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.paypal.base.rest.JSONFormatter;
import com.paypal.base.rest.OAuthTokenCredential;
import com.paypal.base.rest.PayPalRESTException;

public class BillingPlanTestCase {
	private String id = null;

	public static Plan loadPlan() {
	    try {
		    BufferedReader br = new BufferedReader(new FileReader("src/test/resources/billingplan_create.json"));
	        StringBuilder sb = new StringBuilder();
	        String line = br.readLine();

	        while (line != null) {
	            sb.append(line);
	            sb.append(System.getProperty("line.separator"));
	            line = br.readLine();
	        }
	        br.close();
	        return JSONFormatter.fromJSON(sb.toString(), Plan.class);
	        
	    } catch (IOException e) {
	    	e.printStackTrace();
	    	return null;
	    }
	}
	
	@BeforeTest(groups = "integration")
	public void setUp() throws PayPalRESTException {
		String clientID = "AUASNhD7YM7dc5Wmc5YE9pEsC0o4eVOyYWO9ezXWBu2XTc63d3Au_s9c-v-U";
		String clientSecret = "EBq0TRAE-4R9kgCDKzVh09sm1TeNcuY-xJirid7LNtheUh5t5vlOhR0XSHt3";
		TokenHolder.accessToken = new OAuthTokenCredential(clientID,
				clientSecret).getAccessToken();
	}
	
	@Test(groups = "integration")
	public void testCreatePlan() throws PayPalRESTException {
		Plan plan = loadPlan();
		plan = plan.create(TokenHolder.accessToken);
		this.id = plan.getId();
		Assert.assertNotNull(plan.getId());
	}
	
	@Test(groups = "integration", dependsOnMethods = {"testCreatePlan"})
	public void testUpdatePlan() throws PayPalRESTException {
		// get original plan
		Plan plan = loadPlan();
		plan.setId(this.id);
		
		// set up new plan
		Plan newPlan = new Plan();
		newPlan.setState("ACTIVE");
		
		// incorporate new plan in Patch object
		Patch patch = new Patch();
		patch.setOp("replace");
		patch.setPath("/");
		patch.setValue(newPlan);
		
		// wrap the Patch object with PatchRequest
		List<Patch> patchRequest = new ArrayList<Patch>();
		patchRequest.add(patch);
		
		// execute update
		plan.update(TokenHolder.accessToken, patchRequest);
		Plan updatedPlan = Plan.get(TokenHolder.accessToken, plan.getId());
		Assert.assertEquals(plan.getId(), updatedPlan.getId());
		Assert.assertEquals(updatedPlan.getState(), "ACTIVE");
	}
	
	@Test(groups = "integration", dependsOnMethods = {"testUpdatePlan"})
	public void testRetrievePlan() throws PayPalRESTException {
		Plan plan = Plan.get(TokenHolder.accessToken, this.id);
		Assert.assertEquals(plan.getId(), this.id);
	}
	
	@Test(groups = "integration", dependsOnMethods = {"testRetrievePlan"})
	public void testEmptyListPlan() throws PayPalRESTException {
		// store all required parameters in Map
		Map<String, String> parameters = new HashMap<String, String>();
		parameters.put("page_size", "3");
		parameters.put("status", "INACTIVE");
		parameters.put("page", "2");
		parameters.put("total_required", "yes");
		
		// retrieve plans that match the specified criteria
		PlanList planList = Plan.list(TokenHolder.accessToken, parameters);
		List<Plan> plans = planList.getPlans();
		Assert.assertEquals(plans.size(), 0);
	}
	
	@Test(groups = "integration", dependsOnMethods = {"testRetrievePlan"})
	public void testListPlan() throws PayPalRESTException {
		// store all required parameters in Map
		Map<String, String> parameters = new HashMap<String, String>();
		parameters.put("page_size", "3");
		parameters.put("status", "ACTIVE");
		parameters.put("page", "2");
		parameters.put("total_required", "yes");
		
		// retrieve plans that match the specified criteria
		PlanList planList = Plan.list(TokenHolder.accessToken, parameters);
		List<Plan> plans = planList.getPlans();
		for (int i = 0; i < plans.size(); ++i) {
			Assert.assertEquals(plans.get(i).getState(), "ACTIVE");
		}
	}
}
