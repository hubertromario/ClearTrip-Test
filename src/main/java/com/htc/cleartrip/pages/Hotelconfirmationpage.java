package com.htc.cleartrip.pages;

import org.openqa.selenium.WebDriver;

import com.htc.cleartrip.base.Basepage;
import com.htc.cleartrip.pageobjects.Hotelconfirmationpageobject;

import exception.userdefinedexception;

public class Hotelconfirmationpage extends Basepage implements Hotelconfirmationpageobject {
	
	public Hotelconfirmationpage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public void clickaddtravellerButton()  {
		
		waitForVisibilityOfElementLocated(driver, continueaddingTravellerButton);
		clickableMethod(continueaddingTravellerButton);
		
	}
	
	public void title() {
		waitForVisibilityOfElementLocated(driver,title);
		try {
			dropdown(title,1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void Firstname(String fname) {
		waitForVisibilityOfElementLocated(driver, firstname);
		sendKeys(firstname,fname);
	}
	
	public void Lastname(String sname) {
		waitForVisibilityOfElementLocated(driver, lastname);
		sendKeys(lastname,sname);
	}
	
	public void Mobileno(String mobile) {
		waitForVisibilityOfElementLocated(driver,mobilenumber);
		sendKeys(mobilenumber, mobile);
	}
	
	public void clickcontinueButton() {
		waitForVisibilityOfElementLocated(driver, continueButton);
		clickableMethod(continueButton);
	}
	
	public void email(String Email) {
		waitForVisibilityOfElementLocated(driver, emailtextbox);
		sendKeys(emailtextbox, Email);
	}	
	
	public void clickemailcontinueButton() {
		waitForVisibilityOfElementLocated(driver, emailcontinueButton);
		clickableMethod(emailcontinueButton);
	}
	
	 public String message() {
			try {
				Thread.sleep(30000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			waitForVisibilityOfElementLocated(driver, message);
			String text=Message(message);
			return text;
			 
		 }
	
	public void hotelconfirmation(String Email,String fname,String sname,String mobile) throws userdefinedexception {
		try {
			
		
		this.clickaddtravellerButton();
		this.email(Email);
		this.clickemailcontinueButton();
		this.title();
		this.Firstname(fname);
		this.Lastname(sname);
		this.Mobileno(mobile);
		this.clickcontinueButton();
		}
		catch (Exception e) {
			// TODO: handle exception
			throw new userdefinedexception(e.getMessage());
		}

		
		
	}
}
