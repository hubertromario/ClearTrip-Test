package com.htc.cleartrip.pageobjects;

import org.openqa.selenium.By;

public interface Homepageobject {
	By trips=By.xpath("//span[@class='span span19 truncate']");
	By country=By.xpath("//*[@id=\"countryForm\"]/li[1]/a/span");
	By rupee=By.xpath("//span[text()='Indian Rupee']");
	By sigin=By.xpath("//input[@title='Sign In']");
	By registeration=By.xpath("(//a[@class='weak'])[1]");
	By cancellations=By.xpath("//i[@class='iconSprite icoCancel']");
	By changeflight=By.xpath("//i[@class='iconSprite icoChange']");
	By checkPNRstatus=By.xpath("//i[@class='iconSprite icoPNR']");
	By printticket=By.xpath("//i[@class='iconSprite icoTicket']");
	By printhotelvoucher=By.xpath("//i[@class='iconSprite icoHotelVoucher']");
	By hotelbutton=By.xpath("//a[@title='Find hotels in destinations around the world']");
	By TrainButton=By.xpath("//a[@title='Find trains to destinations within India']");
	By giftcardButton=By.xpath("//a[@title='Gift Card']");
	By Title=By.xpath("//span[@class='span span19 truncate']");
	By signoutButton=By.xpath("//a[@id='global_signout']");
	By profileButton=By.xpath("(//a[@class='forceHttps'])[11]");
	By message=By.xpath("//span[text()='romario']");
	
}


