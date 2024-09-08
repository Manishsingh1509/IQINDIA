package gtc001;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRMPractice {

	public static void main(String[] args) throws InterruptedException {
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
//		Thread.sleep(2000);
//		driver.navigate().refresh();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
	
 /* ########################################################################################## */
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://testautomationpractice.blogspot.com");
		for(int p = 1;p<=4;p++) {
			if(p>1) {
			 WebElement page = driver.findElement(By.xpath("//ul[@class='pagination']//li["+p+"]"));
			 page.click();
			 Thread.sleep(2000);
			}
		}
	 	int no_of_rows = driver.findElements(By.xpath("//table[@id='productTable']//tbody//tr")).size();
	 	for(int i = 1;i<=no_of_rows;i++) {
	 	String Name=	driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr["+i+"]/td[2]")).getText();
	 	String price = driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr["+i+"]/td[3]")).getText();
	 	WebElement we = driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr["+i+"]/td[4]"));
	 	we.click();
	 	System.out.println(Name +"\t"+price);
	 	}

	}

}
