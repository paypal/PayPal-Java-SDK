package com.paypal.api.payments;

import com.paypal.core.rest.JSONFormatter;
import com.paypal.api.payments.Currency;
import com.paypal.api.payments.Tax;
import com.paypal.api.payments.Cost;

public class InvoiceItem  {

	/**
	 * Name of the item. 60 characters max.
	 */
	private String name;

	/**
	 * Description of the item. 1000 characters max.
	 */
	private String description;

	/**
	 * Quantity of the item. Range of 0 to 9999.999.
	 */
	private float quantity;

	/**
	 * Unit price of the item. Range of -999999.99 to 999999.99.
	 */
	private Currency unitPrice;

	/**
	 * Tax associated with the item.
	 */
	private Tax tax;

	/**
	 * Date on which the item or service was provided. Date format: yyyy-MM-dd z. For example, 2014-02-27 PST.
	 */
	private String date;

	/**
	 * Item discount in percent or amount.
	 */
	private Cost discount;

	/**
	 * Default Constructor
	 */
	public InvoiceItem() {
	}

	/**
	 * Parameterized Constructor
	 */
	public InvoiceItem(String name, float quantity, Currency unitPrice) {
		this.name = name;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
	}


	/**
	 * Setter for name
	 */
	public InvoiceItem setName(String name) {
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
	public InvoiceItem setDescription(String description) {
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
	public InvoiceItem setQuantity(float quantity) {
		this.quantity = quantity;
		return this;
	}

	/**
	 * Getter for quantity
	 */
	public float getQuantity() {
		return this.quantity;
	}


	/**
	 * Setter for unitPrice
	 */
	public InvoiceItem setUnitPrice(Currency unitPrice) {
		this.unitPrice = unitPrice;
		return this;
	}

	/**
	 * Getter for unitPrice
	 */
	public Currency getUnitPrice() {
		return this.unitPrice;
	}


	/**
	 * Setter for tax
	 */
	public InvoiceItem setTax(Tax tax) {
		this.tax = tax;
		return this;
	}

	/**
	 * Getter for tax
	 */
	public Tax getTax() {
		return this.tax;
	}


	/**
	 * Setter for date
	 */
	public InvoiceItem setDate(String date) {
		this.date = date;
		return this;
	}

	/**
	 * Getter for date
	 */
	public String getDate() {
		return this.date;
	}


	/**
	 * Setter for discount
	 */
	public InvoiceItem setDiscount(Cost discount) {
		this.discount = discount;
		return this;
	}

	/**
	 * Getter for discount
	 */
	public Cost getDiscount() {
		return this.discount;
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