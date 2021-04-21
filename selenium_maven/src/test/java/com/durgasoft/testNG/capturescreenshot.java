package com.durgasoft.testNG;

import java.awt.List;
import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class capturescreenshot<WebElement> {
	public WebDriver driver;
  @Test
  public void normalscreenshot() throws IOException {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\hp 8.1\\Desktop\\new.exe"));
		
	  
	  
  }
  @Test
  
  public void conditionBasedScreenshot() throws Exception {
	  List<WebElement> links = driver.findElements(By.partialLinkText("New Batches"));
		System.out.println("available links are:" + links.size());
		for (int i = 0; i < links.size(); i++) {
			System.out.println("LinkName:" + links.get(i).getText());
			links.get(i).click();
			Thread.sleep(5000);
		}
		if (!(links.size() == 0)) {
			File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File("C:\\Users\\DELL\\Desktop\\sbm.png"));
		}
	}
  @Test
	public void dateNtimeScreenshot() throws Exception {
		Date dt = new Date(0);
		DateFormat dtformat = new SimpleDateFormat("dd-MM-yyyy-hh-mm-ss");
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\DELL\\Desktop\\" + dtformat.format(dt) + "sel.png"));
	}
  
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "E:\\browserdriver\\chromedriver.exe");		
	  driver = new ChromeDriver();
		driver.get("http://seleniumbymahesh.com");
		driver.manage().window().maximize();
	  
	  
  }

}
