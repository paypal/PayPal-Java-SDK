REST API Samples
===================

This project contains a set of samples that you can explore to understand what the REST APIs can do for you. The sample comes pre-configured with a test account but in case you need to try them against your account, you must obtain your client id and client secret from the developer portal.

Build, run and debug the samples
--------------------------------

  * Simply run `./gradlew clean jettyRun` to start jetty server.
    * Run `./gradlew clean jettyRunDebug` to start jetty server in debug mode.
    See [Debugger support](http://akhikhl.github.io/gretty-doc/Debugger-support.html)
    and [Gretty tasks](http://akhikhl.github.io/gretty-doc/Gretty-tasks) for more info.

  * Access `http://localhost:<jetty-port>/rest-api-sample/` in your browser to view samples.
    * to assign a custom port for _Jetty_ server set gradle project property
    `jettyRunHttpPort` (in your custom `gradle.properties` file) or run
    the build gradle command with `-DjettyRunHttpPort` java argument:

      `./gradlew clean jettyRunDebug -DjettyRunHttpPort=9090`

Test Account
------------

   * Test Client ID and Client Secret can be found in the file sdk_config.properties file under src/main/resources/ folder.
   * The endpoint URL for token generation and API calls are fetched from sdk_config.properties file under src/main/resources/ folder.
   * AccessToken are generated once using GenerateAccessToken.java and used for the samples.

## OpenID Connect Integration

#### Obtain User's Consent
   * Obtain the redirect URL as shown below:
```java
// Initialize apiContext with proper credentials and environment.
APIContext context = new APIContext(clientID, clientSecret, "sandbox");

List<String> scopes = new ArrayList<String>() {{
    /**
    * 'openid'
    * 'profile'
    * 'address'
    * 'email'
    * 'phone'
    * 'https://uri.paypal.com/services/paypalattributes'
    * 'https://uri.paypal.com/services/expresscheckout'
    * 'https://uri.paypal.com/services/invoicing'
    */
    add("openid");
    add("profile");
    add("email");
}};
String redirectUrl = Session.getRedirectURL("UserConsent", scopes, context);
System.out.println(redirectUrl);
```
   * Capture the authorization code that is available as a query parameter (`code`) in the redirect url.
   * Exchange the authorization code for an access token or refresh token.

```java
// Initialize apiContext with proper credentials and environment.
APIContext context = new APIContext(clientID, clientSecret, "sandbox");

// Replace the code with the code value returned from the redirect on previous step.
Tokeninfo info = Tokeninfo.createFromAuthorizationCode(context, code);
String accessToken = info.getAccessToken();
String refreshToken = info.getRefreshToken();
```
   * The refresh token received can be stored permanently in your database, and reused later for fetching user information, or for third party invoicing (with proper scopes).

#### Obtain User Info
   * The refresh token can be used to retrieve user information as shown below:

```java
// Initialize apiContext with proper credentials and environment. Also, set the refreshToken retrieved from previous step.
APIContext userAPIContext = new APIContext(clientID, clientSecret, "sandbox").setRefreshToken(info.getRefreshToken());

Userinfo userinfo = Userinfo.getUserinfo(userAPIContext);
System.out.println(userinfo);
```
