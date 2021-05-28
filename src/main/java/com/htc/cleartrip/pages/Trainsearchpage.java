package com.htc.cleartrip.pages;

import org.openqa.selenium.WebDriver;

import com.htc.cleartrip.base.Basepage;
import com.htc.cleartrip.pageobjects.Trainsearchpageobject;

public class Trainsearchpage extends Basepage implements Trainsearchpageobject {

	public Trainsearchpage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void setFrom(String From) {
		sendKeys(from, From);
	}
	public void setTo(String To) {
		sendKeys(to,To);
	}
	public void classselection() throws Exception {
		dropdown(trainclass,2);
		
	}
	public void selectdate() {
	//	calender(calender, monthtitle, nextmonth, nextmonthTitle, traveldate);
	}
	public void adults() throws Exception {
		dropdown(adult, 2);
	}
	public void children() throws Exception {
		dropdown(children,1);
	}
	
	public void seniorMen() throws Exception {
		dropdown(SeniorMen,3);
	}
	
	public void seniorWomen() throws Exception {
		dropdown(SeniorWomen,3);	
	}
	public void clickSearchButton() {
		clickableMethod(SearchButton);
	}
	
	public void Trainsearch() throws Exception {
		this.setFrom("Trichy");
		this.setTo("chennai");
		this.classselection();
	//	this.selectdate();
		this.adults();
		this.children();
		this.clickSearchButton();
		
		
	}
}
