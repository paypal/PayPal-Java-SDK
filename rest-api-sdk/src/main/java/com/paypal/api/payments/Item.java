package com.paypal.api.payments;

import java.util.List;

import com.paypal.base.rest.PayPalModel;


public class Item  extends PayPalModel {

	/**
	 * Stock keeping unit corresponding (SKU) to item.
	 */
	private String sku;

	/**
	 * Item name. 127 characters max.
	 */
	private String name;

	/**
	 * Description of the item. Only supported when the `payment_method` is set to `paypal`.
	 */
	private String description;

	/**
	 * Number of a particular item. 10 characters max.
	 */
	private String quantity;

	/**
	 * Item cost. 10 characters max.
	 */
	private String price;

	/**
	 * 3-letter [currency code](https://developer.paypal.com/docs/integration/direct/rest_api_payment_country_currency_support/).
	 */
	private String currency;

	/**
	 * Tax of the item. Only supported when the `payment_method` is set to `paypal`.
	 */
	private String tax;

	/**
	 * URL linking to item information. Available to payer in transaction history.
	 */
	private String url;

	/**
	 * Category type of the item.
	 */
	private String category;

	/**
	 * Weight of the item.
	 */
	private Measurement weight;

	/**
	 * Length of the item.
	 */
	private Measurement length;

	/**
	 * Height of the item.
	 */
	private Measurement height;

	/**
	 * Width of the item.
	 */
	private Measurement width;

	/**
	 * Set of optional data used for PayPal risk determination.
	 */
	private List<NameValuePair> supplementaryData;

	/**
	 * Set of optional data used for PayPal post-transaction notifications.
	 */
	private List<NameValuePair> postbackData;

	/**
	 * Default Constructor
	 */
	public Item() {
	}

	/**
	 * Parameterized Constructor
	 */
	public Item(String name, String quantity, String price, String currency) {
		this.name = name;
		this.quantity = quantity;
		this.price = price;
		this.currency = currency;
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
	 * Setter for description
	 */
	public Item setDescription(String description) {
		this.description = description;
		return this;
	}

	/**
	 * Getter for description
	 */
	public String getDescription() {
		return this.description;
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
	 * Setter for tax
	 */
	public Item setTax(String tax) {
		this.tax = tax;
		return this;
	}

	/**
	 * Getter for tax
	 */
	public String getTax() {
		return this.tax;
	}


	/**
	 * Setter for url
	 */
	public Item setUrl(String url) {
		this.url = url;
		return this;
	}

	/**
	 * Getter for url
	 */
	public String getUrl() {
		return this.url;
	}


	/**
	 * Setter for category
	 */
	public Item setCategory(String category) {
		this.category = category;
		return this;
	}

	/**
	 * Getter for category
	 */
	public String getCategory() {
		return this.category;
	}


	/**
	 * Setter for weight
	 */
	public Item setWeight(Measurement weight) {
		this.weight = weight;
		return this;
	}

	/**
	 * Getter for weight
	 */
	public Measurement getWeight() {
		return this.weight;
	}


	/**
	 * Setter for length
	 */
	public Item setLength(Measurement length) {
		this.length = length;
		return this;
	}

	/**
	 * Getter for length
	 */
	public Measurement getLength() {
		return this.length;
	}


	/**
	 * Setter for height
	 */
	public Item setHeight(Measurement height) {
		this.height = height;
		return this;
	}

	/**
	 * Getter for height
	 */
	public Measurement getHeight() {
		return this.height;
	}


	/**
	 * Setter for width
	 */
	public Item setWidth(Measurement width) {
		this.width = width;
		return this;
	}

	/**
	 * Getter for width
	 */
	public Measurement getWidth() {
		return this.width;
	}


	/**
	 * Setter for supplementaryData
	 */
	public Item setSupplementaryData(List<NameValuePair> supplementaryData) {
		this.supplementaryData = supplementaryData;
		return this;
	}

	/**
	 * Getter for supplementaryData
	 */
	public List<NameValuePair> getSupplementaryData() {
		return this.supplementaryData;
	}


	/**
	 * Setter for postbackData
	 */
	public Item setPostbackData(List<NameValuePair> postbackData) {
		this.postbackData = postbackData;
		return this;
	}

	/**
	 * Getter for postbackData
	 */
	public List<NameValuePair> getPostbackData() {
		return this.postbackData;
	}


}