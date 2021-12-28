package sanketpakage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sendkeys {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.flipkart.com/");
//		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("nokia");
		//driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		driver.findElement(By.xpath("//a[@class='_1_3w1N']"));
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys();
		
	}

}
