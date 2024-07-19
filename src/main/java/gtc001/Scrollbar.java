package gtc001;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scrollbar {

	public static void main(String[] args) throws InterruptedException {
         WebDriverManager.chromedriver().setup();
         WebDriver driver = new ChromeDriver();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
         driver.manage().window().maximize();
         JavascriptExecutor js = (JavascriptExecutor) driver;
         driver.get("https://www.hyrtutorials.com");
     //    js.executeScript("window.scroll(0,5000)");  //Scroll and ScrollTo both are same
     //    js.executeScript("window.scrollTo(0,1000)");
   //      Thread.sleep(5000);
     //    js.executeScript("window.scrollTo(1000,0)"); // Scroll from this given point to top
     //    Thread.sleep(5000);
     //    js.executeScript("window.scrollTo(0,1000)"); // it scroll from the top of the page
   //      Thread.sleep(3000);
     //   js.executeScript("window.scrollBy(0,2000)");   // it scroll from the scroll point
     //    Thread.sleep(3000);
    //     driver.findElement(By.xpath("//a[@class='back-to-top']")).click();
       js.executeScript("window.scrollTo(0,document.body.scrollHeight)");    // it scroll up to the bottom
       Thread.sleep(2000);  
       driver.findElement(By.xpath("//a[(text()='Yada Giri Reddy ')]")).click();
       
//    Scroll the page by using Scroll view Scrollbar
       WebElement we = driver.findElement(By.xpath("//a[text()='Yada Giri Reddy ']"));
       Thread.sleep(2000);
       js.executeScript("arguements[0].scrollIntoview().click()",we);
       //-------------OR----------------------------//
       js.executeScript("arguements[0].scrollIntoview()",we);
       we.click();
	}

}
