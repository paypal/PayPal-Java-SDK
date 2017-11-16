package com.paypal.api.payments;

import com.paypal.api.openidconnect.Tokeninfo;
import com.paypal.base.rest.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.List;
import java.util.Map;

@Getter @Setter
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class Invoice extends PayPalResource {

	/**
	 * The unique invoice resource identifier.
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
	 * The required invoice recipient email address and any optional billing information. One recipient is supported.
	 */
	private List<BillingInfo> billingInfo;

	/**
	 * For invoices sent by email, one or more email addresses to which to send a Cc: copy of the notification. Supports only email addresses under participant.
	 */
	private List<Participant> ccInfo;

	/**
	 * The shipping information for entities to whom items are being shipped.
	 */
	private ShippingInfo shippingInfo;

	/**
	 * The list of items to include in the invoice. Maximum value is 100 items per invoice.
	 */
	private List<InvoiceItem> items;

	/**
	 * The date when the invoice was enabled. The date format is *yyyy*-*MM*-*dd* *z* as defined in [Internet Date/Time Format](http://tools.ietf.org/html/rfc3339#section-5.6).
	 */
	private String invoiceDate;

	/**
	 * Optional. The payment deadline for the invoice. Value is either `term_type` or `due_date` but not both.
	 */
	private PaymentTerm paymentTerm;

	/**
	 * Reference data, such as PO number, to add to the invoice. Maximum length is 60 characters.
	 */
	private String reference;

	/**
	 * The invoice level discount, as a percent or an amount value.
	 */
	private Cost discount;

	/**
	 * The shipping cost, as a percent or an amount value.
	 */
	private ShippingCost shippingCost;

	/**
	 * The custom amount to apply on an invoice. If you include a label, the amount cannot be empty.
	 */
	private CustomAmount custom;

	/**
	 * Indicates whether the invoice allows a partial payment. If set to `false`, invoice must be paid in full. If set to `true`, the invoice allows partial payments. Default is `false`.
	 */
	private Boolean allowPartialPayment;

	/**
	 * If `allow_partial_payment` is set to `true`, the minimum amount allowed for a partial payment.
	 */
	private Currency minimumAmountDue;

	/**
	 * Indicates whether tax is calculated before or after a discount. If set to `false`, the tax is calculated before a discount. If set to `true`, the tax is calculated after a discount. Default is `false`.
	 */
	private Boolean taxCalculatedAfterDiscount;

	/**
	 * Indicates whether the unit price includes tax. Default is `false`.
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
	 * A private bookkeeping memo for the merchant. Maximum length is 150 characters.
	 */
	private String merchantMemo;

	/**
	 * Full URL of an external image to use as the logo. Maximum length is 4000 characters.
	 */
	private String logoUrl;

	/**
	 * The total amount of the invoice.
	 */
	private Currency totalAmount;

	/**
	 * List of payment details for the invoice.
	 */
	private List<PaymentDetail> payments;

	/**
	 * List of refund details for the invoice.
	 */
	private List<RefundDetail> refunds;

	/**
	 * Audit information for the invoice.
	 */
	private Metadata metadata;

	/**
	 * Any miscellaneous invoice data. Maximum length is 4000 characters.
	 */
	private String additionalData;

	/**
	 * Gratuity to include with the invoice.
	 */
	private Currency gratuity;

	/**
	 * Payment summary of the invoice including amount paid through PayPal and other sources.
	 */
	private PaymentSummary paidAmount;

	/**
	 * Payment summary of the invoice including amount refunded through PayPal and other sources.
	 */
	private PaymentSummary refundedAmount;

	/**
	 * List of files attached to the invoice.
	 */
	private List<FileAttachment> attachments;

	/**
	 * HATEOS links representing all the actions over the invoice resource based on the current invoice status.
	 */
	private List<Links> links;

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
	 * @deprecated Please use {@link #getPayments()} instead.
	 * @return {@link List} of {@link PaymentDetail}
	 */
	public List<PaymentDetail> getPaymentDetails(){
		return this.payments;
	}

	/**
	 * @deprecated Please use {@link #setPayments(List)} instead.
	 * @param details
	 * @return {@link Invoice}
	 */
	public Invoice setPaymentDetails(List<PaymentDetail> details) {
		this.payments = details;
		return this;
	}

	/**
	 * @deprecated Please use {@link #getRefunds()} instead.
	 * @return {@link List} of {@link RefundDetail}
	 */
	public List<RefundDetail> getRefundDetails() {
		return this.refunds;
	}

	/**
	 * @deprecated Please use {@link #setRefunds(List)} instead.
	 * @param details
	 * @return {@link Invoice}
	 */
	public Invoice setRefundDetails(List<RefundDetail> details) {
		this.refunds = details;
		return this;
	}

	/**
	 * Creates an invoice. Include invoice details including merchant information in the request.
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
	 * Creates an invoice. Include invoice details including merchant information in the request.
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
	 * Searches for an invoice or invoices. Include a search object that specifies your search criteria in the request.
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
	 * Searches for an invoice or invoices. Include a search object that specifies your search criteria in the request.
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
	 * Sends an invoice, by ID, to a recipient. Optionally, set the `notify_merchant` query parameter to send the merchant an invoice update notification. By default, `notify_merchant` is `true`.
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
	 * Sends an invoice, by ID, to a recipient. Optionally, set the `notify_merchant` query parameter to send the merchant an invoice update notification. By default, `notify_merchant` is `true`.
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
	 * Sends a reminder about a specific invoice, by ID, to a recipient. Include a notification object that defines the reminder subject and other details in the JSON request body.
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
	 * Sends a reminder about a specific invoice, by ID, to a recipient. Include a notification object that defines the reminder subject and other details in the JSON request body.
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
	 * Cancels an invoice, by ID.
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
	 * Cancels an invoice, by ID.
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
	 * Marks the status of a specified invoice, by ID, as paid. Include a payment detail object that defines the payment method and other details in the JSON request body.
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
	 * Marks the status of a specified invoice, by ID, as paid. Include a payment detail object that defines the payment method and other details in the JSON request body.
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
	 * Marks the status of a specified invoice, by ID, as refunded. Include a refund detail object that defines the refund type and other details in the JSON request body.
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
	 * Marks the status of a specified invoice, by ID, as refunded. Include a refund detail object that defines the refund type and other details in the JSON request body.
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
	 * Gets the details for a specified invoice, by ID.
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
	 * Gets the details for a specified invoice, by ID.
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
	 * Lists some or all merchant invoices. Filters the response by any specified optional query string parameters.
	 * @deprecated Please use {@link #getAll(APIContext)} instead.
	 * @param accessToken
	 *            Access Token used for the API call.
	 * @return Invoices
	 * @throws PayPalRESTException
	 */
	public static Invoices getAll(String accessToken) throws PayPalRESTException {
		APIContext apiContext = new APIContext(accessToken);
		return getAll(apiContext, null);
	}

	/**
	 * Lists some or all merchant invoices. Filters the response by any specified optional query string parameters.
	 * @param apiContext
	 *            {@link APIContext} used for the API call.
	 * @return Invoices
	 * @throws PayPalRESTException
	 */
	public static Invoices getAll(APIContext apiContext) throws PayPalRESTException {
		return getAll(apiContext, null);
	}

	/**
	 * Lists some or all merchant invoices. Filters the response by any specified optional query string parameters.
	 * @param apiContext
	 *            {@link APIContext} used for the API call.
	 * @param options
	 * 			  {@link Map} of query parameters. Allowed options: page, page_size, total_count_required.
	 * @return Invoices
	 * @throws PayPalRESTException
	 */
	public static Invoices getAll(APIContext apiContext, Map<String, String> options) throws PayPalRESTException {
		String pattern = "v1/invoicing/invoices";
		String resourcePath = RESTUtil.formatURIPath(pattern, null, options);
		String payLoad = "";
		return configureAndExecute(apiContext, HttpMethod.GET, resourcePath, payLoad, Invoices.class);
	}


	/**
	 * Fully updates an invoice by passing the invoice ID to the request URI. In addition, pass a complete invoice object in the request JSON. Partial updates are not supported.
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
	 * Fully updates an invoice by passing the invoice ID to the request URI. In addition, pass a complete invoice object in the request JSON. Partial updates are not supported.
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
	 * Delete a particular invoice by passing the invoice ID to the request URI.
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
	 * Delete a particular invoice by passing the invoice ID to the request URI.
	 * @param apiContext
	 *            {@link APIContext} used for the API call.
	 * @throws PayPalRESTException
	 */
	public void delete(APIContext apiContext) throws PayPalRESTException {
		if (this.getId() == null) {
			throw new IllegalArgumentException("Id cannot be null");
		}
		Object[] parameters = new Object[] {this.getId()};
		String pattern = "v1/invoicing/invoices/{0}";
		String resourcePath = RESTUtil.formatURIPath(pattern, parameters);
		String payLoad = "";
		configureAndExecute(apiContext, HttpMethod.DELETE, resourcePath, payLoad, null);
	}

	/**
	 * Delete external payment.
	 * @param apiContext
	 *            {@link APIContext} used for the API call.
	 * @return
	 * @throws PayPalRESTException
	 */
	public void deleteExternalPayment(APIContext apiContext) throws PayPalRESTException {
		if (this.getId() == null) {
			throw new IllegalArgumentException("Id cannot be null");
		}

		Object[] parameters = new Object[] {this.getId()};
		String pattern = "v1/invoicing/invoices/{0}/payment-records/{1}";
		String resourcePath = RESTUtil.formatURIPath(pattern, parameters);
		String payLoad = "";
		configureAndExecute(apiContext, HttpMethod.DELETE, resourcePath, payLoad, null);
	}

	/**
	 * Delete external refund.
	 * @param apiContext
	 *            {@link APIContext} used for the API call.
	 * @return
	 * @throws PayPalRESTException
	 */
	public void deleteExternalRefund(APIContext apiContext) throws PayPalRESTException {
		if (this.getId() == null) {
			throw new IllegalArgumentException("Id cannot be null");
		}
		Object[] parameters = new Object[] {this.getId()};
		String pattern = "v1/invoicing/invoices/{0}/refund-records/{1}";
		String resourcePath = RESTUtil.formatURIPath(pattern, parameters);
		String payLoad = "";
		configureAndExecute(apiContext, HttpMethod.DELETE, resourcePath, payLoad, null);
	}

	/**
	 * Generates a QR code for an invoice, by ID. The request generates a QR code that is 500 pixels in width and height. To change the dimensions of the returned code, specify optional query parameters.
	 * @deprecated Please use {@link #qrCode(APIContext, String, Map)} instead.
	 * @param apiContext
	 *            {@link APIContext} used for the API call.
	 * @param invoiceId
	 *            String
	 * @return object
	 * @throws PayPalRESTException
	 */
	public static Image qrCode(APIContext apiContext, String invoiceId) throws PayPalRESTException {
		return qrCode(apiContext, invoiceId, null);
	}

	/**
	 * Generates a QR code for an invoice, by ID. The request generates a QR code that is 500 pixels in width and height. To change the dimensions of the returned code, specify optional query parameters.
	 * @param apiContext
	 *            {@link APIContext} used for the API call.
	 * @param invoiceId
	 *            String
	 * @param options
	 * 			  {@link Map} of options. Valid values are: width, height, action.
	 * @return object
	 * @throws PayPalRESTException
	 */
	public static Image qrCode(APIContext apiContext, String invoiceId, Map<String, String> options) throws PayPalRESTException {
		if (invoiceId == null) {
			throw new IllegalArgumentException("invoiceId cannot be null");
		}
		String pattern = "v1/invoicing/invoices/{0}/qr-code";
		String resourcePath = RESTUtil.formatURIPath(pattern, options, invoiceId);
		String payLoad = "";
		return configureAndExecute(apiContext, HttpMethod.GET, resourcePath, payLoad, Image.class);
	}

	/**
	 * Generates the next invoice number.
	 * @param apiContext
	 *            {@link APIContext} used for the API call.
	 * @return object
	 * @throws PayPalRESTException
	 */
	public InvoiceNumber generateNumber(APIContext apiContext) throws PayPalRESTException {
		Object[] parameters = new Object[] {this.getId()};
		String pattern = "v1/invoicing/invoices/next-invoice-number";
		String resourcePath = RESTUtil.formatURIPath(pattern, parameters);
		String payLoad = "";
		return configureAndExecute(apiContext, HttpMethod.POST, resourcePath, payLoad, InvoiceNumber.class);
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
