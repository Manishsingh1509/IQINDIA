package testNGcode;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//public class OrangeHRM {
//	WebDriver driver;
//  @Test(priority=1)
//  public void openapp() {
//	  driver = new ChromeDriver();
//	  driver.manage().window().maximize();
//	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//  }
//  
//  @Test(priority=2)
//  public void Logo() throws InterruptedException{
//	  Thread.sleep(3000);
////	 boolean logo = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
////	 System.out.println("logo displayed " + logo);O
//	 
//	  //**********OR******************//
//	  
//	 WebElement logo = driver.findElement(By.xpath("//img[@alt='company-branding']"));
//	 if(logo.isDisplayed()) {
//		 System.out.println("logo available "+logo);
//	 }
//	 else {
//		 System.out.println("Logo not available "+logo);
//	 }
//  }
//  
//  @Test(priority=3)
//  public void login() {
//	  driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
//	  driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin1234");
//	  driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
//  }
//  
//  @Test(priority=4)
//  public void close() {
//	  driver.quit();
//  }
//}

/* ANOTHER ANNOTATIONS (@BEFORE METHOD , @AFTER METHOD) ###########################################*/


//public class OrangeHRM {
//	WebDriver driver;
//	@BeforeMethod
//	public void login() {
//		driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		driver.manage().window().maximize();
//		driver.get("https://demo.testfire.net/login.jsp");
//		driver.findElement(By.id("uid")).sendKeys("jsmith");
//		driver.findElement(By.id("passw")).sendKeys("demo1234");
//		driver.findElement(By.name("btnSubmit")).click();
//	}
//	
//	@Test(priority=1)
//	public void search() throws InterruptedException {
//		Thread.sleep(2000);
//		driver.findElement(By.id("query")).sendKeys("Transfer Funds");
//		driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
//	}
//	
//	@Test(priority=2)
//	public void click() throws InterruptedException {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("(//a[@class='focus'])[3]")).click();
//	}
//	
//	@AfterMethod
//	public void logout() throws InterruptedException {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//font[text()='Sign Off']")).click();
//	}
//}


/* ANNOTATIONS(@BEFORECLASS,@AFTERCLASS)#####################################*/
//public class OrangeHRM {
//	WebDriver driver;
//@BeforeClass
//public void login() {
//	driver = new ChromeDriver();
//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//	driver.manage().window().maximize();
//	driver.get("https://demo.testfire.net/login.jsp");
//	driver.findElement(By.id("uid")).sendKeys("jsmith");
//	driver.findElement(By.id("passw")).sendKeys("demo1234");
//	driver.findElement(By.name("btnSubmit")).click();
//}
//
//@Test(priority=1)
//public void search() throws InterruptedException {
//	Thread.sleep(2000);
//	driver.findElement(By.id("query")).sendKeys("Transfer Funds");
//	driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
//}
//
//@Test(priority=2)
//public void click() throws InterruptedException {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("(//a[@class='focus'])[3]")).click();
//}
//
//@AfterClass
//public void logout() throws InterruptedException {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//font[text()='Sign Off']")).click();
//}
//}


/* ANNOTATIONS(@BEFORETEST,@AFTERTEST)####################################################*/
//public class OrangeHRM {
//	WebDriver driver;
//	@BeforeTest
//	public void login() {
//		driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		driver.manage().window().maximize();
//		driver.get("https://demo.testfire.net/login.jsp");
//		driver.findElement(By.id("uid")).sendKeys("jsmith");
//		driver.findElement(By.id("passw")).sendKeys("demo1234");
//		driver.findElement(By.name("btnSubmit")).click();
//	}
//	
//	@Test(priority=1)
//	public void search() throws InterruptedException {
//		Thread.sleep(2000);
//		driver.findElement(By.id("query")).sendKeys("Transfer Funds");
//		driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
//	}
//	
//	@Test(priority=2)
//	public void click() throws InterruptedException {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("(//a[@class='focus'])[3]")).click();
//	}
//}
