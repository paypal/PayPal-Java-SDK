package com.paypal.api.payments;

import com.paypal.base.rest.PayPalModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class PotentialPayerInfo extends PayPalModel {

	/**
	 * Email address representing the potential payer.
	 */
	private String email;

	/**
	 * ExternalRememberMe id representing the potential payer
	 */
	private String externalRememberMeId;

	/**
	 * Account Number representing the potential payer
	 */
	private String accountNumber;

	/**
	 * Billing address of the potential payer.
	 */
	private Address billingAddress;

	/**
	 * Default Constructor
	 */
	public PotentialPayerInfo() {
	}
}
