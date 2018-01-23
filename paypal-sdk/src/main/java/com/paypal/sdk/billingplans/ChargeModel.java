// This class was generated on Tue, 23 Jan 2018 10:55:03 CST by version 0.1.0-dev+20fb1e of Braintree SDK Generator
// ChargeModel.java
// @version 0.1.0-dev+20fb1e
// @type object
// @data H4sIAAAAAAAC/6xU32vUThB///4Vwz59hVyiIgj3JhahSn9giyClyNzu5HZ0sxtnJz2D+L/Lpm2ux1WstI/57Gb284v5ac7HnszSvPUoa4Kj5CiYynxCYVwFOsaunJrKfKBx+3FA2Qr3yimapTn3BNlz33NcQ0sEGB0o/gCObZIOy7XaVOaNCI7X7z2vzEdCdxLDaJYthkwF+D6wkJuBU0k9iTJls7zYMh1EKNpxnyV2aYi6w3WG9hmvMBOk1VeyCm0SwBCg5YjRMga4wjDQQiigkoOWKbhcQR6sB8ywwoDRUgU9jh1FBTdQNcnOCf5RrMrwR61ZheN6X6nderDVegfcV3uhXogW1qOgVRI4PDtZvHr54jXc/gY2Obr836v2edk0jq4oFE51j2OPobapa1yyueGotJYp1caxkNVGKGtzO2hRBuXm2SNdiEMIv6q/WjEFtePDLbJvwix1ulLDEa+9wqoUFiZVJFMVbu4xZQj8jeD96WdQjwooBDEp6NizxRBGaIudnCIGKB0CR5Y7DDN+77zz44PtvDysHF+xI1c4JFCfhozRqc81vEsC6gnkxiiIQ7cigdTOL/UBLeXrCu+GWUEmgovDsxMoSW+z3Ww2NedUJ1k3nFPjU0dNVowOxeU5yC9TkLXX7kmyvHxAmux2opw+93M8PCgGFF/s9drqytp67Ip5YOG0HN8leQPcU7c75EplqIKNZ+uB87Qek8xr82n8/e83AAAA//8=
// DO NOT EDIT
package com.paypal.sdk.billingplans;

import com.braintreepayments.http.annotations.Model;
import com.braintreepayments.http.annotations.SerializedName;
/**
 * The shipping fee and tax information.
 */
@Model
public class ChargeModel {

    // Required default constructor
    public ChargeModel() {}

	/**
	* REQUIRED
	* The base object for all financial value-related fields, such as balance, payment due, and so on.
	*/
	@SerializedName("amount")
	private Currency amount;

	public Currency amount() { return amount; }
	
	public ChargeModel amount(Currency amount) {
	    this.amount = amount;
	    return this;
	}

	/**
	* The ID of the charge model.
	*/
	@SerializedName("id")
	private String id;

	public String id() { return id; }
	
	public ChargeModel id(String id) {
	    this.id = id;
	    return this;
	}

	/**
	* REQUIRED
	* The charge model type, which is tax or shipping.
	*/
	@SerializedName("type")
	private String type;

	public String type() { return type; }
	
	public ChargeModel type(String type) {
	    this.type = type;
	    return this;
	}
}
