package com.durgasoft.testNG.excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class writeExceldata_byindex{
	public FileInputStream fi;
	public FileOutputStream fo;
  	public XSSFWorkbook w;
  	public XSSFSheet s;
  	public XSSFRow row;
  	public XSSFCell cell;
	
  @Test
  public void f() throws IOException {
	  fi=new FileInputStream("E:\\SELENIUM\\eclipse\\seleniumautomation\\test data\\readdata.xlsx");
		 w=new XSSFWorkbook(fi);	  
		  s=w.getSheet("sheet1");
		  row=null;
		  cell=null;
		  row=s.getRow(3);
		  if(row==null)
			  row=s.createRow(3);
		  cell=row.getCell(2);
		  if(cell==null)
			   cell=row.createCell(2);
		  cell.setCellValue(true);
		  fo=new FileOutputStream("E:\\SELENIUM\\eclipse\\seleniumautomation\\test data\\readdata.xlsx");
	      w.write(fo);
		  fo.close();
  }
}
