package com.durgasoft.testNG.excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class readdatafrom_excelfile {
  @Test
  public void f() throws IOException {
	FileInputStream fi = new FileInputStream("E:\\SELENIUM\\eclipse\\seleniumautomation\\test data\\readdata.xlsx");
	  XSSFWorkbook w=new XSSFWorkbook(fi);
	 XSSFSheet s = w.getSheet("sheet1");
	XSSFRow row= s.getRow(1);
	XSSFCell cell =row.getCell(1);
	System.out.println(cell.getStringCellValue());
	w.close();
	  
	  
	  
	  
	  
  }
}
