package com.durgasoft.testNG;

import org.testng.annotations.Test;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class bootstrapalert_redbus {
	
	public WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  
	  driver.findElement(By.id("i-icon-profile ")).click();
	  Thread.sleep(5000);
	  driver.findElement(By.id("signInLink")).click();
	  Thread.sleep(5000);
	  driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='modalFrame']")));
	  driver.findElement(By.xpath("//div[text()='Facebook']")).click();
	Set<String>  windows =driver.getWindowHandles();
	  System.out.println(windows);
	  Object[] s=windows.toArray();
	  driver.switchTo().window(s[1].toString());
	  
	  
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "E:\\browserdriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
	  
	  
	  
  }

}
