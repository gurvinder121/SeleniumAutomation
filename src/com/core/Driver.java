package com.core;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {
	  WebDriver driver;
	
	public WebDriver intiateWebDriver() throws Throwable
	{
		EnvironmentConfiguration.readfile();
		if(EnvironmentConfiguration.getBrowser().equalsIgnoreCase("firefox")) {
			
			
		System.setProperty("webdriver.gecko.driver",EnvironmentConfiguration.getGeckoDriver());
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		return driver;
		
		
		}else if(EnvironmentConfiguration.getBrowser().equalsIgnoreCase("chrome")) {
			
			
			System.setProperty("webdriver.chrome.driver",EnvironmentConfiguration.getGeckoDriver());
			driver=new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			return driver;
			
			
		}
		return driver;
	}
}
