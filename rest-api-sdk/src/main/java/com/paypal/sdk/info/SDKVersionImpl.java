package com.paypal.sdk.info;

import com.paypal.core.SDKVersion;

/**
 * Implementation of SDKVersion
 */
public class SDKVersionImpl implements SDKVersion {

    /**
	 * SDK ID used in User-Agent HTTP header
	 */
	private static final String SDK_ID = "rest-sdk-java";

	/**
	 * SDK Version used in User-Agent HTTP header
	 */
	private static final String SDK_VERSION = "0.8.0";

	public String getSDKId() {
		return SDK_ID;
	}

	public String getSDKVersion() {
		return SDK_VERSION;
	}

}
