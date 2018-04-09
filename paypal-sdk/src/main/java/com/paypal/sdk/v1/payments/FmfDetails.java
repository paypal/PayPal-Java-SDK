// This class was generated on Mon, 09 Apr 2018 18:13:17 UTC by version 0.1.0-dev+291f3f of Braintree SDK Generator
// FmfDetails.java
// @version 0.1.0-dev+291f3f
// @type object
// @data H4sIAAAAAAAC/7ySwWrcQAyG730KMacE3HXPeysEQynbljT0EkJQPLItGGtcSaaYkncv4102G9KllJSejH/9kj6N9DPcLBOFbejG7j6SIycLVfiGyviQ6BOOJRiq8JGWp58rslZ5cs4StuFmIGgU5wg7FOxpJHFoODkpXDS75hIOhcEHdEAlwGlKTBE8gw8EEy5r0hpXsjk5sAAKYNvS5BVEkqWCrDCRRJYesC3dN3BNPqtQXP3HQko2ZTGCLGkB7tYuI2k7oDgMaEBS5ovQ7JqSulJo7jgRGLmz9AYoEbIQ5H1+t87YrYMZ/EADV+57UorwgEbFDD5keyqxgSYrjFkJWLqsIxbqCowIbs+8mcHXeRxRl7uLOubW6jahGbd1N3Y1i1Ova5W3/cyR6mbXHPz15SZU4b0qLvulvqvCNWH8LGkJ2w6TURG+z6wUj8IXzROpM1nY3h7PwVxZ+peXEE82f3oUz/WX97F/NTixvZZV5pQeqz8C7xvfc3yGe6qehf1w9VeMrvOrEL24fgN50M9ilvj/AZXyOSU8CGfRSvyf7Pnu8c0vAAAA//8=
// DO NOT EDIT
package com.paypal.sdk.v1.payments;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * The Fraud Management Filter (FMF) details that are applied to the payment that result in an accept, deny, or pending action. Returned in a payment response only if the merchant has enabled FMF in the profile settings and one of the fraud filters was triggered based on those settings. For more information, see [Fraud Management Filters Summary](/docs/classic/fmf/integration-guide/FMFSummary/).
 */
@Model
public class FmfDetails {

    // Required default constructor
    public FmfDetails() {}

	/**
	* The filter description.
	*/
	@SerializedName("description")
	private String description;

	public String description() { return description; }
	
	public FmfDetails description(String description) {
	    this.description = description;
	    return this;
	}

	/**
	* REQUIRED
	* The filter ID.
	*/
	@SerializedName("filter_id")
	private String filterId;

	public String filterId() { return filterId; }
	
	public FmfDetails filterId(String filterId) {
	    this.filterId = filterId;
	    return this;
	}

	/**
	* REQUIRED
	* The filter type.
	*/
	@SerializedName("filter_type")
	private String filterType;

	public String filterType() { return filterType; }
	
	public FmfDetails filterType(String filterType) {
	    this.filterType = filterType;
	    return this;
	}

	/**
	* The filter name.
	*/
	@SerializedName("name")
	private String name;

	public String name() { return name; }
	
	public FmfDetails name(String name) {
	    this.name = name;
	    return this;
	}
}
