package com.paypal.core.object;

import com.braintreepayments.http.serializer.Deserializable;
import com.braintreepayments.http.serializer.Serializable;
import com.paypal.core.Authorization;

import java.util.Date;
import java.util.Map;

public class AccessToken implements Authorization, Serializable, Deserializable {

	private final transient Date createDate = new Date();

	private String accessToken;

	private String tokenType = "Bearer";

    private Integer expiresIn;

	public boolean isExpired() {
    	Date expireDate = new Date(createDate.getTime() + (expiresIn * 1000));
    	return new Date().after(expireDate);
    }

	public String accessToken() {
		return accessToken;
	}

	public String tokenType() {
		return tokenType;
	}

	public Integer expiresIn() {
		return expiresIn;
	}

	public Date createDate() {
		return createDate;
	}

	@Override
	public String authorizationString() {
		return String.format("Bearer %s", accessToken);
	}

	@Override
	public void serialize(Map<String, Object> serialized) {
		if (this.accessToken != null) {
			serialized.put("access_token", accessToken);
		}
		if (this.tokenType != null) {
			serialized.put("token_type", tokenType);
		}
		if (this.expiresIn != null) {
			serialized.put("expires_in", expiresIn);
		}
	}

	@Override
	public void deserialize(Map<String, Object> fields) {
		if (fields.containsKey("access_token")) {
			this.accessToken = (String) fields.get("access_token");
		}
		if (fields.containsKey("token_type")) {
			this.tokenType = (String) fields.get("token_type");
		}
		if (fields.containsKey("expires_in")) {
			this.expiresIn = (Integer) fields.get("expires_in");
		}
	}
}
