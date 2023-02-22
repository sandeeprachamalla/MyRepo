package com.selenium.learning.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass1 {

	public static WebDriver driver=null;
	public BaseClass1(WebDriver driver){
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().timeouts().implicitlyWait(null);
		//driver.manage().timeouts().pageLoadTimeout(null);
	}
}
