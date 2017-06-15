package com.paypal.base.rest;

import com.paypal.base.Constants;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

public class RESTAPICallPreHandlerTest {

    @Test
    public void getBaseURL_returnsServiceEndpointIfSet() throws MalformedURLException {
        Map<String, String> configurations = new HashMap<String, String>();
        configurations.put(Constants.ENDPOINT, "https://www.example.com/abc");
        RESTAPICallPreHandler restapiCallPreHandler = new RESTAPICallPreHandler(configurations);

        URL result = restapiCallPreHandler.getBaseURL();

        assertNotNull(result);
        assertEquals(result.getHost(), "www.example.com");
        assertEquals(result.getPath(), "/abc/");
    }

    @Test
    public void getBaseURL_usesModeEndpointIfServiceEndpointNotSet() throws MalformedURLException {
        Map<String, String> configurations = new HashMap<String, String>();
        configurations.put(Constants.MODE, "sandbox");
        RESTAPICallPreHandler restapiCallPreHandler = new RESTAPICallPreHandler(configurations);

        URL result = restapiCallPreHandler.getBaseURL();

        assertNotNull(result);
        assertEquals(result.getHost(), "api.sandbox.paypal.com");
        assertEquals(result.getPath(), "/");
    }

    @Test(expectedExceptions = MalformedURLException.class, expectedExceptionsMessageRegExp = "service\\.EndPoint not set \\(OR\\) mode not configured to sandbox\\/live ")
    public void getBaseURL_throwsExceptionIfBothModeAndServiceEndpointNotSet() throws MalformedURLException {
        Map<String, String> configurations = new HashMap<String, String>();
        RESTAPICallPreHandler restapiCallPreHandler = new RESTAPICallPreHandler(configurations);

        restapiCallPreHandler.getBaseURL();
    }

}
