// This class was generated on Mon, 09 Apr 2018 18:13:17 UTC by version 0.1.0-dev+291f3f of Braintree SDK Generator
// ApplicationContext.java
// @version 0.1.0-dev+291f3f
// @type object
// @data H4sIAAAAAAAC/7xWTW/jNhC991cMdNkW8Hq3LYoCBnpwYidxk7UN29ke2kKmyZHEhiJVkopXKfa/F0PKH4oTbBcpchmb5JCc9/hmRv8kq6bCZJAMq0pJzrw0OuVGe/zkk17ykVnJNgqnrCSnpJdcY3MYjNBxKyvalAySW4fgCwR2OArao8CiM7XlCN4Ar503pXxAqFhTovaQKbMF/FShlag5QmYsNKa2sKkbtK6f9JKhtayJsb7vJQtkYqZVkwwyphzSxN+1tCj2E3NrKrReoksGv+9ROm+lzk+BbSzTItU0OIbYme6CHYJiG1TgC+Zhdo/WSoEu4N/UTmp0DmgjSB0mP6DlBdP+jYM5a+ZMAePc1NqDiQ7tLC+Q35naQ8VydP3zglnGPVpQqHNfANMClCylD/y6AXz/w8/gpM4Vvt00HoGpqmC6LtFKDny3/cUc6lqpz70vEqmYFlLnKUXfofLRQpfMVYHgmwrBZNA6BvykFiFdpVjziCYnfZRJ7dDuSevDytBM8NRGv31E9fHZPXDo6YL1mVRK6nzd2f14p8mlfmb/Da2tX4tgw5l6RO1u6pTUuES0BjlFtR7B2yXgUe61fLs+DOGeKSnI1gjSwXp4u+7BergiezYOdkH2fBjsVbBTsqOwOl6SvTwjexE8J2Hv9IbsPNows6CTjYX17XJNN//0di9d4EaE65lypg2JXl4xndcBVUwxhxDeykp0A1gLlo6u6egC00m4SYp0MqI/f7H01zn90SadzuhP5dOIxNZpCGXt7tNlwOCLdBWAPRRpxPZQpFfXbbgPRbr67bXe3hWyqkISWczQ0nO5jhKecejqYlkhl1kDy9YZ5gfnwR/1+/c/8lqFX4wjJY9H9BpxPJ2ly6vJfD6ZXsald4c1gAUKxr2DXUzAhLBUFTOJSjjIrCm7UqR6BwvkpixRC9wJz8ekpCcXMpeeKciNEa7fXtoN77lgL8er9GIx+5BeTG7Gp+F+KzBjtfLfwSXGDDmJ26FC7lHApmnLfIOWylIHwFcFtRyv0vli9nEyGo/S4Wi0GC+XT1C5b6xtJJU191IcIinb3tKHsxCTdKCNB1JO6LcF03n3hG4xbamfZPuTQBh0+g11IeeA6f3GCLpgsdOZoKl4hzHu5I4vM/NuJ7VXSiFqFynjIRWOM6c7302YEWbUz2FboC/QEtzKoqO6edDBVlJzBjg32ktdI1B5IAJgarZwaOv0qdO/MBYifuet0XmkoHVuiTle6W6PnQeOQv6FckZ66M+ogm92IrAopI2a9eapsh/7GPu6WDa190bT+a4wW91v5SndTg7bAjVkUlP7LEP3lA7utNm2S3swkkq39JJRhPRh05gatiS/QLHhQextrLIsUZCraqCujG5hciX5XahiMeI+PE3u7l3+I7tdctsn3ReJl/G8fD6s5cuJpsw/Ipso3ZEcQuuAPWF9B+VI2S2kfWkIH2Yk9/CVGl+JHoCcWsD/SzL/+fmbfwEAAP//
// DO NOT EDIT
package com.paypal.sdk.v1.payments;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * Use the application context resource to customize payment flow experience for your buyers.
 */
@Model
public class ApplicationContext {

    // Required default constructor
    public ApplicationContext() {}

	/**
	* A label that Overrides the business name in the Merchant's PayPal account on the PayPal checkout pages.Character length and limitations: 127 single-byte alphanumeric characters.
	*/
	@SerializedName("brand_name")
	private String brandName;

	public String brandName() { return brandName; }
	
	public ApplicationContext brandName(String brandName) {
	    this.brandName = brandName;
	    return this;
	}

	/**
	* The type of landing page to display on the PayPal site for user checkout. To use the non-PayPal account landing page, set to `Billing`. To use the PayPal account login landing page, set to `Login`.
	*/
	@SerializedName("landing_page")
	private String landingPage;

	public String landingPage() { return landingPage; }
	
	public ApplicationContext landingPage(String landingPage) {
	    this.landingPage = landingPage;
	    return this;
	}

	/**
	* The locale of pages that the PayPal payment experience displays. A valid value is `AU`, `AT`, `BE`, `BR`, `CA`, `CH`, `CN`, `DE`, `ES`, `GB`, `FR`, `IT`, `NL`, `PL`, `PT`, `RU`, or `US`. A 5-character code is also valid for languages in these countries: `da_DK`, `he_IL`, `id_ID`, `ja_JP`, `no_NO`, `pt_BR`, `ru_RU`, `sv_SE`, `th_TH`, `zh_CN`, `zh_HK`, or `zh_TW`.
	*/
	@SerializedName("locale")
	private String locale;

	public String locale() { return locale; }
	
	public ApplicationContext locale(String locale) {
	    this.locale = locale;
	    return this;
	}

	/**
	* Specify Shipping Preferences:<ul><li><code>NO_SHIPPING</code>  Redacts shipping address fields from the PayPal pages. Recommended value to use for digital goods.</li><li><code>GET_FROM_FILE</code> (default) Get the shipping address selected by the buyer on PayPal pages.</li><li><code>SET_PROVIDED_ADDRESS</code>  Use the address provided by the merchant. Buyer is not able to change the address on the PayPal pages. If merchant doesn't pass an address buyer has the option to choose the address on PayPal pages.</li></ul>.
	*/
	@SerializedName("shipping_preferences")
	private String shippingPreferences;

	public String shippingPreferences() { return shippingPreferences; }
	
	public ApplicationContext shippingPreferences(String shippingPreferences) {
	    this.shippingPreferences = shippingPreferences;
	    return this;
	}

	/**
	* Defines whether to present the buyer with a  Continue  or  Pay Now  checkout flow.For <strong>Pay Now</strong> checkout flow, set  user_action=commit .Once buyer is redirected to the PayPal payment page, a <strong>Pay Now</strong> button is shown. Use this option when final amount is known when checkout is initiated and you want to process payment immediately upon buyer clicking Pay Now. For <strong>Continue</strong> checkout flow, set user_action=continue (default).Once buyer is redirected to the PayPal payment page, a <Strong>Continue</Strong> button is shown. Use this option when final amount is not known when you initiate the checkout flow and you want to redirect the buyer to the merchant page without processing the payment.
	*/
	@SerializedName("user_action")
	private String userAction;

	public String userAction() { return userAction; }
	
	public ApplicationContext userAction(String userAction) {
	    this.userAction = userAction;
	    return this;
	}
}
