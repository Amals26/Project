package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Pageutility;

public class ManageNewsPage {
	@FindBy(xpath="//a[@class='small-box-footer' and @href=\"https://groceryapp.uniqassosiates.com/admin/list-news\"]")WebElement ManageNewsInfo;
    @FindBy(xpath="//a[@onclick='click_button(1)']")WebElement New;
    @FindBy(xpath="//textarea[@name='news']")WebElement uploadNews;
    @FindBy(xpath="//button[@class='btn btn-danger']")WebElement save;
    @FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")WebElement Alert;
    
   public WebDriver driver; 
    
    
    public ManageNewsPage(WebDriver driver) 
    {
    	this.driver=driver;
		  PageFactory.initElements(driver,this);
    	
	}

	public void ClickManageNewsInfo()
    {
		Pageutility obj=new Pageutility();
		obj.ClickElement(driver, ManageNewsInfo);
		
	}
    
 
    public void ClickNew() 
    {
    	New.click();
    }
    
    public void EnterUploadNews(String Newss)
    {
    	
    	uploadNews.sendKeys(Newss);
    }
    
    public void ClickSave() 
    {
    	save.click();
    	
    }
    
    public boolean alertisDisplayed() 
    {
		return Alert.isDisplayed();
    	
    }
}
