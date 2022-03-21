package Shubham;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class assigment {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--disable-notification");
		driver=new ChromeDriver(op);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.midtrans.com");
		driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//a[text()='BUY NOW']")).click();
	driver.findElement(By.xpath("//div[text()='CHECKOUT']")).click();

	driver.switchTo().frame("snap-midtrans");
	
	WebElement po = driver.findElement(By.xpath("//p[text()='Order Summary']"));
	System.out.println(po);
	driver.findElement(By.xpath("//*[@id=\"application\"]/div[1]/a")).click();

  driver.findElement(By.xpath("//div[text()='Credit/Debit Card']")).click();
driver.findElement(By.xpath("//input[@name=\"cardnumber\"]")).sendKeys("4811111111111114");
driver.findElement(By.xpath("//input[@placeholder=\"MM / YY\"]")).sendKeys("12/24");
driver.findElement(By.xpath("//input[@inputmode=\"numeric\"]")).sendKeys("123");

driver.findElement(By.xpath("//*[@id=\"application\"]/div[1]/a")).click();
Thread.sleep(3000);
WebElement frame = driver.findElement(By.xpath("//iframe[contains(@src,'https://api.sandbox.midtrans.com/v2/token/rba/redirect/4811')]"));
driver.switchTo().frame(frame);

driver.findElement(By.xpath("/html/body/div/form/div[5]/div/input")).sendKeys("112233");
driver.findElement(By.name("ok")).click();
driver.switchTo().defaultContent();
String message = driver.findElement(By.xpath("//span[text()='Thank you for your purchase.']")).getText();

System.out.println(message);
String z ="Thank you for your purchase.";
if(message.equals(z)) {
	System.out.println("test is pass");
}driver.close();
}

	}


