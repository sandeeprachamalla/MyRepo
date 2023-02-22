package stepDefinitions;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.selenium.learning.Base.TestBase;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class login extends TestBase{
	
	@Given("i have account details")
	public void i_have_account_details() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
	}

	@When("i enter username and password")
	public void i_enter_username_and_password() {
	    
	}

	@When("i click the login button")
	public void i_click_the_login_button() {
	    
	}
	
	@Then("i should be logged in successfully")
	public void i_should_be_logged_in_successfully() {
	   
	}


}
