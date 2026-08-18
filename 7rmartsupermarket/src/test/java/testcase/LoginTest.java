package testcase;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import utilities.Excelutility;

public class LoginTest extends Base {
	
	
	@Test(groups= {"Regression"})
	public void verifyuserisabletoLoginWithValidCreditional() throws IOException
	{
		
	      String username1=Excelutility.getStringData(1, 0,"loginpage");
	      String password1=Excelutility.getStringData(1, 1,"loginpage");
	      
	      
	      LoginPage loginpage=new LoginPage(driver);
	      loginpage.EnterUsername(username1);
	      loginpage.EnterPassword(password1);
	      loginpage.ClickSigin();
	}
	
	
	  
    @Test
    	public void verifyuserisabletoLoginWithInvalidusernameAndValidPassword() throws IOException {
    		
    		
    		String username1=Excelutility.getStringData(2, 0,"loginpage");
    		String password1=Excelutility.getStringData(2, 1,"loginpage");

    		
    		  //String usernameValue="admin";
    	      //String PasswordValue="ayinu";
    	      
    	      LoginPage loginpage=new LoginPage(driver);
    	      loginpage.EnterUsername(username1);
    	      loginpage.EnterPassword(password1);
    	      loginpage.ClickSigin();
    	      
    	      boolean frontpage=loginpage.isalertDisplayed();
    	      Assert.assertTrue(frontpage);
    }    	      
    	      
    		
    		
    			
    	@Test
		public void verifyuserisabletoLoginWithValidUsernameAndInvalidPassword() throws IOException {
			
			  //String usernameValue="admin";
		     // String PasswordValue="hey";
		      
		      String username=Excelutility.getStringData(3, 0,"loginpage");
	     		String password=Excelutility.getStringData(3, 1,"loginpage");

		      
		      LoginPage loginpage=new LoginPage(driver);
		      loginpage.EnterUsername(username);
		      loginpage.EnterPassword(password);
		      loginpage.ClickSigin();
		      boolean frontpage=loginpage.isalertDisplayed();
    	      Assert.assertTrue(frontpage);
			
}
}


