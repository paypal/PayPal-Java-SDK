package com.paypal.api.payments;

import com.paypal.core.rest.JSONFormatter;
import com.paypal.api.payments.MerchantInfo;
import com.paypal.api.payments.BillingInfo;
import java.util.List;
import com.paypal.api.payments.ShippingInfo;
import com.paypal.api.payments.InvoiceItem;
import com.paypal.api.payments.PaymentTerm;
import com.paypal.api.payments.Cost;
import com.paypal.api.payments.ShippingCost;
import com.paypal.api.payments.CustomAmount;
import com.paypal.api.payments.Currency;
import com.paypal.api.payments.PaymentDetail;
import com.paypal.api.payments.RefundDetail;
import com.paypal.api.payments.Metadata;
import com.paypal.core.rest.PayPalRESTException;
import com.paypal.core.rest.PayPalResource;
import com.paypal.core.rest.HttpMethod;
import com.paypal.core.rest.RESTUtil;
import com.paypal.core.rest.QueryParameters;
import com.paypal.core.rest.APIContext;
import com.paypal.core.Constants;
import com.paypal.core.SDKVersion;
import com.paypal.sdk.info.SDKVersionImpl;
import java.io.File;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Properties;

public class Invoice  {

	/**
	 * Unique invoice resource identifier.
	 */
	private String id;

	/**
	 * Unique number that appears on the invoice. If left blank will be auto-incremented from the last number. 25 characters max.
	 */
	private String number;

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
	 * Returns the last request sent to the Service
	 *
	 * @return Last request sent to the server
	 */
	public static String getLastRequest() {
		return PayPalResource.getLastRequest();
	}

	/**
	 * Returns the last response returned by the Service
	 *
	 * @return Last response got from the Service
	 */
	public static String getLastResponse() {
		return PayPalResource.getLastResponse();
	}

	/**
	 * Initialize using InputStream(of a Properties file)
	 *
	 * @param is
	 *            InputStream
	 * @throws PayPalRESTException
	 */
	public static void initConfig(InputStream is) throws PayPalRESTException {
		PayPalResource.initConfig(is);
	}

	/**
	 * Initialize using a File(Properties file)
	 *
	 * @param file
	 *            File object of a properties entity
	 * @throws PayPalRESTException
	 */
	public static void initConfig(File file) throws PayPalRESTException {
		PayPalResource.initConfig(file);
	}

	/**
	 * Initialize using Properties
	 *
	 * @param properties
	 *            Properties object
	 */
	public static void initConfig(Properties properties) {
		PayPalResource.initConfig(properties);
	}
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
	 * Setter for id
	 */
	public Invoice setId(String id) {
		this.id = id;
		return this;
	}

	/**
	 * Getter for id
	 */
	public String getId() {
		return this.id;
	}


	/**
	 * Setter for number
	 */
	public Invoice setNumber(String number) {
		this.number = number;
		return this;
	}

	/**
	 * Getter for number
	 */
	public String getNumber() {
		return this.number;
	}


	/**
	 * Setter for uri
	 */
	public Invoice setUri(String uri) {
		this.uri = uri;
		return this;
	}

	/**
	 * Getter for uri
	 */
	public String getUri() {
		return this.uri;
	}


	/**
	 * Setter for status
	 */
	public Invoice setStatus(String status) {
		this.status = status;
		return this;
	}

	/**
	 * Getter for status
	 */
	public String getStatus() {
		return this.status;
	}


	/**
	 * Setter for merchantInfo
	 */
	public Invoice setMerchantInfo(MerchantInfo merchantInfo) {
		this.merchantInfo = merchantInfo;
		return this;
	}

	/**
	 * Getter for merchantInfo
	 */
	public MerchantInfo getMerchantInfo() {
		return this.merchantInfo;
	}


	/**
	 * Setter for billingInfo
	 */
	public Invoice setBillingInfo(List<BillingInfo> billingInfo) {
		this.billingInfo = billingInfo;
		return this;
	}

	/**
	 * Getter for billingInfo
	 */
	public List<BillingInfo> getBillingInfo() {
		return this.billingInfo;
	}


