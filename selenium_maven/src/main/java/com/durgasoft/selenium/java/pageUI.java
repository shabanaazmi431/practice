package com.durgasoft.selenium.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pageUI {

	@FindBy(linkText="HMS")WebElement linkHMS;
	@FindBy(name="username")WebElement txtusername;
	@FindBy(name="password")WebElement txtpassword;
	@FindBy(name="submit")WebElement Btnlogin;
	@FindBy(linkText="Logout")WebElement linkLogout;
	
	public pageUI(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public pageUI() {
		// TODO Auto-generated constructor stub
	}

	public void hmslogin() {
		linkHMS.click();
		txtusername.sendKeys("admin"); 
		txtpassword.sendKeys("admin");
		Btnlogin.click();
		
	
	}

	public void hmsLogout() {
		linkLogout.click();
	}
	
	
	
}
