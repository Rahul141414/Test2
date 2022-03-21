package cimet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Normal {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://econnextest.cimet.io/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("postcode")).sendKeys("2000");
		
		
	}

}
