package com.selenium.learning.Test;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	
	public BaseClass(){
		
	}
	 
	public static WebDriver getDriver(){
	if(driver==null){
	//System.setProperty("webdriver.chrome.driver", "D:chromedriver.exe");
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(null);
	driver.manage().timeouts().pageLoadTimeout(null);
	//driver.get("https://www.google.com/");
	}
	return driver;
	}

}
