// This class was generated on Mon, 09 Apr 2018 18:13:17 UTC by version 0.1.0-dev+291f3f of Braintree SDK Generator
// PayerInformation.java
// @version 0.1.0-dev+291f3f
// @type object
// @data H4sIAAAAAAAC/+xaW2/buBJ+P79i4D6cBrAs22l70Ly16eVkizZBLrsP2cChxbE1W4pUyVEdddH/viAlXxTZ27ot3MXCLwE8Mx81Mxx+Qw7yZ+eyzLFz1MlFiXZEemJsJpiM7nQ7vwpLYqzwnci8SafbeYPl8scLdImlPBgfdS5ThLAIrCzS63Q7z6wVZfWVfrdzjkKealV2jiZCOfSCDwVZlAvBmTU5WiZ0naPrhX9CSovOtb0ak1Kkp6OlwdLJtq7tc20DtQ0YCy6lPF+VTYwF4aPLUPOPi8mxJT1th5QQl404akHbea8ALTL8Xqd0odTn7pc9M4VmW44SI7HpYVPR9vSaZyZKUmFFwmjh5OIUDgdPnkQD8JCbh7E0iYtJM05tKJ1YksWEY4uO43r5yNu6+AA4FQwkUTNNCB2wz0Vl4zfQ4tQX3+9Fv3+YjJVJ3n8oDGP4Xf1NHFujp5XknWE8qsTxqhwuV5b1nw6F8NqiYHhuiQVpIAcV0usr2Ovn9VpLEQgtQRtu2V69WWProHAogXSIi00eKfyICqTJ/Cf9flc1GdJQO9iDK4cBcHs8vG27fZySFjAzVskZ1bLEZLmwfn+h0InRbI1SKCG3lCA8PL46O4AMOTWyC2Oh30MirOyGYBJrnIvGxkq0wFZoJxK/ba7Oenw/7dsUKNvi2+pTkcZBozDnknZFTsg6Bq8HMwmJq497D14ZC3gnslxhF3SRjdF2wbFF5Cp6Z2BLcvuukIatkIZrQ3KYGC2/IiZXEKM/KSIXlj2r1WHuiEe0bxCKPoWTPnIsuGgy9waDdshzim4AoAL04By5sBolGK3KUPKhRTmYWJPBcys+kdpRyHlqdJMz55I1fdRrFoVHGq5f9gbDQ6j66s3DlDl3R3E8m816xEWPtOfJJL6Mzl8eR8E2Gvb7g/4wOolRH/TgrbijrMhAoZ5y6lnrcR8WdOx2lQPjWKh292jK1+Qj6AOXdWGWUhIi8OX9ifKK4nx1fyjoo1C+RcNlmVMilCrB1n7XhOdZ0XeMGXHqe/py5XAcdGOVC0S4XjFZZh51b0bvKUdJomfsNPa/4rNlHAc7Sqmv9GYy55I1PfhrWm2ALxptdfO5uggnKqTIZ32Zo2BgOMWV3Ppjt5Lz1eYA1GAlv4ukwSzoyuFymSO4fmanvsVrsY3TD8QcddCF6+qMb4UfB4gHHwst5HYfTwLEg0+0pO2w5BEBykKV20E9wkN/EbnQW0H/8AgPfYt3lJitsFmAePBlKkgJLbeCcw066PrKur7SxCjhwpu4rRYqnFhLco/64EhPFUbjknH3hMdevXo4a0H7bHqFPwTr+/Xt/0/fvhydno9+Oz1/c9uF29cnry5vv/Uusimem6+IaEyW05G8TzoN8bpHluUUZKCQigFCH65624lmtBq50t/vcWyMcj1CngSeTTlTsZ0kh4eHTx84DLQSPe49ObifscHTp/2o/ygaDG//8Y+jkIz/uvYjqR8tHknL6/yWj6UdRY+ZINUIey7ZHG+wWJZ8+/wOhv/b/aEND4ORf2U1wmmIN8dUPSt2+CZXYp23q9LNznqrXfqakZQK29425Zv9rex26XE9F5PN++pS2Pb1TJRnQkXCOZr6pwfqxJa5b2zVeOzkxa6uhkIVPJ/lrdwPV8WbU700+9Hu1tO10caR3hqLFffbyjUP4fsTPIksSLn97G4/u9vP7vazu/3sbj+728/u9rO7nzu7s5hQTqjXXN9bqnZivWLOFAtzEAyckltwx34KuZ9C7qeQ+ynkv2sK6YrJhO6ahDMX/c2TNpjsKuni7v7YYCHa7CKLOzh50YOLIs+N5Tl5LcYK839Cqa/24W6004BG7WJqyL8UWiixnxDfzef//AUAAP//
// DO NOT EDIT
package com.paypal.sdk.v1.payments;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * The payer information.
 */
