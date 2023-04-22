package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.DriverFactory;

public class PasswordPage extends DriverFactory {
	WebDriverWait Wait=new WebDriverWait(driver,Duration.ofSeconds(30));
	public PasswordPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
	
	@FindBy(xpath="//p[text()='login']")
	public WebElement loginButton;

	public void clickLoginButton() {
		Wait.until(ExpectedConditions.elementToBeClickable(loginButton));
		loginButton.click();
	}
	

}
