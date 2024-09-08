package testNGcode;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class NewIgnoreMixCode {
	public static WebDriver driver;
	public static JavascriptExecutor js;
	public static SoftAssert soft;
  @BeforeTest
  public void init() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  js = (JavascriptExecutor) driver;
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  soft = new SoftAssert();
  }
  
  @Test
  public void login() throws InterruptedException {
	  driver.get("https://demo.testfire.net/login.jsp");
	  Thread.sleep(2000);
	  driver.findElement(By.id("uid")).sendKeys("jsmith");
	  driver.findElement(By.xpath("//input[@id='passw']")).sendKeys("demo1234");
	  WebElement we = driver.findElement(By.name("btnSubmit"));
	  js.executeScript("arguments[0].click()",we);
  }
  @Test
  public void verify_login() {
	  String expected = "Hello, john Smith";
	  String actual = driver.findElement(By.xpath("//h1[starts-with(text(),'Hello')]")).getText();
	  soft.assertEquals(actual, expected,"not login");
	  
	  
	  boolean b = driver.findElement(By.xpath("//font[text()='Sign Off']")).isDisplayed();
	  soft.assertEquals(b,false,"sign-off");
	  soft.assertAll();
  }
  @Test
  public void Hyr_screenshot() {
	    
		TakesScreenshot ts = (TakesScreenshot) driver;
		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
		File src = ts.getScreenshotAs(OutputType.FILE);
		String path = "C:\\Users\\Manish\\eclipse-workspace\\Testing001\\Screenshot\\image.png";
		File targetfile = new File(path);
		try {
			FileUtils.copyFile(src, targetfile);
		}
      catch(IOException e) {
      	e.printStackTrace();
      }
  }
  @Ignore
  @Test
  public void frame() throws InterruptedException {
	  driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
      Thread.sleep(2000);
      driver.findElement(By.id("name")).sendKeys("inputs at main page");
      Thread.sleep(2000);
      driver.switchTo().frame("frm3");
      Thread.sleep(2000);
      driver.findElement(By.id("name")).sendKeys("Imput inside frame 3");
      Thread.sleep(2000);
      driver.switchTo().frame(1);        // Switch to frame by index at 0
      Thread.sleep(2000);
      WebElement we = driver.findElement(By.id("selectnav1"));
      Select sl = new Select(we);
      List<WebElement> lst = sl.getOptions();
      for(WebElement s : lst)                    // This for loop select and print all the options of dropdown in frame1
      {
    	  String str = s.getText();
    	  sl.selectByVisibleText(str);
    	  System.out.println(str);
    	  Thread.sleep(2000);
      }
      driver.switchTo().parentFrame();
      Thread.sleep(2000);
      driver.findElement(By.id("name")).clear();
      driver.findElement(By.id("name")).sendKeys("Input after frame 1 to frame 3");
      Thread.sleep(2000);
      driver.switchTo().parentFrame();
      driver.findElement(By.id("name")).clear();
      driver.findElement(By.id("name")).sendKeys("main page after child");
      Thread.sleep(2000);
  }
  @AfterTest
  public void close() throws InterruptedException {
	  Thread.sleep(2000);
	  driver.close();
  }
}
