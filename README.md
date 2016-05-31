## PayPal REST API Java SDK [![Build Status](https://travis-ci.org/paypal/PayPal-Java-SDK.png?branch=master)](https://travis-ci.org/paypal/PayPal-Java-SDK)
This repository contains Java SDK and samples for REST API. For PayPal mobile(Android) SDK, please go to [PayPal Android SDK](https://github.com/paypal/PayPal-Android-SDK)

Prerequisites:
---------------
*	Java JDK 6 or higher
*	Apache Maven 3 or higher
*	Please refer http://maven.apache.org/guides/getting-started/maven-in-five-minutes.html for any help in Maven.
*	An environment which supports TLS 1.2 (see the [TLS-update site](https://github.com/paypal/TLS-update#java) for more information)

SDK Integration:
----------------

For Maven Users:
----------------

*	Create a new maven application.

*	Add dependency to sdk in your application's pom.xml as below.
		
		<dependency>
			<groupId>com.paypal.sdk</groupId>
			<artifactId>rest-api-sdk</artifactId>
			<version>LATEST</version>
		</dependency>
		
		
To make an API call:
--------------------
*	Import stub classes into your code. For example,

	```java
	import com.paypal.api.payments.*
	```
		
*	Copy the configuration file `sdk_config.properties` in `rest-api-sample/src/test/resources` folder to your application `src/main/resources`. And load it as a classloader resource,

	```java
	InputStream is = PaymentWithCreditCardServlet.class.getResourceAsStream("/sdk_config.properties");
	```
		
*	Or load config file from any custom location using absolute path with the below method calls as required,
	```java
	OAuthTokenCredential tokenCredential = Payment.initConfig(new File("../sdk_config.properties"));
						Or
	OAuthTokenCredential tokenCredential = Payment.initConfig(new InputStream(new File("../sdk_config.properties")));
						Or
	OAuthTokenCredential tokenCredential = Payment.initConfig(new Properties().load(new InputStream(new File("../sdk_config.properties"))));
	```

*   Create `accesstoken` from the above OAuthTokenCredential

    ```java
    String accessToken = tokenCredential.getAccessToken()
    ```

*	Alternatively, create `accesstoken` from `clientID` and `clientSecret` using `OAuthTokenCredential` 

	```java
	Map<String, String> map = new HashMap<String, String>();
	map.put("mode", "sandbox");
	String accessToken = new OAuthTokenCredential(clientID, clientSecret, map).getAccessToken();
	```
		
*	Depending on the context of API calls, calling method may be static or non-static (For example, most `GET` http methods are created as `static` methods within the resource). In all API calls, we need to pass `accessToken` created above as argument as shown below,
	 * If it is static, invoke it as a class method as like

		```java
		Payment.get(accessToken, paymentID);
		```
			
	 * If it is non-static, invoke it using resource object as like below. The API call takes a APIContext object in the place of AccessToken, APIContext object encapsulates Access Token and Request ID (used for idempotency).

		```java
		APIContext apiContext = new APIContext(accessToken);
				     (OR)
		APIContext apiContext = new APIContext(accessToken, requestId);
		Payment payment = new Payment();
		payment.setIntent("sale");
		...		
		payment.create(apiContext);
		```

*	[Future Payments](https://developer.paypal.com/docs/integration/mobile/make-future-payment/) sample is available [here](https://github.com/paypal/rest-api-sdk-java/blob/master/rest-api-sample/src/main/java/com/paypal/api/sample/FuturePaymentSample.java) for executing future payments for a customer who has granted consent on a mobile device.

*	For [Invoicing](https://developer.paypal.com/webapps/developer/docs/api/#invoicing), check out the [samples](https://github.com/paypal/rest-api-sdk-java/blob/master/rest-api-sample/src/main/java/com/paypal/api/sample/InvoiceSample.java) to see how you can use the node sdk to create, send and manage invoices.

## Running Samples
SDK Configuration:
------------------
The SDK uses Java properties format configuration file. Sample of this file is at 
 
`rest-api-sample/src/test/resources/`. You can use the `sdk_config.properties` configuration file to configure

*	HTTP connection parameters.

*	Service configuration.

*	Credentials	

## OpenID Connect Integration
   * Redirect your buyer to `Authorization.getRedirectUrl(redirectURI, scope, configurationMap);` to obtain authorization.
   * Capture the authorization code that is available as a query parameter (`code`) in the redirect url
   * Exchange the authorization code for a access token, refresh token, id token combo

```java
    Map<String, String> configurationMap = new HashMap<String, String>();
    configurationMap.put(Constants.CLIENT_ID, "...");
    configurationMap.put(Constants.CLIENT_SECRET, "...");
    configurationMap.put(Constants.ENDPOINT, "https://api.paypal.com/");
    APIContext apiContext = new APIContext();
    apiContext.setConfigurationMap(configurationMap);
    ...
    CreateFromAuthorizationCodeParameters param = new CreateFromAuthorizationCodeParameters();
    param.setCode(code);
    Tokeninfo info = Tokeninfo.createFromAuthorizationCode(apiContext, param);
    String accessToken = info.getAccessToken();
```
   * The access token is valid for a predefined duration and can be used for seamless XO or for retrieving user information

```java
    Map<String, String> configurationMap = new HashMap<String, String>();
    configurationMap.put(Constants.CLIENT_ID, "...");
    configurationMap.put(Constants.CLIENT_SECRET, "...");
    configurationMap.put(Constants.ENDPOINT, "https://api.paypal.com/");
    APIContext apiContext = new APIContext();
    apiContext.setConfigurationMap(configurationMap);
    ...
    Tokeninfo info = new Tokeninfo();
    info.setRefreshToken("refreshToken");
    UserinfoParameters param = new UserinfoParameters();
    param.setAccessToken(info.getAccessToken());
    Userinfo userInfo = Userinfo.userinfo(apiContext, param);
```
   * If the access token has expired, you can obtain a new access token using the refresh token from the 3'rd step.

```java
    Map<String, String> configurationMap = new HashMap<String, String>();
    configurationMap.put(Constants.CLIENT_ID, "...");
    configurationMap.put(Constants.CLIENT_SECRET, "...");
    configurationMap.put(Constants.ENDPOINT, "https://api.paypal.com/");
    APIContext apiContext = new APIContext();
    apiContext.setConfigurationMap(configurationMap);
    ...
    CreateFromRefreshTokenParameters param = new CreateFromRefreshTokenParameters();
    param.setScope("openid"); // Optional
    Tokeninfo info = new Tokeninfo // Create Token info object; setting the refresh token
    info.setRefreshToken("refreshToken");

    info.createFromRefreshToken(apiContext, param);
```
		
[![Bitdeli Badge](https://d2weczhvl823v0.cloudfront.net/paypal/rest-api-sdk-java/trend.png)](https://bitdeli.com/free "Bitdeli Badge")

## License
Code released under [SDK LICENSE](LICENSE)  

## Contributions 
 Pull requests and new issues are welcome. See [CONTRIBUTING.md](CONTRIBUTING.md) for details. 
