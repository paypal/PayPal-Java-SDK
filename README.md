## PayPal REST API Java SDK [![Build Status](https://travis-ci.org/paypal/PayPal-Java-SDK.svg?branch=master)](https://travis-ci.org/paypal/PayPal-Java-SDK)

![Home Image](https://raw.githubusercontent.com/wiki/paypal/PayPal-Java-SDK/images/homepage.jpg)

This repository contains Java SDK and samples for REST API. For PayPal mobile(Android) SDK, please go to [PayPal Android SDK](https://github.com/paypal/PayPal-Android-SDK)

## Please Note
> **The Payment Card Industry (PCI) Council has [mandated](http://blog.pcisecuritystandards.org/migrating-from-ssl-and-early-tls) that early versions of TLS be retired from service.  All organizations that handle credit card information are required to comply with this standard. As part of this obligation, PayPal is updating its services to require TLS 1.2 for all HTTPS connections. At this time, PayPal will also require HTTP/1.1 for all connections. [Click here](https://github.com/paypal/tls-update) for more information. Connections to the sandbox environment use only TLS 1.2.**

## Direct Credit Card Support
> **Important: The PayPal REST API no longer supports new direct credit card integrations.**  Please instead consider [Braintree Direct](https://www.braintreepayments.com/products/braintree-direct); which is, PayPal's preferred integration solution for accepting direct credit card payments in your mobile app or website. Braintree, a PayPal service, is the easiest way to accept credit cards, PayPal, and many other payment methods.

## PayPal Checkout v2
Please note that if you are integrating with PayPal Checkout, this SDK and corresponding API [v1/payments](https://developer.paypal.com/docs/api/payments/v1/) are in the process of being deprecated.

We recommend that you integrate with API [v2/checkout/orders](https://developer.paypal.com/docs/api/orders/v2/) and [v2/payments](https://developer.paypal.com/docs/api/payments/v2/). Please refer to the [Checkout Java SDK](https://github.com/paypal/Checkout-Java-SDK) to continue with the integration.

## 2.0 Release Candidate!
We're releasing a [brand new version of our SDK!](https://github.com/paypal/PayPal-Java-SDK/tree/2.0-beta) 2.0 is currently at release candidate status, and represents a full refactor, with the goal of making all of our APIs extremely easy to use. 2.0 includes all of the existing APIs, and includes the new Orders API (disputes and Marketplace coming soon). Check out the [FAQ and migration guide](https://github.com/paypal/PayPal-java-SDK/tree/2.0-beta/docs), and let us know if you have any suggestions or issues!

## Prerequisites
* Java JDK 6 or higher
* An environment which supports TLS 1.2 (see the [TLS-update site](https://github.com/paypal/TLS-update#java) for more information)

## Integration

#### Gradle
```gradle
repositories {
	mavenCentral()
}
dependencies {
	compile 'com.paypal.sdk:rest-api-sdk:+'
}
```
#### Others
- For Maven and other options, follow [instructions here](https://github.com/paypal/PayPal-Java-SDK/wiki/Installation)

## Get Started
- [Make your first call](https://github.com/paypal/PayPal-Java-SDK/wiki/Making-First-Call).
- [Run Samples project](rest-api-sample).

License
--------------------
Code released under [SDK LICENSE](LICENSE)

Contributions
--------------------
Pull requests and new issues are welcome. See [CONTRIBUTING.md](CONTRIBUTING.md) for details.
