package com.durgasoft.testNG.excel;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.BeforeTest;

public class readdatafromexcel_coloumn {
	public FileInputStream fi;
  	public XSSFWorkbook w;
  	public XSSFSheet s;
  	public XSSFRow r;
  	public XSSFCell cell;
  @Test
  public void f() throws IOException {
	  	
	  	FileInputStream fi = new FileInputStream("E:\\SELENIUM\\eclipse\\seleniumautomation\\test data\\readdata.xlsx");
		  XSSFWorkbook w=new XSSFWorkbook(fi);
		 XSSFSheet s = w.getSheet("sheet1");
		XSSFRow row= s.getRow(1);
	   cell=null;
	   int column=-1;
	   for(int i=0;i<row.getLastCellNum();i++) {
		   System.out.println(row.getCell(i).getStringCellValue());
		   if(row.getCell(i).getStringCellValue().equalsIgnoreCase("Password")) {
			   column=i;
			   System.out.println(i);
			   
		   }
		   
	   }
	  row=s.getRow(1);
	  cell=row.getCell(column);
	  String pwd=cell.getStringCellValue();
	  System.out.println("value in excel cell is:"+pwd);
  }
  @BeforeTest
  public void beforeTest() {
	  
	  
  }

}
