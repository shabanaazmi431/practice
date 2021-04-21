package com.durgasoft.testNG;

import org.testng.annotations.Test;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class printall_radiobutton_properties {
	public WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  
	  WebElement tableloc = driver.findElement(By.xpath("//td[@class='table5'])[2]"));
	  for(int k=1;k<3;k++) {
	      java.util.List<WebElement> radio=tableloc.findElements(By.name("group"+k));
	  for(int i=0;i<radio.size();i++) {
		  radio.get(i).click();
		  for(int j=0;j<radio.size();j++) {
			  System.out.println(radio.get(j).getAttribute("value")+"-----"+radio.get(j).getAttribute("checked"));
			  Thread.sleep(5000);
		  }
	  }
	  
	  
	  }
	  
  }
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver", "E:\\browserdriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://echoecho.com/htmlforms10.htm");
		driver.manage().window().maximize();
  }

}
