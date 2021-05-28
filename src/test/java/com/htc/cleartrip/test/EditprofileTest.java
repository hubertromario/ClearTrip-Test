package com.htc.cleartrip.test;

import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.htc.cleartrip.base.TestBase;

public class EditprofileTest extends TestBase{
	
	@Test(dataProvider = "Test" , dataProviderClass = com.htc.cleartrip.util.Dataprovider.class,priority=1)
	public void LoginTest(Map<String, String> data)  {
		h.tripButton();
		Childtest.pass("Trip Button Clicked");
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
	public void EditprofileTest(Map<String, String> data)  {
		/*h.tripButton();
		h.siginButton();
		
			Thread.sleep(5000);
		//	si.signin(data.get("Username"),data.get("Password"));
				
			
		
		//	Assert.assertEquals("", null);
*/		
		
			h.clickTitle();
			Childtest.pass("Title Button Clicked");
		    h.clickprofilebutton();
		    Childtest.pass("Profile Button Clicked");
			//System.out.println(data.get("airline"));
			P.edit(data.get("Firstname"),data.get("Lastname"),data.get("Lastname"),
					data.get("Address"),data.get("City"),data.get("State"),data.get("pincode"),data.get("Country"),data.get("Passportno"),data.get("Country"),
					data.get("City"),data.get("Nationality"),data.get("airport"),data.get("Flight"));
			Childtest.pass("The data has been edited");
			System.out.println(P.message());
			System.out.println(data.get("Emessage"));
		//	Assert.assertEquals(P.message(), data.get("Emessage"));
		
	}
}
