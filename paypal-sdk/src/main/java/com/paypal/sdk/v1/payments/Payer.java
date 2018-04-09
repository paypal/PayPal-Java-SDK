// This class was generated on Mon, 09 Apr 2018 18:13:17 UTC by version 0.1.0-dev+291f3f of Braintree SDK Generator
// Payer.java
// @version 0.1.0-dev+291f3f
// @type object
// @data H4sIAAAAAAAC/+xcbXPbNvJ///8UO8p/pnFGEm3noY1n7kUSp62uTeOx5XZu3IwEkSsRNQgwAGhZubnvfrMASZEilViJo7Y3fJMJF1hgH4DF7g+w/t0br1LsnfRStkLd6/d+ZZqzmcBfWELkXr/3E67WH6doQs1Ty5XsnfTGMYJjHEL5X5hnMjJg/XeC0g57/d4LrdnKT3XY750ji95KseqdzJkwSIT3GdcYlYQzrVLUlqPpnVyVQn6fyYjLBYyksTqjsZsSz32fCS/7mJoS7e11vV5IYCQwqDkwMFwuBELOCGtGmCvtFA0zrem7UBh+ZYJHoKRYAZMR6Fy9NYPGiFsImY4KJkjQxirylvSzJ5mxwGUosggBuY1RA4OpZ54Q8xSUrhEmVl2jnIKa/YGhHcJo7ubz44VKWsalgURpBBszCUpiRaF+1W3ADUQYCi4x2nDhs893YUXWpu/qjWuf1el1X51iqjFkFnPTVU0boWVcmCH8S2UQMgmZIb25qTrRKudaYGv3XRpcf/qhiAFZdH9rmUWRRmOaRphxIWiBrjusDdFsa27IvA/kfWiFmJinaZVG65Dd//40VnO5aPErt6u6Qz2hKTw1gGQJfqlQMhPiP/1PS6YyafVqEqoI6xLWG5qSXtmlGoQx0yy0qGF08RYeHz17NjgCYnn3MIhUaAIuLS40I74g4hpDG2g0NsiHH1BfExzQZrTAI5SWzzn68Jn3IQdqXHAlh79nh4ePw5lQ4fX7TFl03/7f0Fit5MJTflEWTzw5qNL9BsmHpandQvhBI7PwUnMKDrTrPSe1e7YfXuZjrUkurEllG30vf2rpa2jj0R5yelmVDgTeoIBIJTQl+dvksZHZQkC/DYlh+up42hT7Vcwlg6XSIlrynBaqJGWa/AuZpHCnlRAYQap5iPDw1eXZQR5n+zBj8trt7b5TJtTKmMFM6Qg1WM2kYSG5zeRWDzbNvssCtTr7vPVJ0feotjALSnNFzrk2Fqidzi0X9v12H8L3SgPesiQV2AeZJTPUfTBWI1qvvVGg5HBvKh03VDpuVclgqGR0B51Mxi3STmEp09aFba/mnuKIVDphgn9wO31iLLNZPXJv6dBUuQjRNQbwDEM4R5tpiXluQUveJV0G5lol8FKzD1zsSeU0VrIeMwtKS5JILeXC4xKuXg+Pjh+TAgmz7x7G1qbmJAiWy+WQ22zIJcXJMBgPzl+/Gri+g+PDw6PD48EoQHkwhDfslidZAgLlwsYUtZ4eQhmOzb5soIxlonl61Okt9nDtLpb1YRnz0GlAy/sDT32Io9X9PuM3TLiUZLxKeciEWNWTSR8V6cRYchvTmb4e2W0HWRvlAhGuKl3Wlkc5XPJrnmLE2VDpRUBfwdlaj4M9mZRWet2YBaXlDL7LUevYy4PWZz6XF25HOROR1dc2ch2US7VL29K2qybwlcMBeC0qgUstXVbtw5XB9TAncPVCL+iIl2wXoR+wguugD1d+j+/EP3MsxPyKSRbtNnnoWIh5JCO+Gy8nDsdqmVjtxkocxPpPljK5E+sfxEGsb/CWh2on3sSxEPM4ZlwwGe3EbnOmgz6trKtLyS1GcEFdzE4DZYa1Brknh3k5OpitLO4/4Flqrm7OnNDcm9Tg6ufW83r649s3rydvzye/vT3/adqH6Q+j78fTz81Ftunz7i4VwM1NPRvJCS0axRpx4OpFlelBxBdFnXlD5b4/qMl/9+wLt2DawBm8TbnGSaKkjWsqbDQ0VXEdvMCukz89pAKBzIEcH1ArB2NkSMvOZRfToykpPz06nt5vpvgpBVfIdJt+Ob0lE177p6Ipdd9Piusy8QmVNXXoqUpuqX1pKcVKRKi/MXk2v8dSWLA2mavUT4lMfb+GxILL60m0nnzi0a3W0uLabJYW1x/H9yidQmMHGgWjYH3144vx67cvLsCxFkGbpTxQN6hvOC6DBzGzqJgZuC4H9weObXNNrHFeUysntDhEUXy1CJaSBguX5z8PYawgYde+li7UpFyyT91nVFtRi6+LfSRwGNnV5fkIxpikxDHwqbrFaJ0zWqWEGXK0c5cxxjYRgZ6Hz55+e3jgzOeDfqpxkGoVoqGjq18imq60/38K/g/zyD89mFaPNAdXTEnXaZEeX+MKCgeRrko6CC9m1vsLWGkCr2ORF5tsZsjTDs8T+6qRvE1rritJTef9OB6fFW4os3y7xXl70kCjqInvv1tScTK/F5BiLZ3+n1woT59/990Dgy6THjw5KCohg/oGDTBD1cvoNE/Z3fjO0ZlkyYwvMpUZsQIfF2Y5ZmYwYdLy0BRwgV+Gru75mUY4zyU0G0Unk77sYcbwhXTXAgHxDgqVNj+Ht6TGwd7yFF881zGFgtQSByooeA6ErE9zmSWoeVjZah5OKJIAk7IQHXCcZjK0mVN4CG8yYyFUkiIBLUsXNFSUCeU2b56klgt3tgJkYVwThZbFEB6dY0TzOkRQo0mVNGiGj/ZyNt89g20KXlpwesMNo8iVMGNRu6uYPkwjbkI6JaYu/Z+yBG+nQzhVDin1dw9UEQq1JB6DlDhmOfQZcZMKtrqPBKW6nBp3Qx+9dSm7tN69lK0tuTG18A8Um778/uXr30dUdOJbr5p8U1PX0SkFl9rqcOi9AWOVXuPcZ2x1xgTcsEzYO0P3oyRV2jJpt+L3ZMM8uOUznL++GDeA+CC3pmni8S/ORobMzsIQU9t2GemADKpKNQ/dzdrIX3/1YZV78mO8FEdy8TNRVVTw6hcDOtr/8Xtva11cjBgsXIpWfv7eyy8miAwbirJcy/zgb52L0jnnl+CB12DgHB5qZBaL0XfzcH32/Kuu8Bb1q+fQTDMurUYslBqGKglSraIstCYomwfeQoWoLws6nHr6vQiTslXKhJMgM8ESZyxNTZCkaZCgDmMmy/lzQ8wywyUaA4XAd5AjqC+Rr3vN8ncvpb8cLPizaukvq0ufNGrSJ63CugqUJAYncZkF5tu2JSva0z0BW6HePGoqxI3yFDLJ32fupHGBpwy6Ljl12ZbVLLyGZYzStToFqfipaJgHKRedKB/J3KsG91m3BRVa3NBsNEmMInWnw43iEUkiLUqSjAl/9mhIuMlPocooxl+jMgkzBCZXPrnpg8nC2CXzcHk5Ou3TGNqhBC5JwoRxsQYJHz0qzP3o0Vq7rZK7KfkcGEwLa05hySh35Qsu3X1JqtUNjzBaD1cMtPES5y8Hof71E9DtBU01B81dIz2EQPpt2yByrtq2iCdveXsGlYG75znd85zueU73PKd7ntM9z+me53TPc7rnOd3znO55Tvc8p3ue83d9njPj2saTaDPo1MhtRZa2MUQuhMyLP2opzraRtKglWt++ecZtuat8/Pjx8/Ku8unw2cGmxY6ePz8cHD4Z3D+kd//FkTPGN6ZZJB0OyiJpnc7vWCztSXsHHNWRzJyyXd8NsKm5f4+Ov93/pv2810KFTn+Ld0KFsF/rhdDW9xc8igQ2pa3Tt8vr++1T4t2Q4nF5CTXw2DBGgDLUq5QONg+PjU73lRoykdkC36vkh1XydlOvu923uDm6NtkK6bX0qIjfbGwphDcRvOLmu8PuOuyuw+467K7D7jrsrsPuOuzuT8XuNIY85Shb0vdGU9Ow1FBEirI7MOsf9BWxo0MhOxSyQyE7FPJ/C4U02XzOb+sBpyB9pKR1XfZldHa7CRuUpO0iWnYLo9MhXGRpqrSt/ERR/qSz/utELjfaq0KT5mKq0T+lWv5wau/6vbsb1kNzT1r+SqjR1Kpn7Xejyrdhm3Wjf8bbrB39KZfb4TcmBK5/wap7rt49V++eq3/l5+pflv9uVMEfqXt9E+3CIjbmBmChyzvvKeD9338BAAD//w==
// DO NOT EDIT
package com.paypal.sdk.v1.payments;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * The payer. The payer funds the payment.
 */
