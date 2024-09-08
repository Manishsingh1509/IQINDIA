package testNGcode;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class DataProvider1 {
  @DataProvider(name="Test")
  public String [] Datasource() {
	  String[] s = new String[] {"Test","QA","Dev"};
	  return s;
  }
  
  @Test(dataProvider="Test")
  public void Run(String s1) {
	  System.out.println(s1);
  }  
 /* ############################################################################### */
	  
  @DataProvider(name="Test1")
  public Object [] Datasource1() {
	  Object[] s = new Object[] {"Test",123,1.3,'T','F'};
	  return s;
  }
  
  @Test(dataProvider="Test1")
  public void run(Object s1) {
	  System.out.println(s1);
  }
  
}
