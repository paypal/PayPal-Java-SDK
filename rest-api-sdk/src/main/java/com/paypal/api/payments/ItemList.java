package com.paypal.api.payments;

import java.util.ArrayList;
import java.util.List;

import com.paypal.base.rest.PayPalModel;

public class ItemList  extends PayPalModel {

	/**
	 * List of items.
	 */
	private List<Item> items;

	/**
	 * Shipping address.
	 */
	private ShippingAddress shippingAddress;
	
	/**
	 * Shipping method used for this payment like USPSParcel etc.
	 */
	private String shippingMethod;

	/**
	 * Allows merchant's to share payer’s contact number with PayPal for the current payment. Final contact number of payer associated with the transaction might be same as shipping_phone_number or different based on Payer’s action on PayPal. The phone number must be represented in its canonical international format, as defined by the E.164 numbering plan
	 */
	private String shippingPhoneNumber;



	/**
	 * Default Constructor
	 */
	public ItemList() {
		items = new ArrayList<Item>();
	}


	/**
	 * Setter for items
	 */
	public ItemList setItems(List<Item> items) {
		this.items = items;
		return this;
	}

	/**
	 * Getter for items
	 */
	public List<Item> getItems() {
		return this.items;
	}


	/**
	 * Setter for shippingAddress
	 */
	public ItemList setShippingAddress(ShippingAddress shippingAddress) {
		this.shippingAddress = shippingAddress;
		return this;
	}

	/**
	 * Getter for shippingAddress
	 */
	public ShippingAddress getShippingAddress() {
		return this.shippingAddress;
	}

	public String getShippingMethod() {
		return shippingMethod;
	}


	public ItemList setShippingMethod(String shippingMethod) {
		this.shippingMethod = shippingMethod;
		return this;
	}
	
	/**
	 * Setter for shippingPhoneNumber
	 */
	public ItemList setShippingPhoneNumber(String shippingPhoneNumber) {
		this.shippingPhoneNumber = shippingPhoneNumber;
		return this;
	}

	/**
	 * Getter for shippingPhoneNumber
	 */
	public String getShippingPhoneNumber() {
		return this.shippingPhoneNumber;
	}
}
