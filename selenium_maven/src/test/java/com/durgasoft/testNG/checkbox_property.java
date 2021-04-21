package com.durgasoft.testNG;

import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class checkbox_property {
	
	public WebDriver driver;
  @Test
  public void f() {
	List<WebElement> cb =driver.findElements(By.xpath("//td[@class='table5']/input[@type=checkbox']"));
	  for(int i=0;i<cb.size();i++) {
		 System.out.println(cb.get(i).getAttribute("value")+"-----"+cb.get(i).getAttribute("checked"));
		 if(!cb.get(i).isSelected()) {
		 cb.get(i).click();
		 
	  }
	  
	  } 
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "E:\\browserdriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://echoecho.com/htmlforms09.htm");
		driver.manage().window().maximize();
		  
  }

}
