package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOutPage {
	
	@FindBy(xpath="//a[@data-toggle='dropdown']")WebElement Admin;
	@FindBy(xpath="//i[@class='ace-icon fa fa-power-off']") WebElement Logout;
	//@FindBy(xpath="//a[@class='dropdown-item' and @href=\"https://groceryapp.uniqassosiates.com/admin/logout\"]")WebElement Logout;

	
	
	public WebDriver driver;

	public LogOutPage(WebDriver driver)
	{
		this.driver=driver;
		  PageFactory.initElements(driver,this);
	
	}
	
	public void ClickAdmin() 
	{
		Admin.click();
	}
	
	public void ClickLogOut()
	{
		
	Logout.click();
	}

}
