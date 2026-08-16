package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Pageutility;

public class ManageLocationPage {
	
	private static final String String = null;
	@FindBy(xpath="//a[@class='small-box-footer' and @href=\"https://groceryapp.uniqassosiates.com/admin/list-location\"]")WebElement clickMoreInfo;
	@FindBy(xpath="//a[@onclick='click_button(1)']")WebElement New;
	@FindBy(xpath="//select[@class='form-control selectpicker']")WebElement ClickCountry;
	@FindBy(xpath="//select[@name='state_id']")WebElement ClickState;
	@FindBy(xpath="//input[@id='location']")WebElement Location;
	@FindBy(xpath="//input[@id='delivery']")WebElement DeliveryCharge;
	@FindBy(xpath="//button[@name='create']")WebElement SaveButton;
	@FindBy(xpath="//button[@name='create']")WebElement Alert;

	

    public  WebDriver driver;

    
    public ManageLocationPage(WebDriver driver)
    
    {
    	this.driver=driver;
		  PageFactory.initElements(driver,this);
  	
	}

	public void CreateManageLocation(String country,String state,String enterlocation,String entercharge) 
    
	{ 
		Pageutility page = new Pageutility();
		page.ClickElement(driver, clickMoreInfo);
      	New.click();

   	    page.DropDownVisibleText(ClickCountry, country);   
	    page.DropDownVisibleText(ClickState, state);
	    
      	Location.sendKeys(enterlocation);
    	DeliveryCharge.sendKeys(entercharge);
        SaveButton.click();
      	
    }
	
	public boolean Locationiscerated() {
		return  Alert.isDisplayed();
		
	}

}
