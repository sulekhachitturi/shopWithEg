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
	@FindBy(xpath="//input[@type='password']")
    public WebElement password;
	public void validpassword() {
		Wait.until(ExpectedConditions.elementToBeClickable(password));
		password.sendKeys("Sulekha@7673");
		password.clear();
	}
	
	@FindBy(xpath="//p[text()='sign in']")
	public WebElement signin;
	public void clicksignin() {
		Wait.until(ExpectedConditions.elementToBeClickable(signin));
		signin.click();
	}
	@FindBy(xpath="//input[@type='password']")
	public WebElement password1;
	public void invalidpassword() {
		Wait.until(ExpectedConditions.elementToBeClickable(password1));
		password1.sendKeys("Sulekha7673");
		
		
	}
		
	@FindBy(xpath="//p[text()='sign in']")
	public WebElement signin1;
	public void clicksignin1() {
		Wait.until(ExpectedConditions.elementToBeClickable(signin1));
		signin1.click();
		
	
}

	@FindBy(xpath="//p[text()='At least one special character is required']")
	public WebElement validatemessage;
	public void errormessage() {
		Boolean message=validatemessage.isDisplayed();
		System.out.println(message);
		String s=validatemessage.getText();
		System.out.println(s);
	}
	public void invalidnumeric() {
		Wait.until(ExpectedConditions.elementToBeClickable(password1));
		password1.clear();
		password1.sendKeys("Sulekha@");
		
		
		
	}
	@FindBy(xpath="//p[text()='At least one number is required']")
	public WebElement validatemessage2; 
	public void errormessage2() {
		Boolean message1=validatemessage2.isDisplayed();
		System.out.println(message1);
		String s1=validatemessage2.getText();
		System.out.println(s1);
		
	}
	public void invalidlower() {
		password1.clear();
		password1.sendKeys("SSSSSS@7673");
	}
	@FindBy(xpath="//p[text()='At least one lowercase character is required']")
	public WebElement validatemessage3;
	public void errormessage3() {
		Boolean message3=validatemessage3.isDisplayed();
		System.out.println(message3);
		String s2=validatemessage3.getText();
		System.out.println(s2);
		
	}
	public void invalidupper() {
		password1.clear();
		password1.sendKeys("sjakadj@123");
	}
	@FindBy(xpath="//p[text()='At least one uppercase character is required']")
	public WebElement validatemessage4;
	public void errormessage4() {
		Boolean message4=validatemessage4.isDisplayed();
		System.out.println(message4);
		String s3=validatemessage4.getText();
		System.out.println(s3);	
	}
	
	
	
}
