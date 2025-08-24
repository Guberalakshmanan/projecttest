package pageFactorys;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class checkoutOverviewPageFactory {
	
	WebDriver driver;
	@FindBy(xpath = "//div/span[text()='Checkout: Overview']")
	WebElement lbl_checkInfo;
	@FindBy(id = "finish")
	WebElement btn_finish;
	
	
	public void isLogoDisplayed() {
		lbl_checkInfo.isDisplayed();
	}
	
	public void clickFinish() {
		btn_finish.click();
	}
	
	
	public checkoutOverviewPageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	

}
