package pageFactorys;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePageFactory {

	WebDriver driver;	
	@FindBy(xpath = "//*[name()='path' and contains(@fill,'currentCol')]")
	WebElement lbl_homelogo;
	
	public void isLogoDisplayed() {
		lbl_homelogo.isDisplayed();		
	}
	
	public homePageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
}
