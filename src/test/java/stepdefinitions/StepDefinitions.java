package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.DriverFactory;
import pages.LoginPage;
import pages.AccountPage;


public class StepDefinitions {
	LoginPage loginPage=new LoginPage(DriverFactory.driver);
	AccountPage accountpage=new AccountPage(DriverFactory.driver);
	

	
	@Given("user launches shopwitheg site.")
	public void user_launches_shopwitheg_site() {
		DriverFactory.driver.get("https://stg.shopwitheg.com/"); 
	}

	@When("user clicks login button")
	public void user_clicks_login_button() {
		
		loginPage.clickLoginButton();
	    
	}

	@Then("user enter valid credentials")
	public void user_enter_valid_credentials() {
		loginPage.enteremail();
		loginPage.enterpassword();
	}

	@And("user will be successbvcvhfully loggedin.")
	public void user_will_be_successbvcvhfully_loggedin() {
		loginPage.clicksignin();
	}

	
	@When("user clicks on create account button")
	public void user_clicks_on_create_account_button() {
		accountpage.createaccount();
	}

	
	
	@When("user enters firstname with less than 2charactes")
	public void user_enters_firstname_with_less_than_2charactes() throws InterruptedException {
		accountpage.enterfirstname();
		accountpage.clickaccount();
		
		
	}

	@Then("validate the error message")
	public void validate_the_error_message() {
		
		accountpage.errorvalidation();
	}
}
