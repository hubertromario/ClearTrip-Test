package com.htc.cleartrip.pages;

import org.openqa.selenium.WebDriver;

import com.htc.cleartrip.base.Basepage;
import com.htc.cleartrip.pageobjects.*;
public class Homepage extends Basepage implements Homepageobject {
	
	public Homepage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public void tripButton() {
		clickableMethod(trips);
	}
	public void currencyButton() {
		clickableMethod(rupee);
	}
	public void countryButton() {
		clickableMethod(country);
	}
	public void siginButton() {
		clickableMethod(sigin);
	//	switchtoNewTab(driver);		
	}
	public void registerButton() {
		clickableMethod(registeration);
	}
	public void cancellation() {
		clickableMethod(cancellations);
	}
	public void changeflightButton() {
		clickableMethod(changeflight);
	}
	public void pnrstatusButton() {
		clickableMethod(checkPNRstatus);
	}
	public void printticketButton() {
		clickableMethod(printticket);	
	}
	public void printhotelvoucherButton() {
		clickableMethod(printhotelvoucher);
	}
	public void clickhotelButton() throws InterruptedException {
		Thread.sleep(10000);
		clickableMethod(hotelbutton);
	}
	public void clickTrainButton() {
		clickableMethod(TrainButton);
	}
	public void clickGiftButton() {
		clickableMethod(giftcardButton);
		switchtoNewTab(driver,1);
	}
	public void getTitle() {
		
	}
	public void clicksignout() {
		clickableMethod(Title);
		clickableMethod(signoutButton);
	}
	public void clickTitle() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		clickableMethod(Title);
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
	
	public void clickprofilebutton() {
		clickableMethod(profileButton);
		//switchtoNewTab(driver, 1);
		}

}
