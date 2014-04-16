package com.paypal.api.sample;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.paypal.api.payments.CancelNotification;
import com.paypal.api.payments.Invoice;
import com.paypal.api.payments.Invoices;
import com.paypal.api.payments.Notification;
import com.paypal.api.payments.Search;
import com.paypal.api.payments.util.GenerateAccessToken;
import com.paypal.core.rest.JSONFormatter;
import com.paypal.core.rest.PayPalRESTException;

/**
 * This class shows code samples for invoicing.
 * l
 * https://developer.paypal.com/webapps/developer/docs/api/#invoicing
 *
 */
public class InvoiceSample {

	private Invoice invoice = null;
	private String accessToken = null;

	/**
	 * Initialize and instantiate an Invoice object
	 * @throws PayPalRESTException
	 * @throws JsonSyntaxException
	 * @throws JsonIOException
	 * @throws FileNotFoundException
	 */
	public InvoiceSample() throws PayPalRESTException, JsonSyntaxException,
			JsonIOException, FileNotFoundException {

		// initialize Invoice with credentials. User credentials must be stored
		// in the file
		Invoice.initConfig(new File(".",
						"src/main/resources/sdk_config.properties"));

		// get an access token
		accessToken = GenerateAccessToken.getAccessToken();
	}
	
	private static Invoice loadInvoice(String jsonFile) {
	    try {
		    BufferedReader br = new BufferedReader(new FileReader("src/main/resources/" + jsonFile));
	        StringBuilder sb = new StringBuilder();
	        String line = br.readLine();

	        while (line != null) {
	            sb.append(line);
	            sb.append(System.lineSeparator());
	            line = br.readLine();
	        }
	        br.close();
	        return JSONFormatter.fromJSON(sb.toString(), Invoice.class);
	        
	    } catch (IOException e) {
	    	e.printStackTrace();
	    	return new Invoice();
	    }
	}

	/**
	 * Create an invoice.
	 * 
	 * https://developer.paypal.com/webapps/developer/docs/api/#create-an-invoice
	 * 
	 * @return newly created Invoice instance
	 * @throws PayPalRESTException
	 */
	public Invoice create() throws PayPalRESTException {
		// populate Invoice object that we are going to play with
		invoice = loadInvoice("invoice_create.json");
		invoice = invoice.create(accessToken);
		return invoice;
	}

	/**
	 * Send an invoice.
	 * 
	 * https://developer.paypal.com/webapps/developer/docs/api/#send-an-invoice
	 * 
	 * @throws PayPalRESTException
	 */
	public void send() throws PayPalRESTException {
		invoice.send(accessToken);
	}

	/**
	 * Update an invoice.
	 * 
	 * https://developer.paypal.com/webapps/developer/docs/api/#update-an-invoice
	 * 
	 * @return updated Invoice instance
	 * @throws PayPalRESTException
	 */
	public Invoice update() throws PayPalRESTException {
		String id = invoice.getId();
		invoice = loadInvoice("invoice_update.json");
		invoice.setId(id);
		invoice = invoice.update(accessToken);
		return invoice;
	}

	/**
	 * Retrieve an invoice.
	 * 
	 * https://developer.paypal.com/webapps/developer/docs/api/#retrieve-an-invoice
	 * 
	 * @return retrieved Invoice instance
	 * @throws PayPalRESTException
	 */
	public Invoice retrieve() throws PayPalRESTException {
		invoice = Invoice.get(accessToken, invoice.getId());
		return invoice;
	}

	/**
	 * Get invoices of an merchant.
	 * 
	 * https://developer.paypal.com/webapps/developer/docs/api/#get-invoices-of-a-merchant
	 * 
	 * @return Invoices instance that contains invoices for merchant
	 * @throws PayPalRESTException
	 */
	public Invoices getMerchantInvoices() throws PayPalRESTException {
		return Invoice.getAll(accessToken);
	}

	/**
	 * Search for invoices.
	 * 
	 * https://developer.paypal.com/webapps/developer/docs/api/#search-for-invoices
	 * 
	 * @return Invoices instance that contains found invoices
	 * @throws PayPalRESTException
	 */
	public Invoices search() throws PayPalRESTException {
		Search search = new Search();
		search.setStartInvoiceDate("2010-05-10 PST");
		search.setEndInvoiceDate("2014-04-10 PST");
		search.setPage(1);
		search.setPageSize(20);
		search.setTotalCountRequired(true);
		return invoice.search(accessToken, search);
	}

	/**
	 * Send an invoice reminder.
	 * 
	 * https://developer.paypal.com/webapps/developer/docs/api/#send-an-invoice-reminder
	 * 
	 * @throws PayPalRESTException
	 */
	public void sendReminder() throws PayPalRESTException {
		Notification notification = new Notification();
		notification.setSubject("Past due");
		notification.setNote("Please pay soon");
		notification.setSendToMerchant(true);
		invoice.remind(accessToken, notification);
	}

	/**
	 * Cancel an invoice.
	 * 
	 * https://developer.paypal.com/webapps/developer/docs/api/#cancel-an-invoice
	 * 
	 * @throws PayPalRESTException
	 */
	public void cancel() throws PayPalRESTException {
		CancelNotification cancelNotification = new CancelNotification();
		cancelNotification.setSubject("Past due");
		cancelNotification.setNote("Canceling invoice");
		cancelNotification.setSendToMerchant(true);
		cancelNotification.setSendToPayer(true);
		invoice.cancel(accessToken, cancelNotification);
	}

	/**
	 * Delete an invoice.
	 * 
	 * https://developer.paypal.com/webapps/developer/docs/api/#delete-an-invoice
	 * 
	 * @throws PayPalRESTException
	 */
	public void delete() throws PayPalRESTException {
		Invoice newInvoice = this.create();
		newInvoice.delete(accessToken);
	}
	
	/**
	 * Main method that calls all methods above in a flow.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			InvoiceSample invoiceSample = new InvoiceSample();
			
			Invoice invoice = invoiceSample.create();
			System.out.println("create response:\n" + Invoice.getLastResponse());
			invoiceSample.send();
			System.out.println("send response:\n" + Invoice.getLastResponse());
			invoice = invoiceSample.update();
			System.out.println("update response:\n" + Invoice.getLastResponse());
			invoice = invoiceSample.retrieve();
			System.out.println("retrieve response:\n" + Invoice.getLastResponse());
			Invoices invoices = invoiceSample.getMerchantInvoices();
			System.out.println("getall response:\n" + Invoice.getLastResponse());
			invoices = invoiceSample.search();
			System.out.println("search response:\n" + Invoice.getLastResponse());
			invoiceSample.sendReminder();
			System.out.println("remind response:\n" + Invoice.getLastResponse());
			invoiceSample.cancel();
			System.out.println("cancel response:\n" + Invoice.getLastResponse());
			invoiceSample.delete();
			System.out.println("delete response:\n" + Invoice.getLastResponse());
		} catch (JsonSyntaxException e) {
			e.printStackTrace();
		} catch (JsonIOException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (PayPalRESTException e) {
			e.printStackTrace();
		}
	}
}
