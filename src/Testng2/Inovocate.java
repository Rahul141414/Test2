package Testng2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Inovocate {
	
  @Test(invocationCount = 4)
  public void invocate() {
	  System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver =new ChromeDriver();
	  driver.get("https://www.makemytrip.com/");
	  Reporter.log("Make my trip is Running", true);
	  driver.close();
	  
  }
 
 
  
}
