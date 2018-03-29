// This class was generated on Thu, 29 Mar 2018 19:06:15 UTC by version 0.1.0-dev+2136c8 of Braintree SDK Generator
// Refund.java
// @version 0.1.0-dev+2136c8
// @type object
// @data H4sIAAAAAAAC/+xZT2/buBK/v08xcN+hCWQpfenf3AL0PTR43W2QuL1kA3skjS1uKFIlR3GERb/7gqIkW5abpmjW7cEngzNDamZ+M+SP9F+jSVXQ6GRkaF6qdBSMPqERGEv6HXMnHwWj/1O1GrwlmxhRsNBqdDKaZAR+JqTEKKQNR8Ho1Bis/LpHweiCMP2gZDU6maO05ASfS2Eo7QTnRhdkWJAdnVx1HmGuS8VDjzr5yq9ONPSuwConxeBNAlgKzh7fV8tGqMXQ16Q0hlRS9bxdEw79veLMEI2TDA0mTAbOLj+Mn//n2Stop0GiU7p+GqU6sZFQTAuDboEoFYYSjgxZjlrjsTO20UEI51ido4RUkwWlGWxZFNowoJTt0oK+LyVsyo2MqFLKL8EGhNMm3cP0rBSr7Kxkw+Rgmgo3dHF4M8BYlww8QPqfx3Yh5jxdGix67q9LhwE4LTgtzIlC+A3vRF7mIEktOANh4dkRdNDbAJaZSDIQKpFlSvbkj/Lo6DgpZf1LfiSFH13SLSlIxUKwhZjm2lCdlpQSkaOEQgvFoZ8TtZP6S0y+03yp2+/h3JXqAz8XtQH8IEQbxfY1nDJUqRRqMZ0T9aDaUAzRag32YDmX/X5BKcy1n93sKG3f5cSZTkErWYW7QVYoWxpUSR/WdekQ0067B7UHqoPtfmR3BKrNRFF4zQrTNeEQ0la5R3Rne2qb8mkqbDKgY9u098MGreW+I3+9bdaWMWtG2cd4JdwCbaNsuFgXimDKbQhn83pk6HNJljsoQQrV2ATAmbBQeGcrVwWHh6aJ5fBw3+U7AZ7xroe5Hw/hZrzbI/IIiFw/BJNBJ369DXs96KBYUAqs29sSEcRVNzAh/E+b5jZvAzBUGLKk2NYmzSqcIa/Nb6zbRbURC6H8ZuUW3NfEj96lH1ISCRZcGpqKtP/MsC4eFsfZW9B+H7YoCdigspg4A4jJHcseW9oV70sMIdOURd6n8335MI4UmQBVCs4Clhmp5nCpX6WWaMGvkAYgFFydKSajiDfmzbXJka+fZsyFPYki1lraUBDPQ20WUca5jMw8OT4+fvPEUp2m8Yvw5cGOkpOuhd1/LFmX3/M21ylC+ISyJMhLyxATWKEWksZx5bIhiwxVmZMRyVqb7uo21y/fb5ZtE9ta4W7dcF79hEjUrRYJTVWZx2Q2Lqcbqm031NoEHGcymNy4Xjx7C37GI0cghbqZrlXHVMd/UrLl0dUZ9t/pWkk/gFMF6NxzIDX8bmxIuv6Dq3enk/9+OL2Eemr7gomFiPQtmVtBy+hJhkwa7bg22eyul4//iJcZmvcfhbxgCEui80ISO7ZjFsTw8eJ9CBMNOd5QU48+zASlDJx57Ois0zSUvX56rnnt1ceLM5hQXrgZY7/3MKXf3H5evnh1dFCnzx/WhaFxYXRC1rVx0B6k9Udn/54FMHs6C+pNbnYwW+8DcBHNXKwz1yTO/oYqaAFysWpF7XlfgwHYpcDH6ONBR/atQ9pxDJRyRz3mc9qDrhMNwXs3mZy3MLTXCEdatoK3owgM9XmcH2/5R8Cl3zvoDmeuCvpmobx48/p1d049P2iJliVzSxbQAiq3p7h7GdbweqBLhXksFqUurayaUyMmXx+WclQsEtvuv74ML4ng6r1b4aLx0K68Wy6XoUCFtW9orVgod4e1kZs7bkPaHIZ3LozHOVofwp8KNKR42lywe5gMVPcdSO0NXasm3XWvrxMrYSFGuzNKZQjtBmHoRNu4glOtGP6m4z+DFDpquslrV7Jfn9RaRu7T2Vay5dHEafrkZkdelkW6lXr35d9Bva0uTUI1+ZZoGfxCvzADv/7yr78BAAD//w==
// DO NOT EDIT
package com.paypal.sdk.v1.payments;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * The refund details.
 */
