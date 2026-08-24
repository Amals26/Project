package testcase;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.AdminUserPage;
import pages.LoginPage;
import utilities.Excelutility;
import utilities.FakerUtility;

public class AdminUserTest extends Base{
	
	@Test(description="Admin user page")
     public void AdminUser() throws IOException {

	      String username1=Excelutility.getStringData(1, 0,"loginpage");
	      String password1=Excelutility.getStringData(1, 1,"loginpage");
	     	      
	      
	      LoginPage loginpage=new LoginPage(driver);
	      loginpage.EnterUsername(username1);
	      loginpage.EnterPassword(password1);
	      loginpage.ClickSigin();
	      
	     
	      
	      AdminUserPage adminuser=new AdminUserPage(driver);
	      adminuser.ClickMoreInfo();
	      adminuser.ClickNew();
	      
	     // String username2=Excelutility.getStringData(1, 0,"adminuser");
	      //String password2=Excelutility.getStringData(1, 1,"adminuser");
	      FakerUtility fakerutility=new    FakerUtility();
	      String username2=fakerutility.creatARandomFirstName();
	      String password2=fakerutility.creatARandomFirstName();
	      String usertype=Excelutility.getStringData(1, 3,"adminuser");

	      
	      System.out.println("Username = " + username2);
	      System.out.println("Password = " + password2);
	      System.out.println("UserType = [" + usertype + "]");
 	     

	      
	      adminuser.EnterUserName(username2);
	      adminuser.EnterPassWord(password2);
	      adminuser.SelectUserType(usertype);
	      adminuser.clickSave();
	      
	      
	      boolean alert=adminuser.AlertIsDisplayed();
 	      Assert.assertTrue(alert);
 	     System.out.print("is sucessfully registerd");
 	     
 	    	  
 	      

	      
	      
	      
    	 
    	 
     }
}