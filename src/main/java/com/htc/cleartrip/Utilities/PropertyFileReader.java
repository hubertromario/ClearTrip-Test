package com.htc.cleartrip.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyFileReader {
	public Properties prop;
	public FileInputStream fis;
	static PropertyFileReader instance;
	public String b;
	public String U;
	public String P;
	private PropertyFileReader() throws IOException {
		prop=new Properties();
		fis = new FileInputStream("C:\\Users\\huber\\eclipse-workspace\\cleartrip\\src\\test\\resources\\cleartrip.properties");	
		prop.load(fis);
	    b=prop.getProperty("browser");
		String U=prop.getProperty("url");
		P=prop.getProperty("ExcelFileLocation");
		}
	
	public static PropertyFileReader getInstance() throws IOException {
		if(instance==null) {
			instance=new PropertyFileReader();
		}
		return instance;
	}
   
  
  

}



