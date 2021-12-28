package POM_Pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testclassgoogle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		  WebDriver driver =new ChromeDriver();
		  driver.get("https://www.google.com/");
		  listofwebelement li = new listofwebelement(driver);
		  li.search();
		  Thread.sleep(1000);
		  
		li.selectlist();
		
	}

}
