package com.htc.cleartrip.pages;

import org.openqa.selenium.WebDriver;

import com.htc.cleartrip.base.Basepage;
import com.htc.cleartrip.pageobjects.Loginpageobject;

import exception.userdefinedexception;

public class Siginpage extends Basepage implements Loginpageobject {
	
	public Siginpage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public void setemail(String Username) throws InterruptedException {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		switchtoNewFrame(driver);
		waitForVisibilityOfElementLocated(driver, username);
		sendKeys(username, Username);
	}
	public void setpassword(String password) {
		sendKeys(lpassword,password);
	}
	public void checkbox() {
		clickableMethod(lcheckbox);
	}
	public void clicksigninButton() {
		clickableMethod(lsignin);
		//switchtoNewTab(driver);
	}
	
	public void signin(String email,String password) {
			
			
		try {
			this.setemail(email);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.setpassword(password);
		this.checkbox();
		this.clicksigninButton();
		}

	}
	

