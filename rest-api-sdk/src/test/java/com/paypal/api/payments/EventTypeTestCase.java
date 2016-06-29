package com.paypal.api.payments;

import java.util.UUID;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import com.paypal.base.rest.OAuthTokenCredential;
import com.paypal.base.rest.PayPalRESTException;

public class EventTypeTestCase {
	
	private static final Logger logger = Logger.getLogger(EventTypeTestCase.class);
	
	public static EventType createEventType() {
		EventType eventType = new EventType();
		eventType.setName(WebhooksInputData.availableEvents[0][0]);
		eventType.setDescription(WebhooksInputData.availableEvents[0][1]);
		return eventType;
	}

	@Test(groups = "unit")
	public void testEventConstruction() {
		EventType eventType = createEventType();
		Assert.assertEquals(eventType.getName(), WebhooksInputData.availableEvents[0][0]);
		Assert.assertEquals(eventType.getDescription(), WebhooksInputData.availableEvents[0][1]);
	}

	@Test(groups = "unit")
	public void testTOJSON() {
		EventType eventType = createEventType();
		Assert.assertEquals(eventType.toJSON().length() == 0, false);
		logger.info("EventTypeJSON = " + eventType.toJSON());
	}

	@Test(groups = "unit")
	public void testTOString() {
		EventType eventType = createEventType();
		Assert.assertEquals(eventType.toString().length() == 0, false);
	}
	
	@Test(groups = "integration")
	public void testSubscribedEventTypes() throws PayPalRESTException {
		logger.info("**** Subscribed EventTypes ****");
		TokenHolder.accessToken = new OAuthTokenCredential(WebhooksInputData.CLIENT_ID, WebhooksInputData.CLIENT_SECRET).getAccessToken();
		logger.info("Generated Access Token = " + TokenHolder.accessToken);
		
		Webhook webhookRequest = new Webhook();
		String uuid = UUID.randomUUID().toString();
		webhookRequest.setUrl(WebhooksInputData.WEBHOOK_URL + uuid);
		webhookRequest.setEventTypes(EventTypeListTestCase.createAuthEventTypeList());
		Webhook webhookResponse = webhookRequest.create(TokenHolder.accessToken, webhookRequest);
		String webhookId =  webhookResponse.getId();
		
		EventTypeList eventTypeList = EventType.subscribedEventTypes(TokenHolder.accessToken, webhookId);
		logger.info("Response = " + eventTypeList.toJSON());

		Assert.assertNotNull(eventTypeList.getEventTypes());
		Assert.assertEquals(eventTypeList.getEventTypes().size(), 2);
		Assert.assertEquals(eventTypeList.getEventTypes().get(0).getName(), WebhooksInputData.availableEvents[2][0]);
		Assert.assertEquals(eventTypeList.getEventTypes().get(1).getName(), WebhooksInputData.availableEvents[1][0]);
		Assert.assertNotEquals(eventTypeList.getEventTypes().size(), WebhooksInputData.availableEvents.length);
	}
	
	@Test(groups = "integration")
	public void testAvailableEventTypes() throws PayPalRESTException {
		logger.info("**** Available EventTypes ****");
		TokenHolder.accessToken = new OAuthTokenCredential(WebhooksInputData.CLIENT_ID, WebhooksInputData.CLIENT_SECRET).getAccessToken();
		logger.info("Generated Access Token = " + TokenHolder.accessToken);
		
		EventTypeList eventTypeList = EventType.availableEventTypes(TokenHolder.accessToken);
		logger.info("Response = " + eventTypeList.toJSON());

		Assert.assertNotNull(eventTypeList.getEventTypes());
		Assert.assertTrue(eventTypeList.getEventTypes().size() > WebhooksInputData.availableEvents.length);
	}

}
