package com.paypal.api.payments;

import com.paypal.core.rest.JSONFormatter;

public class Item  {

	/**
	 * Number of items.
	 */
	private String quantity;

	/**
	 * Name of the item.
	 */
	private String name;

	/**
	 * Cost of the item.
	 */
	private String price;

	/**
	 * 3-letter Currency Code
	 */
	private String currency;

	/**
	 * Number or code to identify the item in your catalog/records.
	 */
	private String sku;

	/**
	 * Default Constructor
	 */
	public Item() {
	}

	/**
	 * Parameterized Constructor
	 */
	public Item(String quantity, String name, String price, String currency) {
		this.quantity = quantity;
		this.name = name;
		this.price = price;
		this.currency = currency;
	}


	/**
	 * Setter for quantity
	 */
	public Item setQuantity(String quantity) {
		this.quantity = quantity;
		return this;
	}

	/**
	 * Getter for quantity
	 */
	public String getQuantity() {
		return this.quantity;
	}


	/**
	 * Setter for name
	 */
	public Item setName(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Getter for name
	 */
	public String getName() {
		return this.name;
	}


	/**
	 * Setter for price
	 */
	public Item setPrice(String price) {
		this.price = price;
		return this;
	}

	/**
	 * Getter for price
	 */
	public String getPrice() {
		return this.price;
	}


	/**
	 * Setter for currency
	 */
	public Item setCurrency(String currency) {
		this.currency = currency;
		return this;
	}

	/**
	 * Getter for currency
	 */
	public String getCurrency() {
		return this.currency;
	}


	/**
	 * Setter for sku
	 */
	public Item setSku(String sku) {
		this.sku = sku;
		return this;
	}

	/**
	 * Getter for sku
	 */
	public String getSku() {
		return this.sku;
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