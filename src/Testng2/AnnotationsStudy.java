package Testng2;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationsStudy {
  @Test
  public void testmethod () {
	  Reporter.log("Normal Method Running", true);
  }
  @BeforeMethod
  public void beforemethod() {
	  Reporter.log("Before method are running", true);
  }
  @AfterMethod
  public void Aftermethod() {
	  Reporter.log("After method are running", true);
	  }
@Test 
public void testmethod1 () {
	  Reporter.log("Normal Method 2 Running", true);
}
}
