package sanketpakage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class moxila {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "D:\\selenium\\edgedriver_win64\\msedgedriver.exe          ");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.bing.com/?pc=W124");
		

	}

}
