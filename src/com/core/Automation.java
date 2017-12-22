package com.core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Automation {

public static void main(String [] args) throws Throwable {
	EnvironmentConfiguration.readfile();
    Driver d=new Driver();
	WebDriver driver=d.intiateWebDriver();
    driver.get(EnvironmentConfiguration.getUrl());
    driver.findElement(By.xpath(ObjectRepository.googleinputbox)).sendKeys("selenium");
	driver.findElement(By.xpath(ObjectRepository.googlesearchbutton)).click();
	driver.close();

}

}
