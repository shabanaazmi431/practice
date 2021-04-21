package com.durgasoft.testNG;

import org.testng.annotations.Test;

import com.durgasoft.selenium.java.basepage;
import com.durgasoft.selenium.java.pageUI;

import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;

import org.testng.annotations.BeforeTest;

public class TC001_hms_login_logout extends basepage {
	
	public ATUTestRecorder recorder;
  @Test
  public void hms_login_logout() throws ATUTestRecorderException {
	   pageUI p =new pageUI(driver);
	   p.hmslogin();
	   p.hmsLogout();
	   recorder.stop();
	  	  
  }
  @BeforeTest
  public void beforeTest() throws Exception{
	 recorder= new ATUTestRecorder("E:\\recording", "hmslogin", false);
	  recorder.start();
	  
	  browserLaunch("chrome","http://seleniumbymahesh.com");
	  
	  
	  
	  
	  
  }

}
