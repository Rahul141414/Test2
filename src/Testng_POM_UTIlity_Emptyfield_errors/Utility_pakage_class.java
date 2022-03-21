package Testng_POM_UTIlity_Emptyfield_errors;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Driver;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility_pakage_class {
	public static String excel(int row,int cell) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("D:\\Excel files\\Book1.xlsx");
		Sheet sheet = WorkbookFactory.create(file).getSheet("Sheet4");
		String values = sheet.getRow(row).getCell(cell).getStringCellValue();
		return values;
		
	}
	public static void screenshot(WebDriver driver,int TCID) throws IOException {
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination = new File("D:\\Screenshots\\Testcase"+TCID+".jpg");
		FileHandler.copy(source, destination);
	}

}
