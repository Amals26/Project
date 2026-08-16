package testcase;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.LogOutPage;
import pages.LoginPage;
import utilities.Excelutility;

public class LogOutTest extends Base {
	
	@Test
	public void Logout() throws IOException {
		

	      String username1=Excelutility.getStringData(1, 0,"loginpage");
	      String password1=Excelutility.getStringData(1, 1,"loginpage");
	      
	      
	      LoginPage loginpage=new LoginPage(driver);
	      loginpage.EnterUsername(username1);
	      loginpage.EnterPassword(password1);
	      loginpage.ClickSigin();	
	
	      LogOutPage logoutpage=new LogOutPage(driver);
	      logoutpage.ClickAdmin();
	      logoutpage.ClickLogOut();
	}
}
