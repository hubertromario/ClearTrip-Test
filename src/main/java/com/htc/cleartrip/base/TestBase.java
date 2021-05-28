package com.htc.cleartrip.base;



import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.htc.browserFactory.BrowserFactory;
import com.htc.cleartrip.Utilities.Screenshot;
import com.htc.cleartrip.pages.Editprofilepage;
import com.htc.cleartrip.pages.Egiftpage;
import com.htc.cleartrip.pages.FlightSearchpage;
import com.htc.cleartrip.pages.Flightconfirmationpage;
import com.htc.cleartrip.pages.Flightselectionpage;
import com.htc.cleartrip.pages.Giftcardpage;
import com.htc.cleartrip.pages.Homepage;
import com.htc.cleartrip.pages.HotelSearchpage;
import com.htc.cleartrip.pages.Hotelconfirmationpage;
import com.htc.cleartrip.pages.Hotelroomselectionpage;
import com.htc.cleartrip.pages.Hotelselectionpage;

import com.htc.cleartrip.pages.Registrationpage;
import com.htc.cleartrip.pages.Siginpage;
import com.htc.cleartrip.pages.Trainsearchpage;


import constants.Constants;

public class TestBase {
	protected FlightSearchpage s;
	protected Flightselectionpage se;
	protected Flightconfirmationpage c;
	protected Homepage h;
	protected Siginpage si;
	protected Registrationpage r;
	protected HotelSearchpage hs;
	protected Hotelselectionpage hse;
	protected Hotelroomselectionpage hr;
	protected Hotelconfirmationpage hc;
	protected Trainsearchpage t;
	protected Giftcardpage g;
	protected Egiftpage eg;
	//protected Offerpage O;
	protected Editprofilepage P;
	public WebDriver driver;
	protected Screenshot S;
	public static ExtentReports extent;
	public static ExtentTest test;
	public static ExtentTest Childtest;
	//public ITestContext context;
	public WebDriver getDriver() {
		return driver;
	}
	
	@BeforeClass
	public void setUp(ITestContext context) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-blink-features=AutomationControlled");
		options.addArguments("--disable-popup-blocking");
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("credentials_enable_service", false);
		prefs.put("profile.password_manager_enabled", false);

		options.setExperimentalOption("prefs",prefs);


		options.addArguments("--disable-notifications");
		options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"}); 
		System.setProperty("webdriver.chrome.driver", Constants.chromedriver);
		
	    driver =new ChromeDriver(options);	
		String appURL="https://www.cleartrip.com/";
		System.out.println("Launching google chrome with new profile..");
		driver.manage().window().maximize();
		driver.navigate().to(appURL);
		System.out.println("appurl is valid");
		h=new Homepage(driver);
		r=new Registrationpage(driver);
		hs=new HotelSearchpage(driver);
		hse=new Hotelselectionpage(driver);
		hr=new Hotelroomselectionpage(driver);
		hc=new Hotelconfirmationpage(driver);
	    si=new Siginpage(driver);
	    s=new FlightSearchpage(driver);
	    se=new Flightselectionpage(driver);
	    c=new Flightconfirmationpage(driver);
	    t=new Trainsearchpage(driver);
	    g=new Giftcardpage(driver);
	    eg=new Egiftpage(driver);
	    P=new Editprofilepage(driver);
	    S=new Screenshot(driver);
	    System.out.println(driver!=null);
	    System.out.println(S!=null);
	    context.setAttribute("Driver", driver);
	   
	}
	


	
	
}
