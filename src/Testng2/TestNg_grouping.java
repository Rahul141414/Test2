package Testng2;

import org.testng.annotations.Test;

public class TestNg_grouping {
  @Test(groups = "smoke")
  public void tc1() {
	  System.out.println("1");
  }
  @Test(groups = "smoke")
  public void tc2() {
	  System.out.println("2");
  }
  @Test(groups = "sanity")
  public void tc3() {
	  System.out.println("3");
  }
}
