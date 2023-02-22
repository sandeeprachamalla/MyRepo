package pagerepository;

import org.openqa.selenium.WebDriver;

public class LoginPage1 extends com.selenium.learning.Test.BaseClass1{

	public LoginPage1(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	//WebDriver driver;
	
	public void OpenUrl() {
		driver.get("https://www.google.com/");
	}
}
