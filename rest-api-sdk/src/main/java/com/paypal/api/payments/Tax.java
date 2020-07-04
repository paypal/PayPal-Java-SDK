package com.paypal.api.payments;

import com.paypal.base.rest.PayPalModel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter @Setter
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class Tax extends PayPalModel {

	/**
	 * The resource ID.
	 */
	private String id;

	/**
	 * The tax name. Maximum length is 20 characters.
	 */
	private String name;

	/**
	 * The rate of the specified tax. Valid range is from 0.001 to 99.999.
	 */
	private float percent;

	/**
	 * The tax as a monetary amount. Cannot be specified in a request.
	 */
	private Currency amount;

	/**
	 * Default Constructor
	 */
	public Tax() {
	}

	/**
	 * Parameterized Constructor
	 */
	public Tax(String name, float percent) {
		this.name = name;
		this.percent = percent;
	}
}
