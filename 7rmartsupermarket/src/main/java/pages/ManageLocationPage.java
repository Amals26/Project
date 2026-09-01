package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Pageutility;

public class ManageLocationPage {
	Pageutility page = new Pageutility();

	/*
	 * @FindBy(xpath =
	 * "//a[@class='small-box-footer' and @href=\"https://groceryapp.uniqassosiates.com/admin/list-location\"]"
	 * ) WebElement ManageLocationclickMoreInfo;
	 */

	@FindBy(xpath = "//a[@onclick='click_button(1)']")
	WebElement New;

	@FindBy(xpath = "//select[@class='form-control selectpicker']")
	WebElement ClickCountry;

	@FindBy(xpath = "//select[@name='state_id']")
	WebElement ClickState;

	@FindBy(xpath = "//input[@id='location']")
	WebElement Location;

	@FindBy(xpath = "//input[@id='delivery']")
	WebElement DeliveryCharge;

	@FindBy(xpath = "//button[@name='create']")
	WebElement SaveButton;

	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	WebElement Alert;

	public WebDriver driver;

	public ManageLocationPage(WebDriver driver)

	{
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	/*
	 * public void ClicKMoreinfo()
	 * 
	 * {
	 * 
	 * page.ClickElement(driver, ManageLocationclickMoreInfo); }
	 */

	public ManageLocationPage ClickNew() {
		New.click();
		return this;
	}

	public ManageLocationPage SelectCountry(String country) {
		page.DropDownVisibleText(ClickCountry, country);
		return this;
	}

	public ManageLocationPage Selectstate(String state) {
		page.DropDownVisibleText(ClickState, state);
		return this;
	}

	public ManageLocationPage EnterLocation(String enterlocation) {
		Location.sendKeys(enterlocation);
		return this;
	}

	public ManageLocationPage EnterDeliveryCharge(String entercharge) {
		DeliveryCharge.sendKeys(entercharge);
		return this;
	}

	public ManageLocationPage ClickSave() {
		SaveButton.click();
		return this;
	}

	public boolean Locationiscerated() {
		return Alert.isDisplayed();

	}

}
