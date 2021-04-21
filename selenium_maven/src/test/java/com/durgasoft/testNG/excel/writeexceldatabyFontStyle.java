package com.durgasoft.testNG.excel;

import java.awt.Font;
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

public class writeexceldatabyFontStyle {
	private static final Date Ok = null;
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
		 font =w.createFont();
		 style=w.createCellStyle();
		 row=s.getRow(2);
		 if(row==null)
			 s.createRow(2);
		 cell=row.getCell(1);
		 if(cell==null)
			 cell=row.createCell(1);
		 font.setFontName("Arial Black");
		 font.setFontHeight(9);
		 font.setBold(true);
		 style.setFont(font);
		 cell.setCellStyle(style);
		 cell.setCellValue("Ok");
		 fo=new FileOutputStream("E:\\SELENIUM\\eclipse\\seleniumautomation\\test data\\readdata.xlsx");
	      w.write(fo);
		  fo.close();

  }
}
