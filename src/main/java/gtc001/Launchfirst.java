package gtc001;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Launchfirst {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("http://demo.testfire.net/login.jsp");
		Thread.sleep(2000);
		driver.findElement(By.id("uid")).sendKeys("jsmith");
		driver.findElement(By.id("passw")).sendKeys("demo1234");
		driver.findElement(By.name("btnSubmit")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("View Account Summary")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Transfer Funds")).click();
		driver.findElement(By.linkText("PERSONAL")).click();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Loa")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(4000);
		//driver.findElement(By.tagName("a")).click();
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td[3]/div/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Lending']")).click();
		//driver.findElement(By.xpath("/a[contains(@id='Header4')]")).click();
		driver.findElement(By.xpath("//a[starts-with(@id,'LinkHeader4')]")).click();
		
		

	}

}
