package com.htc.cleartrip.pages;

import org.openqa.selenium.WebDriver;

import com.htc.cleartrip.base.Basepage;
import com.htc.cleartrip.pageobjects.Flightselectionpageobject;

import exception.userdefinedexception;

public class Flightselectionpage extends Basepage implements Flightselectionpageobject {
	public Flightselectionpage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void clickBookButton() {
		waitForVisibilityOfElementLocated(driver, BookButton);
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		clickableMethod(BookButton);
		switchtoNewTab(driver,1);
		
	}
	
	public void nonstopcheckbox() {
		waitForVisibilityOfElementLocated(driver,nonstopcheckbox);
		clickableMethod(nonstopcheckbox);
	}
	
	
	public void flightselection()  {
		
		this.nonstopcheckbox();
		this.clickBookButton();
		
		
	}

}
