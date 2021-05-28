package com.htc.cleartrip.pages;

import org.openqa.selenium.WebDriver;

import com.htc.cleartrip.base.Basepage;
import com.htc.cleartrip.pageobjects.Flightsearchpageobject;

import exception.userdefinedexception;

public class FlightSearchpage extends Basepage implements Flightsearchpageobject{
	public FlightSearchpage(WebDriver driver) {
		super(driver);
	}
	public void onewayButton() {
		clickableMethod(oneway);
	}
	public void fromTextbox(String from) {
		sendKeys(From,from);
		clickableMethod(Fromtab);
	}
	public void toTextbox(String to) {
		sendKeys(To,to);
		clickableMethod(Totab);
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void Depart(String type,String date)  {
		calenderr(type,departdate,Monthtitle,Nextmonth,NextmonthTitle,date);
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void adult()  {
		try {
			dropdown(adult, 0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void children()  {
		try {
			dropdown(children,0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void infants()  {
		try {
			dropdown(infants,0);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void searchflightButton()  {
		waitForVisibilityOfElementLocated(driver,searchButton);
		clickableMethod(searchButton);
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void search(String from,String to,String date,String type)  {
		this.onewayButton();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.fromTextbox(from);
		this.toTextbox(to);	
		this.Depart(type,date);
		this.adult();
		this.children();
		this.infants();
		this.searchflightButton();
		

		//driver.navigate().to("https://www.cleartrip.com/flights/results?origin=Trichy,+IN+-+Tiruchirapally+Civil+(TRZ)&from=TRZ&destination=Chennai,+IN+-+Chennai+Airport+(MAA)&to=MAA&depart_date=17/06/2021&adults=3&childs=2&infants=2&class=Economy&airline=&carrier=&intl=n&sd=1620452833894&rnd_one=O");
		}
		
		
	}
	
	

