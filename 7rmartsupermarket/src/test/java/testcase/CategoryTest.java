package testcase;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import pages.CategoryPage;
import pages.HomePage;
import pages.LoginPage;
import utilities.Excelutility;

public class CategoryTest extends Base {

	HomePage homepage;
	CategoryPage category;

	@Test(groups = { "Regression" })
	public void Category() throws IOException {

		String username1 = Excelutility.getStringData(1, 0, "loginpage");
		String password1 = Excelutility.getStringData(1, 1, "loginpage");

		LoginPage loginpage = new LoginPage(driver);
		loginpage.EnterUsername(username1);
		loginpage.EnterPassword(password1);
		loginpage.ClickSigin();

		homepage = new HomePage(driver);
		// CategoryPage category = new CategoryPage(driver);
		String category1 = Excelutility.getStringData(1, 0, "categoryname");

		category = homepage.clickCategoryMoreInfo();
		category.ClickNew().ClickSelect().ClickCategory(category1).ClickImageUpload().RadioButton().ClickSave();
		/*
		 * category.ClickSelect(); category.ClickCategory(category1);
		 * category.ClickImageUpload(); category.RadioButton(); category.ClickSave();
		 */

		boolean alert = category.isalertDisplayed();
		Assert.assertTrue(alert,Constant.CATEGORY);

	}
}