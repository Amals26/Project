package utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;


public class ScreenShotUtility {

	public void getScreenShot(WebDriver driver, String failedTestCase) throws IOException {
		TakesScreenshot scrShot = (TakesScreenshot) driver; // convert Webdriver to ss
					//selenium webdriver cannot take ss directly. so,we typecaste into take ss
		
		File screenShot = scrShot.getScreenshotAs(OutputType.FILE);//capture the ss and store it temporary as a file
		
		String timeStamp = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss").format(new Date());//create date and time
		
		File f1 = new File(System.getProperty("user.dir") + "//OutputScreenShot"); 	//folder name																				//// is generated in this folder ie
																					
		if (!f1.exists()) {
			f1.mkdirs(); //create a folder id does not exist
		}
		String destination = System.getProperty("user.dir") + "//OutputScreenShot//" + failedTestCase + timeStamp
				+ ".png";
		File finalDestination = new File(destination);
		FileHandler.copy(screenShot, finalDestination); // FileHandler-class
	}
}
