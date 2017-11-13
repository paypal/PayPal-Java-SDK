package com.paypal.base.rest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.paypal.base.rest.APIContext;

public class APIContextTest {

	@Test
	public void testIsRequestIdSetIfNoMethodCalled() {
    APIContext apiContext = new APIContext();
    Assert.assertFalse(apiContext.isRequestIdSet());
	}

	@Test
	public void testIsRequestIdSetIfGetRequestIdCalled() {
    APIContext apiContext = new APIContext();
    Assert.assertNotNull(apiContext.getRequestId());
    Assert.assertTrue(apiContext.isRequestIdSet());
	}

	@Test
	public void testIsRequestIdSetIfSetRequestIdCalled() {
    APIContext apiContext = new APIContext();
    final String randomRequestId = "random-id";
    apiContext.setRequestId(randomRequestId);
    Assert.assertTrue(apiContext.isRequestIdSet());
    Assert.assertEquals(randomRequestId, apiContext.getRequestId());
	}

}
