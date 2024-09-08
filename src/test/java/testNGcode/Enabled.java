package testNGcode;

import org.testng.annotations.Test;

public class Enabled {
  @Test
  public void TC001() {
	  System.out.println("Inside TC_001");
  }
  
  @Test(priority=1,enabled = false)
  public void TC002() {
	  System.out.println("Inside TC002");
  }
  @Test(enabled = false)
  public void TC003() {
	  System.out.println("Inside TC003");
  }
  @Test
  public void TC004() {
	  System.out.println("Inside TC004");
  }
  @Test
  public void TC005() {
	  System.out.println("Inside TC005");
  }
}
