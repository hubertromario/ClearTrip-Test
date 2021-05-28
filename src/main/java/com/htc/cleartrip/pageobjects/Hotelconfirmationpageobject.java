package com.htc.cleartrip.pageobjects;

import org.openqa.selenium.By;

public interface Hotelconfirmationpageobject {
	By continueaddingTravellerButton=By.xpath("//input[@id='itineraryBtn']");
	By continueButton=By.xpath("//input[@id='travellerBtn']");
	By title= By.xpath("//select[@name='title']");
	By firstname=By.xpath("//input[@etitle='First name']");
	By lastname=By.xpath("//input[@etitle='Last name']");
	By mobilenumber=By.xpath("(//input[@id='mobileNumber'])[1]");
	By emailtextbox=By.xpath("//input[@title='Your email address']");
	By emailcontinueButton=By.xpath("//input[@class='booking hotelButton']");
	By message=By.xpath("//h6[text()='Enter your credit card details']");
	
}
