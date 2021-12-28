package _1_Webdriver_method;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class GET_SIZE_and_Setsize {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://facebook.com/");
		System.out.println(driver.manage().window().getSize());  
		Dimension d = new Dimension(1000, 400);
		driver.manage().window().setSize(d);
		///////////////////////////////////
		System.out.println(driver.manage().window().getPosition());
		Point p = new Point(450, 50);
		driver.manage().window().setPosition(p);
		

	}

}
