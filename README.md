## PayPal REST API Java SDK [![Build Status](https://travis-ci.org/paypal/PayPal-Java-SDK.svg?branch=master)](https://travis-ci.org/paypal/PayPal-Java-SDK) [![Coverage Status](https://coveralls.io/repos/github/paypal/PayPal-Java-SDK/badge.svg?branch=master)](https://coveralls.io/github/paypal/PayPal-Java-SDK?branch=master)
This repository contains Java SDK and samples for REST API. For PayPal mobile(Android) SDK, please go to [PayPal Android SDK](https://github.com/paypal/PayPal-Android-SDK)

## Please Note
> **The Payment Card Industry (PCI) Council has [mandated](http://blog.pcisecuritystandards.org/migrating-from-ssl-and-early-tls) that early versions of TLS be retired from service.  All organizations that handle credit card information are required to comply with this standard. As part of this obligation, PayPal is updating its services to require TLS 1.2 for all HTTPS connections. At this time, PayPal will also require HTTP/1.1 for all connections. [Click here](https://github.com/paypal/tls-update) for more information**

Prerequisites:
---------------
* Java JDK 6 or higher
* An environment which supports TLS 1.2 (see the [TLS-update site](https://github.com/paypal/TLS-update#java) for more information)

SDK Integration:
----------------

#### Maven
```xml
<dependency>
	<groupId>com.paypal.sdk</groupId>
	<artifactId>rest-api-sdk</artifactId>
	<version>LATEST</version>
</dependency>
```
#### Gradle
```gradle
repositories {
	mavenCentral()
}
dependencies {
	compile 'com.paypal.sdk:rest-api-sdk:*'
}
```
#### Other
- You can view more options to include PayPal-Java-SDK in your project at [Maven Repository Viewer](http://mvnrepository.com/artifact/com.paypal.sdk/rest-api-sdk)

To make an API call:
--------------------
1. Fetch the clientId and secret from [PayPal Developer Dashboard](https://developer.paypal.com/)

	```java
	// Replace these values with your clientId and secret. You can use these to get started right now.
	String clientId = "AYSq3RDGsmBLJE-otTkBtM-jBRd1TCQwFf9RGfwddNXWz0uFU9ztymylOhRS";
	String clientSecret = "EGnHDxD_qRPdaLdZz8iCr8N7_MzF-YHPTkjs6NKYQvQSBngp4PTTVWkPZRbL";
	```
2. Create an `ApiContext`

	```java
	APIContext context = new APIContext(clientId, clientSecret, "sandbox");
	```
4. Fetch a Payment by ID

	```java
	Payment payment = Payment.get(context, "PAY-4T698276NC427425EK5QIV7Y");
	System.out.println(payment);
	```
6. Visit [Developer Docs](https://developer.paypal.com/docs/api/) for more PayPal REST APIs.

* [Future Payments](https://developer.paypal.com/docs/integration/mobile/make-future-payment/) sample is available [here](https://github.com/paypal/rest-api-sdk-java/blob/master/rest-api-sample/src/main/java/com/paypal/api/sample/FuturePaymentSample.java) for executing future payments for a customer who has granted consent on a mobile device.

* For [Invoicing](https://developer.paypal.com/webapps/developer/docs/api/#invoicing), check out the [samples](https://github.com/paypal/rest-api-sdk-java/blob/master/rest-api-sample/src/main/java/com/paypal/api/sample/InvoiceSample.java) to see how you can use the java sdk to create, send and manage invoices.

Running Samples
--------------------
Please refer to [rest-api-sample](rest-api-sample) project for running samples.

License
--------------------
Code released under [SDK LICENSE](LICENSE)

Contributions
--------------------
Pull requests and new issues are welcome. See [CONTRIBUTING.md](CONTRIBUTING.md) for details.
