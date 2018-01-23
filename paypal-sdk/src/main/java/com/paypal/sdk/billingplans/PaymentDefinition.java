// This class was generated on Tue, 23 Jan 2018 10:55:03 CST by version 0.1.0-dev+20fb1e of Braintree SDK Generator
// PaymentDefinition.java
// @version 0.1.0-dev+20fb1e
// @type object
// @data H4sIAAAAAAAC/+xXUWvkNhB+768Y/NSCY98dpYW8HZcW0nKX0AsHJRzJrDS21MqSK413a0r/e5G89nrjTbvXC/tw5GnxaDye75tP30p/ZTd9S9l5do19Q5bhgiptNWtnszz7gF7jytA7bGJOlmc/U797uKAgvG5T8nn2GtptDTnVyGGjtFAgick32lIA5TbgKiYLaCVUzqeIcbYGVgSiC+wa8qADCIW+JlnApRWmkxRShrZMfo0GkLfVH3kvHxbSA2DjOst5+qhLLaOBoHTbaltDRRTSEuOfFIosz157j/3AzYs8+4VQXlnTZ+cVmkAx8EenPckpcO1dS541hez8dmL1Tec9WdEvuRz62WN0Cu3zeqMIVhgI3Oo3EpwoQ2Og0hat0GhgjaajM08GmSRUmowMOYROKMAAKzRoBeW78XQ08BAcOPtJYNl3j2IN7LWtl0jFjoMd1llwifaWlSc6i5NDweTh8v3V2bevXn4P42sgnKSPXyvmNpyXpaQ1mdhT0WLfoimEa0rpRCijWGqPsXgptSfBpafA5VjoLBYK5TefyYLtjPk7/08q0qD2eBgjSxImqCmlgLe6VgwrArRpC9TkkxS2eZoCGP07wU/XvwIrZEBPYB0D960WaEwPVaRzUH7UEEgSukEzxQ/Wu3l3sasXupXUay1Jxh4csHJdQCtZhQJ+dD7tOL8lCmzXrMiDq6YvtQYFhUHC+8PMIRDB7eX7K4iT3s12s9kUOrjC+brUwZXKNVQGRivRyzAN8i4NslDcPMksP86m+WZwkLdOkjkg77R618TVsK/xBysP7NICxiYjPcf50HfPPnQU2GcjejaiL9KIHpumlnujTI/LOV5eRAJmR6JkTJ+77Y4UHMfleZPbwAG5zZqLkqHxDKlDdMUomNEun6T3YwgWvTD0wNzH0BLBTm2j0w3JgzC1TYdjihK0ATaaFSB4qjuD/uAROhDD/VDiHtjB/Yv707hEFTfQwjHn0SX4aXUU24hIW2ClwwzZiUHcjReHw2jmy0tYR186CvgQbRIE2uh5K4LaE8b/DlZo4eUraJyNLnUS8J/qDEv5ncgfbPyZt7oNLJtdtggx9zR8Hm9jB9qMuQX8gEKlvQ9NFxgUrimKyhAGBmfpX6wgHpby6fZq+hwQ2MeT14G5DR+avRxaErrS/+8K/iT/ZF/9AwAA//8=
// DO NOT EDIT
package com.paypal.sdk.billingplans;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * A payment definition, which determines how often and for how long the customer is charged. Includes the interval at which the customer is charged, the charge amount, and optional shipping fees and taxes.
 */
@Model
public class PaymentDefinition {

    // Required default constructor
    public PaymentDefinition() {}

	/**
	* REQUIRED
	* The base object for all financial value-related fields, such as balance, payment due, and so on.
	*/
	@SerializedName("amount")
	private Currency amount;

	public Currency amount() { return amount; }
	
	public PaymentDefinition amount(Currency amount) {
	    this.amount = amount;
	    return this;
	}

	/**
	* An array of shipping fees and taxes.
	*/
	@SerializedName(value = "charge_models", listClass = ChargeModel.class)
	private List<ChargeModel> chargeModels;

	public List<ChargeModel> chargeModels() { return chargeModels; }
	
	public PaymentDefinition chargeModels(List<ChargeModel> chargeModels) {
	    this.chargeModels = chargeModels;
	    return this;
	}

	/**
	* REQUIRED
	* The number of payment cycles. For infinite plans with a regular payment definition, set `cycles` to `0`.
	*/
	@SerializedName("cycles")
	private String cycles;

	public String cycles() { return cycles; }
	
	public PaymentDefinition cycles(String cycles) {
	    this.cycles = cycles;
	    return this;
	}

	/**
	* REQUIRED
	* The frequency of the payment in this definition.
	*/
	@SerializedName("frequency")
	private String frequency;

	public String frequency() { return frequency; }
	
	public PaymentDefinition frequency(String frequency) {
	    this.frequency = frequency;
	    return this;
	}

	/**
	* REQUIRED
	* The interval at which the customer is charged. Value cannot be greater than 12 months.
	*/
	@SerializedName("frequency_interval")
	private String frequencyInterval;

	public String frequencyInterval() { return frequencyInterval; }
	
	public PaymentDefinition frequencyInterval(String frequencyInterval) {
	    this.frequencyInterval = frequencyInterval;
	    return this;
	}

	/**
	* The ID of the payment definition.
	*/
	@SerializedName("id")
	private String id;

	public String id() { return id; }
	
	public PaymentDefinition id(String id) {
	    this.id = id;
	    return this;
	}

	/**
	* REQUIRED
	* The payment definition name.
	*/
	@SerializedName("name")
	private String name;

	public String name() { return name; }
	
	public PaymentDefinition name(String name) {
	    this.name = name;
	    return this;
	}

	/**
	* REQUIRED
	* The payment definition type. Each plan must have at least one regular payment definition and, optionally, a trial payment definition. Each definition specifies how often and for how long the customer is charged.
	*/
	@SerializedName("type")
	private String type;

	public String type() { return type; }
	
	public PaymentDefinition type(String type) {
	    this.type = type;
	    return this;
	}
}
