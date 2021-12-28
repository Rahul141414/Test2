package grouping;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTest123 {
  
  @Test (groups = "sanity")
  public void tc5() {Reporter.log("tc5",true);
  }
  @Test (groups = "sanity")
  public void tc6() {Reporter.log("tc6",true);
  }
  @Test (groups = "smoke")
  public void tc7() {Reporter.log("tc7",true);
  }
  @Test (groups = "smoke")
  public void tc8() {Reporter.log("tc8",true);
  }
}

