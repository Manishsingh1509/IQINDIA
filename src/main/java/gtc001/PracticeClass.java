 package gtc001;

import java.time.Duration;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeClass {

	public static void main(String[] args) throws InterruptedException {
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//        driver.get("https://app.arcfacilities.com/");
//        driver.findElement(By.xpath("(//button[text()='Got it'])[1]")).click();
//        driver.findElement(By.id("UserID")).sendKeys("qatest-interview@yopmail.com");
//        driver.findElement(By.id("Password")).sendKeys("QATest@n");
//        driver.findElement(By.id("btnLogin")).click();
//        Set<String> s = driver.getWindowHandles();
//        for(String s1 : s) {
//        	String t = driver.switchTo().window(s1).getTitle();
//        	if(t.contains("ARCFacilities")) {
//        		driver.switchTo().window(s1);
//        		Thread.sleep(2000);
//                driver.findElement(By.xpath("//a[@class='ng-tns-c161-1']/descendant::h4)[3]")).click();
//        	}
//        	
//    	}
		
	/*  ######################################################################################## */
		Scanner sc = new Scanner(System.in);
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.globalsqa.com/demo-site/datepicker/#Simple%20Date%20Picker");
		WebElement we = driver.findElement(By.xpath("//div[@class='resp-tabs-container']/descendant::iframe[1]"));
		driver.switchTo().frame(we);
		Thread.sleep(1000);
		driver.findElement(By.id("datepicker")).click();
		
		String month = "September 2024";
		String date = "15";
		while(true) {
			String text = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
			Thread.sleep(2000);
			if(text.equals(month)) {
				break;
			}
			else {
				driver.findElement(By.xpath("//span[text()='Next']")).click();
			}
		}
	//	driver.findElement(By.xpath("//tbody/tr/td/a[contains(text(),"+date+")]")).click();
		       //OR
	    List<WebElement> alldates=	driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
		for(WebElement we1 : alldates) {
			if(we1.getText().equals(date)) {
				we1.click();
				break;
			}
		}
        
	}

}
