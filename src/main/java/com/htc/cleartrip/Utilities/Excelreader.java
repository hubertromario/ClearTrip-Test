package com.htc.cleartrip.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelreader {

		//XSSF //HSSF
		Workbook tripWorkbook;
		Sheet loginData;
		public Excelreader(String excelfilePath) throws IOException {
		//	try {
			File s = new File(excelfilePath);
			FileInputStream stream = new FileInputStream(s);
			tripWorkbook = new XSSFWorkbook(stream);
			System.out.println("excelFilepath"+excelfilePath);
			System.out.println("tripWorkbook "+tripWorkbook.getNumberOfSheets());
			tripWorkbook.close();
			}

		

	public Object[] getDataUsingMap(String sheetName){
				
				loginData = tripWorkbook.getSheet(sheetName);
				int rowCount = loginData.getLastRowNum();
				int colCount = loginData.getRow(0).getLastCellNum();
				
				Object[] obj = new Object[rowCount];
				System.out.println(rowCount + "  "+ colCount);
				
				for(int row=0; row<rowCount; row++) {
					Map<Object, Object> dataMap = new HashMap<Object, Object>();
					
					for(int col=0; col<colCount; col++) {
						dataMap.put(loginData.getRow(0).getCell(col).toString(), loginData.getRow(row+1).getCell(col).toString());
					}
					obj[row] = dataMap;
					
				}
			
				System.out.println(obj);
				return obj;
				
			}
	}



