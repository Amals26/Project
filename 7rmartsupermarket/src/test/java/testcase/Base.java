package testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class Base {
	
	public WebDriver driver;
	
	@BeforeMethod
	public void BrowserInitilization() {
		 driver=new ChromeDriver();
		 driver.get("https://groceryapp.uniqassosiates.com/admin/login");
		 driver.manage().window().maximize();		
		
	}
	
	public void QuitandClose() {
		
		driver.quit();
	}

}
