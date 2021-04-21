package com.durgasoft.testNG.excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class writeexceldatabyColumnname {
	
	public FileInputStream fi;
	public FileOutputStream fo;
  	public XSSFWorkbook w;
  	public XSSFSheet s;
  	public XSSFRow row;
  	public XSSFCell cell;	
  	public XSSFFont font;
  	public XSSFCellStyle style;
  @Test
  public void f() throws IOException {
	  fi=new FileInputStream("E:\\SELENIUM\\eclipse\\seleniumautomation\\test data\\readdata.xlsx");
		 w=new XSSFWorkbook(fi);	  
		  s=w.getSheet("sheet1");
		  row=null;
		  cell=null;
		  int colNum=-1;
		  row=s.getRow(0);
		  for(int i=0;i<row.getLastCellNum();i++) {
			  if(row.getCell(i).getStringCellValue().equalsIgnoreCase("Results")) {
				  colNum=i;
				  
			  }
		  }
		row=s.getRow(1)	;
		if(row==null)
			row=s.createRow(1);
		cell=row.getCell(colNum);
		if(cell==null)
			cell=row.createCell(colNum);
		cell.setCellValue("Passed");
		 fo=new FileOutputStream("E:\\SELENIUM\\eclipse\\seleniumautomation\\test data\\readdata.xlsx");
	      w.write(fo);
		  fo.close();
  }
}
