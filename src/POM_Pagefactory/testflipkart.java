package POM_Pagefactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testflipkart {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver =new ChromeDriver();
		FileInputStream file = new FileInputStream("D:\\Excel files\\Book1.xlsx");
		Sheet sheet = WorkbookFactory.create(file).getSheet("Sheet4");
		 String mobile = sheet.getRow(1).getCell(0).getStringCellValue();
		String password = sheet.getRow(2).getCell(0).getStringCellValue();
		driver.get("https://www.flipkart.com/");
		Flipkart_login login = new Flipkart_login(driver);
		login.id(mobile);
		login.password(password);
		login.loginbutton();
		Homepageflipkart h = new Homepageflipkart(driver);
		String t = sheet.getRow(2).getCell(1).getStringCellValue();
		System.out.println(t);
		h.actual(t);
				

	}

}
