package com.durgasoft.selenium.java;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class readdatafrom_propertiesfile {
	
	public static final String path="./objectrepositery.properties";
	public static String getdata(String key) throws Exception {
		File f=new File(path);
		Properties p = new Properties();
		FileInputStream fs=new  FileInputStream(f);
		p.load(fs);
		return p.getProperty(key);
		
		
	
		return p.getProperty(key);

	public static void main(String[] args)  throws Excpetion{
		
		System.out.println(getdata("browser"));
		WebDriver driver = new chromedriver();
		driver.get(getdata("prodURL"));
		driver.manage().window().maximize();
		driver.findElement(By.name(getdata("usernameLoc"))).sendKeys(getdata("username"));
		driver.findElement(By.name(getdata("passwordLoc"))).sendKeys(getdata("password"));
        driver.findElement(By.name(getdata("loginLoc"))).click();
	}

	
	}

}
