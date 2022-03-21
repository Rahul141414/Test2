package automobile;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver =new ChromeDriver();
		driver.get("https://shop.advanceautoparts.com/");
		 WebElement offer = driver.findElement(By.xpath("//div[text()='Special Offers']"));
		 boolean offer1 = offer.isDisplayed();
		 
		
		if(offer1==true) {
			offer.click();
			List<WebElement> list = driver.findElements(By.xpath("(//ul[@class='css-bznv3i'])[2]//li"));
			for(WebElement w:list) {
				System.out.println(w.getText());
			}
			
		}
		else {
			System.out.print("offer not enable");
		}
	

	}

}
