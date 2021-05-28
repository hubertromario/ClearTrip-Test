package com.htc.cleartrip.Utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import com.htc.cleartrip.base.Basepage;
import com.htc.cleartrip.base.TestBase;


public class Screenshot extends TestBase{
	
	public Screenshot(WebDriver driver) {
		this.driver=driver;		// TODO Auto-generated constructor stub
	}
	
	static Logger log=Logger.getLogger(Screenshot.class);
	
	public String screenShot( String fileName, String filePath ) {

		String scrPath= filePath + fileName + ".png";
		System.out.println("I m in screenshot");
		
		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);	
		
		try {
			FileUtils.copyFile(file, new File(scrPath));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return scrPath;
	}

}


