package _1_Webdriver_method;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class GET_SIZE_and_Setsize {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
//		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.get("");
		FileInputStream file =new FileInputStream("D:\\Excel files\\Book1.xlsx");
		Sheet sheet = WorkbookFactory.create(file).getSheet("Sheet2");
		for(int i=0;i<=sheet.getLastRowNum();i++) {
			Row row = sheet.getRow(i);
			for(int j=0;j<=row.getLastCellNum()-1;j++) {
				Cell cell = sheet.getRow(i).getCell(j);
				if(cell.getCellType()==CellType.STRING) {
					System.out.print(cell.getStringCellValue());
				}
				else if(cell.getCellType()==CellType.NUMERIC) {
					System.out.print(cell.getNumericCellValue());
				}
				else if(cell.getCellType()==CellType.BOOLEAN) {
					System.out.print(cell.getBooleanCellValue());
				}
				
			}System.out.println(" ");
		}
		
		
		

	}

}
