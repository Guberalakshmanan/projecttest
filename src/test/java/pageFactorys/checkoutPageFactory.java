package pageFactorys;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class checkoutPageFactory {

	WebDriver driver;
	@FindBy(xpath = "//div/span[text()='Checkout: Your Information']")
	WebElement lbl_checkInfo;
	@FindBy(id = "first-name")
	WebElement txt_firstname;
	@FindBy(id = "last-name")
	WebElement txt_lastname;
	@FindBy(id = "postal-code")
	WebElement txt_postcode;
	@FindBy(xpath = "//div/input[@type='submit']")
	WebElement btn_continue;
	
	public void isLogoDisplayed() {
		lbl_checkInfo.isDisplayed();		
	}
	
	public void enterFirstname(String firstname) {
		txt_firstname.sendKeys(firstname);
	}
	
	public void enterLastname(String lastname) {
		txt_lastname.sendKeys(lastname);
	}
	
	public void enterPostalcode(String postalcode) {
		txt_postcode.sendKeys(postalcode);
	}
	
	public void clickContinue() {
		btn_continue.click();
	}
	
	
	public checkoutPageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
