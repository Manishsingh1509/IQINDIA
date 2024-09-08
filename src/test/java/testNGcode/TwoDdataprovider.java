package testNGcode;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TwoDdataprovider {
  @DataProvider(name="twoD")
  public Object [][] source() {
	  Object [][] s = new Object [][]{
		  {"Manish","Chaudhary"},
		  {"Institute","IQ"},
		  {"Batch",34},
		  {"Timing",9}
	  };
	  return s;
  }
  
  @Test(dataProvider = "twoD")
  public void run(Object s1,Object s2) {
	  System.out.print(s1);
	  System.out.print("::");
	  System.out.print(s2);
	  System.out.println();
  }
  
  @DataProvider(name="twoD1")
  public Object [][] source1() {
	  Object [][] s = new Object [][]{
		  {"Mohit","Chaudhary"},
		  {"Institute","IQ"},
		  {"Batch",36},
		  {"Timing",11}
	  };
	  return s;
  }
  
  @Test(dataProvider = "twoD1")
  public void run1(Object s3,Object s4) {
	  System.out.print(s3);
	  System.out.print("::");
	  System.out.print(s4);
	  System.out.println();
  }
}
