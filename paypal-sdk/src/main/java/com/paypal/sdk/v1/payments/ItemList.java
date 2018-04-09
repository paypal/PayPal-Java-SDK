// This class was generated on Mon, 09 Apr 2018 18:13:17 UTC by version 0.1.0-dev+291f3f of Braintree SDK Generator
// ItemList.java
// @version 0.1.0-dev+291f3f
// @type object
// @data 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
// DO NOT EDIT
package com.paypal.sdk.v1.payments;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * An array of items that are being purchased.
 */
@Model
public class ItemList {

    // Required default constructor
    public ItemList() {}

	/**
	* An array of items that are being purchased.
	*/
	@SerializedName(value = "items", listClass = Item.class)
	private List<Item> items;

	public List<Item> items() { return items; }
	
	public ItemList items(List<Item> items) {
	    this.items = items;
	    return this;
	}

	/**
	* The shipping address details.
	*/
	@SerializedName("shipping_address")
	private ShippingAddress shippingAddress;

	public ShippingAddress shippingAddress() { return shippingAddress; }
	
	public ItemList shippingAddress(ShippingAddress shippingAddress) {
	    this.shippingAddress = shippingAddress;
	    return this;
	}

	/**
	* The shipping method used for this payment, such as USPS Parcel.
	*/
	@SerializedName("shipping_method")
	private String shippingMethod;

	public String shippingMethod() { return shippingMethod; }
	
	public ItemList shippingMethod(String shippingMethod) {
	    this.shippingMethod = shippingMethod;
	    return this;
	}

	/**
	* The shipping phone number, in its canonical international format as defined by the [E.164](https://en.wikipedia.org/wiki/E.164) numbering plan. Enables merchants to share payer’s contact number with PayPal for the current payment. The final contact number for the payer who is associated with the transaction might be the same as or different from the `shipping_phone_number` based on the payer’s action on PayPal.
	*/
	@SerializedName("shipping_phone_number")
	private String shippingPhoneNumber;

	public String shippingPhoneNumber() { return shippingPhoneNumber; }
	
	public ItemList shippingPhoneNumber(String shippingPhoneNumber) {
	    this.shippingPhoneNumber = shippingPhoneNumber;
	    return this;
	}
}
