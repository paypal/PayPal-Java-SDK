## PayPal REST API Java SDK [![Build Status](https://travis-ci.org/paypal/rest-api-sdk-java.png?branch=master)](https://travis-ci.org/paypal/rest-api-sdk-java)
This repository contains Java SDK and samples for REST API.

Prerequisites:
---------------
*	Java JDK-1.5 or higher
*	Apache Maven 3 or higher
*	Please refer http://maven.apache.org/guides/getting-started/maven-in-five-minutes.html for any help in Maven.

SDK Core Dependency:
---------------------
*	Source code for core files are present at https://github.com/paypal/sdk-core-java.

To build sdk and samples:
--------------------------
*	Run `mvn install` to build sdk jar and sample war files.

SDK Integration:
----------------
*	Create a new maven application.

*	Add dependency to sdk in your application's pom.xml as below.
		
		<dependency>
			<groupId>com.paypal.sdk</groupId>
			<artifactId>rest-api-sdk</artifactId>
			<version>0.5.2</version>
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
	Payment.initConfig(new File("../sdk_config.properties"));
						Or
	Payment.initConfig(new InputStream(new File("../sdk_config.properties")));
						Or
	Payment.initConfig(new Properties().load(new InputStream(new File("../sdk_config.properties"))));
	```

*	Create `accesstoken` from `clientID` and `clientSecret` using `OAuthTokenCredential` 

	```java
	String accessToken = new OAuthTokenCredential(clientID, clientSecret).getAccessToken();
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

		
SDK Configuration:
------------------
The SDK uses Java properties format configuration file. Sample of this file is at 
 
`rest-api-sample/src/test/resources/`. You can use the `sdk_config.properties` configuration file to configure

*	HTTP connection parameters.

*	Service configuration.

*	Credentials	
		

