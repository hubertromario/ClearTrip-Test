package com.htc.cleartrip.pages;

import org.openqa.selenium.WebDriver;

import com.htc.cleartrip.base.Basepage;
import com.htc.cleartrip.pageobjects.Egiftpageobject;

public class Egiftpage extends Basepage implements Egiftpageobject {

	public Egiftpage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void denomination(String amount)  {
		try {
			scrollByVisibleElement(driver, denomination);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		waitForVisibilityOfElementLocated(driver, denomination);
		sendKeys(denomination,amount);
	}
	public void quantity()  {
		//waitForVisibilityOfElementLocated(driver, denomination);
		try {
			dropdown(quantity,2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void deliverydate()  {
		waitForVisibilityOfElementLocated(driver, denomination);
		clickableMethod(deliverydate);
	}
	public void message(String Msg)  {
		waitForVisibilityOfElementLocated(driver, denomination);
		sendKeys(Message,Msg);
	}
	public void sendername(String name)  {
		try {
			scrollByVisibleElement(driver,sendername);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		waitForVisibilityOfElementLocated(driver, sendername);
		sendKeys(sendername, name);
	}
	public void receivername(String rname)  {
		try {
			scrollByVisibleElement(driver,receivername);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		waitForVisibilityOfElementLocated(driver, receivername);
		sendKeys(receivername, rname);
	}
	public void senderemailaddress(String email)  {
		try {
			scrollByVisibleElement(driver, senderemail);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		waitForVisibilityOfElementLocated(driver, Address);
		sendKeys(senderemail, email);	
	}
	public void receiveremailaddress(String remail)  {
		waitForVisibilityOfElementLocated(driver, receiveremail);
		sendKeys(receiveremail, remail);		
	}
	public void resendreceiveremail(String reemail) {
		waitForVisibilityOfElementLocated(driver, rreceiveremail );
		sendKeys(rreceiveremail, reemail);
	}
	public void address(String address)  {
		waitForVisibilityOfElementLocated(driver, Address);
		sendKeys(Address, address);
	}
	public void pincode(String pin) {
		try {
			scrollByVisibleElement(driver, Address);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		waitForVisibilityOfElementLocated(driver, pincode);
		sendKeys(pincode, pin);
	}
	
	public void receiverMobilenumber(String number) {
		try {
			scrollByVisibleElement(driver,rmobilenumber );
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		waitForVisibilityOfElementLocated(driver, rmobilenumber);
		sendKeys(rmobilenumber, number);
	}
	
	public void senderMobilenumber(String snumber) {
		try {
			scrollByVisibleElement(driver, smobilenumber);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		waitForVisibilityOfElementLocated(driver, smobilenumber );
		sendKeys(smobilenumber, snumber);
		clickableMethod(image);
		}

	public void clickcheckbox() {
		waitForVisibilityOfElementLocated(driver,checkbox);
		clickableMethod(checkbox);
	}
	
	public void clickpaynowButton() {
		waitForVisibilityOfElementLocated(driver, payButton);
		clickableMethod(payButton);
	}
	
	public String message() {
		try {
			Thread.sleep(40000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		waitForVisibilityOfElementLocated(driver, message);
		String text=Message(message);
		return text;
	}
	
	
	
	public void clickverifyotpbutton( ) {
		try {
			Thread.sleep(40000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		clickableMethod(verifyotpButton);
		
		
	}
	
	public void giftcard(String amount, String Msg,String name,String rname,String email,String remail,String address,String reemail,String number,String pin,String snumber)  {

		this.denomination(amount);
		this.quantity();
		this.deliverydate();
		this.message(Msg);
		this.sendername(name);
		this.receivername(rname);
		this.senderemailaddress(email);
		this.receiveremailaddress(remail);
		this.address(address);
		this.resendreceiveremail(reemail);
		this.receiverMobilenumber(number);
		this.pincode(pin);
		this.senderMobilenumber(snumber);
		//this.clickimage();
		this.clickcheckbox();
		this.clickpaynowButton();
		this.clickverifyotpbutton();
		
		
		
	}
		
}
