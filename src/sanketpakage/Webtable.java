package sanketpakage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Selenium_Practice.Webdriver_method;

public class Webtable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32\\chromedriver.exe" );
		WebDriver w = new ChromeDriver();
		w.get("https://ip-api.com/");
		w.navigate().forward();
		List<WebElement> a = w.findElements(By.xpath("//a/name"));
		System.out.println(a);
	}

}
