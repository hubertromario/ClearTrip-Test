package com.htc.cleartrip.pages;

import org.openqa.selenium.WebDriver;

import com.htc.cleartrip.base.Basepage;
import com.htc.cleartrip.pageobjects.Hotelselectionpageobject;

import exception.userdefinedexception;

public class Hotelselectionpage extends Basepage implements Hotelselectionpageobject {

	public Hotelselectionpage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public void addfilters() {
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		waitForVisibilityOfElementLocated(driver, filters);
		clickableMethod(filters);
	}
	public void selectroombutton()  {
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		waitForVisibilityOfElementLocated(driver, selectroomButton);
		clickableMethod(selectroomButton);
		switchtoNewTab(driver,1);
	}
	
	public void hotelselection() throws userdefinedexception {
		try {
		this.addfilters();
		this.selectroombutton();
	}
		catch (Exception e) {
			// TODO: handle exception
			throw new userdefinedexception(e.getMessage());
		}

	}

}
