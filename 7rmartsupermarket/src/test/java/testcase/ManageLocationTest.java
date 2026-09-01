package testcase;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import pages.HomePage;
import pages.LoginPage;
import pages.ManageLocationPage;
import utilities.Excelutility;

public class ManageLocationTest extends Base {

	HomePage homepage;
	ManageLocationPage locations;

	@Test(groups = { "Regression" }, description = "manage location")
	public void ManageLocation() throws IOException {

		String username1 = Excelutility.getStringData(1, 0, "loginpage");
		String password1 = Excelutility.getStringData(1, 1, "loginpage");

		LoginPage loginpage = new LoginPage(driver);
		loginpage.EnterUsername(username1);
		loginpage.EnterPassword(password1);
		loginpage.ClickSigin();

		ManageLocationPage locations = new ManageLocationPage(driver);

		String country = Excelutility.getStringData(1, 0, "locations");
		String state = Excelutility.getStringData(1, 1, "locations");
		String enterlocation = Excelutility.getStringData(1, 2, "locations");
		String entercharge = Excelutility.getStringData(1, 3, "locations");

		System.out.println("Country = " + country);
		System.out.println("State = " + state);
		System.out.println("Location = " + enterlocation);
		System.out.println("Delivery Charge = " + entercharge);
		homepage = new HomePage(driver);
		locations = homepage.ClicKLocationMoreinfo();
		locations.ClickNew().SelectCountry(country).Selectstate(state).EnterLocation(enterlocation)
				.EnterDeliveryCharge(entercharge).ClickSave();

		/*
		 * locations.SelectCountry(country); locations.Selectstate(state);
		 * 
		 * locations.EnterLocation(enterlocation);
		 * locations.EnterDeliveryCharge(entercharge); locations.ClickSave();
		 */

		boolean alert = locations.Locationiscerated();
		Assert.assertTrue(alert,Constant.MANAGELOCATION);

	}

}
