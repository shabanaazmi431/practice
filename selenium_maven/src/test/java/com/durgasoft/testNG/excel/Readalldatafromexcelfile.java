package com.durgasoft.testNG.excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Readalldatafromexcelfile {
	public FileInputStream fi;
  	public XSSFWorkbook w;
  	public XSSFSheet s;
  	public XSSFRow row;
  	public XSSFCell cell;		
  @Test
  public void f() throws IOException {
	  fi=new FileInputStream("E:\\SELENIUM\\eclipse\\seleniumautomation\\test data\\readdata.xlsx");
	 w=new XSSFWorkbook(fi);	  
	  s=w.getSheet("sheet1");
	  int rowCount=s.getLastRowNum()-s.getFirstRowNum();
	  System.out.println(rowCount);
	  for(int i=1;i<=rowCount;i++) {
		  row=s.getRow(i);
	for(int j=0;j<row.getLastCellNum();j++) {
		System.out.println(row.getCell(j).getStringCellValue());
		
	}
		System.out.println();  
	  }
	  
  }
  
}
