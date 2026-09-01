package testcase;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import pages.AdminUserPage;
import pages.HomePage;
import pages.LoginPage;
import utilities.Excelutility;
import utilities.FakerUtility;

public class AdminUserTest extends Base {

	HomePage homepage;
	AdminUserPage adminuser;

	@Test(description = "Admin user page")
	public void AdminUser() throws IOException {

		String username1 = Excelutility.getStringData(1, 0, "loginpage");
		String password1 = Excelutility.getStringData(1, 1, "loginpage");

		LoginPage loginpage = new LoginPage(driver);
		loginpage.EnterUsername(username1);
		loginpage.EnterPassword(password1);
		loginpage.ClickSigin();

		homepage = new HomePage(driver);

		adminuser = homepage.ClickMoreInfo();

		adminuser.ClickNew();

		// String username2=Excelutility.getStringData(1, 0,"adminuser");
		// String password2=Excelutility.getStringData(1, 1,"adminuser");
		FakerUtility fakerutility = new FakerUtility();
		String username2 = fakerutility.creatARandomFirstName();
		String password2 = fakerutility.creatARandomFirstName();
		String usertype = Excelutility.getStringData(1, 2, "adminuser");

		System.out.println("Username = " + username2);
		System.out.println("Password = " + password2);
		System.out.println("UserType = [" + usertype + "]");

		adminuser.EnterUserName(username2).EnterPassWord(password2).SelectUserType(usertype).clickSave();

		/*
		 * adminuser.EnterPassWord(password2); adminuser.SelectUserType(usertype);
		 * adminuser.clickSave();
		 */

		boolean alert = adminuser.AlertIsDisplayed();
		Assert.assertTrue(alert,Constant.ADMINUSER);

	}
}