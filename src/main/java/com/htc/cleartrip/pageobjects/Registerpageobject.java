package com.htc.cleartrip.pageobjects;

import org.openqa.selenium.By;

public interface Registerpageobject {
    By register=By.xpath("(//a[@class='weak'])[1]");
	By remail=By.xpath("//input[@name='username1']");
	By rcheckbox=By.xpath("//*[@id='mkt_sbpt']");
	By rcreateAccountButton=By.xpath("//button[@id='registerButton']");
//	protected By siginlink=By.xpath("//a[@title='Sign in']");
	By rpassword=By.xpath("//input[@name='password']");
	By rtitle=By.xpath("//*[@name=\'title\']");
	By rfirstname=By.xpath("//input[@name='first_name']");
	By rlastname=By.xpath("//input[@name='last_name']");
	By rcountrycode=By.xpath("//*[@id=\'country_code\']/option[220]");
	By rmobileno=By.xpath("//input[@name='phone_number_value']");
	By rregistercheckbox=By.xpath("(//input[@id='mkt_sbpt'])[2]");
	By rsignupButton=By.xpath("//button[@id='signUpButton']");
	By rmessage=By.xpath("//span[text()='Note: verify your account']");

}
