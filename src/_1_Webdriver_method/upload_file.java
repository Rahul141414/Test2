package _1_Webdriver_method;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class upload_file {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://demo.guru99.com/test/upload/");
	
		  WebElement web=driver.findElement(By.id("uploadfile_0"));
	 
		  Thread.sleep(2000);
	    web.sendKeys("D:\\other\\table.html");
	    driver.findElement(By.name("terms")).click();
	    driver.findElement(By.name("send")).click();
	  System.out.println(driver.findElement(By.xpath("//h3[@id='res']")).getText());
	    

	}

}
