//package Testclass;

//import org.testng.annotations.Test;
//
//import Base.BaseClass;
//import Pageclass.LoginPage;
//
//public class LoginTest extends BaseClass {
//	LoginPage lp;
// 
//
//
//  @Test
//  public void LoginPageTest()  {
//	  lp = new LoginPage();
////	  lp.enterUsername("jsmith");
////	  lp.enterPassword("demo1234");
////	  lp.clickLogin();
//	  lp.homepage("jsmith", "demo1234");
//  }
//  
////  @Test(dependsOnMethods="LoginPageTest")
////  public void checkuserlogin() {
////	 boolean b =  lp.verifylogin();
////	 if(b==true) {
////		 System.out.println("user login successfully");
////	 }
////	 else {
////		 System.out.println("user not login");
////	 }
//  }

/*  #################  (Properties file) ###################################### */
package Testclass;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import Base.BaseClass;
import Pageclass.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest extends BaseClass{
	public static LoginPage lp;
	
	public LoginTest() throws IOException {
//		String browser = prop.getProperty("browser");
//		String b1 = browser.toLowerCase();
//		switch(b1) {
//		case "chrome":
//			WebDriverManager.chromedriver().setup();
//			driver = new ChromeDriver();
//			break;
//		case "firefox":
//			WebDriverManager.firefoxdriver().setup();
//			driver = new FirefoxDriver();
//			break;
//		case "edge":
//			WebDriverManager.edgedriver().setup();
//			driver = new EdgeDriver();
//			break;
//		default:
//			System.out.println("incorrect browser detail");
//		}
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		String pageurl = prop.getProperty("url");
		driver.get(pageurl);
		lp = new LoginPage();
	}
	
	@Test
	public void LoginPageTest() {
		String user = prop.getProperty("username");
		String pass = prop.getProperty("password");
		lp.enterUsername(user);
		lp.enterPassword(pass);
		lp.clickLogin();
	}
}
