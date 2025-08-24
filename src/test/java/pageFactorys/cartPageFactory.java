package pageFactorys;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class cartPageFactory {

	WebDriver driver;
	@FindBy(xpath = "//div/span[text()='Your Cart']")
	WebElement lbl_yourCart;
	@FindBy(id = "checkout")
	WebElement btn_checkout;	
	
	public void isLogoDisplayed() {
		lbl_yourCart.isDisplayed();		
	}
	
	public void clickCheckout() {
		btn_checkout.click();
	}
	
	
	
	public cartPageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
}
