package com.htc.cleartrip.test;

import java.util.Map;

import org.testng.annotations.Test;

import com.htc.cleartrip.base.TestBase;

public class TrainBookingTest extends TestBase {
	
	@Test(dataProvider = "Test" , dataProviderClass = com.htc.cleartrip.util.Dataprovider.class,priority=1)
	public void LoginTest(Map<String, String> data)  {
		h.tripButton();
	//	Childtest.pass("Trip Button Clicked");
		h.siginButton();
		Childtest=test.createNode("Sigin button clicked");
		try {
			Thread.sleep(5000);
			try {
				si.signin(data.get("Username"),data.get("Password"));
				Childtest.pass("data entered and login Button clicked");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		//	Assert.assertEquals("", null);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test(dataProvider = "Test" , dataProviderClass = com.htc.cleartrip.util.Dataprovider.class,priority=2)
	public void TrainBookingTest(Map<String, String> data) throws Exception {
		h.clickTrainButton();
		Childtest=test.createNode("Train button clicked");
		Childtest.pass("Train Button Clicked");
		t.Trainsearch(data.get("Typee"),data.get("TravelDate"));
	}
}
