package gtc001;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Switchwindow {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
		
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		Thread.sleep(2000);
        driver.findElement(By.id("newWindowsBtn")).click();
        Thread.sleep(2000);
        Set<String> s = driver.getWindowHandles();
        for(String i : s)
        {
        	String t = driver.switchTo().window(i).getTitle();
        	if(t.contains("XPath Practice - H Y R Tutorials"))
        	{
        		driver.switchTo().window(i);
        		Thread.sleep(2000);
        		driver.findElement(By.xpath("//label[text()='First Name ']/following-sibling::input")).sendKeys("Manish");
        		Thread.sleep(2000);
        		
        	}
        }
     	

	}

}
