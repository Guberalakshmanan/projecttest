package StepDefinition;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageFactorys.cartPageFactory;
import pageFactorys.checkoutOverviewPageFactory;
import pageFactorys.checkoutPageFactory;
import pageFactorys.completeorderPageFactory;
import pageFactorys.homePageFactory;
import pageFactorys.loginPageFactory;

public class PageFactoryLoginStepDefinition {
	
	WebDriver driver;
	loginPageFactory login;
	homePageFactory home;
	cartPageFactory cartpage;
	checkoutPageFactory checkout;
	checkoutOverviewPageFactory overview;
	completeorderPageFactory complete_page;
	
	@Given("User is on login page")
	public void user_is_on_login_page() {
		WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    driver.get("https://www.saucedemo.com/");	    
	}

	@Then("User enters valid {string} and {string}")
	public void user_enters_valid_and(String username, String password) {
	    login = new loginPageFactory(driver);
	    login.enterUsername(username);
	    login.enterPassword(password);	       
	}

	@And("User clicks login button")
	public void user_clicks_login_button() {
		login.clickOnLoginButton();	
		home = new homePageFactory(driver);
	}

	@Then("User is navigate to the home page")
	public void user_is_navigate_to_the_home_page() throws InterruptedException {
		Thread.sleep(20000);
		home.isLogoDisplayed();
	}

	@And("User added products in cart")
	public void user_added_products_in_cart() {
	    home.addBagtocart();
	    home.addOnesietocart();
	}

	@And("User clicks cart button")
	public void user_clicks_cart_button() {
	    home.clickCart();
	}

	@Then("Check user in your cart page")
	public void check_usser_in_your_cart_page() {
		cartpage = new cartPageFactory(driver);
		cartpage.isLogoDisplayed();
	}

	@And("User clicks checkout button")
	public void user_clicks_checkout_button() {
		cartpage.clickCheckout();
	}

	@Then("User is on your information page")
	public void user_is_on_your_information_page() {
		checkout = new checkoutPageFactory(driver);
		checkout.isLogoDisplayed();
	}

	@And("User enters enters the following details {string} and {string} and {string}")
	public void user_enters_enters_the_following_details_and_and(String firstname, String lastname, String postalcode) {
	    checkout.enterFirstname(firstname);
	    checkout.enterLastname(lastname);
	    checkout.enterPostalcode(postalcode);
	}

	@And("User clicks Continue")
	public void user_clicks_continue() {
	    checkout.clickContinue();
	}

	@Then("User is on overview page")
	public void user_is_on_overview_page() {
		overview = new checkoutOverviewPageFactory(driver);
		overview.isLogoDisplayed();
	}

	@And("User clicks finish button")
	public void user_clicks_finish_button() {
	    overview.clickFinish();
	}

	@Then("User has completed the checkout process")
	public void user_has_completed_the_checkout_process() {
		complete_page = new completeorderPageFactory(driver);
		complete_page.isLogoDisplayed();
	}

	@And("User should see a success message confirming the order")
	public void user_should_see_a_success_message_confirming_the_order() {
		complete_page.iscompleteorderDisplayed();
	}	
	
	@And("Close the browser")
	public void close_the_browser() {
	   driver.close();
	}


}
