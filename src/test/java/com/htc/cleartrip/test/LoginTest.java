package com.htc.cleartrip.test;

import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.htc.cleartrip.base.TestBase;

public class LoginTest extends TestBase{
	
	@Test(dataProvider = "Test" , dataProviderClass = com.htc.cleartrip.util.Dataprovider.class)
	public void LoginTest(Map<String, String> data)  {
		Childtest=test.createNode("Login Test");
		h.tripButton();
		Childtest.pass("Trip Button Clicked");
		h.siginButton();
		Childtest=test.createNode("Sigin button clicked");
		si.signin(data.get("Username"),data.get("Password"));
		Childtest.pass("data entered and login button clicked");
		//	Assert.assertEquals("", null);
		
		Assert.assertEquals(h.message(), data.get("Message"));
		h.clicksignout();
		Childtest.pass("signout Button clicked");
		
		
		
}
}