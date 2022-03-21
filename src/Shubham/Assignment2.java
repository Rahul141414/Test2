package Shubham;
import java.io.IOException;
import java.time.Duration;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Assignment2 {
	@Parameters("Browsername")
	  @Test
	  public void Test(String Browsername) throws EncryptedDocumentException, IOException, InterruptedException {
			WebDriver driver = null ;
			if(Browsername.equals("chrome")) {
				System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32\\chromedriver.exe" );
				driver= new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				driver.get("https://demo.midtrans.com");
				System.out.println("The chrome browser is launch");
			}
			else if(Browsername.equals("firefox")) {
				System.setProperty("webdriver.gecko.driver", "D:\\selenium\\chromedriver_win32\\geckodriver-v0.30.0-win64 (1)\\geckodriver.exe");
				driver = new FirefoxDriver();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				driver.get("https://demo.midtrans.com");
				System.out.println("The firefox is launch");
			}
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
		Thread.sleep(2000);
		WebElement frame = driver.findElement(By.xpath("//iframe[contains(@src,'https://api.sandbox.midtrans.com/v2/token/rba/redirect/4811')]"));
		driver.switchTo().frame(frame);

		driver.findElement(By.xpath("/html/body/div/form/div[5]/div/input")).sendKeys("112233");
		driver.findElement(By.name("ok")).click();
		driver.switchTo().defaultContent();
		String message = driver.findElement(By.xpath("//span[text()='Thank you for your purchase.']")).getText();

		System.out.println(message);
		String z ="Thank you for your purchase.";
		if(message.equals(z)) {
			System.out.println("Test is passed");
		}			
			
	}
}
			


