package sanketpakage;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazone {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.amazon.in/s?k=smartphones&rh=n%3A1389432031%2Cp_89%3AOppo&dc&qid=1638282373&rnid=3837712031&ref=sr_nr_p_89_3");
	
		List<WebElement> oppo = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		String expected = "OPPO";
		for (WebElement w : oppo) {
	            Dimension q = w.getSize();
	            System.out.println(q);
		String p = w.getText();
		
		
		if(p.contains(expected)) {
			System.out.println(p);
			
		}
		
		}
	}

}
