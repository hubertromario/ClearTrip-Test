package com.htc.cleartrip.pages;

import org.openqa.selenium.WebDriver;

import com.htc.cleartrip.base.Basepage;
import com.htc.cleartrip.pageobjects.Flightconfirmationpageobject;

import exception.userdefinedexception;

public class Flightconfirmationpage extends Basepage implements Flightconfirmationpageobject{
	
	public Flightconfirmationpage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void clickselectfare() {
		try {
			scrollByVisibleElement(driver, fare);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		clickableMethod(fare);
	}
	public void clickcontinueButton()  {
		
		try {
			scrollByVisibleElement(driver, continueButton);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		waitForVisibilityOfElementLocated(driver, continueButton);
		clickableMethod(continueButton);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void clickaddoncontinueButton()  {
		try {
			scrollByVisibleElement(driver, addoncontinueButton);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		waitForVisibilityOfElementLocated(driver, addoncontinueButton);
		clickableMethod(addoncontinueButton);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	 public void mobilenumber(String number) {
		 sendKeys(mobilenumber,number);
		 try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
	 public void email(String Email) {
		 sendKeys(email,Email);
		 try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
	 public void contactcontinueButton() {
		 waitForVisibilityOfElementLocated(driver,contactcontinueButton);
		 clickableMethod(contactcontinueButton);
		 try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
	 public void Firstname(String Firstname)  {
		 sendKeys(firstname,Firstname);
		 try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
	 public void Lastname(String Lastname)  {
		 sendKeys(lastname,Lastname);
		 try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
	
	 public void selectGender() throws Exception {
		 clickableMethod(genderButton);
		 Thread.sleep(2000);
		 clickableMethod(gender);
	 }
	 
	 public void clickpaymentButton() throws InterruptedException {
		 clickableMethod(continuetopaymentButton);
		 Thread.sleep(5000);
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

	 public void confirmation(String number,String Email,String Firstname,String lastname)  {
		
		 this.clickselectfare();
		 this.clickcontinueButton();
		 this.clickaddoncontinueButton();
		 this.mobilenumber(number);
		 this.email(Email);
		 this.contactcontinueButton();
		 this.Firstname(Firstname);
		 this.Lastname(lastname);
		 try {
			Thread.sleep(5000);
			try {
				this.selectGender();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 try {
			this.clickpaymentButton();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// this.confirmation();
		 }
		 

	 }

