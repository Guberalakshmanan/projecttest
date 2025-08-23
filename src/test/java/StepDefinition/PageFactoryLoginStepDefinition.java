package StepDefinition;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageFactorys.homePageFactory;
import pageFactorys.loginPageFactory;

public class PageFactoryLoginStepDefinition {
	
	WebDriver driver;
	loginPageFactory login;
	homePageFactory home;
	
	@Given("User is on login page")
	public void user_is_on_login_page() {
		WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    driver.get("https://www.saucedemo.com/v1/");	    
	}

	@When("User enters valid {string} and {string}")
	public void user_enters_valid_and(String username, String password) {
	    login = new loginPageFactory(driver);
	    login.enterUsername(username);
	    login.enterPassword(password);	       
	}

	@And("User clicks login button")
	public void user_clicks_login_button() {
		login.clickOnLoginButton();
	}

	@Then("User is navigate to the home page")
	public void user_is_navigate_to_the_home_page() {
		home = new homePageFactory(driver);
	   home.isLogoDisplayed();
	}

	@And("Close the browser")
	public void close_the_browser() {
	   driver.close();
	}


}
