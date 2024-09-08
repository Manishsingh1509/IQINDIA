package Pageclass;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Base.BaseClass;
public class LoginPage extends BaseClass {
	public LoginPage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}



	WebElement uname = driver.findElement(By.id("uid"));
	 WebElement pwd = driver.findElement(By.id("passw"));
	 WebElement login = driver.findElement(By.name("btnSubmit"));
//	 WebElement signoff = driver.findElement(By.xpath("//font[text()='Sign Off']"));
// public LoginPage() throws InterruptedException {
//		super();
//		// TODO Auto-generated constructor stub
//	}


 
 public void enterUsername(String user) {
	 uname.sendKeys(user);
 }
 
 public void enterPassword(String password) {
	 pwd.sendKeys(password);
 }
 
 public void clickLogin() {
	 login.click();
 }
 
// public void homepage(String uname1 , String pwd1) {
//	 uname.sendKeys(uname1);
//	 pwd.sendKeys(pwd1);
//	 login.click();
// }
 
// public boolean verifylogin() {
//	 return signoff.isDisplayed();
 }

