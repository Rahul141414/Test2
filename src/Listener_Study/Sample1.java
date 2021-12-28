package Listener_Study;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Listener_Study.Listener.class)
public class Sample1 {
  @Test
  public void TC1() {
	  Reporter.log("TC1 is Pass",true);
  }
  @Test
  public void TC2() {
	 Reporter.log("TC2 is Pass",true);
  }
  @Test
  public void TC3() {
	 Assert.fail();
	 Reporter.log("TC3 is fail",true);
  }
  @Test
  public void TC4() {
	  Reporter.log("TC4 is Pass",true);
  }
  @Test(dependsOnMethods =  "TC3")
  public void TC5() {
	 Reporter.log("TC5 is Pass",true);
  }
}
