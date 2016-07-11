package com.paypal.api.payments;

import com.paypal.api.openidconnect.CreateFromAuthorizationCodeParameters;
import com.paypal.api.openidconnect.Tokeninfo;
import com.paypal.base.rest.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class Invoice extends PayPalResource {

	/**
	 * Unique invoice resource identifier.
	 */
	private String id;

	/**
	 * Unique number that appears on the invoice. If left blank will be auto-incremented from the last number. 25 characters max.
	 */
	private String number;

	/**
	 * The template ID used for the invoice. Useful for copy functionality.
	 */
	private String templateId;

	/**
	 * URI of the invoice resource.
	 */
	private String uri;

	/**
	 * Status of the invoice.
	 */
	private String status;

	/**
	 * Information about the merchant who is sending the invoice.
	 */
	private MerchantInfo merchantInfo;

	/**
	 * Email address of invoice recipient (required) and optional billing information. (Note: We currently only allow one recipient).
	 */
	private List<BillingInfo> billingInfo;

	/**
	 * Email address of invoice recipient (required) and optional billing information. (Note: We currently only allow one recipient).
	 */
	private List<Participant> ccInfo;

	/**
	 * Shipping information for entities to whom items are being shipped.
	 */
	private ShippingInfo shippingInfo;

	/**
	 * List of items included in the invoice. 100 items max per invoice.
	 */
	private List<InvoiceItem> items;

	/**
	 * Date on which the invoice was enabled. Date format: yyyy-MM-dd z. For example, 2014-02-27 PST
	 */
	private String invoiceDate;

	/**
	 * Optional field to pass payment deadline for the invoice. Either term_type or due_date can be passed, but not both.
	 */
	private PaymentTerm paymentTerm;

	/**
	 * Reference data, such as PO number, to add to the invoice. Maximum length is 60 characters.
	 */
	private String reference;

	/**
	 * Invoice level discount in percent or amount.
	 */
	private Cost discount;

	/**
	 * Shipping cost in percent or amount.
	 */
	private ShippingCost shippingCost;

	/**
	 * Custom amount applied on an invoice. If a label is included then the amount cannot be empty.
	 */
	private CustomAmount custom;

	/**
	 * Indicates whether tax is calculated before or after a discount. If false (the default), the tax is calculated before a discount. If true, the tax is calculated after a discount.
	 */
	private Boolean taxCalculatedAfterDiscount;

	/**
	 * A flag indicating whether the unit price includes tax. Default is false
	 */
	private Boolean taxInclusive;

	/**
	 * General terms of the invoice. 4000 characters max.
	 */
	private String terms;

	/**
	 * Note to the payer. 4000 characters max.
	 */
	private String note;

	/**
	 * Bookkeeping memo that is private to the merchant. 150 characters max.
	 */
	private String merchantMemo;

	/**
	 * Full URL of an external image to use as the logo. 4000 characters max.
	 */
	private String logoUrl;

	/**
	 * The total amount of the invoice.
	 */
	private Currency totalAmount;

	/**
	 * List of payment details for the invoice.
	 */
	private List<PaymentDetail> paymentDetails;

	/**
	 * List of refund details for the invoice.
	 */
	private List<RefundDetail> refundDetails;

	/**
	 * Audit information for the invoice.
	 */
	private Metadata metadata;

	
	/**
	 * Default Constructor
	 */
	public Invoice() {
	}

	/**
	 * Parameterized Constructor
	 */
	public Invoice(MerchantInfo merchantInfo) {
		this.merchantInfo = merchantInfo;
	}
	
	/**
	 * Creates a new invoice Resource.
	 * @deprecated Please use {@link #create(APIContext)} instead.
	 * @param accessToken
	 *            Access Token used for the API call.
	 * @return Invoice
	 * @throws PayPalRESTException
	 */
	public Invoice create(String accessToken) throws PayPalRESTException {
		APIContext apiContext = new APIContext(accessToken);
		return create(apiContext);
	}

	/**
	 * Creates a new invoice Resource.
	 * @param apiContext
	 *            {@link APIContext} used for the API call.
	 * @return Invoice
	 * @throws PayPalRESTException
	 */
	public Invoice create(APIContext apiContext) throws PayPalRESTException {

		String resourcePath = "v1/invoicing/invoices";
		String payLoad = this.toJSON();
		return configureAndExecute(apiContext, HttpMethod.POST, resourcePath, payLoad, Invoice.class);
	}

	

	/**
	 * Search for invoice resources.
	 * @deprecated Please use {@link #search(APIContext, Search)} instead.
	 * @param accessToken
	 *            Access Token used for the API call.
	 * @param search
	 *            Search
	 * @return Invoices
	 * @throws PayPalRESTException
	 */
	public Invoices search(String accessToken, Search search) throws PayPalRESTException {
		APIContext apiContext = new APIContext(accessToken);
		return search(apiContext, search);
	}

	/**
	 * Search for invoice resources.
	 * @param apiContext
	 *            {@link APIContext} used for the API call.
	 * @param search
	 *            Search
	 * @return Invoices
	 * @throws PayPalRESTException
	 */
	public Invoices search(APIContext apiContext, Search search) throws PayPalRESTException {

		if (search == null) {
			throw new IllegalArgumentException("search cannot be null");
		}
		Object[] parameters = new Object[] {this.getId()};
		String pattern = "v1/invoicing/search";
		String resourcePath = RESTUtil.formatURIPath(pattern, parameters);
		String payLoad = search.toJSON();
		return configureAndExecute(apiContext, HttpMethod.POST, resourcePath, payLoad, Invoices.class);
	}


	/**
	 * Sends a legitimate invoice to the payer.
	 * @deprecated Please use {@link #send(APIContext)} instead.
	 * @param accessToken
	 *            Access Token used for the API call.
	 * @throws PayPalRESTException
	 */
	public void send(String accessToken) throws PayPalRESTException {
		APIContext apiContext = new APIContext(accessToken);
		send(apiContext);
	}

	/**
	 * Sends a legitimate invoice to the payer.
	 * @param apiContext
	 *            {@link APIContext} used for the API call.
	 * @throws PayPalRESTException
	 */
	public void send(APIContext apiContext) throws PayPalRESTException {

		if (this.getId() == null) {
			throw new IllegalArgumentException("Id cannot be null");
		}
		Object[] parameters = new Object[] {this.getId()};
		String pattern = "v1/invoicing/invoices/{0}/send";
		String resourcePath = RESTUtil.formatURIPath(pattern, parameters);
		String payLoad = "";
		configureAndExecute(apiContext, HttpMethod.POST, resourcePath, payLoad, null);
	}


	/**
	 * Reminds the payer to pay the invoice.
	 * @deprecated Please use {@link #remind(APIContext, Notification)} instead.
	 * @param accessToken
	 *            Access Token used for the API call.
	 * @param notification
	 *            Notification
	 * @throws PayPalRESTException
	 */
	public void remind(String accessToken, Notification notification) throws PayPalRESTException {
		APIContext apiContext = new APIContext(accessToken);
		remind(apiContext, notification);
	}

	/**
	 * Reminds the payer to pay the invoice.
	 * @param apiContext
	 *            {@link APIContext} used for the API call.
	 * @param notification
	 *            Notification
	 * @throws PayPalRESTException
	 */
	public void remind(APIContext apiContext, Notification notification) throws PayPalRESTException {

		if (this.getId() == null) {
			throw new IllegalArgumentException("Id cannot be null");
		}
		if (notification == null) {
			throw new IllegalArgumentException("notification cannot be null");
		}
		Object[] parameters = new Object[] {this.getId()};
		String pattern = "v1/invoicing/invoices/{0}/remind";
		String resourcePath = RESTUtil.formatURIPath(pattern, parameters);
		String payLoad = notification.toJSON();
		configureAndExecute(apiContext, HttpMethod.POST, resourcePath, payLoad, null);
	}


	/**
	 * Cancels an invoice.
	 * @deprecated Please use {@link #cancel(APIContext, CancelNotification)} instead.
	 * @param accessToken
	 *            Access Token used for the API call.
	 * @param cancelNotification
	 *            CancelNotification
	 * @throws PayPalRESTException
	 */
	public void cancel(String accessToken, CancelNotification cancelNotification) throws PayPalRESTException {
		APIContext apiContext = new APIContext(accessToken);
		cancel(apiContext, cancelNotification);
	}

	/**
	 * Cancels an invoice.
	 * @param apiContext
	 *            {@link APIContext} used for the API call.
	 * @param cancelNotification
	 *            CancelNotification
	 * @throws PayPalRESTException
	 */
	public void cancel(APIContext apiContext, CancelNotification cancelNotification) throws PayPalRESTException {

		if (this.getId() == null) {
			throw new IllegalArgumentException("Id cannot be null");
		}
		if (cancelNotification == null) {
			throw new IllegalArgumentException("cancelNotification cannot be null");
		}
		Object[] parameters = new Object[] {this.getId()};
		String pattern = "v1/invoicing/invoices/{0}/cancel";
		String resourcePath = RESTUtil.formatURIPath(pattern, parameters);
		String payLoad = cancelNotification.toJSON();
		configureAndExecute(apiContext, HttpMethod.POST, resourcePath, payLoad, null);
	}


	/**
	 * Mark the status of the invoice as paid.
	 * @deprecated Please use {@link #recordPayment(APIContext, PaymentDetail)} instead.
	 * @param accessToken
	 *            Access Token used for the API call.
	 * @param paymentDetail
	 *            PaymentDetail
	 * @throws PayPalRESTException
	 */
	public void recordPayment(String accessToken, PaymentDetail paymentDetail) throws PayPalRESTException {
		APIContext apiContext = new APIContext(accessToken);
		recordPayment(apiContext, paymentDetail);
	}

	/**
	 * Mark the status of the invoice as paid.
	 * @param apiContext
	 *            {@link APIContext} used for the API call.
	 * @param paymentDetail
	 *            PaymentDetail
	 * @throws PayPalRESTException
	 */
	public void recordPayment(APIContext apiContext, PaymentDetail paymentDetail) throws PayPalRESTException {

		if (this.getId() == null) {
			throw new IllegalArgumentException("Id cannot be null");
		}
		if (paymentDetail == null) {
			throw new IllegalArgumentException("paymentDetail cannot be null");
		}
		Object[] parameters = new Object[] {this.getId()};
		String pattern = "v1/invoicing/invoices/{0}/record-payment";
		String resourcePath = RESTUtil.formatURIPath(pattern, parameters);
		String payLoad = paymentDetail.toJSON();
		configureAndExecute(apiContext, HttpMethod.POST, resourcePath, payLoad, null);
	}


	/**
	 * Mark the status of the invoice as refunded.
	 * @deprecated Please use {@link #recordRefund(APIContext, RefundDetail)} instead.
	 * @param accessToken
	 *            Access Token used for the API call.
	 * @param refundDetail
	 *            RefundDetail
	 * @throws PayPalRESTException
	 */
	public void recordRefund(String accessToken, RefundDetail refundDetail) throws PayPalRESTException {
		APIContext apiContext = new APIContext(accessToken);
		recordRefund(apiContext, refundDetail);
	}

	/**
	 * Mark the status of the invoice as refunded.
	 * @param apiContext
	 *            {@link APIContext} used for the API call.
	 * @param refundDetail
	 *            RefundDetail
	 * @throws PayPalRESTException
	 */
	public void recordRefund(APIContext apiContext, RefundDetail refundDetail) throws PayPalRESTException {

		if (this.getId() == null) {
			throw new IllegalArgumentException("Id cannot be null");
		}
		if (refundDetail == null) {
			throw new IllegalArgumentException("refundDetail cannot be null");
		}
		Object[] parameters = new Object[] {this.getId()};
		String pattern = "v1/invoicing/invoices/{0}/record-refund";
		String resourcePath = RESTUtil.formatURIPath(pattern, parameters);
		String payLoad = refundDetail.toJSON();
		configureAndExecute(apiContext, HttpMethod.POST, resourcePath, payLoad, null);
	}


	/**
	 * Get the invoice resource for the given identifier.
	 * @deprecated Please use {@link #get(APIContext, String)} instead.
	 * @param accessToken
	 *            Access Token used for the API call.
	 * @param invoiceId
	 *            String
	 * @return Invoice
	 * @throws PayPalRESTException
	 */
	public static Invoice get(String accessToken, String invoiceId) throws PayPalRESTException {
		APIContext apiContext = new APIContext(accessToken);
		return get(apiContext, invoiceId);
	}

	/**
	 * Get the invoice resource for the given identifier.
	 * @param apiContext
	 *            {@link APIContext} used for the API call.
	 * @param invoiceId
	 *            String
	 * @return Invoice
	 * @throws PayPalRESTException
	 */
	public static Invoice get(APIContext apiContext, String invoiceId) throws PayPalRESTException {

		if (invoiceId == null) {
			throw new IllegalArgumentException("invoiceId cannot be null");
		}
		Object[] parameters = new Object[] {invoiceId};
		String pattern = "v1/invoicing/invoices/{0}";
		String resourcePath = RESTUtil.formatURIPath(pattern, parameters);
		String payLoad = "";
		return configureAndExecute(apiContext, HttpMethod.GET, resourcePath, payLoad, Invoice.class);
	}


	/**
	 * Get all invoices of a merchant.
	 * @deprecated Please use {@link #getAll(APIContext)} instead.
	 * @param accessToken
	 *            Access Token used for the API call.
	 * @return Invoices
	 * @throws PayPalRESTException
	 */
	public static Invoices getAll(String accessToken) throws PayPalRESTException {
		APIContext apiContext = new APIContext(accessToken);
		return getAll(apiContext);
	}

	/**
	 * Get all invoices of a merchant.
	 * @param apiContext
	 *            {@link APIContext} used for the API call.
	 * @return Invoices
	 * @throws PayPalRESTException
	 */
	public static Invoices getAll(APIContext apiContext) throws PayPalRESTException {

		String resourcePath = "v1/invoicing/invoices";
		String payLoad = "";
		Invoices invoices = configureAndExecute(apiContext, HttpMethod.GET, resourcePath, payLoad, Invoices.class);
		
		return invoices;
	}


	/**
	 * Full update of the invoice resource for the given identifier.
	 * @deprecated Please use {@link #update(APIContext)} instead.
	 * @param accessToken
	 *            Access Token used for the API call.
	 * @return Invoice
	 * @throws PayPalRESTException
	 */
	public Invoice update(String accessToken) throws PayPalRESTException {
		APIContext apiContext = new APIContext(accessToken);
		return update(apiContext);
	}

	/**
	 * Full update of the invoice resource for the given identifier.
	 * @param apiContext
	 *            {@link APIContext} used for the API call.
	 * @return Invoice
	 * @throws PayPalRESTException
	 */
	public Invoice update(APIContext apiContext) throws PayPalRESTException {

		if (this.getId() == null) {
			throw new IllegalArgumentException("Id cannot be null");
		}
		Object[] parameters = new Object[] {this.getId()};
		String pattern = "v1/invoicing/invoices/{0}";
		String resourcePath = RESTUtil.formatURIPath(pattern, parameters);
		String payLoad = this.toJSON();
		return configureAndExecute(apiContext, HttpMethod.PUT, resourcePath, payLoad, Invoice.class);
	}


	/**
	 * Delete invoice resource for the given identifier.
	 * @deprecated Please use {@link #delete(APIContext)} instead.
	 * @param accessToken
	 *            Access Token used for the API call.
	 * @throws PayPalRESTException
	 */
	public void delete(String accessToken) throws PayPalRESTException {
		APIContext apiContext = new APIContext(accessToken);
		delete(apiContext);
	}

	/**
	 * Delete invoice resource for the given identifier.
	 * @param apiContext
	 *            {@link APIContext} used for the API call.
	 * @throws PayPalRESTException
	 */
	public void delete(APIContext apiContext) throws PayPalRESTException {

		if (this.getId() == null) {
			throw new IllegalArgumentException("Id cannot be null");
		}
			apiContext.setMaskRequestId(true);
		Object[] parameters = new Object[] {this.getId()};
		String pattern = "v1/invoicing/invoices/{0}";
		String resourcePath = RESTUtil.formatURIPath(pattern, parameters);
		String payLoad = "";
		configureAndExecute(apiContext, HttpMethod.DELETE, resourcePath, payLoad, null);
	}

	/**
	 * Fetches long lived refresh token from authorization code, for third party merchant invoicing use. 
	 * 
	 * @param context context
	 * @param authorizationCode authorization code
	 * @return {@link String} Refresh Token
	 * @throws PayPalRESTException
	 */
	public static String fetchRefreshToken(APIContext context, String authorizationCode) throws PayPalRESTException {
		return Tokeninfo.createFromAuthorizationCode(context, authorizationCode).getRefreshToken();
	}
}
