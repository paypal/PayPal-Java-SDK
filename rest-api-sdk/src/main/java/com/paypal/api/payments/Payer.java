package com.paypal.api.payments;
import com.paypal.api.payments.PayerInfo;
import java.util.List;
import com.paypal.api.payments.FundingInstrument;
import com.paypal.api.payments.Resource;
import com.paypal.core.rest.JSONFormatter;

/**
 * 
 */
public class Payer extends Resource {
	public enum PaymentMethod {
		CREDIT_CARD,
		PAYPAL
	}
	
	/**
	 * 
	 */ 
	private String paymentMethod;

	/**
	 * 
	 */ 
	private PayerInfo payerInfo;

	/**
	 * 
	 */ 
	private List<FundingInstrument> fundingInstruments;

	/**
	 * Constructor
	 */
	public Payer() {

	}	

	/**
	 * Getter for paymentMethod
	 */
	public String getPaymentMethod() {
		return paymentMethod;
	}
	
	/**
	 * Setter for paymentMethod;
	 */
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	/**
	 * Setter for paymentMethod;
	 */
	public void setPaymentMethod(PaymentMethod paymentMethod) {
		this.paymentMethod = paymentMethod.toString().toLowerCase();
	}
	/**
	 * Getter for payerInfo
	 */
	public PayerInfo getPayerInfo() {
		return payerInfo;
	}
	
	/**
	 * Setter for payerInfo;
	 */
	public void setPayerInfo(PayerInfo payerInfo) {
		this.payerInfo = payerInfo;
	}
	/**
	 * Getter for fundingInstruments
	 */
	public List<FundingInstrument> getFundingInstruments() {
		return fundingInstruments;
	}
	
	/**
	 * Setter for fundingInstruments;
	 */
	public void setFundingInstruments(List<FundingInstrument> fundingInstruments) {
		this.fundingInstruments = fundingInstruments;
	}




	/**
	 * Returns a JSON string corresponding to object state
	 * 
	 * @return JSON representation
	 */
	public String toJSON() {
		return JSONFormatter.toJSON(this);
	}
	
	@Override
	public String toString() {
		return toJSON();
	}

}