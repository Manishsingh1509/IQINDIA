package testNGcode;

import org.testng.annotations.Test;

public class Prioritization2 {
  @Test
  public void Sign() {
	  System.out.println("Sign in successfully");
  }
  @Test
  public void Search() {
	  System.out.println("Search in successfully");
  }
  @Test
  public void Book() {
	  System.out.println("Book flight");
  }
  @Test
  public void Cancel() {
	  System.out.println("Cancel flight");
  }
}
