package gtc001;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.CodeLanguage;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.ExtentSparkReporterConfig;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.github.bonigarcia.wdm.WebDriverManager;
public class ExtenReportss {
	@Test
	public void Extent() throws IOException {
		ExtentReports extentreports = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("C:\\Users\\Manish\\eclipse-workspace\\Testing001\\ExtentReport\\report.html");
		extentreports.attachReporter(spark);
		
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
		driver.quit();
		extentreports.createTest("Screenshot attach")
		.info("This is information about screenshot")
		.addScreenCaptureFromPath(path, "Google homepage")
		.assignDevice("window 10")
		.assignCategory("smoke and sanity");
		
		ExtentTest test1 = extentreports.createTest("Test1");
		test1.pass("This is pass test");
		test1.fail("This is fail test");
		test1.assignAuthor("mohit");
		ExtentTest test2 = extentreports.createTest("Test2");
		test2.pass("This is pass test");
		test2.pass("This is pass test");
		test2.assignAuthor("Manish");
		spark.config(
				ExtentSparkReporterConfig.builder()
				.theme(Theme.DARK)
				.documentTitle("My Report")
				.build()
				);
		
		
		
//		test1.log(Status.FAIL, "<font color = 'red'>Test case is failed<font>").log(Status.SKIP, "Skip one");
//		test1.log(Status.PASS, "Information");
//		test1.log(Status.INFO,"Pass");
//		test1.log(Status.WARNING,"Warning").info(MarkupHelper.createLabel("This is a test message", ExtentColor.PURPLE));
//		
//		String JSONData = "{'name':'QA','Address':'IQ'}";
//		test2.info(MarkupHelper.createCodeBlock(JSONData,CodeLanguage.JSON));
//		
//		
//		try {
//			int i = 10/0;
//		}catch(Exception e ) {
//			test1.info(e.getMessage());  //[info ka work yha print krna h]
//		}
		extentreports.flush();
		Desktop.getDesktop().browse(new File("C:\\Users\\Manish\\eclipse-workspace\\Testing001\\ExtentReport\\report.html").toURI());
	}

}
