package com.paypal.api.payments;

import com.paypal.base.rest.PayPalModel;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import lombok.Getter; import lombok.Setter;

@Getter @Setter
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class InputFields extends PayPalModel {

	/**
	 * Indicates whether the buyer can enter a note to the merchant on the PayPal page during checkout.
	 */
	private Boolean allowNote;

	/**
	 * Indicates whether PayPal displays shipping address fields on the experience pages. Valid value is `0`, `1`, or `2`. Set to `0` to display the shipping address on the PayPal pages. Set to `1` to redact shipping address fields from the PayPal pages. Set to `2` to not pass the shipping address but instead get it from the buyer's account profile. For digital goods, this field is required and value must be `1`.
	 */
	private Integer noShipping;

	/**
	 * Indicates whether to display the shipping address that is passed to this call rather than the one on file with PayPal for this buyer on the PayPal experience pages. Valid value is `0` or `1`. Set to `0` to display the shipping address on file. Set to `1` to display the shipping address supplied to this call; the buyer cannot edit this shipping address.
	 */
	private Integer addressOverride;

	/**
	 * Default Constructor
	 */
	public InputFields() {
	}

}
