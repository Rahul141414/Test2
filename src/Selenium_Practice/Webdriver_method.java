package Selenium_Practice;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Webdriver_method {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		 FileInputStream file = new FileInputStream("D:\\ex.xlsx");
		Sheet sheet = WorkbookFactory.create(file).getSheet("Sheet1");
		int r = sheet.getLastRowNum();
		for(int i=0;i<=r;i++) {
			short lc = sheet.getRow(i).getLastCellNum();
			for(int j=0;j<=lc-1;j++) {
				 CellType gg = sheet.getRow(i).getCell(j).getCellType();
				if(gg==CellType.STRING) {
					System.out.print(sheet.getRow(i).getCell(j).getStringCellValue());
					}
				else if(gg==CellType.NUMERIC) {
					System.out.print(sheet.getRow(i).getCell(j).getNumericCellValue());
				}
				else if(gg==CellType.BOOLEAN) {
					System.out.print(sheet.getRow(i).getCell(j).getBooleanCellValue());
					
				}
				System.out.println(" ");
			}
			
			
		}
		 
	
		
	}

}
