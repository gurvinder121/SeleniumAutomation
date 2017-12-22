package com.core;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class WebsiteLogin {



	public static void main(String [] args) throws Throwable
	{
	    WebDriver driver;
		Driver d=new Driver();		
		System.setProperty("webdriver.gecko.driver","./Exe/geckodriver.exe");
		driver=d.intiateWebDriver();
	    driver.get("http://newtours.demoaut.com/");
	    driver.findElement(By.xpath(MercuryObjectrepoisitory.mercuryusername)).sendKeys("mercury");
	    driver.findElement(By.xpath(MercuryObjectrepoisitory.mercuryusername1)).sendKeys("mercury");
	    driver.findElement(By.xpath(MercuryObjectrepoisitory.googlesearchbutton)).click();
	    Thread.sleep(((long)5000));
	    driver.findElement(By.xpath(MercuryObjectrepoisitory.googlesearchbutton1)).click();
	    Select x=new Select(driver.findElement(By.xpath(MercuryObjectrepoisitory.mercurydropbox)));
	    x.selectByVisibleText("2");
	    Select g=new Select(driver.findElement(By.xpath(MercuryObjectrepoisitory.mercurydropbox1)));
        g.selectByVisibleText("Paris");
        Thread.sleep(((long)5000));
        Select h=new Select(driver.findElement(By.xpath(MercuryObjectrepoisitory.mercurydropbox2)));
        g.selectByVisibleText("May");
        Select i=new Select(driver.findElement(By.xpath(MercuryObjectrepoisitory.mercurydropbox3)));
        g.selectByVisibleText("14");
        
       
        
        
	    
	    
	}
}