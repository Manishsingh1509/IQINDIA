package testNGcode;

import org.testng.annotations.Test;

public class Prioritization {
  @Test(priority=0)
  public void Sign() {
	  System.out.println("Sign in successfully");
  }
  @Test(priority=2)
  public void Search() {
	  System.out.println("Search in successfully");
  }
  @Test(priority=0)
  public void Book() {
	  System.out.println("Book flight");
  }
  @Test(priority=4)
  public void Cancel() {
	  System.out.println("Cancel flight");
  }
}
