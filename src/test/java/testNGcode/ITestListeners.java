package testNGcode;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ITestListeners implements ITestListener{
  public void onTestStart(ITestResult result) {
	  System.out.println("On test start" + result.getName());
  }
  
  public void onTestFailure(ITestResult result) {
	 System.out.println("On test failure"+ result.getName()); 
  }
  
  public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	  System.out.println("onTestFailedButWithinSuccessPercentage"+result.getName());
  }
  
  public void onTestFailedWithTimeout(ITestResult result) {
	  System.out.println("onTestFailedWithTimeout"+result.getName());
  }
  
  public void onStart(ITestContext context) {
	  System.out.println("onStart"+ context.getName());
  }
  
  public void onFinish(ITestContext context) {
	  System.out.println("onFinish"+context.getName());
  }
}
