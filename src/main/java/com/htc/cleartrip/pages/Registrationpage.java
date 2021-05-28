package com.htc.cleartrip.pages;


import org.openqa.selenium.WebDriver;

import com.htc.cleartrip.base.Basepage;
import com.htc.cleartrip.pageobjects.Registerpageobject;

import exception.userdefinedexception;

public class Registrationpage extends Basepage implements Registerpageobject{
	
	public Registrationpage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public void setemail(String Email) {
		switchtoNewFrame(driver);
		sendKeys(remail, Email);
	}
	public void clickcheckbox() {
		clickableMethod(rcheckbox);
	}
	public void clickcreateaccountButton() {
		clickableMethod(rcreateAccountButton);
	}
	public void password(String Password) throws InterruptedException {
		waitForVisibilityOfElementLocated(driver, rpassword);
		sendKeys(rpassword,Password);
	}
	public void Title() throws Exception {
		dropdown(rtitle,2);	
	}
	public void Firstname(String Fname) {
		sendKeys(rfirstname,Fname);
	}
	public void Lastname(String Lname) {
		sendKeys(rlastname, Lname);
	}
	public void countrycode() {
		clickableMethod(rcountrycode);
	}
	public void registercheckbox() {
		clickableMethod(rregistercheckbox);
	}
	public void signupButton() {
		clickableMethod(rsignupButton);
	}
	public void setmobile(String Mobile) {
		sendKeys(rmobileno,Mobile);
	}
	public void createaccountButton() throws InterruptedException  {
		scrollByVisibleElement(driver, rcreateAccountButton);
		clickableMethod(rsignupButton);
	}
	public String message() {
		String text=driver.findElement(rmessage).getText();
		return text;
	}
	
	
	public void register(String email,String password, String Fname,String Lname,String Mobile) throws Exception {
		try {
			
		
		this.setemail(email);
	//	this.clickcheckbox();
		this.clickcreateaccountButton();
		this.password(password);
		this.Title();
		this.Firstname(Fname);
		this.Lastname(Lname);
		this.setmobile(Mobile);
		this.signupButton();
		
		}
		catch (Exception e) {
			// TODO: handle exception
			throw new userdefinedexception(e.getMessage());
		}

	}
}
