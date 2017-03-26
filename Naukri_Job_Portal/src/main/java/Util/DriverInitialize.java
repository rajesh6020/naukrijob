package Util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;

public class DriverInitialize {
	
	public static WebDriver driver;
	
	public static WebDriver browserOpen(String browserName){
		try{
			
			if(browserName.equalsIgnoreCase("firefox")){
				driver = new FirefoxDriver();
			} else if(browserName.equalsIgnoreCase("ie")){
				System.setProperty("webdriver.ie.driver", "D:/Automation/Workspace/Library/IEDriverServer.exe");
				driver = new InternetExplorerDriver();
				
			} else if(browserName.equalsIgnoreCase("chrome")){
				System.setProperty("webdriver.chrome.driver", "D:/Automation/Workspace/Library/chromedriver.exe");
				driver = new ChromeDriver();
			}
			
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
		
		return driver;
		
	}

}
