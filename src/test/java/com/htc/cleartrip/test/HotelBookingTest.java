package com.htc.cleartrip.test;

import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.htc.cleartrip.base.TestBase;

public class HotelBookingTest extends TestBase {
	@Test(dataProvider = "Test" , dataProviderClass = com.htc.cleartrip.util.Dataprovider.class)
	public void HotelBookingTest(Map<String,String> data) throws Exception {
		h.clickhotelButton();
		Childtest.pass("Hotel Button has been Clicked");
		hs.search(data.get("City"),data.get("BookingType"),data.get("Checkindate"),data.get("BookinggType"),data.get("Checkoutdate"));
		Childtest.pass("Search Button has been Clicked");
		hse.hotelselection();
		Childtest.pass("Hotel Book Button has been Clicked");
		hr.roomselection();
		Childtest.pass("Room Book Button has been Clicked");
		hc.hotelconfirmation(data.get("Email"),data.get("Firstname"),data.get("Lastname"),data.get("Mobile"));
		Childtest.pass("Hotel Booking has been Confirmed");
		Assert.assertEquals(hc.message(), "Enter your credit card details");
	}

}
