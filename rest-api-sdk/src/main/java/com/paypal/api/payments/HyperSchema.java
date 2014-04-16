package com.paypal.api.payments;

import com.paypal.core.rest.JSONFormatter;
import com.paypal.api.payments.Links;
import java.util.List;

public class HyperSchema  {

	/**
	 * 
	 */
	private List<Links> links;

	/**
	 * 
	 */
	private String fragmentResolution;

	/**
	 * 
	 */
	private Boolean readonly;

	/**
	 * 
	 */
	private String contentEncoding;

	/**
	 * 
	 */
	private String pathStart;

	/**
	 * 
	 */
	private String mediaType;

	/**
	 * Default Constructor
	 */
	public HyperSchema() {
	}


	/**
	 * Setter for links
	 */
	public HyperSchema setLinks(List<Links> links) {
		this.links = links;
		return this;
	}

	/**
	 * Getter for links
	 */
	public List<Links> getLinks() {
		return this.links;
	}


	/**
	 * Setter for fragmentResolution
	 */
	public HyperSchema setFragmentResolution(String fragmentResolution) {
		this.fragmentResolution = fragmentResolution;
		return this;
	}

	/**
	 * Getter for fragmentResolution
	 */
	public String getFragmentResolution() {
		return this.fragmentResolution;
	}


	/**
	 * Setter for readonly
	 */
	public HyperSchema setReadonly(Boolean readonly) {
		this.readonly = readonly;
		return this;
	}

	/**
	 * Getter for readonly
	 */
	public Boolean getReadonly() {
		return this.readonly;
	}


	/**
	 * Setter for contentEncoding
	 */
	public HyperSchema setContentEncoding(String contentEncoding) {
		this.contentEncoding = contentEncoding;
		return this;
	}

	/**
	 * Getter for contentEncoding
	 */
	public String getContentEncoding() {
		return this.contentEncoding;
	}


	/**
	 * Setter for pathStart
	 */
	public HyperSchema setPathStart(String pathStart) {
		this.pathStart = pathStart;
		return this;
	}

	/**
	 * Getter for pathStart
	 */
	public String getPathStart() {
		return this.pathStart;
	}


	/**
	 * Setter for mediaType
	 */
	public HyperSchema setMediaType(String mediaType) {
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