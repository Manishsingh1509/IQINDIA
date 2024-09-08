package gtc001;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Keyboardoperations {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/key_presses");
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ALT).build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.CLEAR).build().perform();
		
		
	//#############################--(Copy and paste)###########################################//
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://text-compare.com");
//		Thread.sleep(2000);
//		Actions act = new Actions(driver);
//		WebElement input1 = driver.findElement(By.id("inputText1"));
////		WebElement input2 = driver.findElement(By.id("inputText2"));
//        input1.sendKeys("I am an Automation test Engineer");
//        //  for pressing ctrl+A
//        act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
//          // for pressing ctrl+c
//        act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
//        
//        // for changing focus
//        act.sendKeys(Keys.TAB).build().perform();
//        
//        // for  pressing ctrl+v
//        act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
        
        
//        String str1 = input1.getText();
//        String str2 = input2.getText();
//        if(str1.equals(str2)) {
//        	System.out.println("Test Case is pass");
//        }
//        else {
//        	System.out.println("Text Case is fail");
//        }
        
        
      //##################################################################################//
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://demoqa.com/text-box");
//        Thread.sleep(2000);
//        Actions act = new Actions(driver);
//        driver.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys("Uttar Pradesh");
//        Thread.sleep(2000);
//     //   driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
//        Thread.sleep(2000);
//        act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
//        act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
//        act.sendKeys(Keys.TAB).build().perform();
//        act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
        
        
        
}

}
