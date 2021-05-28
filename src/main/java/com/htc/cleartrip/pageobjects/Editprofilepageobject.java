package com.htc.cleartrip.pageobjects;

import org.openqa.selenium.By;

public interface Editprofilepageobject {
	By editprofileButton = By.cssSelector("a[class=edit]");
	By Title=By.cssSelector("select[id=profile_title]");
	By Firstname=By.cssSelector("input[id=profile_personal_data_first_name]");
	By Lastname=By.cssSelector("input[placeholder='Last name']");
	By screenname=By.cssSelector("input[id=profile_user_screen_name]"); 
	By Address=By.cssSelector("textarea[id=profile_streetAddress]");
	By city=By.cssSelector("input[id=profile_city]");
	By state=By.cssSelector("input[id=profile_state]");
	By pin=By.cssSelector("input[placeholder='Pin/Zip Code']");
	By country=By.cssSelector("input[placeholder='Country']");
	By DOBdate=By.cssSelector("select[name='dobDay']");
	By DOBmonth=By.cssSelector("select[name='dobMonth']");
	By DOByear=By.cssSelector("select[name='dobYear']");
	By passportnumber=By.cssSelector("input[placeholder='Add passport number']");
	By issuingcountry=By.cssSelector("input[placeholder='Add issuing country']");
	By Birthplace=By.cssSelector("input[placeholder='Add birth place']");
	By Nationality=By.cssSelector("input[placeholder='Add nationality']");
	By passportissuedate=By.cssSelector("select[name='passportIssueDay']");
	By passportissueMonth=By.cssSelector("select[name='passportIssueMonth']");
	By passportissueYear=By.cssSelector("select[name='passportIssueYear']");
	By passportexpirydate=By.cssSelector("select[name='passportExpiryDay']");
	By passportexpiryMonth=By.cssSelector("select[name='passportExpiryMonth']");
	By passportexpiryyear=By.cssSelector("select[name='passportExpiryYear']");
	By Homeairport=By.cssSelector("input[placeholder='Set home airport']");
	By Flightseatpreference=By.cssSelector("select[name='travel_profile[seat_preference]']");
	By Flightmealpreference=By.cssSelector("select[name='travel_profile[meal_preference]']");
	By preferedairline=By.cssSelector("input[name='profile_prefered_airline_name']");
	By Trainberthpreference=By.cssSelector("select[name='travel_profile[berth_preference]']");
	By Trainmealpreference=By.cssSelector("select[name='travel_profile[train_meal_preference]']");
	By saveprofileButton=By.cssSelector("button[class='primary']");
	By message=By.cssSelector("div[id='profileFormSuccessMessage']");
	

}
