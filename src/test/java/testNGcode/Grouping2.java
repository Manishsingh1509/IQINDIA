package testNGcode;

import org.testng.annotations.Test;

public class Grouping2 {
  @Test(groups="smoke")
  public void TC_006() {
	  System.out.println("Hello TC_006");
  }
  
  @Test(groups="sanity")
  public void TC_007() {
	  System.out.println("Hello TC_007");
  }
  
  @Test(groups= "daily build")
  public void TC_008() {
	  System.out.println("Hello TC_008");
  }
  
  @Test(groups= {"weekly build","daily build"})
  public void TC_009() {
	  System.out.println("Hello TC_009");
  }
  
  @Test(groups = "regression")
  public void TC_010() {
	  System.out.println("Hello TC_010");
  }
  
}
