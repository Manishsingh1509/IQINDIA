package gtc001;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Iframe {

	public static void main(String[] args) throws InterruptedException {
//	      WebDriverManager.chromedriver().setup();
//	      WebDriver driver = new ChromeDriver();
//	      driver.manage().window().maximize();
//	      driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
//	      Thread.sleep(2000);
//	      driver.findElement(By.id("name")).sendKeys("Inputvalues");
//	      Thread.sleep(2000);
//	      driver.switchTo().frame("frm1");        // way to switch to a frame by frame id 
//	      Thread.sleep(2000);
//	      WebElement we = driver.findElement(By.id("ide"));
//	      Select sl = new Select(we);
//	      List<WebElement> lst = sl.getOptions();
//	      for(WebElement s : lst) {
//	    	  String str = s.getText();
//	    	  sl.selectByVisibleText(str);
//	    	  System.out.println(str);
//	    	  Thread.sleep(2000);
//	      }
//	      driver.switchTo().parentFrame();
//	      Thread.sleep(2000);
//	      driver.findElement(By.id("name")).clear();
//	      driver.findElement(By.id("name")).sendKeys("inputvalues after frame1");
//	      Thread.sleep(2000);
//	      int i = driver.findElements(By.tagName("iframe")).size();   //To find the total number of frame on a page
//	      System.out.println(i);
//	      driver.quit();
		
		
//--------------------------------switch frame method (index and webelement)-----------------------//
		
		  WebDriverManager.chromedriver().setup();
	      WebDriver driver = new ChromeDriver();
	      driver.manage().window().maximize();
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
//	      sl.selectByIndex(2);              // This only select the option at index 2 from dropdown in frame 1
//	      Thread.sleep(2000);
	      driver.switchTo().parentFrame();
	      Thread.sleep(2000);
	      driver.findElement(By.id("name")).clear();
	      driver.findElement(By.id("name")).sendKeys("Input after frame 1 to frame 3");
	      Thread.sleep(2000);
	      driver.switchTo().parentFrame();
	      driver.findElement(By.id("name")).clear();
	      driver.findElement(By.id("name")).sendKeys("main page after child");
	      Thread.sleep(2000);
		
//************************************************************************************************
//----------------------------Wait in selenium----------------------------------------------------//
//	   WebDriverManager.chromedriver().setup();
//	   WebDriver driver = new ChromeDriver();
//	   driver.manage().window().maximize();
//	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//	   driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
//	   driver.findElement(By.id("btn1")).click();
//	   driver.findElement(By.id("txt1")).sendKeys("custom text");
//       driver.findElement(By.id("btn2")).click();
//       driver.findElement(By.id("txt2")).sendKeys("custom 2 text");
       
 //-------------------------------------------------------------------------------------------
//       WebDriverManager.chromedriver().setup();
//	   WebDriver driver = new ChromeDriver();
//	   driver.manage().window().maximize();
//	   WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
//	
//	   driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
//	   driver.findElement(By.id("btn1")).click();
//	   WebElement we = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("txt1")));
//       we.sendKeys("xustom text");
//       driver.findElement(By.id("btn2")).click();
//       WebElement we1=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("txt2")));
//       we1.sendKeys("xustom 2");
	}

}
