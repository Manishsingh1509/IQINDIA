package gtc001;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavascriptExecuter {

	public static void main(String[] args)   {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		driver.get("http://altoro.testfire.net/bank/main.jsp");
		
	//********Locate by js excetur*****************//
//		js.executeScript("document.getElementById('uid').value='jsmith'");
//		js.executeScript("document.getElementsByName('passw')[0].value='demo1234'");
//		js.executeScript("document.getElementsByTagName('input')[4].click()");
//		
//		js.executeScript("document.getElementsByTagName('input')[4].style.backgroundColor='red'");
		    //***Upper line highlight the background of that element****//
		
		
	//*******Locate By Normal locator and pass value by javascriptExecutor******//
		WebElement we = driver.findElement(By.id("uid"));
		js.executeScript("arguments[0].value='jsmith'",we);
		WebElement we1 = driver.findElement(By.name("passw"));
		js.executeScript("arguments[0].value='demo1234'",we1);
		WebElement we2 = driver.findElement(By.name("btnSubmit"));
		js.executeScript("arguments[0].click()",we2);
		

	}

}
