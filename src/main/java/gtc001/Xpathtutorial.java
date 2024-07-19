package gtc001;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpathtutorial {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
//		Thread.sleep(2000);
//	-----------------------------------------------------------------------------------------
//		List<WebElement> lst = driver.findElements(By.xpath("//td[text()<='5000']"));
//		for(WebElement we : lst) {
//			System.out.println(we.getText());
//			
//		}
		
//--------------------------(1.)-X-path AXES -----------------------------------------------------//
//		driver.findElement(By.xpath("//label[text()='Email']/parent::div/child::a")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("(//label[normalize-space (text()='First Name ')]/following-sibling:: input)[1]")).sendKeys("Manish");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//label[text()='Last Name']/following-sibling::input[@name='name']")).sendKeys("Chaudhary");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//label[text()='Email']/following-sibling::input[1]")).sendKeys("@gmail.com");
//		Thread.sleep(1000);
////	    driver.findElement(By.xpath("//div[@class='container']/child::div[2]/input")).sendKeys("1234");
////		Thread.sleep(3000);
//		driver.findElement(By.xpath("//div[@class='container']/descendant::input[4]")).sendKeys("1234");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//div[@class='buttons']/preceding-sibling::input[1]")).sendKeys("1234");
//		Thread.sleep(1000);
////		driver.findElement(By.xpath("//div[@class='buttons']/child::button[text()='Register']")).click();
//		Thread.sleep(1000);
//	//	driver.findElement(By.xpath("//button[text()='Reset']/preceding-sibling::button[text()='Clear']")).click();
//		Thread.sleep(1000);
//	//	driver.findElement(By.xpath("//div[@class='buttons']/child::button[text()='Reset']")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//button[@type='reset']/following-sibling::input")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//td[text()='Francisco Chang']/preceding-sibling::td/child::input")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//td[text()='Maria Anders']/preceding-sibling::td/child::input")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//td[text()='Roland Mendel']/preceding-sibling::td/child::input")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//td[text()='Helen Bennett']/preceding-sibling::td/child::input")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//td[text()='Yoshi Tannamuri']/preceding-sibling::td/child::input")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//td[text()='Giovanni Rovelli']/preceding-sibling::td/child::input")).click();
//		Thread.sleep(1000);
////		driver.findElement(By.xpath("//td[text()='1000']/following-sibling::td/child::a")).click();
////		Thread.sleep(2000);
//		List<WebElement> lst = driver.findElements(By.xpath("//td[text()<='5000']"));
//		int sum = 0;
//		for(WebElement we : lst)
//		{
////			System.out.println(we.getText());
//			String str = we.getText();
//			System.out.println(str);
//			int x = Integer.parseInt(str);
//			sum = x + sum;
//			
//		}
//		System.out.println(sum);
		
// -------------(2.)-How to handle the dropdowns in selenium---------------------------------------//
		
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		Thread.sleep(1000);
		
//		WebElement drop = driver.findElement(By.id("course"));
//		Select sl = new Select(drop);
		
	//--------selectByIndex method--------------------------------------//
		
//		sl.selectByIndex(0);
//		Thread.sleep(2000);
//		sl.selectByIndex(1);
//		Thread.sleep(2000);
//		sl.selectByIndex(2);
//		Thread.sleep(2000);
//		driver.quit();
		
		//--------selectByVisibleText method--------------------------------------//	
		
//          sl.selectByVisibleText("Java");
//          Thread.sleep(2000);
//          sl.selectByVisibleText("Python");
//          Thread.sleep(2000);
//          sl.selectByVisibleText("Dot Net");
//          Thread.sleep(2000);
		
		//--------selectByVisibleText method--------------------------------------//	
		
//		sl.selectByValue("net");
//		Thread.sleep(2000);
//		sl.selectByValue("js");
//		Thread.sleep(2000);
//		sl.selectByValue("java");
//		Thread.sleep(2000);
//----------------------------------------------------------------------------------------//
//		WebElement drop = driver.findElement(By.id("ide"));
//		Select sl = new Select(drop);

//---------------Mutiple drop down selector by selectByIndex----------
		
//		sl.selectByIndex(2);
//		Thread.sleep(2000);
//		sl.selectByIndex(1);
//		Thread.sleep(2000);
//		sl.selectByIndex(0);
//		Thread.sleep(2000);
//		sl.deselectAll();
		
		
//-------------To Print all the values of dropdown----------------------------------------//
//		WebElement drop = driver.findElement(By.id("ide"));
//		Select sl = new Select(drop);
//		List<WebElement> lst = sl.getOptions();
//		for(WebElement we :lst )
//		{
//			String str = we.getText();
//			System.out.println(str);
//			sl.selectByVisibleText(str);
//			Thread.sleep(2000);
//		}
		
//     ----------OR----------
		
//		WebElement drop = driver.findElement(By.id("course"));
//		Select sl = new Select(drop);
//		List<WebElement> lst = sl.getOptions();
//		for(int i = 0;i<lst.size();i++) {
//			WebElement option = lst.get(i);     // Correctly access the WebElement at index i
//			String str = option.getText();      // Get the text from the WebElement
//			System.out.println(str);
//			sl.selectByVisibleText(str);
//			Thread.sleep(2000);
//		}

		//-------OR----------
		
//		List<WebElement> lst = driver.findElements(By.xpath("//select[@id='course']/child::option"));    // by X-path locator and select dropdown list without select class
//		int i = lst.size();
//		for(int j = 0;j<i;j++) {
//			WebElement option = lst.get(j);
//			String str = option.getText();
//			option.click();
//			System.out.println(str);
//			Thread.sleep(2000);
//		}
		
		
		
		
		
	
	}

}
