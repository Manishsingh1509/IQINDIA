package gtc001;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
//		Thread.sleep(2000);
//		driver.findElement(By.id("alertBox")).click();
//		Thread.sleep(2000);
//		Alert al = driver.switchTo().alert();
//		Thread.sleep(2000);
//		al.accept();
//		WebElement output = driver.findElement(By.xpath("//div[@id='output']"));
//		String str = output.getText();
//		System.out.println(str);

//------------------------------------------------------USING ACCEPT,DISMISS  METHOD ON ALERT-------------------------------------------//
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
//		Thread.sleep(2000);
//		driver.findElement(By.id("confirmBox")).click();
//		Thread.sleep(2000);
//		Alert al = driver.switchTo().alert();
//		Thread.sleep(2000);
////		al.accept();
////		al.dismiss();
//		WebElement output = driver.findElement(By.xpath("//div[@id='output']"));
//		String str = output.getText();
//		System.out.println(str);
		
//-----------------------------------------------------SENDKEYSMETHOD---------------------//
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
//		Thread.sleep(2000);
//		driver.findElement(By.id("promptBox")).click();
//		Thread.sleep(2000);
//		Alert al = driver.switchTo().alert();
//		Thread.sleep(2000);
//		al.sendKeys("Test Engineer");
//		Thread.sleep(2000);
//        al.accept();
////		al.dismiss();
//		WebElement output = driver.findElement(By.xpath("//div[@id='output']"));
//		String str = output.getText();
//		System.out.println(str);
		
//------------------------------------------------WINDOW OR TAB HANDLING---------------------//
		
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//	    driver.manage().window().maximize();
//		
//		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
//		Thread.sleep(2000);
//		String pwindow=driver.getWindowHandle();       // gives the parent window id only
//		System.out.println(pwindow);
//		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Text at Parent Page");
		
//		driver.findElement(By.id("newWindowBtn")).click();
		
		//--------------Print the id of child and parent window----------------------------//		
//		Set<String> cwindow = driver.getWindowHandles();  // gives both parent and child window id 
//		for(String str : cwindow)
//		{
//			System.out.println(str);
//		}
//		driver.quit();
		
//------------------print the title of child window--------------------------//		
//		Set<String> cwindow = driver.getWindowHandles();
//		for(String str : cwindow)
//		{
//			if(!str.equals(pwindow))
//			{
//				driver.switchTo().window(str);
//				Thread.sleep(2000);
//				String title = driver.getTitle();
//				System.out.println("Title of child window is "+title);
//			    driver.findElement(By.id("firstName")).sendKeys("Manish Chaudhary");
//				Thread.sleep(1000);
//				driver.close();
//			}
//		}
//		driver.switchTo().window(pwindow);
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//input[@id='name']")).clear();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Text at parent page after child window");
//		Thread.sleep(1000);
		
//----------------------------------------------------------------------------------------------//
//		driver.findElement(By.id("newTabBtn")).click();
//		Set<String> cwindow = driver.getWindowHandles();
//		for(String str : cwindow)
//		{
//			if(!str.equals(pwindow))
//			{
//				driver.switchTo().window(str);
//				Thread.sleep(2000);
//				String title = driver.getTitle();
//				System.out.println("Title of child window is "+title);
//				Thread.sleep(1000);
//				driver.close();
//			}
//		}
//		driver.switchTo().window(pwindow);
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//input[@id='name']")).clear();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Text at parent page after child window");
//		Thread.sleep(1000);
		
//--------------------------Print and open the multiple windows ----------------------------//		
//		driver.findElement(By.id("newWindowsBtn")).click();
//		Set<String> cwindow = driver.getWindowHandles();
//		for(String str : cwindow)
//		{
//			if(!str.equals(pwindow))
//			{
//				driver.switchTo().window(str);
//				Thread.sleep(2000);
//				String title = driver.getTitle();
//				System.out.println("Title of child window is "+title);
//				Thread.sleep(1000);
//				driver.close();
//			}
//		}
//		driver.switchTo().window(pwindow);
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//input[@id='name']")).clear();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Text at parent page after child window");
//		Thread.sleep(1000);
		
//---------Open the tab and window-------------------------------//
//		driver.findElement(By.id("newTabsWindowsBtn")).click();
//		Set<String> cwindow = driver.getWindowHandles();
//		for(String str : cwindow)
//		{
//			if(!str.equals(pwindow))
//			{
//				driver.switchTo().window(str);
//				Thread.sleep(1000);
//				String title = driver.getTitle();
//				System.out.println(title);
//				Thread.sleep(1000);
//				driver.close();
//			}
//		}
//		driver.switchTo().window(pwindow);
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//input[@id='name']")).clear();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Text at parent page after child");
//		Thread.sleep(1000);
//		driver.quit();
		
//--------------------------Control the multiple tab and windows title---------------------------//
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//	    driver.manage().window().maximize();
//		String bc = "";
//		String cm = "";
//		String xp = "";
//		String ad = "";
//		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Text at Parent Page");
//		Thread.sleep(2000);
//		String pwindow=driver.getWindowHandle();       // gives the parent window id only
//		System.out.println(pwindow);
//		driver.findElement(By.id("newTabsWindowsBtn")).click();
//		Set<String> cwindow = driver.getWindowHandles();
//		for(String wid : cwindow)
//		{
//			if(!wid.equals(pwindow))
//			{
//				driver.switchTo().window(wid);
//				Thread.sleep(1000);
//				String title = driver.getTitle();
////				if(title.contains("Basic Controls")) {
////					bc = wid;
////					System.out.println(bc);
////				}
//				 if (title.contains("Contact me")) {
//					cm = wid;
//					System.out.println(cm);
//				}
////				else if(title.contains("Xpath Practice")) {
////					xp = wid;
////					System.out.println(xp);
////				}
////				else if (title.contains("AlertsDemo")) {
////					ad = wid;
////					System.out.println(ad);
////				}
//		}
//		}
//		
//		// working on Basic Control
//		
////		driver.switchTo().window(bc);
////		Thread.sleep(2000);
////		String str1 = driver.getTitle();
////		System.out.println(str1);
////		driver.close();
//		
//		//working on Contact Me
//		
//		driver.switchTo().window(cm);
//		Thread.sleep(2000);
//		String str2 = driver.getTitle();
//		System.out.println(str2);
//		driver.close();
//		
//		// working on Xpath Practice
//		
////		driver.switchTo().window(xp);
////		Thread.sleep(2000);
////		String str3 = driver.getTitle();
////		System.out.println(str3);
////		driver.close();
//		
////		 working on AlertsDemo
//		
////		driver.switchTo().window(ad);
////		Thread.sleep(2000);
////		String str4 = driver.getTitle();
////		System.out.println(str4);
////		driver.close();
//		
//		driver.switchTo().window(pwindow);
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//input[@id='name']")).clear();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Text at parent page after child");
//		Thread.sleep(1000);
//		driver.quit();
		
	}

}
