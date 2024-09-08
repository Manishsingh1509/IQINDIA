package gtc001;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actionss {

	public static void main(String[] args) throws InterruptedException {
//	     WebDriverManager.chromedriver().setup();
//	     WebDriver driver = new ChromeDriver();
//	     driver.manage().window().maximize();
//	     driver.get("https://www.flipkart.com");
//	     Actions act = new Actions(driver);
//	     WebElement fashion = driver.findElement(By.xpath("//span[text()='Fashion']"));
//         act.moveToElement(fashion).build().perform();
//         WebElement kids = driver.findElement(By.xpath("//div[@class='_16rZTH']/descendant::a[9]"));
//         Thread.sleep(2000);
//         act.moveToElement(kids).build().perform();
//         WebElement kid = driver.findElement(By.xpath("//a[text()='Boys & Girls Jeans']"));
//         Thread.sleep(2000);
//         act.click(kid).build().perform();
//         String pwindow = driver.getWindowHandle();
//         System.out.println(pwindow);
//         WebElement kid1 = driver.findElement(By.xpath("(//div[@class='hl05eU']/child::div[@class='Nx9bqj'])[1]"));
//         act.click(kid1).build().perform();
//         Set<String> cwindow = driver.getWindowHandles();
//         for(String str : cwindow) {
//        	 if(!str.equals(pwindow)) {
//        		 driver.switchTo().window(str);
//            	 Thread.sleep(2000);
//            	 WebElement we = driver.findElement(By.xpath("//span[text()='View Details']"));
//            	 act.click(we).build().perform();
//        	 }
//         }
         
 
    //***********************************************************************************************
//         WebDriverManager.chromedriver().setup();
//	     WebDriver driver = new ChromeDriver();
//	     driver.manage().window().maximize();
//         driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
//         Thread.sleep(2000);
//         Actions act = new Actions(driver);
//       WebElement we = driver.findElement(By.xpath("//span[text()='right click me']"));
//       act.contextClick(we).build().perform();
////     WebElement we1 = driver.findElement(By.xpath("//span[text()='Copy']"));
////     act.contextClick(we1).build().perform();
////     Thread.sleep(2000);
////     Alert al = driver.switchTo().alert();
////     al.accept();
//       WebElement we2 = driver.findElement(By.xpath("//span[text()='Edit']"));
//       act.contextClick(we2).build().perform();
//       Thread.sleep(2000);
//       Alert al1 = driver.switchTo().alert();
//       al1.accept();
        
     //################################################################################//
//         Actions act = new Actions(driver);
//         WebElement we = driver.findElement(By.xpath("//a[text()='Adding new Context Menu Triggers']"));
//         Thread.sleep(2000);
//         act.click(we).build().perform();
         
         
  //**********************Drag and Drop**************************************************//
//         WebDriverManager.chromedriver().setup();
//         WebDriver driver = new ChromeDriver();
//         driver.manage().window().maximize();
//         driver.get("https://jqueryui.com/droppable");
//         Actions act = new Actions(driver);
//         driver.switchTo().frame(0);
//         WebElement source = driver.findElement(By.id("draggable"));
//         WebElement target = driver.findElement(By.id("droppable"));
//         Thread.sleep(2000);
//         act.dragAndDrop(source, target).build().perform();
    
//##########################################################################################//
	
//         WebDriverManager.chromedriver().setup();
//         WebDriver driver = new ChromeDriver();
//         driver.manage().window().maximize();
//         driver.get("https://jqueryui.com/droppable");
//         Thread.sleep(2000);
//         driver.findElement(By.xpath("//a[text()='Draggable']")).click();
//         Thread.sleep(2000);
//         driver.switchTo().frame(0);
//         Actions act = new Actions(driver);
//         WebElement source = driver.findElement(By.xpath("//div[@id='draggable']"));
//         act.dragAndDropBy(source,300,0).release().build().perform();
		
//###################################(Click ANd Hold)#############################################################//
		
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://jqueryui.com/droppable");
//		Thread.sleep(2000);
//		Actions act = new Actions(driver);
//		driver.switchTo().frame(0);
//		WebElement source = driver.findElement(By.id("draggable"));
//		WebElement target = driver.findElement(By.id("droppable"));
//		Thread.sleep(2000);
//		act.clickAndHold(source).moveToElement(target).release().build().perform();
		
//##################################--Resize by (drag and drop by method)--#########
		
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://jqueryui.com/droppable");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//a[text()='Resizable']")).click();
//		Thread.sleep(2000);
//		Actions act = new Actions(driver);
//		driver.switchTo().frame(0);
//		WebElement source = driver.findElement(By.xpath("//div[@id='resizable']/child::div[3]"));
//		act.dragAndDropBy(source, 200, 40).release().build().perform();
		
//########################--Select items by using (drag and drop by method)--###
		
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://jqueryui.com/draggable/");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//a[text()='Selectable']")).click();
//		Thread.sleep(2000);
//		Actions act = new Actions(driver);
//		driver.switchTo().frame(0);
//		WebElement source = driver.findElement(By.xpath("//ol[@id='selectable']/child::li[1]"));
//		WebElement target = driver.findElement(By.xpath("//ol[@id='selectable']/child::li[4]"));
//		act.clickAndHold(source).moveToElement(target).release().build().perform();
		
//####################--move the element from one space to another space---#############
		
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://jqueryui.com/draggable/");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//a[text()='Sortable']")).click();
//		Thread.sleep(2000);
//		driver.switchTo().frame(0);
//		Actions act = new Actions(driver);
//		WebElement source = driver.findElement(By.xpath("//ul[@id='sortable']/child::li[1]"));
////		WebElement target = driver.findElement(By.xpath("//ul[@id='sortable']/child::li[6]"));
////		act.clickAndHold(source).moveToElement(target).release().build().perform();
//		act.dragAndDropBy(source, 0, 130).release().build().perform();
//		Thread.sleep(3000);
         
	}

}
