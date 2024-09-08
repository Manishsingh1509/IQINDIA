package testNGcode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Dependency {
	WebDriver driver;
  @BeforeTest
  public void start() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.instagram.com/");
  }
  @Test
  public void login() throws InterruptedException {
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("(//input[@class='_aa4b _add6 _ac4d _ap35'])[1]")).sendKeys("its_jaat_m");
	  driver.findElement(By.xpath("//input[@type='password']")).sendKeys("manish1509");
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
  }
  @Test(dependsOnMethods = "login")
  public void search() throws InterruptedException {
	  Thread.sleep(5000);
	  
	  driver.findElement(By.xpath("(//div[@class='x6s0dn4 x9f619 xxk0z11 x6ikm8r xeq5yr9 x1swvt13 x1s85apg xzzcqpx']/descendant::span)[4]")).click();
	  System.out.println(10/0);
  }
  @Test(dependsOnMethods = "search")
  public void close() throws InterruptedException {
	  Thread.sleep(2000);
	  driver.close();
  }
  

}
