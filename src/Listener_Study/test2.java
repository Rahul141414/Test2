package Listener_Study;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class test2 {
	@Test
	  public void TC6() {
		  Reporter.log("TC6 is Pass",true);
	  }
	  @Test
	  public void TC7() {
		 Reporter.log("TC7 is Pass",true);
	  }
	  @Test
	  public void TC8() {
		 Assert.fail();
		 Reporter.log("TC8 is fail",true);
	  }
	  @Test
	  public void TC9() {
		  Reporter.log("TC9 is Pass",true);
	  }
	  @Test(dependsOnMethods =  "TC8")
	  public void TC10() {
		 Reporter.log("TC10 is Pass",true);
	  }
}