@Model
public class Refund {

    // Required default constructor
    public Refund() {}

	/**
	* The payment amount, with details.
	*/
	@SerializedName("amount")
	private Amount amount;

	public Amount amount() { return amount; }
	
	public Refund amount(Amount amount) {
	    this.amount = amount;
	    return this;
	}

	/**
	* The ID of the sale transaction being refunded.
	*/
	@SerializedName("capture_id")
	private String captureId;

	public String captureId() { return captureId; }
	
	public Refund captureId(String captureId) {
	    this.captureId = captureId;
	    return this;
	}

	/**
	* The date and time when the refund was created, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6).
	*/
	@SerializedName("create_time")
	private String createTime;

	public String createTime() { return createTime; }
	
	public Refund createTime(String createTime) {
	    this.createTime = createTime;
	    return this;
	}

	/**
	* The refund description. Value must be single-byte alphanumeric characters.
	*/
	@SerializedName("description")
	private String description;

	public String description() { return description; }
	
	public Refund description(String description) {
	    this.description = description;
	    return this;
	}

	/**
	* The ID of the refund transaction. Maximum length is 17 characters.
	*/
	@SerializedName("id")
	private String id;

	public String id() { return id; }
	
	public Refund id(String id) {
	    this.id = id;
	    return this;
	}

	/**
	* The invoice or tracking ID number.
	*/
	@SerializedName("invoice_number")
	private String invoiceNumber;

	public String invoiceNumber() { return invoiceNumber; }
	
	public Refund invoiceNumber(String invoiceNumber) {
	    this.invoiceNumber = invoiceNumber;
	    return this;
	}

	/**
	* An array of request-related [HATEOAS links](/docs/api/overview/#hateoas-links).
	*/
	@SerializedName(value = "links", listClass = LinkDescriptionObject.class)
	private List<LinkDescriptionObject> links;

	public List<LinkDescriptionObject> links() { return links; }
	
	public Refund links(List<LinkDescriptionObject> links) {
	    this.links = links;
	    return this;
	}

	/**
	* The ID of the payment on which this transaction is based.
	*/
	@SerializedName("parent_payment")
	private String parentPayment;

	public String parentPayment() { return parentPayment; }
	
	public Refund parentPayment(String parentPayment) {
	    this.parentPayment = parentPayment;
	    return this;
	}

	/**
	* The reason that the transaction is being refunded.
	*/
	@SerializedName("reason")
	private String reason;

	public String reason() { return reason; }
	
	public Refund reason(String reason) {
	    this.reason = reason;
	    return this;
	}

	/**
	* The ID of the sale transaction being refunded.
	*/
	@SerializedName("sale_id")
	private String saleId;

	public String saleId() { return saleId; }
	
	public Refund saleId(String saleId) {
	    this.saleId = saleId;
	    return this;
	}

	/**
	* The state of the refund.
	*/
	@SerializedName("state")
	private String state;

	public String state() { return state; }
	
	public Refund state(String state) {
	    this.state = state;
	    return this;
	}

	/**
	* The date and time when the resource was last updated, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6).
	*/
	@SerializedName("update_time")
	private String updateTime;

	public String updateTime() { return updateTime; }
	
	public Refund updateTime(String updateTime) {
	    this.updateTime = updateTime;
	    return this;
	}
}
