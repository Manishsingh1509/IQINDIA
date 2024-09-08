package Base;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.AfterSuite;
//
//import org.testng.annotations.BeforeSuite;
//
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class BaseClass {
//	public static WebDriver driver;
//	@BeforeSuite
//	public void BaseClass1() throws InterruptedException {
//		WebDriverManager.chromedriver().setup();
//		 driver = new ChromeDriver();
//		 driver.get("https://demo.testfire.net/login.jsp");
//		 Thread.sleep(2000);
//	}
//	
//	@AfterSuite
//	public void close() {
//		driver.close();
//	}
//
//}




/* ################################# For propertiesfile ####################### */
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
public class BaseClass{
	public static WebDriver driver;
	public static Properties prop;
	public BaseClass() throws IOException {
		prop = new Properties();
		String path = "C:\\Users\\Manish\\eclipse-workspace\\Testing001\\TestData.properties";
		File f = new File(path);
		if(f.exists()) {
			System.out.println("File exists");
		}
		else {
			System.out.println("File Does not exists");
		}
		FileInputStream fis = new FileInputStream(f);
		prop.load(fis);
	}
}

