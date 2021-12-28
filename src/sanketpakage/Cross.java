package sanketpakage;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.beust.jcommander.Parameter;

public class Cross
{
	@Parameters("Browser")
	@Test
	
	public void cr(String br) {
		WebDriver driver =null;
		if(br.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32\\chromedriver.exe" );
			 driver = new ChromeDriver();
			
		}
		else if(br.equals("firefox")) {
			 System.setProperty("webdriver.gecko.driver", "D:\\selenium\\chromedriver_win32\\geckodriver-v0.30.0-win64 (1)\\geckodriver.exe");
			 driver = new FirefoxDriver();
			
		}
		
		driver.get("https://kite.zerodha.com/");
		
		
		
	}
		

}
