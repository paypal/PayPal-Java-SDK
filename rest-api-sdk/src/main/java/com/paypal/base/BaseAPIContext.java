package com.paypal.base;

import java.util.HashMap;
import java.util.Map;

import com.paypal.base.message.XMLMessageSerializer;

public class BaseAPIContext {
	
	private Map<String, String> HTTPHeaders;
	
	private Map<String, String> configurationMap;
	
	private XMLMessageSerializer SOAPHeader;
	
	public BaseAPIContext() {
		
	}

	/**
	 * @return the hTTPHeaders
	 */
	public Map<String, String> getHTTPHeaders() {
		return HTTPHeaders;
	}

	/**
	 * @param httpHeaders the httpHeaders to set
	 */
	public void setHTTPHeaders(Map<String, String> httpHeaders) {
		HTTPHeaders = httpHeaders;
	}
	
	/**
	 * @param httpHeaders the httpHeaders to set
	 */
	public void addHTTPHeaders(Map<String, String> httpHeaders) {
		if (HTTPHeaders == null) {
			HTTPHeaders = new HashMap<String, String>();
		}
		for (Map.Entry<String, String> entry : httpHeaders.entrySet())
		{
		    HTTPHeaders.put(entry.getKey(), entry.getValue());
		}
	}

	/**
	 * @return the configurationMap
	 */
	public Map<String, String> getConfigurationMap() {
		return configurationMap;
	}

	/**
	 * @param configurationMap the configurationMap to set
	 */
	public void setConfigurationMap(Map<String, String> configurationMap) {
		this.configurationMap = configurationMap;
	}

	/**
	 * @return the sOAPHeader
	 */
	public XMLMessageSerializer getSOAPHeader() {
		return SOAPHeader;
	}

	/**
	 * @param soapHeader the soapHeader to set
	 */
	public void setSOAPHeader(XMLMessageSerializer soapHeader) {
		SOAPHeader = soapHeader;
	}
	
}
