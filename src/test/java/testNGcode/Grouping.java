package testNGcode;

import org.testng.annotations.Test;

public class Grouping {
  @Test(groups="smoke")
  public void TC_001() {
	 // System.out.println(10/0);
	  System.out.println("Hello TC_001");
  }
  
  @Test(groups="sanity")
  public void TC_002() {
	  System.out.println("Hello TC_002");
  }
  
  @Test(groups= "daily build")
  public void TC_003() {
	  System.out.println("Hello TC_003");
  }
  
  @Test(groups= {"weekly build","daily build"})
  public void TC_004() {
	  System.out.println("Hello TC_004");
  }
  
  @Test(groups = "regression")
  public void TC_005() {
	  System.out.println("Hello TC_005");
  }
  
}
