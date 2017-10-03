package com.paypal.core;

import com.paypal.BuildConfig;

class UserAgent {

	static final String USER_AGENT;

	static {
		StringBuilder javaVersion = new StringBuilder();
		if (System.getProperty("java.version") != null
				&& System.getProperty("java.version").length() > 0) {
			javaVersion.append("v=")
					.append(System.getProperty("java.version"));
		}
		if (System.getProperty("java.vendor") != null
				&& System.getProperty("java.vendor").length() > 0) {
			javaVersion.append("; vendor=" + System.getProperty("java.vendor"));
		}
		if (System.getProperty("java.vm.name") != null
				&& System.getProperty("java.vm.name").length() > 0) {
			javaVersion.append("; bit=");
			if (System.getProperty("java.vm.name").contains("Client")) {
				javaVersion.append("32");
			} else {
				javaVersion.append("64");
			}
		}

		StringBuilder osVersion = new StringBuilder();
		if (System.getProperty("os.name") != null
				&& System.getProperty("os.name").length() > 0) {
			osVersion.append("os=");
			osVersion.append(System.getProperty("os.name").replace(' ', '_'));
		} else {
			osVersion.append("os=");
		}
		if (System.getProperty("os.version") != null
				&& System.getProperty("os.version").length() > 0) {
			osVersion.append(" "
					+ System.getProperty("os.version").replace(' ', '_'));
		}

		StringBuilder stringBuilder = new StringBuilder("PayPalSDK/"
				+ "PayPal-Java-SDK" + " " + BuildConfig.VERSION + " ");
		stringBuilder.append("(").append(javaVersion.toString());
		if (osVersion.length() > 0) {
			stringBuilder.append("; ").append(osVersion.toString());
		}
		stringBuilder.append(")");

		USER_AGENT = stringBuilder.toString();
	}
}
