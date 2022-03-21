package Dropdownvalidation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownvalidation2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException   {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
	
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		
		WebElement days = driver.findElement(By.id("day"));
		Select s = new Select(days);
		
		List<WebElement> list = s.getOptions();
		ArrayList  d = new ArrayList ();
		ArrayList z = new ArrayList<>();
		
	
		for(WebElement w:list) {
			String e = w.getText();
		 boolean a = d.add(e);
			
		FileInputStream file = new FileInputStream("D:\\Excel files\\Book1.xlsx");
		Sheet sheet = WorkbookFactory.create(file).getSheet("Sheet7");
		for(int i=0;i<=sheet.getLastRowNum()-1;i++) {
			String f1 = sheet.getRow(i).getCell(0).getStringCellValue();
			boolean x = z.add(f1);
			if(x==a) {
				System.out.println(i++);
			}
			
			
		}
		}
		
		
		

	}

}
