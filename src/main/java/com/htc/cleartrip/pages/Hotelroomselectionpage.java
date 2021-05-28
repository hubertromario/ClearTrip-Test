package com.htc.cleartrip.pages;

import org.openqa.selenium.WebDriver;

import com.htc.cleartrip.base.Basepage;
import com.htc.cleartrip.pageobjects.Hotelroomselectionpageobject;

import exception.userdefinedexception;

public class Hotelroomselectionpage extends Basepage implements Hotelroomselectionpageobject {
	
	public Hotelroomselectionpage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public void clickselectroomButton() throws InterruptedException {
		waitForVisibilityOfElementLocated(driver, BookButton);
		clickableMethod(selectroomButton);
	}
	public void clickBookButton() throws InterruptedException {
		waitForVisibilityOfElementLocated(driver, BookButton);
		clickableMethod(BookButton);
	}
	
	public void roomselection() throws InterruptedException, userdefinedexception {
		try {
		Thread.sleep(10000);
		this.clickselectroomButton();
		Thread.sleep(10000);
		this.clickBookButton();
		}
		catch (Exception e) {
			// TODO: handle exception-
			throw new userdefinedexception(e.getMessage());
		}

	}
}
