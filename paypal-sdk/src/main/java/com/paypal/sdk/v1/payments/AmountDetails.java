// This class was generated on Mon, 09 Apr 2018 18:13:17 UTC by version 0.1.0-dev+291f3f of Braintree SDK Generator
// AmountDetails.java
// @version 0.1.0-dev+291f3f
// @type object
// @data H4sIAAAAAAAC/+yWz6/TMAzH7/wVVo5TtTfEbTckLggBE0xcAE1e466W0iQvcdgq9P531PXHVvr0AIEmDj1V9teO7XyatN/Vtvak1gorl6zsNAmyiSpTnzAw7g29w6rRVabeUH0xXlHMA3thZ9VabUsC1JobEw10qwDuXRKQksBjXZEVaMssVaZehoB1W3yVqQ+E+r01tVoXaCI1jvvEgfTg2ATnKQhTVOvPQ9tRAtvDtN0DF7I7BvSjvq+90wEaFRoVCqIlvMUTV6kCQ/YgJXCE5yvISwyYC4WYwbHkvAS2uUma4vpLWq1e5Mmcn9RahlvrI30jC5oPLBH2VLhA523RlHOFBrxjK8s2565PGi+x/cPwo+vrYSEUfrfcXT/AXyKyyZiH7JecSrTasD3sCqIRqp+EKa0+YIbVtJy8d0FIQ+Ha7A3Wmya5O3cVSek0OGvq5W3Iso0poM3HWK+9U6aDOkMdQW2wPU32RlBjyd63yoXplXOKtBdnoje7U/st32mOefO5fZTWtfo0Nugj5xP5/12zMe3FCZox44vzEbSd2P2LDaOwUBWX8Lo4W4HuE0UZUIJh28VkICVH8G2zdfMWLBahm2WxmE/5TcALnkbMW3uKW/A0E/kHRL4+PPsBAAD//w==
// DO NOT EDIT
package com.paypal.sdk.v1.payments;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * The additional details about the payment amount.
 */
@Model
public class AmountDetails {

    // Required default constructor
    public AmountDetails() {}

	/**
	* The gift wrap fee. Maximum length is 10 characters, which includes:<ul><li>Seven digits before the decimal point.</li><li>The decimal point.</li><li>Two digits after the decimal point.</li></ul>
	*/
	@SerializedName("gift_wrap")
	private String giftWrap;

	public String giftWrap() { return giftWrap; }
	
	public AmountDetails giftWrap(String giftWrap) {
	    this.giftWrap = giftWrap;
	    return this;
	}

	/**
	* The handling fee. Maximum length is 10 characters, which includes:<ul><li>Seven digits before the decimal point.</li><li>The decimal point.</li><li>Two digits after the decimal point.</li></ul>Supported for the PayPal payment method only.
	*/
	@SerializedName("handling_fee")
	private String handlingFee;

	public String handlingFee() { return handlingFee; }
	
	public AmountDetails handlingFee(String handlingFee) {
	    this.handlingFee = handlingFee;
	    return this;
	}

	/**
	* The insurance fee. Maximum length is 10 characters, which includes:<ul><li>Seven digits before the decimal point.</li><li>The decimal point.</li><li>Two digits after the decimal point.</li></ul>Supported only for the PayPal payment method.
	*/
	@SerializedName("insurance")
	private String insurance;

	public String insurance() { return insurance; }
	
	public AmountDetails insurance(String insurance) {
	    this.insurance = insurance;
	    return this;
	}

	/**
	* The shipping fee. Maximum length is 10 characters, which includes:<ul><li>Seven digits before the decimal point.</li><li>The decimal point.</li><li>Two digits after the decimal point.</li></ul>
	*/
	@SerializedName("shipping")
	private String shipping;

	public String shipping() { return shipping; }
	
	public AmountDetails shipping(String shipping) {
	    this.shipping = shipping;
	    return this;
	}

	/**
	* The shipping fee discount. Maximum length is 10 characters, which includes:<ul><li>Seven digits before the decimal point.</li><li>The decimal point.</li><li>Two digits after the decimal point.</li></ul>Supported for the PayPal payment method only.
	*/
	@SerializedName("shipping_discount")
	private String shippingDiscount;

	public String shippingDiscount() { return shippingDiscount; }
	
	public AmountDetails shippingDiscount(String shippingDiscount) {
	    this.shippingDiscount = shippingDiscount;
	    return this;
	}

	/**
	* The subtotal amount for the items. If the request includes line items, this property is **required**. Maximum length is 10 characters, which includes:<ul><li>Seven digits before the decimal point.</li><li>The decimal point.</li><li>Two digits after the decimal point.</li></ul>
	*/
	@SerializedName("subtotal")
	private String subtotal;

	public String subtotal() { return subtotal; }
	
	public AmountDetails subtotal(String subtotal) {
	    this.subtotal = subtotal;
	    return this;
	}

	/**
	* The tax. Maximum length is 10 characters, which includes:<ul><li>Seven digits before the decimal point.</li><li>The decimal point.</li><li>Two digits after the decimal point.</li></ul>
	*/
	@SerializedName("tax")
	private String tax;

	public String tax() { return tax; }
	
	public AmountDetails tax(String tax) {
	    this.tax = tax;
	    return this;
	}
}
