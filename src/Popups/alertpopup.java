package Popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertpopup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("http://demo.guru99.com/test/delete_customer.php");
		 driver.findElement(By.name("submit")).click();
		 Alert al =driver.switchTo().alert();
		 al.accept();
		 al.accept();
		 

	}

}
