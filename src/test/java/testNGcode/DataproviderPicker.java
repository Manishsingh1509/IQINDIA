package testNGcode;

import org.testng.annotations.DataProvider;


public class DataproviderPicker {
//  @DataProvider(name="Login",indices = {0,2})
//  public Object [][] source() {
//	  Object [][]s = new Object[][] {
//		  {"jsmith","demo"},
//		  {"jsm","dem11"},
//		  {"jsmith","demo1234"}
//	  };
//	  return s;
//  }
	
	
	 @DataProvider(name="Login",parallel=true)
	  public Object [][] source() {
		  Object [][]s = new Object[][] {
			  {"jsmith","demo"},
			  {"jsm","dem11"},
			  {"jsmith","demo1234"},
			  {"jsmithi","demo"},
			  {"jsmi","dem11"},
			  {"jsmithee","demo1234"},
			  {"jsmithy","demo"},
			  {"jsmen","dem11"},
			  {"jsmithn","demo1234"},
		  };
		  return s;
	  }
}
