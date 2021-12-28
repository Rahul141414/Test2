package Assert_pakage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Discoveryhomepage {
@Test
  public void home() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32\\chromedriver.exe" );
	WebDriver driver =new ChromeDriver();
	//launch the webpage
	driver.get("https://auth.discoveryplus.in/login?flow=OTPLogin");
	Thread.sleep(2000);
	//web OTP button is disable
	boolean button = driver.findElement(By.xpath("//button[@type='submit']")).isEnabled();
	Assert.assertFalse(button,"Button is enable");
	//otp button is enable
	driver.findElement(By.id("mobileNumber")).sendKeys("9823888957");
	boolean button1 = driver.findElement(By.xpath("//button[@type='submit']")).isEnabled();
	Assert.assertTrue(button1,"Button is Disable");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
}
	  
}
