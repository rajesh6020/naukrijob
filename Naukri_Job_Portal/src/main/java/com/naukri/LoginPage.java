package com.naukri;

//import java.util.Set;
//import java.util.concurrent.TimeUnit;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Util.DriverInitialize;


public class LoginPage {
	
	
	public void  signin(String username, String pwd)
	{
		
	System.out.println("This is sign in method");
	DriverInitialize.driver.findElement(By.xpath(".//*[@id='login_Layer']/div")).click();
	DriverInitialize.driver.findElement(By.xpath(".//*[@id='eLogin']")).sendKeys(username);
	DriverInitialize.driver.findElement(By.xpath(".//*[@id='pLogin']")).sendKeys(pwd);
	DriverInitialize.driver.findElement(By.xpath(".//*[@id='lgnFrm']/div[7]/button")).click();
	
	
	}
	
	/*public void  multiWindows()
	{
		String nklogin=driver.getWindowHandle();
		Set<String> nklogins= driver.getWindowHandles();
		System.out.println(nklogins);
		for (String handle: nklogins)
		{
			driver.switchTo().window(handle);
			driver.manage().window().maximize();
		}
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.switchTo().window(nklogin);
	}*/
	
	
}