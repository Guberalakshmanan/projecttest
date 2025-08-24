package pageFactorys;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePageFactory {

	WebDriver driver;	
	@FindBy(xpath = "//div[text()='Swag Labs']")	//*[name()='path' and contains(@fill,'currentCol')]
	WebElement lbl_homelogo;
	@FindBy(xpath = "//div[text()='Sauce Labs Backpack']/ancestor::div[@class='inventory_item_label']/following-sibling::div[@class='pricebar']//button")
	WebElement btn_labsBag;
	@FindBy(xpath = "//div[text()='Sauce Labs Onesie']/ancestor::div[@class='inventory_item_label']/following-sibling::div[@class='pricebar']//button")
	WebElement btn_labsOne;
	@FindBy(xpath = "//div/a[@data-test='shopping-cart-link']")
	WebElement btn_addtoCart;
	
	
	public void isLogoDisplayed() {
		lbl_homelogo.isDisplayed();		
	}
	
	public void addBagtocart() {
		btn_labsBag.click();
	}
	
	public void addOnesietocart() {
		btn_labsOne.click();
	}
	
	public void clickCart() {
		btn_addtoCart.click();
	}
	
	public homePageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
}
