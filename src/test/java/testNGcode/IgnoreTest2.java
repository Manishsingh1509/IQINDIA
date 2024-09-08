package testNGcode;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
@Ignore
public class IgnoreTest2 {
  @Test
  public void TC006() {
	  System.out.println("Inside TC006");
  }
  @Ignore
  @Test
  public void TC007() {
	  System.out.println("Inside TC007");
  }
  @Test
  public void TC008() {
	  System.out.println("Inside TC008");
  }
  @Test
  public void TC009() {
	  System.out.println("Inside TC009");
  }
  @Test
  public void TC0010() {
	  System.out.println("Inside TC0010");
  }
}
