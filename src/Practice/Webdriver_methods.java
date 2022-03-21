package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver_methods {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

          driver.get("https://www.facebook.com/#!/");
       Dimension d = new Dimension(10,20);
     driver.manage().window().setSize(d);
Point p = new Point(100,200);
driver.manage().window().setPosition(p);
		 }
		
	}
	
	 
			
			
		
			
			
		
	


