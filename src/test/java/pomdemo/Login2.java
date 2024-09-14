package pomdemo;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
// using page factory
public class Login2 {
  WebDriver driver;
  Login2(WebDriver d){
	 this. driver = d;
	  PageFactory.initElements(driver,this);
  }
  
  @FindBy(id="user-name")
  WebElement username;
  
  @FindBy(id="password")
  WebElement pass;
  
  @FindBy(id="login-button")
  WebElement btn;
  
  public void enterusername(String uname) {
	   username.sendKeys(uname);
  }
  
  public void enterpassword(String pwd) {
	   pass.sendKeys(pwd);
  }
  
  public void clickonlogin() {
	  btn.click();
  }
}
