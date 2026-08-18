package testcase;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageNewsPage;
import utilities.Excelutility;

public class ManageNewsTest extends Base {

	@Test(groups= {"Regression"})
	public void ManageNews() throws IOException {
		
		 String username1=Excelutility.getStringData(1, 0,"loginpage");
	      String password1=Excelutility.getStringData(1, 1,"loginpage");
	     	      
	      
	      LoginPage loginpage=new LoginPage(driver);
	      loginpage.EnterUsername(username1);
	      loginpage.EnterPassword(password1);
	      loginpage.ClickSigin();
	      
	      
	      ManageNewsPage managenews=new ManageNewsPage(driver);
	      String Newss=Excelutility.getStringData(1, 0,"News");
	      

	      managenews.ClickManageNewsInfo();
	      managenews.ClickNew();
	      managenews.EnterUploadNews(Newss);
	      managenews.ClickSave();
	      
	      boolean alert=managenews.alertisDisplayed();
 	      Assert.assertTrue(alert);
 	     
 	     
 	     
	      
		
	}
}
