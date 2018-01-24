// This class was generated on Tue, 23 Jan 2018 17:16:08 CST by version 0.1.0-dev+20fb1e of Braintree SDK Generator
// AgreementStateDescriptor.java
// @version 0.1.0-dev+20fb1e
// @type object
// @data H4sIAAAAAAAC/6SPMUvEQBCFe3/FMHUQ63QHdoKKHjZiMSYvycLebJydFIvcf5fV3B3B8sr38XjzzTfvywxueTcacIA6vbo46B65szB7Mm74TSzIZ8SjHGqXG35AuYRTNyStS9RfMqWBfAJ1i1kdz7/jK5TTzVtueGcm5U/mruEXSP+ksXA7SMyo4GsJhv4Mni3NMA/I3L6f38huQcf/ypocG+0VbNX3E8ggOSkNybaOq3o3iY64VliXGI8fx5sfAAAA//8=
// DO NOT EDIT
package com.paypal.sdk.billingagreements;

import com.braintreepayments.http.annotations.*;
/**
 * A description of the current state of the agreement.
 */
@Model
public class AgreementStateDescriptor {

    // Required default constructor
    public AgreementStateDescriptor() {}

	/**
	* The reason for the agreement state change.
	*/
	@SerializedName("note")
	private String note;

	public String note() { return note; }
	
	public AgreementStateDescriptor note(String note) {
	    this.note = note;
	    return this;
	}
}
