package com.htc.cleartrip.pageobjects;

import org.openqa.selenium.By;

public interface Flightconfirmationpageobject {
	By scroll = By.xpath("//h3[text()='Protect your trip with travel insurance']");
	By continueButton=By.xpath("(//button[text()='Continue'])[1]");
	By addoncontinueButton=By.xpath("(//button[text()='Continue'])[2]");
	By mobilenumber=By.xpath("//input[@placeholder='Mobile number']");
	By email=By.xpath("//input[@placeholder='Email address']");
	By contactcontinueButton=By.xpath("(//button[text()='Continue'])[3]");
	By firstname=By.xpath("//input[@placeholder='First name']");
	By lastname=By.xpath("//input[@placeholder='Last name']");
	By genderdropdown=By.xpath("//div[text()='Gender']");
	By continuetopaymentButton=By.xpath("//button[text()='Continue to payment']");
	By fare= By.xpath("//div[@data-testid='fareCard1']");
	By genderButton=By.xpath("//div[text()='Gender']");
	By gender=By.xpath("//li[text()='Male']");
	By message=By.xpath("//h1[text()='Pay to complete your booking']");
}
