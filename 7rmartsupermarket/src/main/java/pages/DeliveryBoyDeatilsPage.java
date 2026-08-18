package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Pageutility;

public class DeliveryBoyDeatilsPage {
	
	@FindBy(xpath="//a[@class='small-box-footer'and @href=\"https://groceryapp.uniqassosiates.com/admin/list-deliveryboy\"]")WebElement MoreInfo;
    @FindBy(xpath="//a[@onclick='click_button(1)']")WebElement NewButton;
    @FindBy(xpath="//input[@id='name']")WebElement Name;
    @FindBy(xpath="//input[@id='email']")WebElement EmailId;
    @FindBy(xpath="//input[@id='phone']")WebElement PhoneNumber;
    @FindBy(xpath="//textarea[@id='address']")WebElement Adress;
    @FindBy(xpath="//input[@id='username']")WebElement Username;
    @FindBy(xpath="//input[@id='password']")WebElement Password;
    @FindBy(xpath="//button[@type='submit']")WebElement Save;
    @FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")WebElement alert;  
    
    public WebDriver driver;
    
    public DeliveryBoyDeatilsPage(WebDriver driver) 
    
    {
    	this.driver=driver;
    	PageFactory.initElements(driver,this);
	}

	public void ClickMoreInfo()
    {
      MoreInfo.click();	
    }
    
    public void ClickButton()
    {
    	NewButton.click();
    }
    
    public void EnterName(String name)
    {
         Name.sendKeys(name);	
    }
    
    public void EnterEmailId(String emailid)
    {
    	EmailId.sendKeys(emailid);
    }
 
    public void EnterPhoneNumber(String phonenumber)
    {
    	PhoneNumber.sendKeys(phonenumber);
    }
    
    public void EnterAdress(String adress)
    {
    	Adress.sendKeys(adress);
    }
    
    public void EnterUserName(String username)
    {
    	Username.sendKeys(username);
    }
    
    public void EnterPassword(String password)
    {
    	Password.sendKeys(password);
    }
    
    public void ClickSave()
    {
    	
    	Pageutility page=new Pageutility();
    	page.ClickElement(driver, Save);
 	 }
    	
    
       public boolean AlertisDisplayed() 
    {
		return alert.isDisplayed();
    	
    }

}
