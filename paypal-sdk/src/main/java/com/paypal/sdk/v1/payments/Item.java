// This class was generated on Mon, 09 Apr 2018 18:13:17 UTC by version 0.1.0-dev+291f3f of Braintree SDK Generator
// Item.java
// @version 0.1.0-dev+291f3f
// @type object
// @data H4sIAAAAAAAC/8yUwWobMRCG732KQacEbG8TCgHfAr2UNI2Jk15CDmPt2DtYK21Go8ZLybsXdeutt8a0pcXkZObfkfg+jeSv5q5tyEwNK9VmZD6jMC4cfcI6p2Zkrqj9WbynaIUb5eDN1NxVBHkdlKTILk7MyFyKYNvt+XZkbgnLG+9aM12ii5SDp8RCZR/MJDQkyhTN9KGniSrsV/s8NomQt+2Aayfc53vQSojGtkJBqyTwYX4zfnd+dgHbZWBDSY8nRRlsLNgrrQTzBkXJQlYLoajFtnmcm2Nx+leqKukXU5+cexn9Vrfc0dk1HuYHh9LHE5inpgmiVELwroVlENCKYIbtDB002NbkFWrSKpT/OsY/lPP5Z9fqR3BAJ3+dwDVuuE41OPIrrYAjnJ1fQD/deCT2RtgO4bfJAXobovZTiKDPAUqyXOfDd2gpHudCPSX0yjp8PzvhAfptxwSuU1RYECA8V8ER+FQvSI4DH9dpwN3V+8hRg13Dmqhhv4LkWeFkfnV/2t/67HSki6K4GTB39YFjVty8ypeaxA0kunpf4v72I2joXNgvg9TY/ftcfkF2ecP8Ods02JIA+++FCvqINrdCxVGDtP9F7PHlzTcAAAD//w==
// DO NOT EDIT
package com.paypal.sdk.v1.payments;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * The item details.
 */
@Model
public class Item {

    // Required default constructor
    public Item() {}

	/**
	* REQUIRED
	* The [three-character ISO-4217 currency code](/docs/integration/direct/rest/currency-codes/).
	*/
	@SerializedName("currency")
	private String currency;

	public String currency() { return currency; }
	
	public Item currency(String currency) {
	    this.currency = currency;
	    return this;
	}

	/**
	* The item description. Supported only for the PayPal payment method.
	*/
	@SerializedName("description")
	private String description;

	public String description() { return description; }
	
	public Item description(String description) {
	    this.description = description;
	    return this;
	}

	/**
	* The item name. Maximum length is 127 characters.
	*/
	@SerializedName("name")
	private String name;

	public String name() { return name; }
	
	public Item name(String name) {
	    this.name = name;
	    return this;
	}

	/**
	* REQUIRED
	* The item cost. Supports two decimal places.
	*/
	@SerializedName("price")
	private String price;

	public String price() { return price; }
	
	public Item price(String price) {
	    this.price = price;
	    return this;
	}

	/**
	* REQUIRED
	* The item quantity. Must be a whole number.
	*/
	@SerializedName("quantity")
	private String quantity;

	public String quantity() { return quantity; }
	
	public Item quantity(String quantity) {
	    this.quantity = quantity;
	    return this;
	}

	/**
	* The stock keeping unit (SKU) for the item.
	*/
	@SerializedName("sku")
	private String sku;

	public String sku() { return sku; }
	
	public Item sku(String sku) {
	    this.sku = sku;
	    return this;
	}

	/**
	* The item tax. Supported only for the PayPal payment method.
	*/
	@SerializedName("tax")
	private String tax;

	public String tax() { return tax; }
	
	public Item tax(String tax) {
	    this.tax = tax;
	    return this;
	}

	/**
	* The URL to item information. Available to the payer in the transaction history.
	*/
	@SerializedName("url")
	private String url;

	public String url() { return url; }
	
	public Item url(String url) {
	    this.url = url;
	    return this;
	}
}
