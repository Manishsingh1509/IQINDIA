package testNGcode;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRMAssertion {
	public static WebDriver driver;
	public static JavascriptExecutor js;
	public static SoftAssert soft;
  @BeforeSuite
  public void init() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  js = (JavascriptExecutor) driver;
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  driver.get("https://demo.testfire.net/login.jsp");
	  soft = new SoftAssert();
  }
  @Test
  public void testTitle() throws InterruptedException {
	  Thread.sleep(2000);
	  driver.findElement(By.id("uid")).sendKeys("jsmith");
	  driver.findElement(By.xpath("//input[@id='passw']")).sendKeys("demo1234");
	  WebElement we = driver.findElement(By.name("btnSubmit"));
	  js.executeScript("arguments[0].click()",we);
	 
	  
  }
  
  @Test
  public void verifyLogin() {
//	  boolean b = driver.findElement(By.xpath("//font[text()='Sign Off']")).isDisplayed();
//	  Assert.assertEquals(b,false);     // By hard assertion
//	  
///* ##############OR#####################################*/
//	  
//	  String expected = "Hello, John Smith";
//	  String actual = driver.findElement(By.xpath("//h1[starts-with(text(),'Hello')]")).getText();
//	  Assert.assertEquals(actual,expected,"Failed");
	  
//####################################################################################################//
  //#####################(By soft Assertion)##################################################//
	  String expected = "Hello, john Smith";
	  String actual = driver.findElement(By.xpath("//h1[starts-with(text(),'Hello')]")).getText();
	  soft.assertEquals(actual, expected,"not login");
	  
	  
	  boolean b = driver.findElement(By.xpath("//font[text()='Sign Off']")).isDisplayed();
	  soft.assertEquals(b,false,"sign-off");
	  soft.assertAll();
	  }
 @AfterSuite
  public void close() throws InterruptedException {
	  Thread.sleep(2000);
	  driver.close();
  }
	

 //##############################################################################################//
 //##############################################################################################//
	
	
//	@BeforeSuite
//	public void init() {
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
//		driver.manage().window().maximize();
//		soft = new SoftAssert();
//	}
//	
//	@Test
//	public void login() {
//		driver.get("https://demo.testfire.net/login.jsp");
//		driver.findElement(By.id("uid")).sendKeys("jsmith");
////		WebElement pwd = driver.findElement(By.id("passw"));
////		js.executeScript("arguements[0].value='demo1234'",pwd);
//		driver.findElement(By.xpath("//input[@id='passw']")).sendKeys("demo1234");
//		
//		driver.findElement(By.name("btnSubmit")).click();
//	}
//	
//	@Test
//	public void verifyLogin() {
//		String expected = "Hello John Smith1";
//		String actual = driver.findElement(By.xpath("//h1[starts-with(text(),'Hello')]")).getText();
//		soft.assertEquals(actual,expected,"user not login");
//		
//		boolean b = driver.findElement(By.xpath("//font[text()='Sign Off']")).isDisplayed();
//		soft.assertEquals(b, false,"sign-off");
//		soft.assertAll();
//	}
//	
//	@AfterSuite
//	public void close() throws InterruptedException {
//		Thread.sleep(2000);
//		driver.close();
//	}
}

	
	
	
	
	
	
	
	
	
	