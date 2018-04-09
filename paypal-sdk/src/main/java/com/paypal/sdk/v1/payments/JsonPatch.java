// This class was generated on Mon, 09 Apr 2018 18:13:17 UTC by version 0.1.0-dev+291f3f of Braintree SDK Generator
// JsonPatch.java
// @version 0.1.0-dev+291f3f
// @type object
// @data H4sIAAAAAAAC/7STwYrbQAyG730KMWcTevat0FMLSWlDL6U0yliJJ4xHU42cYkrefZlJ4uA1y7Kb3eP8ksz3Ifm/WQ+RTG0OicOfiGpbU5mfKA63npbY5ZqpzFcabo/PlKy4qI6Dqc26JfjyY7WEMg28PZBVUAaM0Q8QUdShhz42qJRyQShxL5bSwlTmkwgOZ4iPlflO2KyCH0y9Q58oB397J9SMwTfhSKKOkql/jfhJxYX9HH0n3E3wL8FTCuyCkmRIbQkUZU8KDdu+o6Dg2WIegfwV+Nc62+bWjo9U+o/oe1rAlRl2LCXf5I4NZPAyf6936L0/Vc/Kc5yol+dcfKTKKpa76EnpRYQq/esAI2o7QbwEd24H9babq1CZeK8FnG9+7lfuYSJ4TeaGpTL+NgvI2Ubo0eVAw5QgsIKc+QAvV/cWRr9PHx4AAAD//w==
// DO NOT EDIT
package com.paypal.sdk.v1.payments;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * The JSON patch object to apply partial updates to resources.
 */
@Model
public class JsonPatch {

    // Required default constructor
    public JsonPatch() {}

	/**
	* The JSON pointer to the target document location from which to move the value. Required for the `move` operation.
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
	* The JSON pointer to the target document location at which to complete the operation.
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
