package grouping;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTest1111 {
  @Test (groups = "sanity")
  public void tc1() {Reporter.log("tc1",true);
  }
  @Test (groups = "sanity")
  public void tc2() {Reporter.log("tc2",true);
  }
  @Test (groups = "smoke")
  public void tc3() {Reporter.log("tc3",true);
  }
  @Test (groups = "smoke")
  public void tc4() {Reporter.log("tc4",true);
  }
}
