package com.paypal.api.payments;

import com.paypal.core.rest.JSONFormatter;
import com.paypal.api.payments.HyperSchema;

public class Links  {

	/**
	 * 
	 */
	private String href;

	/**
	 * 
	 */
	private String rel;

	/**
	 * 
	 */
	private HyperSchema targetSchema;

	/**
	 * 
	 */
	private String method;

	/**
	 * 
	 */
	private String enctype;

	/**
	 * 
	 */
	private HyperSchema schema;

	/**
	 * Default Constructor
	 */
	public Links() {
	}

	/**
	 * Parameterized Constructor
	 */
	public Links(String href, String rel) {
		this.href = href;
		this.rel = rel;
	}


	/**
	 * Setter for href
	 */
	public Links setHref(String href) {
		this.href = href;
		return this;
	}

	/**
	 * Getter for href
	 */
	public String getHref() {
		return this.href;
	}


	/**
	 * Setter for rel
	 */
	public Links setRel(String rel) {
		this.rel = rel;
		return this;
	}

	/**
	 * Getter for rel
	 */
	public String getRel() {
		return this.rel;
	}


	/**
	 * Setter for targetSchema
	 */
	public Links setTargetSchema(HyperSchema targetSchema) {
		this.targetSchema = targetSchema;
		return this;
	}

	/**
	 * Getter for targetSchema
	 */
	public HyperSchema getTargetSchema() {
		return this.targetSchema;
	}


	/**
	 * Setter for method
	 */
	public Links setMethod(String method) {
		this.method = method;
		return this;
	}

	/**
	 * Getter for method
	 */
	public String getMethod() {
		return this.method;
	}


	/**
	 * Setter for enctype
	 */
	public Links setEnctype(String enctype) {
		this.enctype = enctype;
		return this;
	}

	/**
	 * Getter for enctype
	 */
	public String getEnctype() {
		return this.enctype;
	}


	/**
	 * Setter for schema
	 */
	public Links setSchema(HyperSchema schema) {
		this.schema = schema;
		return this;
	}

	/**
	 * Getter for schema
	 */
	public HyperSchema getSchema() {
		return this.schema;
	}

	/**
	 * Returns a JSON string corresponding to object state
	 *
	 * @return JSON representation
	 */
	public String toJSON() {
		return JSONFormatter.toJSON(this);
	}

	@Override
	public String toString() {
		return toJSON();
	}
}