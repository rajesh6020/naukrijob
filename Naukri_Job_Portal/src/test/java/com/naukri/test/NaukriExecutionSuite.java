package com.naukri.test;

import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import jxl.read.biff.BiffException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
// org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;

import com.naukri.LoginPage;

import Util.DriverInitialize;
import Util.TestDataScript;

public class NaukriExecutionSuite {
	
	public WebDriver driver;
	public LoginPage lp;
	
	@Parameters("browser")
	@BeforeTest //OR @BeforeTest
	  public void beforeTest(String browser) {
		driver = DriverInitialize.browserOpen(browser);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://www.naukri.com/");
		driver.manage().window().maximize();
		lp = new LoginPage();
		
	  }
	
	
	@DataProvider(name="Authentication")
	public Object[][] credentials() throws Exception {
		
		return TestDataScript.getTestData("D:\\Automation\\TestData.xls", "Sheet1" );
	}
	
	
  @Test(dataProvider="Authentication", priority=1)
  public void loginTest(String username, String pwd) {
	  lp.signin(username, pwd);
	  
  }
	
	@Test(priority=2, enabled=false)
	  public void multiWindowsTest() {
		//lp.multiWindows();
		  
	  }
	
	
	@AfterTest 
	   
	  public void closeBrowser()
	  {
	   
		//driver.quit();
		//driver.close();  
	  }


  
  

}
