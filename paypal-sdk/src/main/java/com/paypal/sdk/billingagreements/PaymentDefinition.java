// This class was generated on Tue, 23 Jan 2018 17:16:08 CST by version 0.1.0-dev+20fb1e of Braintree SDK Generator
// PaymentDefinition.java
// @version 0.1.0-dev+20fb1e
// @type object
// @data H4sIAAAAAAAC/+xXUWvcRhB+768Y9NTCWUpCaeHeTE3BLY5NYwLFBN/c7uh26GpXmV35Ikr/e1npJOtOZ2oT1y/xk63Z0ex833zzyf47u25rypbZFbYVuQhnVLLjyN5li+wjCuPa0nusUk62yH6n9v7hjIISrrvkZXYKenwXSi+AILRpLAp4gSiMFur+ljxbZKci2PaXv1lkfxDqS2fbbFmiDZQCnxsW0mPgSnxNEplCtrwZ277wjlqIbU2w5WhANSLkVAvKa4LPDVoumTTcoW1ojggr37i4h2sMHaLrLulwWQslO3QqQeoqnwhZjKShZLI65PCrF6AvWNWWFrBGi07RYoAPuqEFoNMQPHj3JDaiNA+SEaKw28xRDqTs4ZwE95FeG4KbaIToRBkUVJEEzj9cnvz47u3P+wR/+t7EWIdlUWi6I5t6ymtsa7S58lWhvQoFu0gbwVS80CykYiEUYjEUOkmFQvHDV7LgGmv/WfwnFYMO7nkYInMSRqhdSg4XvDER1gTooENF0ulhl8cUwPJfBKvfrv5cQTQYAYXA+Zi0wwqtbaFMhLJ3aKFbkZ7o2qIi0KS4QjvmHK9+/f5sUj00a813rEmnnjxE45uATkezU2E0BLIjDlxTrUnAl+Nd3c1ht697w11AIIKb8w+XkCbfz3pZFNvtNufgcy+bgoMvjK+oCBGdRtFhnOttN9fcxOpZRvtpMtxfDMqG4MJrsuGI3Lvj22o4nmj+4ORgxR1g6jLREwzXNbsNlETdpkb8AuxKLxWOo4mGw8T0DmD+9Opqz+Pxr7b2amvfgq09NFzWe5PtHudjPT9L+BMtvctB53Jfu4WP1F9ykb0md4Ej6ps015nPs3T4GBpVqywdfA+G0LzPe0kN9tYnA7uZ73eCZNc9U5KeC71v3/8FPHrk+FbSYYRVX3UF0cPqzepl3KJMizNzzml0zsd4OqhsQHSEj5cFcZtMS+7QHkczPZ7DGg4BI2wNK9NvUBOir0iAw06wOoePyS5BoUvOtybYCGH6hkSDDt6+g8q75E4vAv6pljCXXw6nR6L9rxT+x//dHonQpR9TjLvAHOURFCn3ZQbxeOM70uaT7e/Bj8h3/wIAAP//
// DO NOT EDIT
package com.paypal.sdk.billingagreements;

import java.util.List;

import com.braintreepayments.http.annotations.*;
/**
 * A definition for a regular or trial payment.
 */
@Model
public class PaymentDefinition {

    // Required default constructor
    public PaymentDefinition() {}

	/**
	* REQUIRED
	* A type for all financial value-related fields. For example, balance, payment due, and so on.
	*/
	@SerializedName("amount")
	private MoneyTypeWithCurrencyCodeQualifiedValue amount;

	public MoneyTypeWithCurrencyCodeQualifiedValue amount() { return amount; }
	
	public PaymentDefinition amount(MoneyTypeWithCurrencyCodeQualifiedValue amount) {
	    this.amount = amount;
	    return this;
	}

	/**
	* An array of shipping fee and tax information for this definition.
	*/
	@SerializedName(value = "charge_models", listClass = ChargeModels.class)
	private List<ChargeModels> chargeModels;

	public List<ChargeModels> chargeModels() { return chargeModels; }
	
	public PaymentDefinition chargeModels(List<ChargeModels> chargeModels) {
	    this.chargeModels = chargeModels;
	    return this;
	}

	/**
	* REQUIRED
	* The number of payment cycles in this definition. For infinite plans with a regular payment definition, set `cycles` to `0`.
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
	* The ID of the payment definition. A payment definition defines a regular or trial payment.
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
	* The payment definition type.
	*/
	@SerializedName("type")
	private String type;

	public String type() { return type; }
	
	public PaymentDefinition type(String type) {
	    this.type = type;
	    return this;
	}
}
