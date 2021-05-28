package com.htc.cleartrip.base;


import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import exception.userdefinedexception;

public class Basepage {
	
	protected WebDriver driver;
	Logger log=Logger.getLogger(Basepage.class);
	
	public Basepage(WebDriver driver) {
		this.driver=driver;
	}
	

	public WebDriver getDriver() {
		return driver;
	}


	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}


	
	
	public void waitForVisibilityOfElementLocated(WebDriver driver, By locators)  {
		//Thread.sleep(10000);
		WebDriverWait wait = new WebDriverWait(driver, Integer.parseInt("20"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(locators));
		log.info("The element Located");
	}
	public void dropdown(By xpaths,int index) throws Exception  {	
		try {
		Select dropdown = new Select(driver.findElement(xpaths));
		dropdown.selectByIndex(index);
		log.info("The dropdown selected");			
	}
		
		catch(Exception e) {
			throw new userdefinedexception("dropdown not selected" + e.getMessage());
		//	System.out.println(e.getMessage());
			//e.printStackTrace();
		}
		
	}
	public void sendKeys(By xpaths,String str) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	//	driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS) ;
	//	WebDriverWait wait = new WebDriverWait(driver, Integer.parseInt("30"));
		driver.findElement(xpaths).sendKeys(str);
	}
	
	public void numbersendKeys(By xpaths,CharSequence[] pin) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	//	driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS) ;
	//	WebDriverWait wait = new WebDriverWait(driver, Integer.parseInt("30"));
		driver.findElement(xpaths).sendKeys(pin);
	}
	
	
	
	public void copy(By xpaths) {
		Actions actions=new Actions(driver);
		WebElement name=driver.findElement(xpaths);
		name.sendKeys(Keys.CONTROL,"a");
		name.sendKeys(Keys.CONTROL,"c");
		WebElement text=driver.findElement(By.xpath("//input[@id='origin_autocomplete']"));
		text.sendKeys(Keys.CONTROL,"v");
		text.getText();

	}
	
	
	
	
	
	
	public void clickableMethod(By xpaths) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(xpaths).click();
	}
	public void scroll(By xpaths, WebDriver driver) {
//        WebElement Element = driver.findElement(xpaths);
		JavascriptExecutor js = (JavascriptExecutor) driver;		        		
//        js.executeScript("arguments[0].scrollIntoView(true);", Element);
		 js.executeScript("arguments[0].scrollIntoView();", driver.findElement(xpaths));
	}
	public void scrollByVisibleElement(WebDriver driver,By locator) throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		waitForVisibilityOfElementLocated(driver, locator);
		WebElement element=driver.findElement(locator);
		js.executeScript("arguments[0].scrollIntoView();", element);
		log.info("TO SCROLL DOWN THE WEB PAGE BY THE  VISIBILITY OF THE ELEMENT METHOD IS SUCCESSFULLY EXICUTED"+"__"+element);

	}
	public void switchtoNewTab(WebDriver driver,int i) {
		ArrayList<String> newtab=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(newtab.get(i));
	//	System.out.println("done");
		
	}
	public void switchtoNewFrame(WebDriver driver) {
		driver.switchTo().frame("modal_window");
	}
	
	public void click(WebDriver driver,By xpaths) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", xpaths);
	}
	
	public void cleardata(By xpaths) {
		driver.findElement(xpaths).clear();
	}
	
	public String Message(By xpaths) {
		String msg=driver.findElement(xpaths).getText();
		return msg;
	}
	
	public String datesplitter(String date) {
		String[] dateparts = date.split("/");
		String day=dateparts[0];
		String month=dateparts[1];
		String year=dateparts[2];
		return day;
		
	}
	
	public void flightdate(String datee) {
		  driver.findElement(By.xpath("(//a[text()="+datee+"])[1]")).click();
	}
	
	public void checkindate(String datee) {
		driver.findElement(By.xpath("(//a[text()="+datee+"])[1]")).click();
	}
	
	public void checkoutdate(String datee) {
		driver.findElement(By.xpath("(//a[text()="+datee+"])[1]")).click();
	}
	public void calenderr(String test,By xpath1,By xpath2,By xpath3,By xpath4,String date){
		String datearray[]=date.split("/");
		String datee=datearray[0];
		String monthh=datearray[1];
		String Year=datearray[2];
	    driver.findElement(xpath1).click(); 
		String monthyear= driver.findElement(xpath2).getText();
		System.out.println(monthyear);

		while(!(datesplit(monthyear)[0].equals(monthh) && datesplit(monthyear)[1].equals(Year))){
			driver.findElement(xpath3).click();  
			monthyear = driver.findElement(xpath2).getText(); 
			System.out.println(monthyear);
		}
		if(test.equalsIgnoreCase("Flight")) {
			flightdate(datee);
		}
		else if(test.equalsIgnoreCase("Hotelcheckin")) {
			checkindate(datee);
		}
		else if(test.equalsIgnoreCase("Hotelcheckout")) {
			checkoutdate(datee);
		}
		 log.info("calender function called");
		}
	
	
	public String[] datesplit(String monthyear) {
		return monthyear.split(" ");
	}
			
}
