package com.htc.browserFactory;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.htc.cleartrip.Utilities.PropertyFileReader;

import constants.Constants;


public class BrowserFactory {
	//******Loading Browser **********//
	protected static WebDriver driver;
	public static WebDriver startBrowser() throws FileNotFoundException, IOException {
		PropertyFileReader r = PropertyFileReader.getInstance();
		
		if(r.b.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",Constants.chromedriver);
			driver=new ChromeDriver();

		}else  if(r.b.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",Constants.Firefox);
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Constants.Implicitwait, TimeUnit.SECONDS);
		driver.get(r.U);
		
		return driver;
	}
	//*****Closing Browser*****//
	public static void quitBrowser(WebDriver driver) {
		if(driver!=null) {
			System.out.println("Closing the Driver");
			driver.close();
			driver.quit();
		}
	}
	
}
