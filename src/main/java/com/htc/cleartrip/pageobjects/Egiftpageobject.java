package com.htc.cleartrip.pageobjects;

import org.openqa.selenium.By;

public interface Egiftpageobject {
	By denomination=By.xpath("//input[@pattern='[0-9]{3,5}']");
	By quantity=By.xpath("//select[@id='quantity']");
	By deliverydate=By.xpath("//input[@id='dateNow']");
	By Message=By.xpath("//textarea[@placeholder='Your Message:']");
	By sendername=By.xpath("//input[@title='Please Enter only Alphabets (eg: John)' ]");
	By receivername=By.xpath("//input[@tabindex='236' ]");
	By senderemail=By.xpath("//input[@tabindex='128']");
	By receiveremail=By.xpath("//input[@tabindex='253']");
	By Address=By.xpath("//input[@tabindex='136']");
	By rreceiveremail= By.xpath("//input[@tabindex='271']");
	By rmobilenumber= By.xpath("//input[@tabindex='290']");
	By pincode=By.xpath("//input[@tabindex='178']");
	By smobilenumber= By.xpath("//input[@tabindex='191']");
	By Applybutton= By.xpath("//button[@tabindex='331']");
	By checkbox=By.xpath("(//input[@tabindex='353'])");
	By payButton=By.xpath("//input[@tabindex='376']");
	By verifyotpButton=By.xpath("//input[@tabindex='425']");
	By image=By.xpath("//span[@id='plus']");
	By message=By.xpath("//div[text()=\"Choose a payment option\"]");
}
