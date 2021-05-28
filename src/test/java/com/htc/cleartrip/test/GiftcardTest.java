package com.htc.cleartrip.test;

import java.util.Map;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.htc.cleartrip.base.TestBase;



public class GiftcardTest extends TestBase {
	@Test(dataProvider = "Test" , dataProviderClass = com.htc.cleartrip.util.Dataprovider.class)
	public void GiftcardTest(Map<String, String> data)  {
		h.clickGiftButton();
		Childtest.pass("Gift Button Clicked");
		g.clickgiftcard();
		Childtest.pass("Gift card has been Selected");
		eg.giftcard(data.get("denomination"),data.get("message"),data.get("Sendername"),data.get("Receivername"),data.get("Senderemail"),
				data.get("Receiveremail"),data.get("address"),data.get("Receiveremail"),data.get("receivermobile"),data.get("pin"),data.get("sendermobile"));
		Childtest.pass("Giftcard has been selected successfully");
		Assert.assertEquals(eg.message(),"Choose a payment option");
}
}
