package com.htc.cleartrip.test;

import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.htc.cleartrip.base.TestBase;

public class FlightBookingTest extends TestBase{
	
	@Test(dataProvider = "Test" , dataProviderClass = com.htc.cleartrip.util.Dataprovider.class)
	public void FlightsearchTest(Map<String,String> data)  {
		    Childtest=test.createNode("Flight Booking Test");
			s.search(data.get("From"),data.get("To"),data.get("TravelDate"),data.get("Type"));
			Childtest.pass("Search Button Clicked");
			se.flightselection();
			Childtest.pass("Book Button Clicked");
			c.confirmation(data.get("Mobile"),data.get("Email"),data.get("Firstname"),data.get("Lastname"));
			Childtest.pass("Confirmation Button Clicked");
			Assert.assertEquals(c.message(),"Pay to complete your booking");
			
		}
        
		
}

	
 

