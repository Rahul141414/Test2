package POM_Pagefactory;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class xxxx {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver =new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
        Thread.sleep(2000);
       WebElement d = driver.findElement(By.id("day"));
        Select s = new Select(d);
      s.selectByIndex(3);

	}

}
