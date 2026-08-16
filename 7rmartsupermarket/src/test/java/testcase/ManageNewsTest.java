package testcase;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageNewsPage;
import utilities.Excelutility;

public class ManageNewsTest extends Base {

	@Test
	public void ManageNews() throws IOException {
		
		 String username1=Excelutility.getStringData(1, 0,"loginpage");
	      String password1=Excelutility.getStringData(1, 1,"loginpage");
	     	      
	      
	      LoginPage loginpage=new LoginPage(driver);
	      loginpage.EnterUsername(username1);
	      loginpage.EnterPassword(password1);
	      loginpage.ClickSigin();
	      
	      
	      ManageNewsPage managenews=new ManageNewsPage(driver);
	      managenews.ClickManageNewsInfo();
	      managenews.ClickNew();
	      managenews.EnterUploadNews("New Products are Now Avaliable");
	      managenews.ClickSave();
	      
	      boolean alert=managenews.alertisDisplayed();
 	      Assert.assertTrue(alert);
 	     
 	     
 	     
	      
		
	}
}
