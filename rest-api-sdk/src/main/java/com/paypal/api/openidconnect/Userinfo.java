package com.paypal.api.openidconnect;

import com.paypal.base.Constants;
import com.paypal.base.rest.APIContext;
import com.paypal.base.rest.HttpMethod;
import com.paypal.base.rest.PayPalRESTException;
import com.paypal.base.rest.PayPalResource;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;

/**
 * Class Userinfo
 *
 */
@Getter
@Setter
public class Userinfo extends PayPalResource{

	/**
	 * Subject - Identifier for the End-User at the Issuer.
	 */
	private String userId;

	/**
	 * Subject - Identifier for the End-User at the Issuer.
	 */
	private String sub;

	/**
	 * End-User's full name in displayable form including all name parts, possibly including titles and suffixes, ordered according to the End-User's locale and preferences.
	 */
	private String name;

	/**
	 * Given name(s) or first name(s) of the End-User
	 */
	private String givenName;

	/**
	 * Surname(s) or last name(s) of the End-User.
	 */
	private String familyName;

	/**
	 * Middle name(s) of the End-User.
	 */
	private String middleName;

	/**
	 * URL of the End-User's profile picture.
	 */
	private String picture;

	/**
	 * End-User's preferred e-mail address.
	 */
	private String email;

	/**
	 * True if the End-User's e-mail address has been verified; otherwise false.
	 */
	private Boolean emailVerified;

	/**
	 * End-User's gender.
	 */
	private String gender;

	/**
	 * End-User's birthday, represented as an YYYY-MM-DD format. They year MAY be 0000, indicating it is omited. To represent only the year, YYYY format would be used.
	 */
	private String birthday;

	/**
	 * Time zone database representing the End-User's time zone
	 */
	private String zoneinfo;

	/**
	 * End-User's locale.
	 */
	private String locale;

	/**
	 * End-User's preferred telephone number.
	 */
	private String phoneNumber;

	/**
	 * End-User's preferred address.
	 */
	private Address address;

	/**
	 * Verified account status.
	 */
	private Boolean verifiedAccount;

	/**
	 * Account type.
	 */
	private String accountType;

	/**
	 * Account holder age range.
	 */
	private String ageRange;

	/**
	 * Account payer identifier.
	 */
	private String payerId;

	/**
	 * @return End-User's birthday, represented as an YYYY-MM-DD format
	 *
	 * @deprecated PayPal API returns 'birthday', use that instead
	 */
	@Deprecated
	public String getBirthdate() {
		return this.birthday;
	}

	/**
	 * @param birthdate End-User's birthday, represented as an YYYY-MM-DD format
	 *
	 * @deprecated PayPal API returns 'birthday', use that instead
	 */
	@Deprecated
	public void setBirthdate(String birthdate) {
		this.birthday = birthdate;
	}

	/**
	 * Returns user details
	 * @deprecated Please use {@link #getUserinfo(APIContext)} instead.
	 *
	 * @param accessToken
	 *            access token
	 * @return Userinfo
	 * @throws PayPalRESTException
	 */
	public static Userinfo getUserinfo(String accessToken)
			throws PayPalRESTException {
		APIContext apiContext = new APIContext(accessToken);
		return getUserinfo(apiContext);
	}

	/**
	 * Returns user details
	 *
	 * @param apiContext
	 *            {@link APIContext} to be used for the call.
	 * @return Userinfo
	 * @throws PayPalRESTException
	 */
	public static Userinfo getUserinfo(APIContext apiContext) throws PayPalRESTException {
		String resourcePath = "v1/identity/openidconnect/userinfo?schema=openid";
		String payLoad = "";
		String accessToken = apiContext.fetchAccessToken();
		HashMap<String, String> httpHeaders = new HashMap<String, String>();
		if (!accessToken.startsWith("Bearer ")) {
			accessToken = "Bearer " + accessToken;
		}
		httpHeaders.put(Constants.AUTHORIZATION_HEADER, accessToken);
		apiContext.addHTTPHeaders(httpHeaders);
		return configureAndExecute(apiContext, HttpMethod.GET,
								   resourcePath, payLoad, Userinfo.class);
	}
}