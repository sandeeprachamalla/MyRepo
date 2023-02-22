package pagerepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InventoryPage {

	WebDriver driver;
	
	@FindBy(xpath="//span[text()='Products']")
	WebElement productLabel;

	
	public InventoryPage(WebDriver driver) {
		this.driver = driver;
        PageFactory.initElements(driver, this);
	}
	
	
	public String getProductLabel() {
		return productLabel.getText();
	}
	
	
}