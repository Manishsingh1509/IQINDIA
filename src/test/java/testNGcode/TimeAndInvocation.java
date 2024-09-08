package testNGcode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TimeAndInvocation {
  @Test(timeOut=8000,invocationCount = 3)
  public void check() throws InterruptedException {
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://randomuser.me/");
	  Thread.sleep(2000);
	 String we = driver.findElement(By.id("user_value")).getText();
	 System.out.println(we);
  }
}
