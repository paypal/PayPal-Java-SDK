// This class was generated on Mon, 09 Apr 2018 18:13:17 UTC by version 0.1.0-dev+291f3f of Braintree SDK Generator
// PayeeDisplayMetadata.java
// @version 0.1.0-dev+291f3f
// @type object
// @data H4sIAAAAAAAC/7SUTY/TMBCG7/yKkS9lpThpFlSk3hDsYYX40FJxqVbVNJ42lhzbjB1KhPjvyN0m/QhISJRj3vHMPPOOnR9i0XkSc+GxI1opHbzBbtVQRIURRSa+IGtcG/qATTonMvGOuuPHWwoVax+1s2IuFjXBoYZ01nTQF4KNY4g1wb5PLjLxmhm7p+bTTDwQqo/WdGK+QRMoCV9bzaQG4RM7Txw1BTFfDtghsrbbMeaa0aqVTR+nwGfyGD3B8STAug3aUgiQTv4rrG2N+ZkNxL3FvnaWxuCX4SP7ZeT3+DQJsD8Btm3WxP/f6sq1NnK3qpw6B74IjHmXcedkVSNjFYnh/vNUvihnM1nCIRVS6uPzOkYf5kWh6BuZhJZ77DyavHJNoVwVCm0jbRlT7UJppioWTCEWhzoy1QnFDbjN8RJOQt/myhv+k1FPCzmzaJDG5mgrexdO95mBtrC8y8vZy4Oi7Ra8QZueWIPxaNdut8t1bHNtkxtVsZAPd2/kPlXeTstpWcr7m6vM/vgX01OD2pwN3yvj2fcRQKU4PcLTXwfn8B6/66ZtwJDdxhp0gPL2FQzXKFxpome/AAAA//8=
// DO NOT EDIT
package com.paypal.sdk.v1.payments;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * The display-only metadata for the payee.
 */
@Model
public class PayeeDisplayMetadata {

    // Required default constructor
    public PayeeDisplayMetadata() {}

	/**
	* The payer's business name.
	*/
	@SerializedName("brand_name")
	private String brandName;

	public String brandName() { return brandName; }
	
	public PayeeDisplayMetadata brandName(String brandName) {
	    this.brandName = brandName;
	    return this;
	}

	/**
	* The payee's phone number.
	*/
	@SerializedName("display_phone")
	private DisplayPhone displayPhone;

	public DisplayPhone displayPhone() { return displayPhone; }
	
	public PayeeDisplayMetadata displayPhone(DisplayPhone displayPhone) {
	    this.displayPhone = displayPhone;
	    return this;
	}

	/**
	* The email address for the payer. Maximum length is 127 characters.
	*/
	@SerializedName("email")
	private String email;

	public String email() { return email; }
	
	public PayeeDisplayMetadata email(String email) {
	    this.email = email;
	    return this;
	}
}
