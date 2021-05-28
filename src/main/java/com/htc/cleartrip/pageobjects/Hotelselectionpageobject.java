package com.htc.cleartrip.pageobjects;

import org.openqa.selenium.By;

public interface Hotelselectionpageobject {
	By selectroomButton=By.xpath("(//button[@class='button booking hotelDetails'])[1]");
	By filters=By.xpath("(//div[@class='control__indicator'])[3]");
}