@Model
public class PayerInformation {

    // Required default constructor
    public PayerInformation() {}

	/**
	* The billing address or shipping address for a payment.
	*/
	@SerializedName("billing_address")
	private Address billingAddress;

	public Address billingAddress() { return billingAddress; }
	
	public PayerInformation billingAddress(Address billingAddress) {
	    this.billingAddress = billingAddress;
	    return this;
	}

	/**
	* The birth date of the payer, in [Internet date format](https://tools.ietf.org/html/rfc3339#section-5.6). For example, `1990-04-12`.
	*/
	@SerializedName("birth_date")
	private String birthDate;

	public String birthDate() { return birthDate; }
	
	public PayerInformation birthDate(String birthDate) {
	    this.birthDate = birthDate;
	    return this;
	}

	/**
	* The payer's [two-character IS0-3166-1 country code](/docs/integration/direct/rest/country-codes/).
	*/
	@SerializedName("country_code")
	private String countryCode;

	public String countryCode() { return countryCode; }
	
	public PayerInformation countryCode(String countryCode) {
	    this.countryCode = countryCode;
	    return this;
	}

	/**
	* The payer's email address. Maximum length is 127 characters.
	*/
	@SerializedName("email")
	private String email;

	public String email() { return email; }
	
	public PayerInformation email(String email) {
	    this.email = email;
	    return this;
	}

	/**
	* The payer's first name.
	*/
	@SerializedName("first_name")
	private String firstName;

	public String firstName() { return firstName; }
	
	public PayerInformation firstName(String firstName) {
	    this.firstName = firstName;
	    return this;
	}

	/**
	* The payer's last name.
	*/
	@SerializedName("last_name")
	private String lastName;

	public String lastName() { return lastName; }
	
	public PayerInformation lastName(String lastName) {
	    this.lastName = lastName;
	    return this;
	}

	/**
	* The payer's middle name.
	*/
	@SerializedName("middle_name")
	private String middleName;

	public String middleName() { return middleName; }
	
	public PayerInformation middleName(String middleName) {
	    this.middleName = middleName;
	    return this;
	}

	/**
	* The PayPal-assigned encrypted payer ID.
	*/
	@SerializedName("payer_id")
	private String payerId;

	public String payerId() { return payerId; }
	
	public PayerInformation payerId(String payerId) {
	    this.payerId = payerId;
	    return this;
	}

	/**
	* The payer's phone number. Maximum length is 20 characters.
	*/
	@SerializedName("phone")
	private String phone;

	public String phone() { return phone; }
	
	public PayerInformation phone(String phone) {
	    this.phone = phone;
	    return this;
	}

	/**
	* The phone type.
	*/
	@SerializedName("phone_type")
	private String phoneType;

	public String phoneType() { return phoneType; }
	
	public PayerInformation phoneType(String phoneType) {
	    this.phoneType = phoneType;
	    return this;
	}

	/**
	* The payer's salutation.
	*/
	@SerializedName("salutation")
	private String salutation;

	public String salutation() { return salutation; }
	
	public PayerInformation salutation(String salutation) {
	    this.salutation = salutation;
	    return this;
	}

	/**
	* The shipping address details.
	*/
	@SerializedName("shipping_address")
	private ShippingAddress shippingAddress;

	public ShippingAddress shippingAddress() { return shippingAddress; }
	
	public PayerInformation shippingAddress(ShippingAddress shippingAddress) {
	    this.shippingAddress = shippingAddress;
	    return this;
	}

	/**
	* The payer's suffix.
	*/
	@SerializedName("suffix")
	private String suffix;

	public String suffix() { return suffix; }
	
	public PayerInformation suffix(String suffix) {
	    this.suffix = suffix;
	    return this;
	}

	/**
	* The payer's tax ID. Supported for the PayPal payment method only.
	*/
	@SerializedName("tax_id")
	private String taxId;

	public String taxId() { return taxId; }
	
	public PayerInformation taxId(String taxId) {
	    this.taxId = taxId;
	    return this;
	}

	/**
	* The payer's tax ID type. Supported for the PayPal payment method only.
	*/
	@SerializedName("tax_id_type")
	private String taxIdType;

	public String taxIdType() { return taxIdType; }
	
	public PayerInformation taxIdType(String taxIdType) {
	    this.taxIdType = taxIdType;
	    return this;
	}
}
