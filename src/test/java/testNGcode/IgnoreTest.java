package testNGcode;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class IgnoreTest {
    @Ignore
	@Test
  public void TC001() {
	  System.out.println("Inside TC001");
  }
  @Test
  public void TC002() {
	  System.out.println("Inside TC002");
  }
  @Test
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
