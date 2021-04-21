package com.durgasoft.testNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;

public class facebook_DD {
	public WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  driver.findElement(By.linkText("Create New Account")).click();
	  Thread.sleep(5000);
	  driver.switchTo().frame(0);
	 /* new Select(driver.findElement(By.id("month"))).selectByIndex(3);
	  Thread.sleep(5000);
	  new Select(driver.findElement(By.id("month"))).selectByValue("7");
	  Thread.sleep(5000);
	  new Select(driver.findElement(By.id("month"))).selectByVisibleText("7");*/
	 WebElement ddMonth = driver.findElement(By.xpath("//select[@name='birthday month']"));
	 Select monthDD=new Select(ddMonth);
	 monthDD.selectByIndex(5);
	 Thread.sleep(5000);
	 monthDD.selectByValue("7");
	 Thread.sleep(5000);
	 monthDD.selectByVisibleText("Dec");
	 
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("WebDriver.chrome.driver", "E:\\library\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		  
	  
	  
  }

}
