package Dropdownvalidation;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Validation {

	public static void main(String[] args)throws InterruptedException, EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(2000);
        WebElement days = driver.findElement(By.xpath("//select[@name='birthday_day']"));
        Select s = new Select(days);
        FileInputStream file = new FileInputStream("D:\\Excel files\\Book1.xlsx");
        Row value = WorkbookFactory.create(file).getSheet("Sheet6").getRow(0);
        List<WebElement> list = s.getOptions();
        for(WebElement w:list) {
        	String q = w.getText();
        	//System.out.println(q);
     
        for(int i=0;i<=30;i++) {
        	String ce = value.getCell(i).getStringCellValue();
        	//System.out.println(ce);
        	if(q.equals(ce)) {
        		System.out.println(q+"present");
        	}
        	
        	
        }
        }
        
        	
        	
        }
		
		
	
	

	}