@Model
public class Payer {

    // Required default constructor
    public Payer() {}

	/**
	* An array of a single funding instrument for the current payment. Valid only and required for the credit card payment method. The array must include either a `credit_card` or `credit_card_token` object. If the array contains more than one instrument, the payment is declined.
	*/
	@SerializedName(value = "funding_instruments", listClass = FundingInstrument.class)
	private List<FundingInstrument> fundingInstruments;

	public List<FundingInstrument> fundingInstruments() { return fundingInstruments; }
	
	public Payer fundingInstruments(List<FundingInstrument> fundingInstruments) {
	    this.fundingInstruments = fundingInstruments;
	    return this;
	}

	/**
	* The payer information.
	*/
	@SerializedName("payer_info")
	private PayerInformation payerInfo;

	public PayerInformation payerInfo() { return payerInfo; }
	
	public Payer payerInfo(PayerInformation payerInfo) {
	    this.payerInfo = payerInfo;
	    return this;
	}

	/**
	* The payment method. Value is <code>paypal</code> for a PayPal Wallet payment.<blockquote><strong>Important:</strong> The use of the PayPal REST <code>/payments</code> APIs to accept credit card payments is restricted. Instead, you can accept credit card payments with:<ul><li><a href="/docs/integration/direct/payments/guest-payments/">Guest payments</a> with a <a href="/docs/api/vault/#credit-card_create">credit card that is stored in the PayPal vault</a></li><li><a href="https://www.braintreepayments.com/products/braintree-direct">Braintree Direct</a></li><li><a href="https://www.paypal.com/us/webapps/mpp/merchant">PayPal business products</a></li></ul></blockquote>
	*/
	@SerializedName("payment_method")
	private String paymentMethod;

	public String paymentMethod() { return paymentMethod; }
	
	public Payer paymentMethod(String paymentMethod) {
	    this.paymentMethod = paymentMethod;
	    return this;
	}

	/**
	* The status of payer's PayPal account.
	*/
	@SerializedName("status")
	private String status;

	public String status() { return status; }
	
	public Payer status(String status) {
	    this.status = status;
	    return this;
	}
}
