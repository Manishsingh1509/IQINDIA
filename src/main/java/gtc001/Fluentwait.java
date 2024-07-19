package gtc001;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Fluentwait {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Wait <WebDriver> wait = new FluentWait <> (driver).withTimeout(Duration.ofSeconds(10)).
				                pollingEvery(Duration.ofSeconds(1)).ignoring(NoSuchElementException.class);
		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
		driver.findElement(By.id("btn1")).click();
		WebElement we = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("txt1")));
		we.sendKeys("new custom text");
		driver.findElement(By.id("btn2")).click();
		WebElement we1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("txt2")));
		we1.sendKeys("new custom2");

	}

}
