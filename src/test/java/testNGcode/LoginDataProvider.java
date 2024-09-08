package testNGcode;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginDataProvider {
  @Test(dataProvider="Excel",dataProviderClass =DataProviderExcel.class)
  public void Login(String uname, String pass) throws InterruptedException {
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  SoftAssert soft = new SoftAssert();
	  driver.get("http://altoro.testfire.net/bank/main.jsp");
	  driver.findElement(By.id("uid")).sendKeys(uname);
	  System.out.println(uname);
	  driver.findElement(By.name("passw")).sendKeys(pass);
	  System.out.println(pass);
	  driver.findElement(By.name("btnSubmit")).click();
	  boolean b = driver.findElement(By.xpath("//font[text()='Sign Off']")).isDisplayed();
	  soft.assertEquals(b,true,"sign-off");
	  soft.assertAll();
	  Thread.sleep(2000);
	  driver.close();
	  
  }
}
