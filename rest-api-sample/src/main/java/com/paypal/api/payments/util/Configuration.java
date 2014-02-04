package com.paypal.api.payments.util;

import java.util.HashMap;
import java.util.Map;

public class Configuration {

	/**
	 * Returns a {@link Map} containing the clientID and clientSecret
	 * 
	 * @return {@link Map}
	 */
	public static Map<String, String> getClientCredentials() {
		Map<String, String> clientCredentials = new HashMap<String, String>();
		
		/*
		 * Real world applications may choose to store
		 * the clientID and clientSecret eg: database
		 */
		clientCredentials.put("clientID",
				"EBWKjlELKMYqRNQ6sYvFo64FtaRLRR5BdHEESmha49TM");
		clientCredentials.put("clientSecret",
				"EO422dn3gQLgDbuwqTjzrFgFtaRLRR5BdHEESmha49TM");
		return clientCredentials;
	}

	/**
	 * Returns a Map for dynamic configuration
	 * 
	 * @return {@link Map}
	 */
	public static Map<String, String> getConfigurationMap() {
		Map<String, String> configurationMap = new HashMap<String, String>();
		
		/*
		 * The 'mode' is the least parameter expected for
		 * dynamic configuration. However, the user may
		 * pass additional parameters through the configuration map
		 */
		configurationMap.put("mode", "sandbox");
		return configurationMap;
	}

}
