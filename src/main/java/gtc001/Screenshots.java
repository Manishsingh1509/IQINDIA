package gtc001;

import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshots {

	public static void main(String[] args) throws IOException {
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		TakesScreenshot ts = (TakesScreenshot) driver;
//		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
//		File src = ts.getScreenshotAs(OutputType.FILE);
//		String path = "C:\\Users\\Manish\\eclipse-workspace\\Testing001\\Screenshot\\image.png";
//		File targetfile = new File(path);
//		try {
//			FileUtils.copyFile(src, targetfile);
//		}
//        catch(IOException e) {
//        	e.printStackTrace();
//        }
		
//************************************************************************************************//
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		TakesScreenshot ts = (TakesScreenshot) driver;
//		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
//		String path = "C:\\Users\\Manish\\eclipse-workspace\\Testing001\\Screenshot\\image1.png";
//		FileOutputStream fos = new FileOutputStream(path);
//		String base64code = ts.getScreenshotAs(OutputType.BASE64);
//		byte[] bytearr = Base64.getDecoder().decode(base64code);
//		fos.write(bytearr);
		
//**************************************************************************************************//
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		TakesScreenshot ts = (TakesScreenshot) driver;
//		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
//		String path = "C:\\Users\\Manish\\eclipse-workspace\\Testing001\\Screenshot\\image2.png";
//		FileOutputStream fos = new FileOutputStream(path);
//		byte[] bytearr = ts.getScreenshotAs(OutputType.BYTES);
//		fos.write(bytearr);
		
//**************************************************************************************************//
		//***********MAKE THE SCREENSHOT CODE DYNAMIC USING DATE TIME FORMAT*********************//
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		TakesScreenshot ts = (TakesScreenshot) driver;
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
		DateTimeFormatter myformat = DateTimeFormatter.ofPattern("ddMMyyyyHHmmss");
		String str = ldt.format(myformat);
		driver.get("https://www.google.co.in");
		String path = "C:\\Users\\Manish\\eclipse-workspace\\Testing001\\Screenshot\\"+str+" .png";
		FileOutputStream fos = new FileOutputStream(path);
		byte[] bytearr = ts.getScreenshotAs(OutputType.BYTES);
		fos.write(bytearr);
	}

}
