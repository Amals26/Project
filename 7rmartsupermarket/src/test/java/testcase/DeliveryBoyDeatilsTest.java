package testcase;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.DeliveryBoyDeatilsPage;
import pages.LoginPage;
import utilities.Excelutility;

public class DeliveryBoyDeatilsTest extends Base{
	
	@Test(description="deliveryboy Deatils")
	public void DeliverBoyDeatils() throws IOException
	{
		String username1=Excelutility.getStringData(1, 0,"loginpage");
	      String password1=Excelutility.getStringData(1, 1,"loginpage");
	     	      
	      
	      LoginPage loginpage=new LoginPage(driver);
	      loginpage.EnterUsername(username1);
	      loginpage.EnterPassword(password1);
	      loginpage.ClickSigin();
	      
	      
	      DeliveryBoyDeatilsPage deliveryboy=new DeliveryBoyDeatilsPage(driver);
	      
	      String name=Excelutility.getStringData(1, 0,"deliveryboydetails");
	      String emailid=Excelutility.getStringData(1, 1,"deliveryboydetails");
	      String phonenumber=Excelutility.getStringData(1, 2,"deliveryboydetails");
	      String adress=Excelutility.getStringData(1, 3,"deliveryboydetails");
	      String username=Excelutility.getStringData(1, 4,"deliveryboydetails");
	      String password=Excelutility.getStringData(1, 5,"deliveryboydetails");


	      
	      deliveryboy.ClickMoreInfo();
	      deliveryboy.ClickButton();
	      deliveryboy.EnterName(name);
	      deliveryboy.EnterEmailId(emailid);
	      deliveryboy.EnterPhoneNumber(phonenumber);
	      deliveryboy.EnterAdress(adress);
	      deliveryboy.EnterUserName(username);
	      deliveryboy.EnterPassword(password);
	      deliveryboy.ClickSave();
	      deliveryboy.AlertisDisplayed();
	      
	     
 	      
  	     
	}

}
