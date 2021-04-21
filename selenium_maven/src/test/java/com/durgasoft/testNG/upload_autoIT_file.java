package com.durgasoft.testNG;

import org.testng.annotations.Test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class upload_autoIT_file {
	public WebDriver driver;
  @Test
  public void f() throws InterruptedException, IOException {

		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin");
		driver.findElement(By.name("submit")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Registration")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.name("Perminent Registration")).click();
	    driver.findElement(By.name("image")).click();
	     Runtime.getRuntime().exec("C:\\Users\\hp 8.1\\Desktop\\new.exe");
	  
  }
  @BeforeTest
  public void beforeTest() {
	 
		  
		  System.setProperty("webdriver.chrome.driver", "E:\\browserdriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://seleniumbymahesh.com/HMS");
		driver.manage().window().maximize();
		
	  
	  
	  
  }

}
