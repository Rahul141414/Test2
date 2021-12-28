package Popups;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child_Browser_popups {
	public static void main(String[] args) {
	 System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://skpatro.github.io/demo/links/");
	 driver.findElement(By.name("NewWindow")).click();
	 String pagesid = driver.getWindowHandle();
	 System.out.println(pagesid);
	 Set<String> allpages = driver.getWindowHandles();
	 System.out.println(allpages);
	 Iterator<String> it = allpages.iterator();
	 String mainpage = it.next();
	 String child = it.next();
	 driver.switchTo().window(child);
	 driver.manage().window().maximize();
	 driver.findElement(By.id("the7-search")).sendKeys("Rahul");
	 driver.switchTo().window(mainpage);
	 driver.findElement(By.name("home")).click();
	 

	}

}
