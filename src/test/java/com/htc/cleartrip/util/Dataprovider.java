package com.htc.cleartrip.util;

import java.io.IOException;
import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

import com.htc.cleartrip.Utilities.Excelreader;
import com.htc.cleartrip.Utilities.PropertyFileReader;

public class Dataprovider {
	@DataProvider(name="Test")
		public Object[] ReadData(Method methodName) throws IOException{
		
		PropertyFileReader propertyFile = PropertyFileReader.getInstance();
		Excelreader exr = new Excelreader(propertyFile.P);
		Object[] Data = null;
		
		if(methodName.getName().equals("LoginTest")) {
			Data=exr.getDataUsingMap("Login");
			
			
		}
		
		else if(methodName.getName().equals("registrationTest")) {
			System.out.println("I am in");
			Data=exr.getDataUsingMap("Registration");
			System.out.println(Data);
		}
		
		else if(methodName.getName().equals("FlightsearchTest") ||  methodName.getName().equals("HotelBookingTest") || methodName.getName().equals("EditprofileTest") || methodName.getName().equals("TrainBookingTest")) {
			Data=exr.getDataUsingMap("UserData");
			System.out.print(Data);
		}
		
		else if(methodName.getName().equals("GiftcardTest")) {
		    System.out.print("I m in");
			Data=exr.getDataUsingMap("Sheet1");
			System.out.println("Sheet in");
			System.out.print(Data);
		}
		return Data;
		
	}

}
