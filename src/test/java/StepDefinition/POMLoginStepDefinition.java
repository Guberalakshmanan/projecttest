package StepDefinition;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import PageObject.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class POMLoginStepDefinition {

//	WebDriver driver;
//	LoginPage login; 
//	
//	@Given("User is on login page")
//	public void user_is_on_login_page() {
//		WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//	    driver.get("https://www.saucedemo.com/v1/");
//	    
//	}
//
//	@When("User enters valid {string} and {string}")
//	public void user_enters_valid_and(String username, String password) {
//	    
//	       login = new LoginPage(driver);
//	       login.enterUsername(username);
//	       login.enterPassword(password);
//	}
//
//	@And("User clicks login button")
//	public void user_clicks_login_button() {
//		login.clickLogin();
//	}
//
//	@Then("User is navigate to the home page")
//	public void user_is_navigate_to_the_home_page() {
//	   login.checkLogo();
//	}
//
//	@And("Close the browser")
//	public void close_the_browser() {
//	    login.closeBrowser();
//	}
//
	
}
