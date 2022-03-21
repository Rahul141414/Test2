package cimet;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testclass {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		 driver.get("https://econnextest.cimet.io/");
		 driver.manage().window().maximize();
		 Thread.sleep(3000);
		 Pom1 p1 = new Pom1(driver);
		 p1.postcodemethod();
		 p1.comparenowmethod();
		 Thread.sleep(3000);
		 Pom2 p2 =new Pom2(driver);
		  p2.pom2method(driver);
         }

}
