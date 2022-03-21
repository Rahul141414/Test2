package Testng2;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTest2 {
	@Test(priority = 0)
	public void demo3() {
		Reporter.log("hii demo 3",true);
	}
  @Test(priority = 6)
  public void demo2() {
	  Reporter.log("Good morning 2", true);
  }
  @Test(priority = 2)
	public void demo4() {
		Reporter.log("hii demo4",true);
	}
  @Test(dependsOnMethods = "demo4")
	public void demo5(){
		Reporter.log("hii demo5",true);
	}
  
  
  
}
