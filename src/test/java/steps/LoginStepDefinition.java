package steps;

import java.sql.SQLException;

import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pages.Database;
import pages.LoginPage;
import pages.TestBase;

public class LoginStepDefinition extends TestBase{
	
	LoginPage loginPage;
	Database database;

	@Before
	public void setup() {
		
		initDriver();
		//PageFactory moves the driver to the loginPage to put in the username
		loginPage = PageFactory.initElements(driver, LoginPage.class);
		database = new Database();
		
	}
	
	@Given ("^User is on techfios login page$")
	public void user_is_on_techfios_login_page() {
		
		driver.get("https://techfios.com/billing/?ng=login/");
		takeScreenshot(driver);
		
	}
	
	@When("^User enters username from database$")
	public void user_enters_username_from_database() throws ClassNotFoundException, SQLException {
		
		System.out.println("Username from DB: +" + database.getDataFromDb("username"));
		loginPage.insertUsername(database.getDataFromDb("username"));
	}

	@When("^User enters password from database$")
	public void user_enters_password_from_database() throws ClassNotFoundException, SQLException {
		
		System.out.println("Password from DB: +" + database.getDataFromDb("password"));
		loginPage.insertPasssword(database.getDataFromDb("password"));
	}

	@When("^User clicks on the signin button$")
	public void user_clicks_on_the_signin_button() {
		
		loginPage.clickSigninButton();
	    
	}

	@Then("^User should land on Dashboard page$")
	public void user_should_land_on_Dashboard_page() {
		
		Assert.assertEquals("Page titles are not matching", "Dashboard- iBilling", loginPage.getpageTitle() );
		takeScreenshot(driver);
	    
	}
	
	@After
	public void tearDown() {
		
		driver.close();
		driver.quit();
		
	}
	
}
