package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Pageutility;

public class AdminUserPage {
	
	@FindBy(xpath="//a[@class='small-box-footer' and @href=\"https://groceryapp.uniqassosiates.com/admin/list-admin\"]")WebElement moreInfo; 
    @FindBy(xpath="//a[@onclick='click_button(1)']")WebElement New;
    @FindBy(xpath="//input[@name='username']")WebElement username;
    @FindBy(xpath="//input[@name='password']")WebElement password;
    @FindBy(xpath="//select[@id='user_type']")WebElement userType;
    @FindBy(xpath="//button[@name='Create']")WebElement save;
    @FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']")WebElement Alert;
    
	public WebDriver driver;
	public String type;


    public AdminUserPage(WebDriver driver)
    {
    	this.driver=driver;
		  PageFactory.initElements(driver,this);
    	
	}

    public void ClickMoreInfo() 
    {
    	moreInfo.click();
    }
    
    public void ClickNew()
    {
    	New.click();
    }
    
    public void EnterUserName(String username2) 
    {
    	username.sendKeys(username2);
    }
    
    public void EnterPassWord(String password2) 
    {
    	password.sendKeys(password2);
    	
    }
    
    public void SelectUserType(String usertype) {
        Pageutility page = new Pageutility();
        page.DropDownVisibleText(userType, usertype);
    }
   
    public void clickSave() {
    	save.click();
    }
    
    public boolean AlertIsDisplayed() {
    	return Alert.isDisplayed();

    }
    

}