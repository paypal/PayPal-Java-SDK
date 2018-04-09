// This class was generated on Mon, 09 Apr 2018 18:13:18 UTC by version 0.1.0-dev+291f3f of Braintree SDK Generator
// RefundRequest.java
// @version 0.1.0-dev+291f3f
// @type object
// @data H4sIAAAAAAAC/+yYUYvcNhDH3/spBj+1h2/30hYK+xYohVDaHM2RlzQsWmlsD5UlZzTKnSn97sUr22uv98KFXJY87NOhmb/k0fxmtNL9m921DWabjLGIzmwZP0QMkuXZW8Wkdhb/VHXnz/Lsd2wPg18xaKZGyLtsk72ENB/6+assz14yqzatfpNnf6Eyr51ts02hbMDO8CESoxkNt+wbZCEM2ebdGJeqfXQn4hnth6hG0zy2uwqhUW2NTiBJcrgnqcCgKLLh+WINwuTKZaw6MqPT7SzaiXEZ7zupGPFaV4qVFmR49eb19c8/vvgFhmmgvcH336+N12FNTrBk1S2wNsSoZc0YZD2IrztxWP+wglvV3ioLxmMA5wVCbBrPAsraYWnCz0uJcDzKiIvW/pcfIdz26V6m5+A4ZOdgWyZHGUPdsNtHkoHa+SggC9Jfn21JhWzvWTWz8KfW5QY6L3ReKBBX8Id6oDrWYNGVUgEFeHEDI/qQw31FugJy2kaDYfN3vLn5SUe7/4tpZCmN3uBHdGCoJAmww8Iz7tNiUFOtLDSenKzSnPUwab7E3WfK7/3wPVV0pfrEz62HDXwhoqNie4xTpZyx5MptgThDdeRY0hoEF1hdyOm8QAOFT7P7E2Xouxql8ga8s+3qPGTJhcjK6TnWqXXJdPReoM6gdtg+TfZMUENFTZM8B6YT4xLp4LwQPduZOqR8ayjoxXXslPfT2GBQXjry2ztmQ9yJF2XnjA/GE2h7Z38XG7dCgnVYwatiP+pfDCNKsOR6TQ5SUYAmBdt2VXB1xf1erq4uXX4W8KIeZszTeIlb1MOFyDMQef8UJotOfLwNZz3YoSjRgPjhtYQIu3Yc8Ap+89y/5kMOjA1jQCdhL+lXkUrJZH6vHhb1TCW5dFh1C15q4kvf0k8pCTMBP39JT+3L8uj/cTORreCtshE7UArS58AXEMiVFq93rSAo21TKxRqZ9ATl2W78Hz1p3LpY75CPrv1HrlN3/70EkiTVMgWIoW8LVvqf/ocn/dh+8/lgVOGI+mh6FHhSzLg/z+n13f8AAAD//w==
// DO NOT EDIT
package com.paypal.sdk.v1.payments;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * A refund request.
 */
@Model
public class RefundRequest {

    // Required default constructor
    public RefundRequest() {}

	/**
	* The payment amount, with details.
	*/
	@SerializedName("amount")
	private Amount amount;

	public Amount amount() { return amount; }
	
	public RefundRequest amount(Amount amount) {
	    this.amount = amount;
	    return this;
	}

	/**
	* The refund description. Value is a string of single-byte alphanumeric characters.
	*/
	@SerializedName("description")
	private String description;

	public String description() { return description; }
	
	public RefundRequest description(String description) {
	    this.description = description;
	    return this;
	}

	/**
	* The invoice number that is used to track this payment. Value is a string of single-byte alphanumeric characters.
	*/
	@SerializedName("invoice_number")
	private String invoiceNumber;

	public String invoiceNumber() { return invoiceNumber; }
	
	public RefundRequest invoiceNumber(String invoiceNumber) {
	    this.invoiceNumber = invoiceNumber;
	    return this;
	}

	/**
	* The refund reason description.
	*/
	@SerializedName("reason")
	private String reason;

	public String reason() { return reason; }
	
	public RefundRequest reason(String reason) {
	    this.reason = reason;
	    return this;
	}
}
