package Selenium_Practice;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class timepass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/furniture/tv-units-cabinets/tv-entertainment-units/~cs-x37cn0gxcy/pr?sid=wwe,243,koe&hpid=vaHda9aPgURQ4u1h3ObwUqp7_Hsxr70nj65vMAAFKlc=&fm=neo%2Fmerchandising&iid=M_b1e8e37c-ce34-4776-96ae-b64981bb3b27_1.Q3M9LD3B5Y0O&ppt=hp&ppn=homepage&ssid=nyhshz7zww0000001642860350012&otracker=dynamic_omu_infinite_Top%2BOffers_1_1.dealCard.OMU_INFINITE_Q3M9LD3B5Y0O&cid=Q3M9LD3B5Y0O");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//		WebElement v=driver.findElement(By.xpath("//h2[text()='Guidance']"));
//		JavascriptExecutor js = ((JavascriptExecutor)driver);
//		js.executeScript("arguments[0].scrollIntoView(true);",v);
		driver.findElement(By.className("s1Q9rs")).click();
		Set<String> id = driver.getWindowHandles();
//		Iterator<String> it = id.iterator();
		ArrayList<String> ar = new ArrayList (id);
//		String homepage = it.next();
//		String page2 = it.next();
		String page = ar.get(1);
		driver.switchTo().window(page);
		driver.findElement(By.xpath("//button[@type='button']")).click();
		driver.findElement(By.xpath("//input[@maxlength='auto']")).sendKeys("9823888957");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.navigate().to("https://www.w3schools.com/html/html_tables.asp");
		List<WebElement> ta = driver.findElements(By.xpath("//table[@id='customers']//tr"));
		Thread.sleep(2000);
		for(WebElement w:ta) {
			System.out.println(w.getText());
			driver.navigate().to("https://www.google.com/");
			driver.findElement(By.name("q")).sendKeys("cricket");
			List<WebElement> li = driver.findElements(By.xpath("//ul[@jsname='bw4e9b']//li"));
			for(WebElement e:li) {
				System.out.println(e.getText());
			}
		}
		
	}

}
