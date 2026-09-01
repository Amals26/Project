package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Pageutility;

public class HomePage {
	Pageutility obj = new Pageutility();

	@FindBy(xpath = "//a[@data-toggle='dropdown']")
	WebElement Admin;

	@FindBy(xpath = "//i[@class='ace-icon fa fa-power-off']")
	WebElement Logout;

	// @FindBy(xpath="//a[@class='dropdown-item' and
	// @href=\"https://groceryapp.uniqassosiates.com/admin/logout\"]")WebElement
	// Logout;

	@FindBy(xpath = "//a[@class='small-box-footer' and @href=\"https://groceryapp.uniqassosiates.com/admin/list-admin\"]")
	WebElement AdminmoreInfo;

	@FindBy(xpath = "//a[@class='small-box-footer' and @href=\"https://groceryapp.uniqassosiates.com/admin/list-news\"]")
	WebElement ManageNewsInfo;

	@FindBy(xpath = "//a[@class='small-box-footer' and @href=\"https://groceryapp.uniqassosiates.com/admin/list-category\"]")
	WebElement CategoryMoreInfo;

	@FindBy(xpath = "//a[@class='small-box-footer'and @href=\"https://groceryapp.uniqassosiates.com/admin/list-deliveryboy\"]")
	WebElement DeliveryBoyMoreInfo;

	@FindBy(xpath = "//a[@class='small-box-footer' and @href=\"https://groceryapp.uniqassosiates.com/admin/list-location\"]")
	WebElement ManageLocationclickMoreInfo;

	public WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public HomePage ClickAdmin() {
		Admin.click();
		return this;
	}

	public LoginPage ClickLogOut() {

		Logout.click();
		return new LoginPage(driver);
	}

	public AdminUserPage ClickMoreInfo() {
		AdminmoreInfo.click();
		return new AdminUserPage(driver);
	}

	public ManageNewsPage ClickManageNewsInfo() {

		obj.ClickElement(driver, ManageNewsInfo);
		return new ManageNewsPage(driver);

	}

	public CategoryPage clickCategoryMoreInfo() {

		obj.ClickElement(driver, CategoryMoreInfo);
		return new CategoryPage(driver);
	}

	public DeliveryBoyDeatilsPage ClickDeliveryBoymoreInfo() {
		DeliveryBoyMoreInfo.click();
		return new DeliveryBoyDeatilsPage(driver);
	}

	public ManageLocationPage ClicKLocationMoreinfo()

	{
		obj.ClickElement(driver, ManageLocationclickMoreInfo);
		return new ManageLocationPage(driver);
	}

}
