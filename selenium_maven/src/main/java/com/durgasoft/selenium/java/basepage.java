package com.durgasoft.selenium.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class basepage {
	
	public WebDriver driver;
 public void browserLaunch(String browser,String URL) {
	 System.setProperty("webdriver.chrome.driver", "E:\\SELENIUM\\browserdriver");
	 driver=new ChromeDriver();
	 
 
 driver.get(URL);
 driver.manage().window().maximize();
 
}
}