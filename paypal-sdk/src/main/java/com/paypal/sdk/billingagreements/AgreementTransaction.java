// This class was generated on Tue, 23 Jan 2018 17:16:08 CST by version 0.1.0-dev+20fb1e of Braintree SDK Generator
// AgreementTransaction.java
// @version 0.1.0-dev+20fb1e
// @type object
// @data H4sIAAAAAAAC/+xX32/kRAx+56+wwgsnpUmh/BD7VlEhFXTXqrc6CZVq15txNiMmMzmP0xLQ/e9oJvsrm60K6lHQaZ9Wsb22v8/+JpM/k2nXUDJJzpdMVJMVEEbrsRDtbJIm75A1Lgy9wTqEJWnyM3XbhwvyBesmBk+Scwt4KE8GNyQtW1JQOgbc9YEn5KLKkjQ5Z8au7+c0TW4I1ZU1XTIp0XgKhvetZlIbwzW7hlg0+WRyu0Hy2lnqQLqG4EFLBUXLTLbooHCK4H2LRpeaFNyjaWmMEGvXWhng3Jj20PZFIiJjoNQWbaHR9JlPmAxKQKzJKJ/Bj46Bfse6MZTCAg3aglJosItsqZZSQKvAO3D2H7Eh3D5KhhfWdjlGuSZlgHPHOEQ6rQhupWKik6JCxkKI4fLt1cnXX3353ZDguy8qkcZP8lzRPZnQU9Zg16DJClfnyhU+11ZoyRiS50ozFZIzecnXiU5CIp+/eiYLtjXmQ/okFes92PKwtoxJ2ECNIRm81stKYEGAFiIq4rgPqzhNHoz+jWD+0/Uvc5AKBZAJrJOwO7pAYzoouVcCGujFEYluDBYEigpdo9nEHM4+fXOxk923C6XvtSIVenIglWs9WiXVagulIuAVcWDbekEMrtzUipX9SqmD4abgieD28u0VhMn3s57k+cPDQ6a9yxwvc+1dXrmaci9oFbLym7nO4lyzSuqPMtq7neE+U/Ql0eyA8Afmo/iP4j+K/xMUvyU5JP6B+Sj+o/iP4v8/iv+x4TbYEc+oRm0GIx7ax4OOHri8CLxIHLwXVxM/9wPlb+5k354ND+OuV+Zx04vWa0veQ4j4jzr3gtL6Qdcb02N6EuhD1i0PvhnfBaWB9pNf29PTs6I18Zf6J6P7p/kPLpyrQmqewXSYArSHYuWOJ2woUceXRYUeFkS2Dy8p6CEKhsK5TJT1VfJ1mb2i18iig4RnN1S2VsXq59AgywEo0L9GtkV59afdkvxUSbJK2+VhlE3vBE8iJn5+P5Ftp+3pv9DsBVl9MPkmq4oRh9Pk61G/zOKKrmnmBetmsLwD83iBFa6XStcED1XYpT2wrohbrlLQFm4vrRBbkr1/lo5rlO3LU5wzPtMkZTxUK6lNzmVxdnb2/eeeYuKTb7JvX2UvSM4fztKYm5V1TE3EFbxrLczbJoCeBce8vxa9VPvbccy0GmLYd42BbN8CuwfTy3cebpuP9r5yHhhDuKOG/ncP1en68pHC/IbCfoZz47q/i84/Cra7D5/9BQAA//8=
// DO NOT EDIT
package com.paypal.sdk.billingagreements;

import com.braintreepayments.http.annotations.*;
/**
 * An agreement transaction. Returned for a transaction search.
 */
@Model
public class AgreementTransaction {

    // Required default constructor
    public AgreementTransaction() {}

	/**
	* REQUIRED
	* A type for all financial value-related fields. For example, balance, payment due, and so on.
	*/
	@SerializedName("amount")
	private MoneyTypeWithCurrencyCodeQualifiedValue amount;

	public MoneyTypeWithCurrencyCodeQualifiedValue amount() { return amount; }
	
	public AgreementTransaction amount(MoneyTypeWithCurrencyCodeQualifiedValue amount) {
	    this.amount = amount;
	    return this;
	}

	/**
	* REQUIRED
	* A type for all financial value-related fields. For example, balance, payment due, and so on.
	*/
	@SerializedName("fee_amount")
	private MoneyTypeWithCurrencyCodeQualifiedValue feeAmount;

	public MoneyTypeWithCurrencyCodeQualifiedValue feeAmount() { return feeAmount; }
	
	public AgreementTransaction feeAmount(MoneyTypeWithCurrencyCodeQualifiedValue feeAmount) {
	    this.feeAmount = feeAmount;
	    return this;
	}

	/**
	* REQUIRED
	* A type for all financial value-related fields. For example, balance, payment due, and so on.
	*/
	@SerializedName("net_amount")
	private MoneyTypeWithCurrencyCodeQualifiedValue netAmount;

	public MoneyTypeWithCurrencyCodeQualifiedValue netAmount() { return netAmount; }
	
	public AgreementTransaction netAmount(MoneyTypeWithCurrencyCodeQualifiedValue netAmount) {
	    this.netAmount = netAmount;
	    return this;
	}

	/**
	* The email ID of the customer.
	*/
	@SerializedName("payer_email")
	private String payerEmail;

	public String payerEmail() { return payerEmail; }
	
	public AgreementTransaction payerEmail(String payerEmail) {
	    this.payerEmail = payerEmail;
	    return this;
	}

	/**
	* The business name of the customer.
	*/
	@SerializedName("payer_name")
	private String payerName;

	public String payerName() { return payerName; }
	
	public AgreementTransaction payerName(String payerName) {
	    this.payerName = payerName;
	    return this;
	}

	/**
	* The current status of the transaction. Value is:<ul><li>`Completed`. The transaction is complete and the money has been transfered to the payee.</li><li>`Partially_Refunded`. A part of the transaction amount has been refunded to the payer.</li><li>`Pending`. The transaction is pending settlement.</li><li>`Refunded`. The transaction amount has been refunded to the payer.</li><li>`Denied`. The transaction has been denied.</li></ul>
	*/
	@SerializedName("status")
	private String status;

	public String status() { return status; }
	
	public AgreementTransaction status(String status) {
	    this.status = status;
	    return this;
	}

	/**
	* The date and time when the transaction occurred, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6).
	*/
	@SerializedName("time_stamp")
	private String timeStamp;

	public String timeStamp() { return timeStamp; }
	
	public AgreementTransaction timeStamp(String timeStamp) {
	    this.timeStamp = timeStamp;
	    return this;
	}

	/**
	* The time zone of the `update_time` field.
	*/
	@SerializedName("time_zone")
	private String timeZone;

	public String timeZone() { return timeZone; }
	
	public AgreementTransaction timeZone(String timeZone) {
	    this.timeZone = timeZone;
	    return this;
	}

	/**
	* The ID of the transaction.
	*/
	@SerializedName("transaction_id")
	private String transactionId;

	public String transactionId() { return transactionId; }
	
	public AgreementTransaction transactionId(String transactionId) {
	    this.transactionId = transactionId;
	    return this;
	}

	/**
	* The type of transaction. Typically, `Recurring Payment`.
	*/
	@SerializedName("transaction_type")
	private String transactionType;

	public String transactionType() { return transactionType; }
	
	public AgreementTransaction transactionType(String transactionType) {
	    this.transactionType = transactionType;
	    return this;
	}
}
