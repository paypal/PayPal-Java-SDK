package com.paypal.api.payments;

import com.google.gson.annotations.SerializedName;
import com.paypal.base.rest.*;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import lombok.Getter; import lombok.Setter;

import java.util.List;

@Getter @Setter
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class Template extends PayPalResource {

	/**
	 * Unique identifier id of the template.
	 */
	private String templateId;

	/**
	 * Name of the template.
	 */
	private String name;

	/**
	 * Indicates that this template is merchant's default. There can be only one template which can be a default.
	 */
	@SerializedName("default")
	private Boolean isDefault;

	/**
	 * Customized invoice data which is saved as template
	 */
	private TemplateData templateData;

	/**
	 * Settings for each template
	 */
	private List<TemplateSettings> settings;

	/**
	 * Unit of measure for the template, possible values are Quantity, Hours, Amount.
	 */
	private String unitOfMeasure;

	/**
	 * Indicates whether this is a custom template created by the merchant. Non custom templates are system generated
	 */
	private Boolean custom;

	/**
	 * Default Constructor
	 */
	public Template() {
	}

	/**
	 * Retrieve the details for a particular template by passing the template ID to the request URI.
	 * @param apiContext
	 *            {@link APIContext} used for the API call.
	 * @param templateId
	 *            String
	 * @return Template
	 * @throws PayPalRESTException
	 */
	public static Template get(APIContext apiContext, String templateId) throws PayPalRESTException {
		if (templateId == null) {
			throw new IllegalArgumentException("templateId cannot be null");
		}
		Object[] parameters = new Object[] {templateId};
		String pattern = "v1/invoicing/templates/{0}";
		String resourcePath = RESTUtil.formatURIPath(pattern, parameters);
		String payLoad = "";
		return configureAndExecute(apiContext, HttpMethod.GET, resourcePath, payLoad, Template.class);
	}

	/**
	 * Retrieves the template information of the merchant.
	 * @param apiContext
	 *            {@link APIContext} used for the API call.
	 * @return Templates
	 * @throws PayPalRESTException
	 */
	public static Templates getAll(APIContext apiContext) throws PayPalRESTException {
		String resourcePath = "v1/invoicing/templates";
		String payLoad = "";
		return configureAndExecute(apiContext, HttpMethod.GET, resourcePath, payLoad, Templates.class);
	}

	/**
	 * Delete a particular template by passing the template ID to the request URI.
	 * @param apiContext
	 *            {@link APIContext} used for the API call.
	 * @return
	 * @throws PayPalRESTException
	 */
	public void delete(APIContext apiContext) throws PayPalRESTException {
		if (this.getTemplateId() == null) {
			throw new IllegalArgumentException("Id cannot be null");
		}
		Object[] parameters = new Object[] {this.getTemplateId()};
		String pattern = "v1/invoicing/templates/{0}";
		String resourcePath = RESTUtil.formatURIPath(pattern, parameters);
		String payLoad = "";
		configureAndExecute(apiContext, HttpMethod.DELETE, resourcePath, payLoad, null);
	}

	/**
	 * Creates a template.
	 * @param apiContext
	 *            {@link APIContext} used for the API call.
	 * @return Template
	 * @throws PayPalRESTException
	 */
	public Template create(APIContext apiContext) throws PayPalRESTException {
		String resourcePath = "v1/invoicing/templates";
		String payLoad = this.toJSON();
		return configureAndExecute(apiContext, HttpMethod.POST, resourcePath, payLoad, Template.class);
	}

	/**
	 * Update an existing template by passing the template ID to the request URI. In addition, pass a complete template object in the request JSON. Partial updates are not supported.
	 * @param apiContext
	 *            {@link APIContext} used for the API call.
	 *            Template
	 * @return Template
	 * @throws PayPalRESTException
	 */
	public Template update(APIContext apiContext) throws PayPalRESTException {
		if (this.getTemplateId() == null) {
			throw new IllegalArgumentException("Id cannot be null");
		}
		Object[] parameters = new Object[] {this.getTemplateId()};
		String pattern = "v1/invoicing/templates/{0}";
		String resourcePath = RESTUtil.formatURIPath(pattern, parameters);
		String payLoad = this.toJSON();
		return configureAndExecute(apiContext, HttpMethod.PUT, resourcePath, payLoad, Template.class);
	}

}
