package testng_framework;


import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;



public class ExcelUtils 
{
	@DataProvider
	public  Object[][] getdata() throws IOException{
		ArrayList<String> data = new ArrayList<String>();

	    FileInputStream fis = new FileInputStream("C:\\Users\\onkarb\\Downloads\\testng_01.xlsx");
	    XSSFWorkbook workbook = new XSSFWorkbook(fis);
	    XSSFSheet sheet = workbook.getSheetAt(0);
	    
	    
	    for(int i=1;i<2;i++)
	    {
	                           
	    Row row = sheet.getRow(i);
	    
	    for(int j=0;j<2;j++)
	    {
	    	
	    	String value=sheet.getRow(i).getCell(j).getStringCellValue();
	    	data.add(value);
	    	
	    }
	    
	    }
	    
	    Object [][] objArray = new Object[data.size()][];
		
	    for(int i=0;i< data.size();i++)
	    {
	        
	        objArray[i][0] = data.get(i);
	     } 

	     return objArray;
	    
		
		
		
	    
	}}
