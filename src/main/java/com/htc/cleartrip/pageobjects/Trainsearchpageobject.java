package com.htc.cleartrip.pageobjects;

import org.openqa.selenium.By;

public interface Trainsearchpageobject {
	By from = By.xpath("//input[@title='From station']");
	By to = By.xpath("//input[@title='To station']");
	By trainclass = By.xpath("//select[@id='trainClass']");
	By calender = By.xpath("//input[@title='Journey date']");
	By monthtitle= By.xpath("(//th[@class='month'])[1]");
	By nextmonth= By.xpath("//a[@id='cal_showNextMonth']");
	By nextmonthTitle= By.xpath("(//th[@class='month'])[1]");
	By traveldate=By.xpath("(//a[text()='30'])[1]");
	By adult= By.xpath("//select[@id='train_adults']");
	By children=By.xpath("//select[@id='t']");
	By SeniorMen=By.xpath("//select[@id='train_male_seniors']");
	By SeniorWomen=By.xpath("//select[@id='train_female_seniors']");
	By SearchButton=By.xpath("//button[@id='trainFormButton']");
	

}
