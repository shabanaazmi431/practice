package com.durgasoft.testNG;

import org.testng.annotations.Test;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Radiobutton_properties {
	public WebDriver driver;
	
  @Test
  public void f() {
	  
	  WebElement tableloc = driver.findElement(By.xpath("//td[@class='table5'])[2]"));
	  List<WebElement> radio1= tableloc.findElements(By.name("group1"));
		
	  System.out.println("available radio buttons in group1:"+radio1.size());
	  for(int i=0;i<radio1.size();i++) {
		  System.out.println(radio1.get(i).getAttribute("value")+"-----"+radio1.get(i).getAttribute("checked"));
		  
	  }
	  
	  java.util.List<WebElement> radio2 = tableloc.findElements(By.name("group1"));
	  System.out.println("available radio buttons in group1:"+radio2.size());
	  for(int i=0;i<radio2.size();i++) {
		  System.out.println(radio2.get(i).getAttribute("value")+"-----"+radio2.get(i).getAttribute("checked"));
	  } 
		  
  }
  @BeforeTest
  public void beforeTest() {
	  
	  
	  System.setProperty("WebDriver.chrome.driver", "E:\\library\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://echoecho.com/htmlforms10.htm");
		driver.manage().window().maximize();
  }

}
