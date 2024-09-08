package gtc001;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokerLink {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://www.deadlinkcity.com/");
		
		//capture all the links from webpage-------
		
		List <WebElement> linklist = driver.findElements(By.tagName("a"));
		System.out.println("total : "+linklist.size());
		
		//Reading each and very link by loop
		int nooflink=0;
		for(WebElement element : linklist) {
			String s = element.getAttribute("href");
			if(s==null||s.isEmpty()) {
				System.out.println("impossible to check");
				continue;
			}
			
			//hit URL to the server--------------
			try {
			URL url = new URL(s);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.connect();
			if(conn.getResponseCode()>=400) {
				System.out.print(s+"  =============>broken link");
				nooflink++;
			}
			else {
				System.out.print(s+" ===============>not a broken link");
			}
		}
			catch(Exception e) {
				
			}
		
		

	}
		System.out.println("Total number of broker links : "+nooflink);

}
}
