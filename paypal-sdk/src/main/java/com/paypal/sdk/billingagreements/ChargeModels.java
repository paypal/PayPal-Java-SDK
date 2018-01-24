// This class was generated on Tue, 23 Jan 2018 17:16:08 CST by version 0.1.0-dev+20fb1e of Braintree SDK Generator
// ChargeModels.java
// @version 0.1.0-dev+20fb1e
// @type object
// @data H4sIAAAAAAAC/6yUT2vcPBDG7++nGHR6C167LYXC3kJDIS35QxMKJYRmVhqvh8qSM5KzMaXfvUi766yzKU1Jjh6PRjO/59H8VBdDR2quPjQoS4Jjb8gGVaivKIwLSyfYpt+qUJ9puP84pKCFu8jeqbk6AL0+3qbjUHsBhA6HllwEQzU7TpklPEjMvyhAaLjr2C2hJgJ0BiLeAbvaS4v5oCrUgQgO62ZfF+oLoTl1dlDzGm2gFLjpWciMgTPxHUlkCmp+OY557B0NEIeOYMWxAd2LkNMDaG8Ibnq0XDMZuEXb0z4GbH3v4gTGGHqIJF+SUVgLNTt0mtGuK8+ELEYyUDNZE0r46AXoDtvOUgELtOg0FfcIeyoyl+DhH2lE6f8II0Rht9yfcgtlMudOcDrpRUNwGRshmiVxUUcSODo/nb17++b9FPDV/02MXZhXlaFbsqmnssOhQ1tq31bG61Cxi7SULHtlWEjHSijEaltolgqF6tUzKbje2l/FX1FsfXDPYRvZhzCOmlNKOOZlE2GRHA15KpLsh00eUwDLPwiuP519u4bYYAQUAudj8g5rtHaAOgFl79BCflVr0J1FTWBIc4t2zHm8+sXJ4U710C8M37Ihk3ryEBvfB3QmNhsXxoZANuDA9e2CBHw93pVvDpsnPhG3gEAEl0fnp5CUX2s9r6rValVy8KWXZcXBV41vqQoRnUExYdT1e9a1bGL7ItJePUFcNhNl8+e+rEeHaf6EZXd3PXclPdF/aYlMmtwEHnHf7mJNWS9D8b/fAAAA//8=
// DO NOT EDIT
package com.paypal.sdk.billingagreements;

import com.braintreepayments.http.annotations.*;
/**
 * A charge model for a payment definition. A charge model defines shipping fee and tax information.
 */
@Model
public class ChargeModels {

    // Required default constructor
    public ChargeModels() {}

	/**
	* REQUIRED
	* A type for all financial value-related fields. For example, balance, payment due, and so on.
	*/
	@SerializedName("amount")
	private MoneyTypeWithCurrencyCodeQualifiedValue amount;

	public MoneyTypeWithCurrencyCodeQualifiedValue amount() { return amount; }
	
	public ChargeModels amount(MoneyTypeWithCurrencyCodeQualifiedValue amount) {
	    this.amount = amount;
	    return this;
	}

	/**
	* The ID of the charge model.
	*/
	@SerializedName("id")
	private String id;

	public String id() { return id; }
	
	public ChargeModels id(String id) {
	    this.id = id;
	    return this;
	}

	/**
	* REQUIRED
	* The charge model type.
	*/
	@SerializedName("type")
	private String type;

	public String type() { return type; }
	
	public ChargeModels type(String type) {
	    this.type = type;
	    return this;
	}
}
