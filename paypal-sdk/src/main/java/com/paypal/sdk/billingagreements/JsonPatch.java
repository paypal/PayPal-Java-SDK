// This class was generated on Tue, 23 Jan 2018 17:16:08 CST by version 0.1.0-dev+20fb1e of Braintree SDK Generator
// JsonPatch.java
// @version 0.1.0-dev+20fb1e
// @type object
// @data H4sIAAAAAAAC/7STT2vjQAzF7/spxJxN2LNvgT3tQhJ2w15KIcpYiaeMR1ONnGJKvnuZyT/cFEL/HfUkDb/nJz+b5RDJ1Ob3v/kMFqi2NZX5j+Jw7WmGXe6Zyvyh4VL8omTFRXUcTG2mUHZj3gVeP5BVUAaM0Q8QUdShhz42qJRyQyhxL5bSxFRmKoLDAeFnZf4SNvPgB1Nv0CfKwmPvhJqzsBCOJOoomfruDJ9UXNheg2+EuxH8UXjbALugJBlRWwLPFvMAuFBqRdmSQsO27ygo5KfgqXW2zRsd76iM7dD3NIETOGxYir7KEyvI9OXZz5oPvff76uYX4DjyX8qx+2VLF6psxXIXPSm9i1Cl/xhgRG1HiEfhVkR4MyDUSzwnT2XwuzI43P61xXISI48n5TqJ0jn/PhPI2kro1fFAw5QgsIIc+ACPh/cVju73P14AAAD//w==
// DO NOT EDIT
package com.paypal.sdk.billingagreements;

import com.braintreepayments.http.annotations.*;
/**
 * A JSON patch object to apply partial updates to resources.
 */
@Model
public class JsonPatch {

    // Required default constructor
    public JsonPatch() {}

	/**
	* A JSON pointer to the location in the target document from which to move the value. Required for the `move` operation.
	*/
	@SerializedName("from")
	private String from;

	public String from() { return from; }
	
	public JsonPatch from(String from) {
	    this.from = from;
	    return this;
	}

	/**
	* REQUIRED
	* The operation to complete.
	*/
	@SerializedName("op")
	private String op;

	public String op() { return op; }
	
	public JsonPatch op(String op) {
	    this.op = op;
	    return this;
	}

	/**
	* A JSON pointer to a location in the target document at which to complete the operation.
	*/
	@SerializedName("path")
	private String path;

	public String path() { return path; }
	
	public JsonPatch path(String path) {
	    this.path = path;
	    return this;
	}

	/**
	* The value to apply. The `remove` operation does not require a value.
	*/
	@SerializedName("value")
	private Object value;

	public Object value() { return value; }
	
	public JsonPatch value(Object value) {
	    this.value = value;
	    return this;
	}
}
