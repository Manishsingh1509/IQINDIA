package testNGcode;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LogIn {
	public static WebDriver driver ;
	public static JavascriptExecutor js;
	
  @BeforeTest
   public void init() {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  js = (JavascriptExecutor) driver;
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	  driver.manage().window().maximize();
  }
  @Test
  public void login1() throws InterruptedException {
	  driver.get("https://demo.testfire.net/login.jsp");
	  driver.findElement(By.id("uid")).sendKeys("jsmith");
	  Thread.sleep(1000);
	  WebElement pwd = driver.findElement(By.xpath("//input[@id='passw']"));
	  js.executeScript("arguments[0].value='demo1234'",pwd);
	  driver.findElement(By.name("btnSubmit")).click();
  }
  
  @Test
  public void verify() {
	  WebElement signoff = driver.findElement(By.xpath("//font[text()='Sign Off']"));
	  if(signoff.isDisplayed()) {
		  System.out.println("user Login ");
	  }
	  else {
		  System.out.println("Login failed");
	  }
		  
  }
}
