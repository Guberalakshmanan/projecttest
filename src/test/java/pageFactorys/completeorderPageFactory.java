package pageFactorys;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class completeorderPageFactory {

	WebDriver driver;
	@FindBy(xpath = "//div/span[text()='Checkout: Complete!']")
	WebElement lbl_checkComplete;
	@FindBy(xpath = "//div/h2[text()='Thank you for your order!']")
	WebElement lbl_completeOrder;
	@FindBy(id = "back-to-products")
	WebElement btn_backHome;

	public void isLogoDisplayed() {
		lbl_checkComplete.isDisplayed();
	}
	
	public void iscompleteorderDisplayed() {
		lbl_completeOrder.isDisplayed();
	}
	
	public completeorderPageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
}
