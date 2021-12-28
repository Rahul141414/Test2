package Page_factory_module_excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testclassflipkar {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		FileInputStream file = new FileInputStream("D:\\Excel files\\Book1.xlsx");
		Sheet sheet = WorkbookFactory.create(file).getSheet("Sheet4");
		String mob = sheet.getRow(1).getCell(05).getStringCellValue();
	    String pass = sheet.getRow(1).getCell(1).getStringCellValue();
	    flipkartloginpage login= new flipkartloginpage(driver);
	    login.username(mob);
	    login.password(pass);
	    login.button();
	 
		

	}

}
