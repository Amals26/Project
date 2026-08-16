package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(xpath="//input[@placeholder='Username']")WebElement username;
	@FindBy(xpath="//input[@placeholder='Password']")WebElement password;
	@FindBy(xpath="//button[@class='btn btn-dark btn-block']")WebElement signIn;
	
	
	public WebDriver driver;
	
	public LoginPage(WebDriver driver) 
	{
		this.driver=driver;
		  PageFactory.initElements(driver,this);
		  
	}

	public void EnterUsername(String username1) 
	{
		 username.sendKeys(username1);
		 
	}
	
	public void EnterPassword(String password1) 
	{
		password.sendKeys(password1);
		
	}
	
	public void ClickSigin() 
	
	{
		signIn.click();
	}


}
