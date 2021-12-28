package Assignment;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class test_searchbar {
	
	

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32\\chromedriver.exe" );
		ChromeOptions opt =new ChromeOptions();
	    opt.addArguments("--disable-notifications");
		WebDriver driver =new ChromeDriver(opt);
		driver.get("https://www.planetsuperheroes.com/");
		POm_of_Home_Page home = new POm_of_Home_Page(driver);
		home.search();
		Actions A = new Actions(driver);
		A.sendKeys(Keys.ENTER).build().perform();
		

	}

}
