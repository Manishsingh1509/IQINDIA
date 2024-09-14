package pomdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
   WebDriver driver;
   
   Login(WebDriver d){
	   this.driver=d;
	   }
   
   By username = By.id("user-name");
   By password = By.id("password");
   By loginBtn = By.id("login-button");
   
   public void enterusername(String uname) {
	   driver.findElement(username).sendKeys(uname);
   }
   
   public void enterpassword(String pwd) {
	   driver.findElement(password).sendKeys(pwd);
   }
   
   public void clickonlogin() {
	   driver.findElement(loginBtn).click();
   }
}
