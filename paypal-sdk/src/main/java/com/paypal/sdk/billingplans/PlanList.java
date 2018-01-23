// This class was generated on Tue, 23 Jan 2018 10:55:03 CST by version 0.1.0-dev+20fb1e of Braintree SDK Generator
// PlanList.java
// @version 0.1.0-dev+20fb1e
// @type object
// @data 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
// DO NOT EDIT
package com.paypal.sdk.billingplans;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * A list of plans. Contains details for each plan and a set of [HATEOAS links](/docs/api/overview/#hateoas-links).
 */
@Model
public class PlanList {

    // Required default constructor
    public PlanList() {}

	/**
	* An array of request-related [HATEOAS links](/docs/api/overview/#hateoas-links).
	*/
	@SerializedName(value = "links", listClass = LinkDescriptionObject.class)
	private List<LinkDescriptionObject> links;

	public List<LinkDescriptionObject> links() { return links; }
	
	public PlanList links(List<LinkDescriptionObject> links) {
	    this.links = links;
	    return this;
	}

	/**
	* An array of plans.
	*/
	@SerializedName(value = "plans", listClass = Plan.class)
	private List<Plan> plans;

	public List<Plan> plans() { return plans; }
	
	public PlanList plans(List<Plan> plans) {
	    this.plans = plans;
	    return this;
	}

	/**
	* The total number of plans in the list.
	*/
	@SerializedName("total_items")
	private String totalItems;

	public String totalItems() { return totalItems; }
	
	public PlanList totalItems(String totalItems) {
	    this.totalItems = totalItems;
	    return this;
	}

	/**
	* The total number of pages in the response. The `page_size` request value determines how many plans appear on each page. The `total_items` and `page_size` request values are used to calculate the total number of pages in the response.
	*/
	@SerializedName("total_pages")
	private String totalPages;

	public String totalPages() { return totalPages; }
	
	public PlanList totalPages(String totalPages) {
	    this.totalPages = totalPages;
	    return this;
	}
}
