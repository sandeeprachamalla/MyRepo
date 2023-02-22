package com.selenium.learning.Test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.selenium.learning.Base.TestBase;
import pagerepository.InventoryPage;
import pagerepository.LoginPage;


public class LoginTest extends TestBase{

	LoginPage loginPage;
	

	//Log4j configuration
	private static final Logger log = LogManager.getLogger(LoginTest.class);
	
	@Test
	public void loginTest(){
		
		log.info("Verifying successful login.");
		
		loginPage = new LoginPage(driver);
		
		//Should fetch the username and password from external test data files
		InventoryPage inventoryPage = loginPage.login(envConfig.getProperty("username"), envConfig.getProperty("password"));
		String expectedProductLabel = "PRODUCTS";
		String actualProductLabel = inventoryPage.getProductLabel();
		
		log.info("expectedProductLabel-" + expectedProductLabel + " and actualProductLabel - " + actualProductLabel);
		Assert.assertEquals(actualProductLabel,expectedProductLabel);
	}

}