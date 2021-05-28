package com.htc.cleartrip.pages;

import org.openqa.selenium.WebDriver;

import com.htc.cleartrip.base.Basepage;
import com.htc.cleartrip.pageobjects.Hotelsearchpageobject;

import exception.userdefinedexception;

public class HotelSearchpage extends Basepage implements Hotelsearchpageobject {
	
	public HotelSearchpage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public void wheretextbox(String city )  {
		waitForVisibilityOfElementLocated(driver, where);
		sendKeys(where, city);
		waitForVisibilityOfElementLocated(driver, drop);
		clickableMethod(drop);
	}
	public void checkin(String type,String date)  {
		waitForVisibilityOfElementLocated(driver, checkindatecalender);
		calenderr(type, checkindatecalender, checkinMonthTitle, checkinNextMonth, checkinDate, date);
	}
	public void checkout(String type,String date) {
		waitForVisibilityOfElementLocated(driver, checkoutdatecalender);
		calenderr(type,checkoutdatecalender,checkinMonthTitle,checkinNextMonth,checkoutDate,date);
	}
	public void travellers()  {
		waitForVisibilityOfElementLocated(driver, Travellers);
		try {
			dropdown(Travellers,1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void searchButton()  {
		waitForVisibilityOfElementLocated(driver, searchhotelButton);
		clickableMethod(searchhotelButton);
	}
	
	public void search(String city,String type,String date,String typee,String datee) throws Exception  {
		try {
			
		
		Thread.sleep(20000);
		this.wheretextbox(city);
		Thread.sleep(10000);
		this.checkin(type,date);
		Thread.sleep(20000);
		this.checkout(typee,datee);
		Thread.sleep(20000);
		this.travellers();
		Thread.sleep(20000);
		this.searchButton();
		}
		catch (Exception e) {
			// TODO: handle exception
			throw new userdefinedexception(e.getMessage());
		}

	}

}
