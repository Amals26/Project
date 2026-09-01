package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(xpath = "//input[@placeholder='Username']")
	WebElement username;

	@FindBy(xpath = "//input[@placeholder='Password']")
	WebElement password;

	@FindBy(xpath = "//button[@class='btn btn-dark btn-block']")
	WebElement signIn;
	
	@FindBy(xpath="//i[@class='icon fas fa-ban']")
	WebElement alert;

	public WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public LoginPage EnterUsername(String username1) {
		username.sendKeys(username1);
		return this;

	}

	public  LoginPage EnterPassword(String password1) {
		password.sendKeys(password1);
		return this;

	}

	public HomePage ClickSigin()

	{
		signIn.click();
		return new HomePage(driver);
	}

	public boolean isalertDisplayed() {
		return alert.isDisplayed();

	}

}
