package com.paypal.api.payments;

import com.paypal.base.rest.JSONFormatter;

public class DefinitionsLinkdescription  {

	/**
	 * a URI template, as defined by RFC 6570, with the addition of the $, ( and ) characters for pre-processing
	 */
	private String href;

	/**
	 * relation to the target resource of the link
	 */
	private String rel;

	/**
	 * a title for the link
	 */
	private String title;

	/**
	 * JSON Schema describing the link target
	 */
	private DefinitionsLinkdescription targetSchema;

	/**
	 * media type (as defined by RFC 2046) describing the link target
	 */
	private String mediaType;

	/**
	 * method for requesting the target of the link (e.g. for HTTP this might be "GET" or "DELETE")
	 */
	private String method;

	/**
	 * The media type in which to submit data along with the request
	 */
	private String encType;

	/**
	 * Schema describing the data to submit along with the request
	 */
	private DefinitionsLinkdescription schema;

	/**
	 * Default Constructor
	 */
	public DefinitionsLinkdescription() {
	}

	/**
	 * Parameterized Constructor
	 */
	public DefinitionsLinkdescription(String href, String rel) {
		this.href = href;
		this.rel = rel;
	}


	/**
	 * Setter for href
	 */
	public DefinitionsLinkdescription setHref(String href) {
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
	public DefinitionsLinkdescription setRel(String rel) {
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
	 * Setter for title
	 */
	public DefinitionsLinkdescription setTitle(String title) {
		this.title = title;
		return this;
	}

	/**
	 * Getter for title
	 */
	public String getTitle() {
		return this.title;
	}


	/**
	 * Setter for targetSchema
	 */
	public DefinitionsLinkdescription setTargetSchema(DefinitionsLinkdescription targetSchema) {
		this.targetSchema = targetSchema;
		return this;
	}

	/**
	 * Getter for targetSchema
	 */
	public DefinitionsLinkdescription getTargetSchema() {
		return this.targetSchema;
	}


	/**
	 * Setter for mediaType
	 */
	public DefinitionsLinkdescription setMediaType(String mediaType) {
		this.mediaType = mediaType;
		return this;
	}

	/**
	 * Getter for mediaType
	 */
	public String getMediaType() {
		return this.mediaType;
	}


	/**
	 * Setter for method
	 */
	public DefinitionsLinkdescription setMethod(String method) {
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
	 * Setter for encType
	 */
	public DefinitionsLinkdescription setEncType(String encType) {
		this.encType = encType;
		return this;
	}

	/**
	 * Getter for encType
	 */
	public String getEncType() {
		return this.encType;
	}


	/**
	 * Setter for schema
	 */
	public DefinitionsLinkdescription setSchema(DefinitionsLinkdescription schema) {
		this.schema = schema;
		return this;
	}

	/**
	 * Getter for schema
	 */
	public DefinitionsLinkdescription getSchema() {
		return this.schema;
	}

}
