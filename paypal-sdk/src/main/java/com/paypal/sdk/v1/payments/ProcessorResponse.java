// This class was generated on Mon, 09 Apr 2018 18:13:17 UTC by version 0.1.0-dev+291f3f of Braintree SDK Generator
// ProcessorResponse.java
// @version 0.1.0-dev+291f3f
// @type object
// @data H4sIAAAAAAAC/8SUQW8aPxDF7/9PMfLln0iU7ZkbSm+VWhSivUQRDPYQW/La7ox30abKd68MYVPYSI2aNj3yZvD6/TzzvqubPpGaqcRRk0jkFZOkGITURNXIDjeevmBTetREfab++ccnEs0uZReDmqkbSzCc8iFx7JwhA8fjQEdDAtliBrP/44YgWwJpN43LmQwk7BsKeQrLNqXIRYrB97CzFPat66eOVUPZRrMGJ7DWTMbllUY266maqDkz9gdXHyfqmtB8Db5Xsy16oSJ8ax2TGYQFx0ScHYma3Q48JLML92MGaDqnaVXMnOA41cdkGmJtMWQ4NEIMYOMOcgSLwXgCQ9q7QALbyMCkWy4XODKRtzoLrfePk1/b6+QFb8/i2Njt3BgmEaiJ3dZpLDVY9pKpgYt5vby8u7A5J5lVlaGOfLnTNGGf0E91bKodbTAleS5WJmqptEcRpytMrprXy+unMboqU1Rdno7VO8HRXTeG85P4Apyruv4r9uXA919QIO1Ww86eoDivvCofsM02sns4zM3R0Dt5OX5u/KznlbGXBfYL9BAiN+jdw3nUTWBnnbYlou4pEGOJsy3HZp9kA4j/BSSRLpvzhtfM3P4egC6hnPh+El71dLUTLBiIYd5mSyEP60+8T7mLejFfXoJkzO2fibC7x/9+AAAA//8=
// DO NOT EDIT
package com.paypal.sdk.v1.payments;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * The processor-provided response codes that describe the submitted payment. Supported only when the `payment_method` is `credit_card`.
 */
@Model
public class ProcessorResponse {

    // Required default constructor
    public ProcessorResponse() {}

	/**
	* The merchant advice on how to handle declines for recurring payments.
	*/
	@SerializedName("advice_code")
	private String adviceCode;

	public String adviceCode() { return adviceCode; }
	
	public ProcessorResponse adviceCode(String adviceCode) {
	    this.adviceCode = adviceCode;
	    return this;
	}

	/**
	* The [Address Verification System (AVS)](https://developer.paypal.com/webapps/developer/docs/classic/api/AVSResponseCodes/) response code.
	*/
	@SerializedName("avs_code")
	private String avsCode;

	public String avsCode() { return avsCode; }
	
	public ProcessorResponse avsCode(String avsCode) {
	    this.avsCode = avsCode;
	    return this;
	}

	/**
	* The [CVV](https://developer.paypal.com/webapps/developer/docs/classic/api/AVSResponseCodes/) system response code.
	*/
	@SerializedName("cvv_code")
	private String cvvCode;

	public String cvvCode() { return cvvCode; }
	
	public ProcessorResponse cvvCode(String cvvCode) {
	    this.cvvCode = cvvCode;
	    return this;
	}

	/**
	* The processor-provided authorization response.
	*/
	@SerializedName("eci_submitted")
	private String eciSubmitted;

	public String eciSubmitted() { return eciSubmitted; }
	
	public ProcessorResponse eciSubmitted(String eciSubmitted) {
	    this.eciSubmitted = eciSubmitted;
	    return this;
	}

	/**
	* REQUIRED
	* The PayPal normalized response code, which is generated from the processor's specific response code.
	*/
	@SerializedName("response_code")
	private String responseCode;

	public String responseCode() { return responseCode; }
	
	public ProcessorResponse responseCode(String responseCode) {
	    this.responseCode = responseCode;
	    return this;
	}

	/**
	* The processor-provided Visa Payer Authentication Service (VPAS) status.
	*/
	@SerializedName("vpas")
	private String vpas;

	public String vpas() { return vpas; }
	
	public ProcessorResponse vpas(String vpas) {
	    this.vpas = vpas;
	    return this;
	}
}
