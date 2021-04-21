package com.durgasoft.testNG;

import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
/*stale element reference exception*/
public class bbc_dynamiclinks {
	
	public WebDriver driver;
  @Test
  public void f  () throws InterruptedException {
	  
	 WebElement table = driver.findElement(By.xpath("//div[@class='most popular']"));
	  List<WebElement> links=table.findElements(By.tagName("a"));
	  System.out.println("available links are:"+links.size());
	  for(int i=0;i<links.size();i++) {
		  System.out.println(links.get(i).getText());
		  links.get(i).click();
		  Thread.sleep(5000);
		  System.out.println(driver.getCurrentUrl());
		  driver.navigate().back();
		  Thread.sleep(5000);
		  driver.findElement(By.className("class='Maybe later']"));
		   table = driver.findElement(By.xpath("//div[@class='most popular']"));
		   links=table.findElements(By.tagName("a"));
		  	  
	  }
	  
	  
	  
  }
  @BeforeTest
  public void beforeTest() {

	  System.setProperty("webdriver.chrome.driver", "E:\\browserdriver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.bbc.com/");
	driver.manage().window().maximize();
	  
	  
	  
  }

}
