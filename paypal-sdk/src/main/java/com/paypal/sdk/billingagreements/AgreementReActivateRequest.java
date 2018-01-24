// This class was generated on Tue, 23 Jan 2018 17:16:08 CST by version 0.1.0-dev+20fb1e of Braintree SDK Generator
// AgreementReActivateRequest.java
// @version 0.1.0-dev+20fb1e
// @type request
// @data H4sIAAAAAAAC/6RUwW7bMAy97ysInt24G3byLWg2NBvWZE2wy1CktMXEKhzJpehuRpB/Hxy7TuIAHYZdbOiJIvneo7TDO9oyJkgbYd6y05HwFWVqX0gZI5xwyMSWar3DBO+PewEIQhVKdoYNpLYorNtAnyaCtIbpZARTB5ozfFnM7kD4ueKgkHpTR2BdVlSGgRw89udWQUl5ZbqyXh7Bp0+cKfyymrcfAueVQXNSaANTDocqwhS8g7WXbvnarvUOyJkD2tcC2vqq+TkDWSXCLqtHGOH3iqWek9CWlSVg8vMhwlsmwzJEP3vZDrE5aX6G7XBZl43IQcW6DUb4g8RSWvBQ/JU1GOFXrruNCwOWOcN0An49YKL+hCw3JMYiVLd1ryO8ZzIzV9SYrKkI3ADPlRU2mKhUHOFcfMmilgMmriqK/UMbw0HbJD2JcV900VgFk96qt4gNbT2j+WbYuQBjMMf1qw6teQqH0xfi/JMaHXAqx9/9a8bxjFAHXHo3GNCjgW3rWU5uw//bcOvfvokKpXeB2zwNHOGNd8quMxWpLAubHe5H/BS8wwhvVctvrLk3mOB8tlhiO9KYYPzyPi6pbhoOcXflr3oOId6dDvI+Pn9JPv0uOVM2zdRU4cYbxuTD9cf9uz8AAAD//w==
// DO NOT EDIT
package com.paypal.sdk.billingagreements;

import com.braintreepayments.http.*;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
/**
 * Re-activates a suspended billing agreement, by ID. In the JSON request body, include an `agreement_state_descriptor` object with with a note that describes the reason for the re-activation and the agreement amount and currency.
 */
public class AgreementReActivateRequest extends HttpRequest<Void> {

    public AgreementReActivateRequest(String agreementId) {
        super("/v1/payments/billing-agreements/{agreement_id}/re-activate?", "POST", Void.class);
        try {
            path(path().replace("{agreement_id}", URLEncoder.encode(String.valueOf(agreementId), "UTF-8")));
        } catch (UnsupportedEncodingException ignored) {}
        
        header("Content-Type", "application/json");
    }
    

    public AgreementReActivateRequest requestBody(AgreementStateDescriptor agreementStateDescriptor) {
        super.requestBody(agreementStateDescriptor);
        return this;
    }
}