	/**
	 * Setter for shippingInfo
	 */
	public Invoice setShippingInfo(ShippingInfo shippingInfo) {
		this.shippingInfo = shippingInfo;
		return this;
	}

	/**
	 * Getter for shippingInfo
	 */
	public ShippingInfo getShippingInfo() {
		return this.shippingInfo;
	}


	/**
	 * Setter for items
	 */
	public Invoice setItems(List<InvoiceItem> items) {
		this.items = items;
		return this;
	}

	/**
	 * Getter for items
	 */
	public List<InvoiceItem> getItems() {
		return this.items;
	}


	/**
	 * Setter for invoiceDate
	 */
	public Invoice setInvoiceDate(String invoiceDate) {
		this.invoiceDate = invoiceDate;
		return this;
	}

	/**
	 * Getter for invoiceDate
	 */
	public String getInvoiceDate() {
		return this.invoiceDate;
	}


	/**
	 * Setter for paymentTerm
	 */
	public Invoice setPaymentTerm(PaymentTerm paymentTerm) {
		this.paymentTerm = paymentTerm;
		return this;
	}

	/**
	 * Getter for paymentTerm
	 */
	public PaymentTerm getPaymentTerm() {
		return this.paymentTerm;
	}


	/**
	 * Setter for discount
	 */
	public Invoice setDiscount(Cost discount) {
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
	 * Setter for shippingCost
	 */
	public Invoice setShippingCost(ShippingCost shippingCost) {
		this.shippingCost = shippingCost;
		return this;
	}

	/**
	 * Getter for shippingCost
	 */
	public ShippingCost getShippingCost() {
		return this.shippingCost;
	}


	/**
	 * Setter for custom
	 */
	public Invoice setCustom(CustomAmount custom) {
		this.custom = custom;
		return this;
	}

	/**
	 * Getter for custom
	 */
	public CustomAmount getCustom() {
		return this.custom;
	}


	/**
	 * Setter for taxCalculatedAfterDiscount
	 */
	public Invoice setTaxCalculatedAfterDiscount(Boolean taxCalculatedAfterDiscount) {
		this.taxCalculatedAfterDiscount = taxCalculatedAfterDiscount;
		return this;
	}

	/**
	 * Getter for taxCalculatedAfterDiscount
	 */
	public Boolean getTaxCalculatedAfterDiscount() {
		return this.taxCalculatedAfterDiscount;
	}


	/**
	 * Setter for taxInclusive
	 */
	public Invoice setTaxInclusive(Boolean taxInclusive) {
		this.taxInclusive = taxInclusive;
		return this;
	}

	/**
	 * Getter for taxInclusive
	 */
	public Boolean getTaxInclusive() {
		return this.taxInclusive;
	}


	/**
	 * Setter for terms
	 */
	public Invoice setTerms(String terms) {
		this.terms = terms;
		return this;
	}

	/**
	 * Getter for terms
	 */
	public String getTerms() {
		return this.terms;
	}


	/**
	 * Setter for note
	 */
	public Invoice setNote(String note) {
		this.note = note;
		return this;
	}

	/**
	 * Getter for note
	 */
	public String getNote() {
		return this.note;
	}


	/**
	 * Setter for merchantMemo
	 */
	public Invoice setMerchantMemo(String merchantMemo) {
		this.merchantMemo = merchantMemo;
		return this;
	}

	/**
	 * Getter for merchantMemo
	 */
	public String getMerchantMemo() {
		return this.merchantMemo;
	}


	/**
	 * Setter for logoUrl
	 */
	public Invoice setLogoUrl(String logoUrl) {
		this.logoUrl = logoUrl;
		return this;
	}

	/**
	 * Getter for logoUrl
	 */
	public String getLogoUrl() {
		return this.logoUrl;
	}


	/**
	 * Setter for totalAmount
	 */
	public Invoice setTotalAmount(Currency totalAmount) {
		this.totalAmount = totalAmount;
		return this;
	}

	/**
	 * Getter for totalAmount
	 */
	public Currency getTotalAmount() {
		return this.totalAmount;
	}


	/**
	 * Setter for paymentDetails
	 */
	public Invoice setPaymentDetails(List<PaymentDetail> paymentDetails) {
		this.paymentDetails = paymentDetails;
		return this;
	}

	/**
	 * Getter for paymentDetails
	 */
	public List<PaymentDetail> getPaymentDetails() {
		return this.paymentDetails;
	}


	/**
	 * Setter for refundDetails
	 */
	public Invoice setRefundDetails(List<RefundDetail> refundDetails) {
		this.refundDetails = refundDetails;
		return this;
	}

	/**
	 * Getter for refundDetails
	 */
	public List<RefundDetail> getRefundDetails() {
		return this.refundDetails;
	}


	/**
	 * Setter for metadata
	 */
	public Invoice setMetadata(Metadata metadata) {
		this.metadata = metadata;
		return this;
	}

	/**
	 * Getter for metadata
	 */
	public Metadata getMetadata() {
		return this.metadata;
	}


	/**
	 * Creates a new invoice Resource.
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
		if (apiContext == null) {
			throw new IllegalArgumentException("APIContext cannot be null");
		}
		if (apiContext.getAccessToken() == null || apiContext.getAccessToken().trim().length() <= 0) {
			throw new IllegalArgumentException("AccessToken cannot be null or empty");
		}
		if (apiContext.getHTTPHeaders() == null) {
			apiContext.setHTTPHeaders(new HashMap<String, String>());
		}
		apiContext.getHTTPHeaders().put(Constants.HTTP_CONTENT_TYPE_HEADER, Constants.HTTP_CONTENT_TYPE_JSON);
		apiContext.setSdkVersion(new SDKVersionImpl());
		String resourcePath = "v1/invoicing/invoices";
		String payLoad = this.toJSON();
		return PayPalResource.configureAndExecute(apiContext, HttpMethod.POST, resourcePath, payLoad, Invoice.class);
	}


	/**
	 * Search for invoice resources.
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
		if (apiContext == null) {
			throw new IllegalArgumentException("APIContext cannot be null");
		}
		if (apiContext.getAccessToken() == null || apiContext.getAccessToken().trim().length() <= 0) {
			throw new IllegalArgumentException("AccessToken cannot be null or empty");
		}
		if (apiContext.getHTTPHeaders() == null) {
			apiContext.setHTTPHeaders(new HashMap<String, String>());
		}
		apiContext.getHTTPHeaders().put(Constants.HTTP_CONTENT_TYPE_HEADER, Constants.HTTP_CONTENT_TYPE_JSON);
		apiContext.setSdkVersion(new SDKVersionImpl());
		if (search == null) {
			throw new IllegalArgumentException("search cannot be null");
		}
		Object[] parameters = new Object[] {this.getId()};
		String pattern = "v1/invoicing/search";
		String resourcePath = RESTUtil.formatURIPath(pattern, parameters);
		String payLoad = search.toJSON();
		return PayPalResource.configureAndExecute(apiContext, HttpMethod.POST, resourcePath, payLoad, Invoices.class);
	}


	/**
	 * Sends a legitimate invoice to the payer.
	 * @param accessToken
	 *            Access Token used for the API call.
	 * @return 
	 * @throws PayPalRESTException
	 */
	public void send(String accessToken) throws PayPalRESTException {
		APIContext apiContext = new APIContext(accessToken);
		send(apiContext);
		return;
	}

	/**
	 * Sends a legitimate invoice to the payer.
	 * @param apiContext
	 *            {@link APIContext} used for the API call.
	 * @return 
	 * @throws PayPalRESTException
	 */
	public void send(APIContext apiContext) throws PayPalRESTException {
		if (apiContext == null) {
			throw new IllegalArgumentException("APIContext cannot be null");
		}
		if (apiContext.getAccessToken() == null || apiContext.getAccessToken().trim().length() <= 0) {
			throw new IllegalArgumentException("AccessToken cannot be null or empty");
		}
		if (apiContext.getHTTPHeaders() == null) {
			apiContext.setHTTPHeaders(new HashMap<String, String>());
		}
		apiContext.getHTTPHeaders().put(Constants.HTTP_CONTENT_TYPE_HEADER, Constants.HTTP_CONTENT_TYPE_JSON);
		apiContext.setSdkVersion(new SDKVersionImpl());
		if (this.getId() == null) {
			throw new IllegalArgumentException("Id cannot be null");
		}
		Object[] parameters = new Object[] {this.getId()};
		String pattern = "v1/invoicing/invoices/{0}/send";
		String resourcePath = RESTUtil.formatURIPath(pattern, parameters);
		String payLoad = "";
		PayPalResource.configureAndExecute(apiContext, HttpMethod.POST, resourcePath, payLoad, null);
		return;
	}


	/**
	 * Reminds the payer to pay the invoice.
	 * @param accessToken
	 *            Access Token used for the API call.
	 * @param notification
	 *            Notification
	 * @return 
	 * @throws PayPalRESTException
	 */
	public void remind(String accessToken, Notification notification) throws PayPalRESTException {
		APIContext apiContext = new APIContext(accessToken);
		remind(apiContext, notification);
		return;
	}

	/**
	 * Reminds the payer to pay the invoice.
	 * @param apiContext
	 *            {@link APIContext} used for the API call.
	 * @param notification
	 *            Notification
	 * @return 
	 * @throws PayPalRESTException
	 */
	public void remind(APIContext apiContext, Notification notification) throws PayPalRESTException {
		if (apiContext == null) {
			throw new IllegalArgumentException("APIContext cannot be null");
		}
		if (apiContext.getAccessToken() == null || apiContext.getAccessToken().trim().length() <= 0) {
			throw new IllegalArgumentException("AccessToken cannot be null or empty");
		}
		if (apiContext.getHTTPHeaders() == null) {
			apiContext.setHTTPHeaders(new HashMap<String, String>());
		}
		apiContext.getHTTPHeaders().put(Constants.HTTP_CONTENT_TYPE_HEADER, Constants.HTTP_CONTENT_TYPE_JSON);
		apiContext.setSdkVersion(new SDKVersionImpl());
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
		PayPalResource.configureAndExecute(apiContext, HttpMethod.POST, resourcePath, payLoad, null);
		return;
	}


	/**
	 * Cancels an invoice.
	 * @param accessToken
	 *            Access Token used for the API call.
	 * @param cancelNotification
	 *            CancelNotification
	 * @return 
	 * @throws PayPalRESTException
	 */
	public void cancel(String accessToken, CancelNotification cancelNotification) throws PayPalRESTException {
		APIContext apiContext = new APIContext(accessToken);
		cancel(apiContext, cancelNotification);
		return;
	}

	/**
	 * Cancels an invoice.
	 * @param apiContext
	 *            {@link APIContext} used for the API call.
	 * @param cancelNotification
	 *            CancelNotification
	 * @return 
	 * @throws PayPalRESTException
	 */
	public void cancel(APIContext apiContext, CancelNotification cancelNotification) throws PayPalRESTException {
		if (apiContext == null) {
			throw new IllegalArgumentException("APIContext cannot be null");
		}
		if (apiContext.getAccessToken() == null || apiContext.getAccessToken().trim().length() <= 0) {
			throw new IllegalArgumentException("AccessToken cannot be null or empty");
		}
		if (apiContext.getHTTPHeaders() == null) {
			apiContext.setHTTPHeaders(new HashMap<String, String>());
		}
		apiContext.getHTTPHeaders().put(Constants.HTTP_CONTENT_TYPE_HEADER, Constants.HTTP_CONTENT_TYPE_JSON);
		apiContext.setSdkVersion(new SDKVersionImpl());
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
		PayPalResource.configureAndExecute(apiContext, HttpMethod.POST, resourcePath, payLoad, null);
		return;
	}


	/**
	 * Mark the status of the invoice as paid.
	 * @param accessToken
	 *            Access Token used for the API call.
	 * @param paymentDetail
	 *            PaymentDetail
	 * @return 
	 * @throws PayPalRESTException
	 */
	public void recordPayment(String accessToken, PaymentDetail paymentDetail) throws PayPalRESTException {
		APIContext apiContext = new APIContext(accessToken);
		recordPayment(apiContext, paymentDetail);
		return;
	}

	/**
	 * Mark the status of the invoice as paid.
	 * @param apiContext
	 *            {@link APIContext} used for the API call.
	 * @param paymentDetail
	 *            PaymentDetail
	 * @return 
	 * @throws PayPalRESTException
	 */
	public void recordPayment(APIContext apiContext, PaymentDetail paymentDetail) throws PayPalRESTException {
		if (apiContext == null) {
			throw new IllegalArgumentException("APIContext cannot be null");
		}
		if (apiContext.getAccessToken() == null || apiContext.getAccessToken().trim().length() <= 0) {
			throw new IllegalArgumentException("AccessToken cannot be null or empty");
		}
		if (apiContext.getHTTPHeaders() == null) {
			apiContext.setHTTPHeaders(new HashMap<String, String>());
		}
		apiContext.getHTTPHeaders().put(Constants.HTTP_CONTENT_TYPE_HEADER, Constants.HTTP_CONTENT_TYPE_JSON);
		apiContext.setSdkVersion(new SDKVersionImpl());
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
		PayPalResource.configureAndExecute(apiContext, HttpMethod.POST, resourcePath, payLoad, null);
		return;
	}


	/**
	 * Mark the status of the invoice as refunded.
	 * @param accessToken
	 *            Access Token used for the API call.
	 * @param refundDetail
	 *            RefundDetail
	 * @return 
	 * @throws PayPalRESTException
	 */
	public void recordRefund(String accessToken, RefundDetail refundDetail) throws PayPalRESTException {
		APIContext apiContext = new APIContext(accessToken);
		recordRefund(apiContext, refundDetail);
		return;
	}

	/**
	 * Mark the status of the invoice as refunded.
	 * @param apiContext
	 *            {@link APIContext} used for the API call.
	 * @param refundDetail
	 *            RefundDetail
	 * @return 
	 * @throws PayPalRESTException
	 */
	public void recordRefund(APIContext apiContext, RefundDetail refundDetail) throws PayPalRESTException {
		if (apiContext == null) {
			throw new IllegalArgumentException("APIContext cannot be null");
		}
		if (apiContext.getAccessToken() == null || apiContext.getAccessToken().trim().length() <= 0) {
			throw new IllegalArgumentException("AccessToken cannot be null or empty");
		}
		if (apiContext.getHTTPHeaders() == null) {
			apiContext.setHTTPHeaders(new HashMap<String, String>());
		}
		apiContext.getHTTPHeaders().put(Constants.HTTP_CONTENT_TYPE_HEADER, Constants.HTTP_CONTENT_TYPE_JSON);
		apiContext.setSdkVersion(new SDKVersionImpl());
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
		PayPalResource.configureAndExecute(apiContext, HttpMethod.POST, resourcePath, payLoad, null);
		return;
	}


	/**
	 * Get the invoice resource for the given identifier.
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
		if (apiContext == null) {
			throw new IllegalArgumentException("APIContext cannot be null");
		}
		if (apiContext.getAccessToken() == null || apiContext.getAccessToken().trim().length() <= 0) {
			throw new IllegalArgumentException("AccessToken cannot be null or empty");
		}
		if (apiContext.getHTTPHeaders() == null) {
			apiContext.setHTTPHeaders(new HashMap<String, String>());
		}
		apiContext.getHTTPHeaders().put(Constants.HTTP_CONTENT_TYPE_HEADER, Constants.HTTP_CONTENT_TYPE_JSON);
		apiContext.setSdkVersion(new SDKVersionImpl());
		if (invoiceId == null) {
			throw new IllegalArgumentException("invoiceId cannot be null");
		}
		Object[] parameters = new Object[] {invoiceId};
		String pattern = "v1/invoicing/invoices/{0}";
		String resourcePath = RESTUtil.formatURIPath(pattern, parameters);
		String payLoad = "";
		return PayPalResource.configureAndExecute(apiContext, HttpMethod.GET, resourcePath, payLoad, Invoice.class);
	}


	/**
	 * Get all invoices of a merchant.
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
		if (apiContext == null) {
			throw new IllegalArgumentException("APIContext cannot be null");
		}
		if (apiContext.getAccessToken() == null || apiContext.getAccessToken().trim().length() <= 0) {
			throw new IllegalArgumentException("AccessToken cannot be null or empty");
		}
		if (apiContext.getHTTPHeaders() == null) {
			apiContext.setHTTPHeaders(new HashMap<String, String>());
		}
		apiContext.getHTTPHeaders().put(Constants.HTTP_CONTENT_TYPE_HEADER, Constants.HTTP_CONTENT_TYPE_JSON);
		apiContext.setSdkVersion(new SDKVersionImpl());
		String resourcePath = "v1/invoicing/invoices";
		String payLoad = "";
		return PayPalResource.configureAndExecute(apiContext, HttpMethod.GET, resourcePath, payLoad, Invoices.class);
	}


	/**
	 * Full update of the invoice resource for the given identifier.
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
		if (apiContext == null) {
			throw new IllegalArgumentException("APIContext cannot be null");
		}
		if (apiContext.getAccessToken() == null || apiContext.getAccessToken().trim().length() <= 0) {
			throw new IllegalArgumentException("AccessToken cannot be null or empty");
		}
		if (apiContext.getHTTPHeaders() == null) {
			apiContext.setHTTPHeaders(new HashMap<String, String>());
		}
		apiContext.getHTTPHeaders().put(Constants.HTTP_CONTENT_TYPE_HEADER, Constants.HTTP_CONTENT_TYPE_JSON);
		apiContext.setSdkVersion(new SDKVersionImpl());
		if (this.getId() == null) {
			throw new IllegalArgumentException("Id cannot be null");
		}
		Object[] parameters = new Object[] {this.getId()};
		String pattern = "v1/invoicing/invoices/{0}";
		String resourcePath = RESTUtil.formatURIPath(pattern, parameters);
		String payLoad = this.toJSON();
		return PayPalResource.configureAndExecute(apiContext, HttpMethod.PUT, resourcePath, payLoad, Invoice.class);
	}


	/**
	 * Delete invoice resource for the given identifier.
	 * @param accessToken
	 *            Access Token used for the API call.
	 * @return 
	 * @throws PayPalRESTException
	 */
	public void delete(String accessToken) throws PayPalRESTException {
		APIContext apiContext = new APIContext(accessToken);
		delete(apiContext);
		return;
	}

	/**
	 * Delete invoice resource for the given identifier.
	 * @param apiContext
	 *            {@link APIContext} used for the API call.
	 * @return 
	 * @throws PayPalRESTException
	 */
	public void delete(APIContext apiContext) throws PayPalRESTException {
		if (apiContext == null) {
			throw new IllegalArgumentException("APIContext cannot be null");
		}
		if (apiContext.getAccessToken() == null || apiContext.getAccessToken().trim().length() <= 0) {
			throw new IllegalArgumentException("AccessToken cannot be null or empty");
		}
		if (apiContext.getHTTPHeaders() == null) {
			apiContext.setHTTPHeaders(new HashMap<String, String>());
		}
		apiContext.getHTTPHeaders().put(Constants.HTTP_CONTENT_TYPE_HEADER, Constants.HTTP_CONTENT_TYPE_JSON);
		apiContext.setSdkVersion(new SDKVersionImpl());
		if (this.getId() == null) {
			throw new IllegalArgumentException("Id cannot be null");
		}
			apiContext.setMaskRequestId(true);
		Object[] parameters = new Object[] {this.getId()};
		String pattern = "v1/invoicing/invoices/{0}";
		String resourcePath = RESTUtil.formatURIPath(pattern, parameters);
		String payLoad = "";
		PayPalResource.configureAndExecute(apiContext, HttpMethod.DELETE, resourcePath, payLoad, null);
		return;
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