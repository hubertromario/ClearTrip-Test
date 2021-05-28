package com.htc.cleartrip.Reports;


import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.htc.cleartrip.Utilities.Screenshot;
import com.htc.cleartrip.base.TestBase;




public class Listeners extends TestBase implements ITestListener {
	
	@Override
	public void onStart(ITestContext context) {
		//this.context=context;
		// TODO Auto-generated method stub
		System.out.println("Onstart");
		
	//	parenttest=extent.createTest("Open chrome Browser using chrome driver");
	//	Childtest=parenttest.createNode("Open Url");
	//	Childtest.log(Status.PASS, MarkupHelper.createLabel("Browser opens", ExtentColor.BLUE));
	    System.out.println(driver!=null);
	    System.out.println(S!=null);
		
		extent = ExtentSetup.getInstance();
	    ITestListener.super.onStart(context);
	}
	@Override
	public void onFinish(ITestContext context) {
		System.out.println("OnFinish");
		// TODO Auto-generated method stub
		ITestListener.super.onFinish(context);
		extent.flush();

		System.out.print("Flush is working");
	}
	
	
	
	
	@Override
	public void onTestStart(ITestResult result) {
		System.out.print(result); 
	    test=extent.createTest(result.getName());
	    
	    
	 //   extent.createTest(result.getMethod().getMethodName());
		System.out.println("Test Started : "+ result.getName());
		
	}
	@Override
	public void onTestSuccess(ITestResult result) {
	     
	    Childtest.log(Status.PASS,result.getMethod().getMethodName());
	    Childtest.log(Status.PASS, "Test Passed");
		System.out.println("Test passed : "+ result.getName());
	}
	@Override
	public void onTestFailure(ITestResult result) {
		System.out.print(result);
	  
		Childtest.log(Status.FAIL,result.getMethod().getMethodName());
	    Childtest.log(Status.FAIL, "Test Failed");
	    
	    
	//	Object testClass = result.getInstance();	
	
	  ITestContext context=result.getTestContext();
	  WebDriver driver = (WebDriver) context.getAttribute("Driver");
	  Screenshot S=new Screenshot(driver); 
	  
	 
		// System.out.println(driver!=null);
		// System.out.println(S!=null);
		String screenshotFilepath=S.screenShot("Screenshot","C:\\Users\\huber\\eclipse-workspace\\cleartrip\\Screenshots\\screenshot.png");
		System.out.println("Test Failed : "+ result.getName());
		try {
			test.addScreenCaptureFromPath(screenshotFilepath);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	@Override
	public void onTestSkipped(ITestResult result) {
		
		test.log(Status.SKIP, "Test skip");
		System.out.println("Test Skipped : "+ result.getName());
		
	}
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("Test Failed within successrate : "+ result.getName());
	}
	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		System.out.println("Test Failed with Timeout : "+ result.getName());
	}
	
}
