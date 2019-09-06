package com.paypal.api.sample;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.UUID;

import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.paypal.api.payments.Template;
import com.paypal.api.payments.Templates;
import com.paypal.base.rest.APIContext;
import com.paypal.base.rest.PayPalRESTException;

import static com.paypal.api.payments.util.SampleConstants.clientID;
import static com.paypal.api.payments.util.SampleConstants.clientSecret;
import static com.paypal.api.payments.util.SampleConstants.mode;

/**
 * This class shows code samples for invoicing templates.
 *
 * https://developer.paypal.com/webapps/developer/docs/api/#invoicing
 *
 */
public class InvoiceTemplateSample extends SampleBase<Template> {


	/**
	 * Initialize and instantiate an Invoice object
	 * @throws PayPalRESTException
	 * @throws JsonSyntaxException
	 * @throws JsonIOException
	 * @throws FileNotFoundException
	 */
	public InvoiceTemplateSample() throws PayPalRESTException, JsonSyntaxException,
			JsonIOException, FileNotFoundException {
		super(new Template());
	}

	/**
	 * Create an invoice template
	 * 
	 * https://developer.paypal.com/docs/api/invoicing/#templates
	 * 
	 * @return newly created Invoice Template instance
	 * @throws PayPalRESTException
	 */
	public Template create(APIContext context) throws PayPalRESTException, IOException {
		// populate Invoice object that we are going to play with
		super.instance = load("template_create.json", Template.class);
		// Make sure the Name of Invoice is unique.
		super.instance.setName("Sample-" + UUID.randomUUID().toString());
		try {
			super.instance = super.instance.create(context);
		} catch (PayPalRESTException ex) {
			if (ex.getResponsecode() == 400 && ex.getDetails().getMessage().contains("Exceed maximum number")) {
				// This could be because we have reached the maximum number of templates possible per app.
				Templates templates = Template.getAll(context);
				for (Template template: templates.getTemplates()) {
					if (!template.getIsDefault()) {
						try {
							template.delete(context);
						} catch (Exception e) {
							// We tried our best. We will continue.
							continue;
						}
					}
				}
				super.instance = super.instance.create(context);
			}
		}
		return super.instance;
	}

	/**
	 * Update an invoice template
	 *
	 * https://developer.paypal.com/docs/api/invoicing/#templates
	 *
	 * @return updated Invoice template instance
	 * @throws PayPalRESTException
	 */
	public Template update(APIContext context) throws PayPalRESTException, IOException {
		String id = super.instance.getTemplateId();
		super.instance = load("template_update.json", Template.class);
		super.instance.setTemplateId(id);

		// There is an existing issue when you need to manually remove `custom` settings during update,
		// if you are using the object returned from GET invoice.
		// For internal tracking purpose only: #PPPLCONSMR-39127
		super.instance.setCustom(null);
		// Changing the note to some random value
		super.instance.getTemplateData().setNote(UUID.randomUUID().toString().substring(0, 5));
		super.instance = super.instance.update(context);
		return super.instance;
	}

	/**
	 * Deletes a template
	 *
	 * https://developer.paypal.com/docs/api/invoicing/#templates
	 *
	 * @param context
	 * @throws PayPalRESTException
	 */
	public void delete(APIContext context) throws PayPalRESTException {
		this.instance.delete(context);
	}

	/**
	 * Main method that calls all methods above in a flow.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			InvoiceTemplateSample invoiceSample = new InvoiceTemplateSample();
			
			APIContext context = new APIContext(clientID, clientSecret, mode);

			Template template = invoiceSample.create(context);
			System.out.println("create response:\n" + Template.getLastResponse());
			Template.get(context, template.getTemplateId());
			System.out.println("get response:\n" + Template.getLastResponse());
			invoiceSample.update(context);
			System.out.println("update response:\n" + Template.getLastResponse());
			invoiceSample.delete(context);
			System.out.println("delete response:\n" + Template.getLastResponse());
		} catch (JsonSyntaxException e) {
			e.printStackTrace();
		} catch (JsonIOException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (PayPalRESTException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
