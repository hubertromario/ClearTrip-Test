package com.htc.cleartrip.pages;

import org.openqa.selenium.WebDriver;

import com.htc.cleartrip.base.Basepage;
import com.htc.cleartrip.pageobjects.Editprofilepageobject;

import exception.userdefinedexception;

public class Editprofilepage extends Basepage implements Editprofilepageobject{

	public Editprofilepage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void clickeditprofilebutton() {
		clickableMethod(editprofileButton);	
	}
	
	public void selecttitle() {
		try {
			dropdown(Title, 1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void FirstnameTextbox(String firstname) {
		
		cleardata(Firstname);   //for deletion of existing data
		sendKeys(Firstname, firstname);
	}
	
	public void LastnameTextbox(String lastname) {
		cleardata(Lastname);
		sendKeys(Lastname, lastname);
	}
	
	public void screennametextbox(String screennamee) {
		cleardata(screenname);
		sendKeys(screenname,screennamee);
	}
	
	public void Addresstextbox(String address) {
		cleardata(Address);
		sendKeys(Address,address);
	}
	
	public void citytextbox(String City) {
		cleardata(city);
		sendKeys(city, City);
	}
	
	public void statetextbox(String State) {
		cleardata(state);
		sendKeys(state, State);
	}
	
	public void pincodetextbox(String pincode) {
		cleardata(pin);
		sendKeys(pin,pincode);
	}
	
	public void countrytextbox(String Country) {
		cleardata(country);
		sendKeys(country, Country);
		
	}
	
	public void DOBdate() {
		
		try {
			dropdown(DOBdate,23);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void DOBmonth() {
		try {
			dropdown(DOBmonth,7);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void DOBYear() {
		try {
			dropdown(DOByear,23);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void passportnumberTextbox(String passportno) {
		cleardata(passportnumber);
		sendKeys(passportnumber, passportno);
	}
	
	public void issuingcountryTextBox(String country) {
		cleardata(issuingcountry);
		sendKeys(issuingcountry, country);
	}
	
	public void BirthplaceTextBox(String place) {
		cleardata(Birthplace);
		sendKeys(Birthplace,place);
	}
	
	public void NationalityTextBox(String nationality) {
		cleardata(Nationality);
		sendKeys(Nationality, nationality);
	}
	
	public void passportissuingDay() {
		try {
			dropdown(passportissuedate,15);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void passportissuingMonth() {
		try {
			dropdown(passportissueMonth,5);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void passportissuingyear() {
		try {
			dropdown(passportissueYear,4);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void passportexpirydate() {
		try {
			dropdown(passportexpirydate,10);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void passportexpirymonth() {
		try {
			dropdown(passportexpiryMonth, 5);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void passportexpiryyear() {
		try {
			dropdown(passportexpiryyear,10);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void setairportTextbox(String airport) {
		cleardata(Homeairport);
		sendKeys(Homeairport, airport);
	}
	
	public void setseatprefrence(){
		try {
			dropdown(Flightseatpreference,1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void setmealpreference() {
		try {
			dropdown(Flightmealpreference,5);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void setperferedairline(String airline) {
		sendKeys(preferedairline, airline);
		
	}
	public void clicksaveprofileButton() {
		try {
			scrollByVisibleElement(driver, saveprofileButton);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		clickableMethod(saveprofileButton);
		System.out.println("Button clicked");
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
			//text=text.replaceAll("\\s", "");
			return text;
			 
		 }
	
	public void edit(String firstname ,String lastname,String screennamee,String address,String City,String State,String pincode,String Country,String passportno,String country,String place,String nationality,String airport,String airline)   {
		
		this.clickeditprofilebutton();
		this.selecttitle();
		this.FirstnameTextbox(firstname);
		this.LastnameTextbox(lastname);
		this.screennametextbox(screennamee);
		this.Addresstextbox(address);
		this.citytextbox(City);
		this.statetextbox(State);
		this.pincodetextbox(pincode);
	//	this.countrytextbox(Country);
		this.DOBdate();
		this.DOBmonth();
		this.DOBYear();
		this.passportnumberTextbox(passportno);
	//	this.issuingcountryTextBox(country);
		this.BirthplaceTextBox(place);
	//	this.NationalityTextBox(nationality);
		this.passportissuingDay();
		this.passportissuingMonth();
		this.passportissuingyear();
		this.passportexpirydate();
		this.passportexpirymonth();
		this.passportexpiryyear();
	//	this.setairportTextbox(airport);
		this.setseatprefrence();
		
		this.setperferedairline(airline);
		this.setmealpreference();
		this.clicksaveprofileButton();
		}
		
	}

