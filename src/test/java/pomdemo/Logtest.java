package pomdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Logtest {
	
	@Test
   public void userlogin() {
	   WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
	    Login2	lp = new Login2(driver);
	      lp.enterusername("standard_user");
		  lp.enterpassword("secret_sauce");
		  lp.clickonlogin();
   }
}
