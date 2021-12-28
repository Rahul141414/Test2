package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver_methods {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		 List<WebElement> table = driver.findElements(By.xpath("//table[@id='customers']//tr"));
		 for(WebElement w :table) {
			System.out.println( w.getText());
		 }
		
	}
	
	 
			
			
		
			
			
		
	}


