package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.DriverFactory;

public class LoginPage extends DriverFactory {
	WebDriverWait Wait=new WebDriverWait(driver,Duration.ofSeconds(30));
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
	@FindBy(xpath="//p[text()='login']")
	public WebElement loginButton;

	public void clickLoginButton() {
		Wait.until(ExpectedConditions.elementToBeClickable(loginButton));
		loginButton.click();
	}
	
	@FindBy(xpath="//input[@name='email']")
	public WebElement email;
	public void enteremail() {
		Wait.until(ExpectedConditions.elementToBeClickable(email));
		email.sendKeys("test@gmail.com");
		}
	@FindBy(xpath="//input[@name='password']")
	public WebElement password;
	public void enterpassword() {
		Wait.until(ExpectedConditions.elementToBeClickable(password));
		password.sendKeys("Sulekaha123");
		}
	@FindBy(xpath="//p[text()='sign in']")
	public WebElement signin;
	public void clicksignin() {
		signin.click();
	}
}
