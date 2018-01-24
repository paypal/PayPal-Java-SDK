// This class was generated on Tue, 23 Jan 2018 17:16:08 CST by version 0.1.0-dev+20fb1e of Braintree SDK Generator
// AgreementDetails.java
// @version 0.1.0-dev+20fb1e
// @type object
// @data H4sIAAAAAAAC/+xWTW/cNhC991cM1EsDaKW13SbN3gwEBdwicdAYBVrDWM+So9WgFKmQI9tCkf9eUNrVWpECJG1a++CjOMPhvPfmQ38lF21NySo53XqiiqyAJkE2IUmT39Azbgy9wSq6JGnyC7WHj1cUlOda2NlklVyUBPhxkCxJk1Pvse1fWabJr4T63Jo2WRVoAsWD9w170sPBW+9q8sIUktXlkF8Qz3Y7TUq1ylBYK1fVhoT0KMkZ4zRp21Qb8uAKqLHtku+vwXANCudBSg4HgP8WmG2M+ZB+LjpPFbLtPSbo7hu/AN1w7eHQFciG9HqX2Fq5xsoI4SccpijFCZp7WPuLe8jhASGyRTMA0Cg0BjhnnsLr3AYBoxug1SBc0Qy0FNjC5ZkV8pZm3CuUq+9KkTqs8lycMyFjkiJzfpuXUpncF+rk5OTlt4FUTGLxQ/b8WQY/OQ90h7EnUrg+Xh69WCxfLo5PLpY/rpbL1XL5x/VXJvW1s9SCtDXBLUsJqvGerGpBOU3wvkHDBZOGGzQNTbk3GGTgFqtJdc3bx+yf9s9HktGYTgirGE3/5sKTwW5AMBkdPuJogwatovQgXENpp0Rw4Oz/MBt3fI2nxuFwWmiXUnqihSrRoxLycPbufPH98dGLMfeH8tF0QybmlNXY1mgy5apcOxVytkJbjzF4rtmTktxTkHwfaBEDhfzZF9EgvvlnfbgvkQMP+5MpCQPUziWD17wtBTaxiaBDRb4riJ0fUwDDfxJc//z292uQEgXQE1gnsXhYoTEtFJFQdrGPYy1BT3RtUBFoUlyhGXzmo1+8eXUvemg2mm9Yk445OZDSNQGtlnJXhlIS+B1x9ybj/q3u5X4w4ljcFAIRXJ69O4eofK/1Ks9vb28zDq4bExxcXrqK8iBoNXodBl3Xna5ZKdVXkfbqM8QdNfJkxs5Zp6JHr0c3YZ8vjo7/0wn7KUYt3cl6w8aw3U4ZnbPO/HnQncDO6zHtrKPHvLNcI11LRWZ3+2NE/bz9aWc97aynnfWIdtbVh2/+BgAA//8=
// DO NOT EDIT
package com.paypal.sdk.billingagreements;

import com.braintreepayments.http.annotations.*;
/**
 * The agreement details.
 */
@Model
public class AgreementDetails {

    // Required default constructor
    public AgreementDetails() {}

	/**
	* The number of payment cycles completed for this agreement.
	*/
	@SerializedName("cycles_completed")
	private String cyclesCompleted;

	public String cyclesCompleted() { return cyclesCompleted; }
	
	public AgreementDetails cyclesCompleted(String cyclesCompleted) {
	    this.cyclesCompleted = cyclesCompleted;
	    return this;
	}

	/**
	* The number of payment cycles remaining for this agreement.
	*/
	@SerializedName("cycles_remaining")
	private String cyclesRemaining;

	public String cyclesRemaining() { return cyclesRemaining; }
	
	public AgreementDetails cyclesRemaining(String cyclesRemaining) {
	    this.cyclesRemaining = cyclesRemaining;
	    return this;
	}

	/**
	* The total number of failed payments for this agreement.
	*/
	@SerializedName("failed_payment_count")
	private String failedPaymentCount;

	public String failedPaymentCount() { return failedPaymentCount; }
	
	public AgreementDetails failedPaymentCount(String failedPaymentCount) {
	    this.failedPaymentCount = failedPaymentCount;
	    return this;
	}

	/**
	* The final payment date and time for this agreement, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6). For example, `2017-09-23T08:00:00Z`.
	*/
	@SerializedName("final_payment_date")
	private String finalPaymentDate;

	public String finalPaymentDate() { return finalPaymentDate; }
	
	public AgreementDetails finalPaymentDate(String finalPaymentDate) {
	    this.finalPaymentDate = finalPaymentDate;
	    return this;
	}

	/**
	* A type for all financial value-related fields. For example, balance, payment due, and so on.
	*/
	@SerializedName("last_payment_amount")
	private MoneyTypeWithCurrencyCodeQualifiedValue lastPaymentAmount;

	public MoneyTypeWithCurrencyCodeQualifiedValue lastPaymentAmount() { return lastPaymentAmount; }
	
	public AgreementDetails lastPaymentAmount(MoneyTypeWithCurrencyCodeQualifiedValue lastPaymentAmount) {
	    this.lastPaymentAmount = lastPaymentAmount;
	    return this;
	}

	/**
	* The last payment date and time for this agreement, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6). For example, `2016-12-23T08:00:00Z`.
	*/
	@SerializedName("last_payment_date")
	private String lastPaymentDate;

	public String lastPaymentDate() { return lastPaymentDate; }
	
	public AgreementDetails lastPaymentDate(String lastPaymentDate) {
	    this.lastPaymentDate = lastPaymentDate;
	    return this;
	}

	/**
	* The next billing date and time for this agreement, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6). For example, `2017-01-23T08:00:00Z`.
	*/
	@SerializedName("next_billing_date")
	private String nextBillingDate;

	public String nextBillingDate() { return nextBillingDate; }
	
	public AgreementDetails nextBillingDate(String nextBillingDate) {
	    this.nextBillingDate = nextBillingDate;
	    return this;
	}

	/**
	* A type for all financial value-related fields. For example, balance, payment due, and so on.
	*/
	@SerializedName("outstanding_balance")
	private MoneyTypeWithCurrencyCodeQualifiedValue outstandingBalance;

	public MoneyTypeWithCurrencyCodeQualifiedValue outstandingBalance() { return outstandingBalance; }
	
	public AgreementDetails outstandingBalance(MoneyTypeWithCurrencyCodeQualifiedValue outstandingBalance) {
	    this.outstandingBalance = outstandingBalance;
	    return this;
	}
}
