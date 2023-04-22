package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.DriverFactory;
import pages.LoginPage;
import pages.AccountPage;
import pages.PasswordPage;


public class StepDefinitions {
	LoginPage loginPage=new LoginPage(DriverFactory.driver);
	AccountPage accountpage=new AccountPage(DriverFactory.driver);
	PasswordPage passwordpage=new PasswordPage(DriverFactory.driver);
	

	
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

	
	
	
	@Given("user launches shipWithEg site")
	public void user_launches_ship_with_eg_site() {
	    DriverFactory.driver.get("https://stg.shopwitheg.com/");
	}

	@When("user clicks on login")
	public void user_clicks_on_login() {
		passwordpage.clickLoginButton();
	    
	}

	@When("user enters password with valid input")
	public void user_enters_password_with_valid_input() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("user clicks on signin")
	public void user_clicks_on_signin() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("user not enter specialcharacters,numericvalues,lowercase and uppercaseletters")
	public void user_not_enter_specialcharacters_numericvalues_lowercase_and_uppercaseletters() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("user click on signin")
	public void user_click_on_signin() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}


}
