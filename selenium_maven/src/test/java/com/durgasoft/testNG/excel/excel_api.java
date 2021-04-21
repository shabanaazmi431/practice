package com.durgasoft.testNG.excel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class excel_api {
	public FileInputStream fi=null;
	public FileOutputStream fo=null;
	public XSSFWorkbook w=null;
	public XSSFRow row=null;
	public XSSFCell cell=null;
	String filepath;
	private String cellValue;
	
	public excel_api(String  file) throws IOException {
		this.filepath=file;
		fi=new FileInputStream(filepath);
		w=new XSSFWorkbook(fi);
	}
	
//Reading cell data from excel file by using column index
	public String getCellData(String sheetName,int 	colNum,int rowNum) {
		XSSFSheet s = w.getSheet(sheetName);
		row=s.getRow(rowNum);
		cell=row.getCell(colNum);
		
		if(cell.getCellTypeEnum()==CellType.STRING) {
			return cell.getStringCellValue();
		}else if(cell.getCellTypeEnum()==CellType.NUMERIC || cell.getCellTypeEnum()==CellType.FORMULA);
		   cellValue=String.valueOf(cell.getNumericCellValue());
		   return cellValue;
	}else if(cell.getCellTypeEnum()==CellType.BLANK) {
			return " ";
		}else {
			return String.valueOf(cell.getBooleanCellValue());
			
	}	
	  
  
	}
}

