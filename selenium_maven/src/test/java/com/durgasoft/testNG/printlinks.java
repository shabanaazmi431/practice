package com.durgasoft.testNG;

import org.testng.annotations.Test;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class printlinks {
	public WebDriver driver;
  @Test
  public void f() throws Exception{
	  java.util.List<WebElement> links = driver.findElements(By.tagName("a"));
	  System.out.println("available links are:"+links.size());
	  int count=0;
	  for(int i=0;i<links.size();i++) {
		  if(!links.get(i).getText().isEmpty()) {
		  System.out.println(links.get(i).getText());
		  count++;
		  Thread.sleep(5000);
		  
	  }
	  System.out.println("visible links are:"+count);
	  } 
	  
	  
  }
  @BeforeTest
  public void beforeTest() {

	  System.setProperty("webdriver.chrome.driver", "E:\\browserdriver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://seleniumbymahesh.com");
	driver.manage().window().maximize();
	  
	  
  }

}
