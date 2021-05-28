package com.htc.cleartrip.pageobjects;

import org.openqa.selenium.By;

public interface Hotelsearchpageobject {
	By where=By.xpath("//input[@name='from']");
	By checkindatecalender=By.xpath("//input[@title='Check-in date']");
	By checkoutdatecalender=By.xpath("//input[@title='Check-out date']");
	By checkinMonthTitle=By.xpath("(//div[@class='title'])[1]");
	By checkinNextMonth=By.xpath("//a[@class='nextMonth ']");
	By checkinNextMonthTitle=By.xpath("(//div[@class='title'])[1]");
	By checkinDate=By.xpath("(//a[text()='27'])[1]");
	By checkoutDate=By.xpath("(//a[text()='29'])[1]");
	By Travellers=By.xpath("//select[@id='travellersOnhome']");
	By searchhotelButton=By.xpath("//input[@id='SearchHotelsButton']");
	By drop=By.xpath("(//a[@tabindex='-1'])[4]");
	
}
