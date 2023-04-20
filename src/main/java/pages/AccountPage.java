package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.DriverFactory;

public class AccountPage extends DriverFactory  {
	WebDriverWait Wait=new WebDriverWait(driver,Duration.ofSeconds(30));
	public AccountPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(xpath="//button[text()='Create Account']")
	public WebElement account;
	public void createaccount() {
		Wait.until(ExpectedConditions.elementToBeClickable(account));
		account.click();
	}
	@FindBy(xpath="//input[@name='firstName']")
		public WebElement firstname;
		public void enterfirstname() throws InterruptedException {
			Wait.until(ExpectedConditions.elementToBeClickable(firstname));
			firstname.sendKeys("q");
			Thread.sleep(3000);
			
			
		}
		@FindBy(xpath="//p[text()='create account']")
		public WebElement clickaccount;
		public void clickaccount() {
			clickaccount.click();	
			
		}
		@FindBy(xpath="//p[text()='First name must be 2 to 30 characters']")
		public WebElement error;
		public void errorvalidation() {
			Boolean geterror=error.isDisplayed();
			System.out.println(geterror);
			String geterrortext=error.getText();
			System.out.println(geterrortext);
		}
	}


