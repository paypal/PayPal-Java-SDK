// This class was generated on Sat, 07 Apr 2018 21:37:44 UTC by version 0.1.0-dev+843c6b-dirty of Braintree SDK Generator
// OrderCaptureRequest.java
// @version 0.1.0-dev+843c6b-dirty
// @type request
// @data H4sIAAAAAAAC/+xcX3PbNhJ/v0+xw9xDnKFJp2nSVm+epJ3orq19kdoXn0eCiJWImgRYAJTMy+S73wAgRFGU/7Wupg940mDxh7v4LRa7ix19jn4mJUajSEiKMslIpWuJURx9QJVJVmkmeDSK3ju6AgIVaUrkGpZCAuFg58WwaGD8IYGpgFoh6JwpyEhRxKBzBCHZinFSbOeaLihrpUFVmLFlY1aa26XmwLhGrhMYczv5X5OLn0Hi7zUqDQtBmxgYz4qaou32S5JS1OaHU2CcsoxohE2OOkfp2bEiAFN23tIy5IlGGEMltc6FZP8jRu4kiqP/1CibSyJJiRqlikZX13H0EQlFuU/9Qchyn3ZJdN6jfY6mTWX2W2nJ+CqKo1+JZGRR4C4OM0ajOPo3Ni1xgMc0Rxh/ALFs95caKYUXxzB+LiVp3LfO4ugTEnrBiyYaLUmh0BB+r5lEGo20rDGOLqWoUGqGKhrxuii+XLsxqLRbZMv4+62K7HHe6U7H+F36ZPj3e68l4YpkpgcoasIK9SQBWsKuBN02O7UYMruld7xuSUNW+0oWw4bp/Pl5vUslslpK5FnT39mOOOT3SucS8TTLiSSZRgnjycXp11+9/gb8NMgExeuXKRWZSs2JW0mr8yllEjOdSlQ69YNPzWCVniRwSZpLUgAVqIALDaquKiE1mPPcjmaonkP/4j0IZ+12D7en6+h2p6MNN4dQykzTyOGGAVmIWh8wJ389tiu21LONJFWP/V3qUADTC6YXlogJ/ERuWVmXUCBf6dzYt9dnsIVexbDJWZZ7o6lG/63Pzt5kdWF/0bUK5loTXCMHylZMK1jgUkhnZSlmrDQGXDCuEzcn9ZP6S0yfOHwj/PfIUqN87OdSL8CfhGhP2e7CKSecFoyvZkvsW7i9jiFafkAAy7Ds7AXS7Y3bWhR/7krUuaAgeNEkx0GWcVVLwrM+rLvUIabb3gBqD1QD2/3IHglUlbOqcj0dpjvEIaS+MyB6NJvqt3xGmcoG7tih3vthAz8ynMi/n5lV9UILTYo+xh3xALRtpw/tvChMY6kSGLvYx0eGHkooGG/HxC7wqxyzjdGCV69kK8urV+GUHwV4TW57mLv2EG5NbgMiz4DI9WMwGZzEu49h7wwaKFZIQQsfLSHCotk2ZAI/CAkSlzWnKgaJlUSFXLukS7uKzonemd+O9ovuZovMgkEn/nQu5xEqkUkkGmealXsZnB59qB6UaLRZNzPCJ6Ta1E4MjMPVmGuUHPXe0KWQJdHXL3OtKzVKUy1EoRKGepkIuUpzXRapXGZv3rz57oVCmx46fZu8OzlWWNDPwNnmfTm4A9msowUwa8EynPG6XKDci2L2ug6FMnYIuCH2DEqS3bRXp3MXnlmQhRAFEn5AEjWzadnZoVTigc6+NOM27au6vK8AiQUShTZBJbEkjBtnMceCgjU6zyxawfjNjHZszcTiN8wO5B/NwH7KylP6Qp1zIIY9o2atq3MqsSDGt7v6eD79/uJ8AnaqT+aRiqVijXLNcJO+yIlGQdSpHbJ/dt49fz4rl7js50cc4UD6V5RVgdpc/HKFGn759KN9PyjJDbaenRPTvSNkolwYz870tN6rzcJaPb365dMYplhWZsapsywa6YPG5d3bb85O7Pa5e6uSeFpJkaFSjK/6Dw3zf85jmL+cx9aEzU/mO3dQAkaiuZF17h8YbrABD5CRVXD0V58FA8h2C5yMTh5i/F5lkG7fSY5kRdye9qDbkobgfZxOLz0M3qM2x+0geEeSQGLfpXHtA8lxs/2OQSY46KbCBxXl7Xfffru9hb4+8T6HQrlGBUQB4eYusG9iFl4HdM1JuWCrWtSqaMDZhQU6/VBYEq5ZpvwN4tRwgghXP5oVPrUcqo67zWaTMMKJ5Y0oxVbc2GeVmrmnXqT9ZnJrxHiei/MxrkRFJHI9ay+PHiaDrvuuVB+sCt5utz3ru89FTMGCKKRH0zCiBJ9lguKepu3ShyK5fvvk4vSi04RN7pznXamUNo6SuX6RU3NdWY96jfJ4kloW+qF6S7n7Hc+OSOBXUtSG+3v9cNcyG+LaraSt69vRnWHdebptB97vc++vvrWzD6yfEwWqzoz5X9ZF0XQG+mnfcwHNg5/bEAXuO37C0z5TEakZKYpm9oQPbif9wY9S5Ozgh9oMk9lDilnBuLsR2ut0cHaPmpvYeSzdj4Q7jgZPO8O+A8rv31ONU7CTqCLPGQiEJ+L6j5mxtbFFvT3xlAPPwu7FF8Y+kWgvaVuewpD6+Egs+9G8j+SVOY1EC7lNU17dtaH+MkeebNgNq5Ayd6GbVjqeXMzMrBfnmWZrtJeKOkmOlAWoK3owC9CnP5QF2OTIWy9QiVpmzvIURGlwC9G/b2bg+osZpSrBFT628uXhWp1Q6xIMWah1CbUuodYlPMKGWpdQ6xJqXUKtS6h1CbUuodYl1LoEREKtS6h1CbUuodYl1LqEWpdQ6xJqXUKtS6h1CbUuodYl1LqEWpdQ6xJqXcITcah1CbUuf02ty3th/27H1x9UVWECS6P6vylh4taPWlc/Oe94FF1eTKaR+1ubaBSl69dp67io1P4JjUo/+z+w+ZJ2wevkhlVbNr6/rTDTSCea6Fq9N47E6Kuz11/+8X8AAAD//w==
// DO NOT EDIT
package com.paypal.sdk.v1.payments;

import com.braintreepayments.http.*;
import java.util.*;
import java.util.stream.Collectors;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
/**
 * Captures a payment for an order, by ID. To use this call, the original payment call must specify an `order` intent. In the JSON request body, include the payment amount and indicate whether this capture is the final capture for the authorization.
 */
public class OrderCaptureRequest extends HttpRequest<Capture> {

    public OrderCaptureRequest(String orderId) {
        super("/v1/payments/orders/{order_id}/capture?", "POST", Capture.class);
        try {
            path(path().replace("{order_id}", URLEncoder.encode(String.valueOf(orderId), "UTF-8")));
        } catch (UnsupportedEncodingException ignored) {}
        
        header("Content-Type", "application/json");
    }
    

    public OrderCaptureRequest requestBody(Capture capture) {
        super.requestBody(capture);
        return this;
    }
}
