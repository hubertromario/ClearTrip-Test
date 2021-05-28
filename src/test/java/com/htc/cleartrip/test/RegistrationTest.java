package com.htc.cleartrip.test;

import java.util.Map;

import org.testng.annotations.Test;

import com.htc.cleartrip.base.TestBase;

public class RegistrationTest extends TestBase{


	
	@Test(dataProvider = "Test" , dataProviderClass = com.htc.cleartrip.util.Dataprovider.class)
	public void registrationTest(Map<String, String> data) throws Exception  {
		h.tripButton();
		Childtest.pass("Trip Button Clicked");
		h.registerButton();
		Childtest.pass("registration Button has been Clicked");
		r.register(data.get("Email"),data.get("Password"),data.get("Fname"),data.get("Lname"),data.get("Mobile"));
		Childtest.pass("Register Button Clicked");
		//h.clicksignout();
}
}
