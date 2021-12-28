package Testng2;

import org.testng.annotations.Test;

public class tc2tc {
	 @Test(groups = "smoke")
	  public void tc5() {
		  System.out.println("5");
	  }
	  @Test(groups = "smoke")
	  public void tc6() {
		  System.out.println("6");
	  }
	  @Test(groups = "sanity")
	  public void tc7() {
		  System.out.println("7");
	  }
	}


