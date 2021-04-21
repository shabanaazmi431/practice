package com.durgasoft.testNG;

import org.testng.annotations.Test;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class jqurey_Dropdown {
	public WebDriver driver;
  @Test
  public void f() {
	  
	  driver.findElement(By.xpath("//button[@class='multiselect dropdown-toggle btn btn-default']"));
	 WebElement table=driver.findElement(By.xpath("//ul[@class='multiselect-container dropdown-menu']"));
	 List<WebElement>ddValues=table.findElements(By.tagName("input"));
	  System.out.println("available values in Dropdown:"+ddValues.size());
	  for(int i=0;i<ddValues.size();i++) {
		  ddValues.get(i).click();
		  
	  }
	  
	  Random r=new Random();
	  int num=r.nextInt(4);
	  System.out.println();
	  ddValues.get(num).click();
  }
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver", "E:\\browserdriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_1");
		driver.manage().window().maximize();
		  
  }

}
