package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import constant.Constant;
import utilities.FileUploadUtility;
import utilities.Pageutility;
import utilities.Waitutility;

public class CategoryPage {
	

	Pageutility obj=new Pageutility();
	@FindBy(xpath="//a[@class='small-box-footer' and @href=\"https://groceryapp.uniqassosiates.com/admin/list-category\"]")WebElement MoreInfo;
	@FindBy(xpath="//a[@onclick='click_button(1)']")WebElement New;
	@FindBy(xpath="//input[@id='category']")WebElement Category;
	@FindBy(xpath="//li[@id='1-selectable']")WebElement Select;
	@FindBy(xpath="//input[@id='main_img']")WebElement ImageUpload; 
	@FindBy(xpath="//input[@name='top_menu' and @value='yes']")WebElement topmenubutton;
	@FindBy(xpath="//input[@name='show_home' and @value='yes']")WebElement leftmenubutton;
	@FindBy(xpath="//button[@name='create'] ")WebElement Save;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")WebElement alertmessage;

	public WebDriver driver;
    public CategoryPage(WebDriver driver) {
    	this.driver=driver;
		PageFactory.initElements( driver,this);

	}
    
    public void ClickMoreInfo()
    {    	
  		
    		obj.ClickElement(driver,MoreInfo );
    }		
    
    public void ClickNew() 
    {
    		New.click();
    }		
    
    public void ClickCategory(String category1) 
    {
    		Category.sendKeys(category1);
    		
    }		
    
    public void  ClickSelect() 
    {
    		Select.click();
    		
    }		
    
    public void ClickImageUpload()
    {
    		FileUploadUtility file =new FileUploadUtility();
    		file.FileUploadUsingSendKeys(ImageUpload, Constant.APPIMG);
    		
    }
    
    public void  RadioButton() 
    {
    		topmenubutton.isSelected();	
    
    		leftmenubutton.isSelected();
    }		
    
    public void ClickSave()
    {
    		
    		obj.ClickElement(driver, Save);
    }
    	
    
    
    public boolean isalertDisplayed() {
    	
    		Waitutility waitutility=new Waitutility();
    		waitutility.waitForAlertToBeVisible(driver); 
		
		return alertmessage.isDisplayed();
	}
    }

	


