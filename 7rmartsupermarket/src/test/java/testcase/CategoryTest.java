package testcase;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.CategoryPage;
import pages.LoginPage;
import utilities.Excelutility;

public class CategoryTest extends Base {

	@Test
	public void Category() throws IOException {
	

	      String username1=Excelutility.getStringData(1, 0,"loginpage");
	      String password1=Excelutility.getStringData(1, 1,"loginpage");
	      
	      
	      LoginPage loginpage=new LoginPage(driver);
	      loginpage.EnterUsername(username1);
	      loginpage.EnterPassword(password1);
	      loginpage.ClickSigin();
		
	           
	      CategoryPage category=new CategoryPage(driver);
	      String category1=Excelutility.getStringData(1, 0,"categoryname");
	      category.CreateCategory(category1);
	      
	      
	      boolean alert=category.isCategoryCreated();
 	      Assert.assertTrue(alert);

	      
	      
	      
}
}