package log4j2;

import java.time.Duration;
import org.apache.logging.log4j.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Logging {
	
	public static WebDriver driver ;
	public static JavascriptExecutor js;
	Logger log = LogManager.getLogger("Logging");
	
  @BeforeTest
   public void init() {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  js = (JavascriptExecutor) driver;
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  driver.manage().window().maximize();
  }
  @Test
  public void login1() throws InterruptedException {
	  driver.get("https://demo.testfire.net/login.jsp");
	  log.info("Launch the application");
	  driver.findElement(By.id("uid")).sendKeys("jsmith");
	  log.info("Enter username");
	  Thread.sleep(1000);
	  WebElement pwd = driver.findElement(By.xpath("//input[@id='passw']"));
	  js.executeScript("arguments[0].value='demo1234'",pwd);
	  log.info("Enter password");
	  driver.findElement(By.name("btnSubmit")).click();
	  log.fatal("fatal message");
  }
  
  @Test
  public void verify() {
	  WebElement signoff = driver.findElement(By.xpath("//font[text()='Sign Off']"));
	  if(signoff.isDisplayed()) {
		  System.out.println("user Login ");
		  log.warn("for debug");
	  }
	  else {
		  System.out.println("Login failed");
		  log.error("login failed");
	  }
		  
  }

}
