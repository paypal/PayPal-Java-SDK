// This class was generated on Tue, 23 Jan 2018 17:16:08 CST by version 0.1.0-dev+20fb1e of Braintree SDK Generator
// LinkDescriptionObject.java
// @version 0.1.0-dev+20fb1e
// @type object
// @data H4sIAAAAAAAC/6yU0U/bMBDG3/dXnMweqJQmPIyN9Q2JSaChgUrZS4WUq3NtvDp28F3ooon/fXIMZVBNbNoe/fXO/n73XfNDzfqW1ESdG7eGE2IdTCvGO7hYfCMtKlNfMRhcWPqCTSxUmfpM/dPhlx41UbOaINBtRyzjQBaFKpifHs8+XRxfgTVuzTf7ReU1F9iawt9RuDO0KfZqFPLI46FklKtMHYeAfTJ3kKkpYXXhbK8mS7RMUbjtTKBqK1wG31IQQ6wm8y0WSzButUtRB1o+I3kQdmm0b1pLQiAYViRwPT3PYeahwTWBDLgJU6O1WSxfGJd+aUhqX8HGSA1SGx4GkIFxML+enoFQ08ZWWPrQoNzs1yItT4pCvLecG5Jl7sOqqKWxRVjq94cfDkY5nDltuyq9UL4tMyj3ywzQVVCOStA1BtRCgeO10AYat8FrYjZulUMkKiNrCYaHK9bUw2NAkdU7cgJSo6S8ALcjSIyJB4G7BceknQzyX2UmoXsRmeusvc9ezS2N9FlyW2k3u9PZ7PIxhfDwOMhvsvvXpftDgkD2mf103vU+j9NPBuPfUfqWXt2Qw49HR3tMOnaM340y2NRG18AU7ogBGdDB2cmwGDikm3LuHDYLs+p8x7aHarCyoLQeTA06MZrBLwchtuVwRQTz4ZsxfXDIT+42m01u0OHgDZnNyjXkhIvYO35EennMv0eM0f/Yo5v7Nz8BAAD//w==
// DO NOT EDIT
package com.paypal.sdk.billingagreements;

import com.braintreepayments.http.annotations.*;
/**
 * The request-related [HATEOAS links](/docs/api/overview/#hateoas-links).
 */
@Model
public class LinkDescriptionObject {

    // Required default constructor
    public LinkDescriptionObject() {}

	/**
	* REQUIRED
	* The complete target URL. To make the related call, combine the method with this link, in [URI template format](https://tools.ietf.org/html/rfc6570). Include the `$`, `(`, and `)` characters for pre-processing. The `href` is the key HATEOAS component that links a completed call with a subsequent call.
	*/
	@SerializedName("href")
	private String href;

	public String href() { return href; }
	
	public LinkDescriptionObject href(String href) {
	    this.href = href;
	    return this;
	}

	/**
	* The HTTP method required to make the related call.
	*/
	@SerializedName("method")
	private String method;

	public String method() { return method; }
	
	public LinkDescriptionObject method(String method) {
	    this.method = method;
	    return this;
	}

	/**
	* REQUIRED
	* The [link relation type](https://tools.ietf.org/html/rfc5988#section-4), which serves as an ID for a link that unambiguously describes the semantics of the link. See [Link Relations](https://www.iana.org/assignments/link-relations/link-relations.xhtml).
	*/
	@SerializedName("rel")
	private String rel;

	public String rel() { return rel; }
	
	public LinkDescriptionObject rel(String rel) {
	    this.rel = rel;
	    return this;
	}
}
