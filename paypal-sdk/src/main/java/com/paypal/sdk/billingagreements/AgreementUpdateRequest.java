// This class was generated on Tue, 23 Jan 2018 17:16:08 CST by version 0.1.0-dev+20fb1e of Braintree SDK Generator
// AgreementUpdateRequest.java
// @version 0.1.0-dev+20fb1e
// @type request
// @data H4sIAAAAAAAC/7SVQW8TPxDF7/9PMZqz/0nhwGFvVQNqQbSBFi6oaifrSdaVYxt7trCq8t2Rvdu02SBKERz3eTx+P7+Jc4entGaskFaRec1OJm3QJIwKZ5zqaIIY77DCT0VOoFnI2AR+CQQLY61xK9juVrDo4GQ2gdlQZlxtW80gDYN+aKggNSaEslfryCkpSEJRIJ+igJyG5MG7CSr80HLs5hRpzcIxYfXlUuExk+Y4Vt/4uB5rc5JmR7vDiy5k6CTRuBUq/EzR0MLy+DKujEaF77gbFvZu5aJhOJnly8iA230gHvp7zP4PY6SuP/JA4UcmfeZsh9WSbOIsfG1NZI2VxJYVzqMPHMVwwsq11m4u+xpO0jfZ+n97fnYKc5K62WcIWb6K/b4diPHKLtGhA8p+M1PpX8rBL264lpTBKATbQaAohuyAWRYiJ9/GmtMI+tUvoQfhMfXTCS2jX+9ADcKIZSDwxgnHbDGnZH1NuQCMK99CccUC2tdtyS63gm+NqZu8Y+1v++m9JdvyBO6Nw9LHol/nimvI7kvbZyX+E/gSuXryBnzY4S+f+7O5dZVRar8Olp85k3/uMJA048FrfiMjejIhkod87qFK4b8KoZ/+fcQyEzuM98p+FGVl+/uZQNauI4+mB7TnBM4LxN4f0DB5f4PocpOrUvAucd8nywqPvBN2w/OC2aDpE5jeJO9Q4bFIeM/SeI0Vzg8vjo6xf1ixwunti2mgLieTpsM/wv/bpzBN7x4/pxtU+Pp74FpYnwtJm468ZqxeHhxs/vsBAAD//w==
// DO NOT EDIT
package com.paypal.sdk.billingagreements;

import com.braintreepayments.http.*;
import java.util.*;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
/**
 * Updates details of a billing agreement, by ID. Details include the description, shipping address, start date, and so on.
 */
public class AgreementUpdateRequest extends HttpRequest<Void> {

    public AgreementUpdateRequest(String agreementId) {
        super("/v1/payments/billing-agreements/{agreement_id}?", "PATCH", Void.class);
        try {
            path(path().replace("{agreement_id}", URLEncoder.encode(String.valueOf(agreementId), "UTF-8")));
        } catch (UnsupportedEncodingException ignored) {}
        
        header("Content-Type", "application/json");
    }
    

    public AgreementUpdateRequest requestBody(List<JsonPatch> patchRequest) {
        super.requestBody(patchRequest);
        return this;
    }
}
