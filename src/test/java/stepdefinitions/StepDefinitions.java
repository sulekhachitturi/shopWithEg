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

	@And("user enters password with valid input")
	public void user_enters_password_with_valid_input() {
		passwordpage.validpassword();
	}

	@Then("user clicks on signin")
	public void user_clicks_on_signin() {
		passwordpage.clicksignin();
	}

	@When("user not enter specialcharacters")
	public void user_not_enter_specialcharacters() {
		passwordpage.invalidpassword();
	}
	@And("user click on signin")
	public void user_click_on_signin() {
		passwordpage.clicksignin1();
	}

	@Then("validate error message")
	public void validate_error_message() {
		passwordpage.errormessage();
	    
	}

	@When("user not enter numericvalues")
	public void user_not_enter_numericvalues() {
		passwordpage.invalidnumeric();
	}
	
	@Then("validate error message2")
	public void validate_error_message2() {
		passwordpage.errormessage2();
	}

	@When("user not enter lowercase")
	public void user_not_enter_lowercase() {
		passwordpage.invalidlower();
	}
	

	@Then("validate error message3")
	public void validate_error_message3() {
		
		passwordpage.errormessage3();
	}

	@When("user not enter uppercaseletters")
	public void user_not_enter_uppercaseletters() {
		passwordpage.invalidupper();
	}
	
	@Then("validate error message4")
	public void validate_error_message4() {
		passwordpage.errormessage4();
	}
	


}
