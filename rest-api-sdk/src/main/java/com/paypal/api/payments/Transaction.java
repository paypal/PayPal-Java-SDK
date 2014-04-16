package com.paypal.api.payments;

import com.paypal.core.rest.JSONFormatter;
import com.paypal.api.payments.Amount;
import com.paypal.api.payments.Payee;
import com.paypal.api.payments.ItemList;
import com.paypal.api.payments.RelatedResources;
import java.util.List;

public class Transaction  {

	/**
	 * Amount being collected.
	 */
	private Amount amount;

	/**
	 * Recepient of the funds in this transaction.
	 */
	private Payee payee;

	/**
	 * Description of what is being paid for.
	 */
	private String description;

	/**
	 * List of items being paid for.
	 */
	private ItemList itemList;

	/**
	 * List of financial transactions (Sale, Authorization, Capture, Refund) related to the payment.
	 */
	private List<RelatedResources> relatedResources;

	/**
	 * Additional transactions for complex payment (Parallel and Chained) scenarios.
	 */
	private List<Transaction> transactions;

	/**
	 * Default Constructor
	 */
	public Transaction() {
	}

	/**
	 * Parameterized Constructor
	 */
	public Transaction(Amount amount) {
		this.amount = amount;
	}


	/**
	 * Setter for amount
	 */
	public Transaction setAmount(Amount amount) {
		this.amount = amount;
		return this;
	}

	/**
	 * Getter for amount
	 */
	public Amount getAmount() {
		return this.amount;
	}


	/**
	 * Setter for payee
	 */
	public Transaction setPayee(Payee payee) {
		this.payee = payee;
		return this;
	}

	/**
	 * Getter for payee
	 */
	public Payee getPayee() {
		return this.payee;
	}


	/**
	 * Setter for description
	 */
	public Transaction setDescription(String description) {
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
	 * Setter for itemList
	 */
	public Transaction setItemList(ItemList itemList) {
		this.itemList = itemList;
		return this;
	}

	/**
	 * Getter for itemList
	 */
	public ItemList getItemList() {
		return this.itemList;
	}


	/**
	 * Setter for relatedResources
	 */
	public Transaction setRelatedResources(List<RelatedResources> relatedResources) {
		this.relatedResources = relatedResources;
		return this;
	}

	/**
	 * Getter for relatedResources
	 */
	public List<RelatedResources> getRelatedResources() {
		return this.relatedResources;
	}


	/**
	 * Setter for transactions
	 */
	public Transaction setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
		return this;
	}

	/**
	 * Getter for transactions
	 */
	public List<Transaction> getTransactions() {
		return this.transactions;
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