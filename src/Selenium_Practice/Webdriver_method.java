package Selenium_Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Webdriver_method {

	public static void main(String[] args) throws EncryptedDocumentException, IOException  {
		FileInputStream file = new FileInputStream("D:\\Excel files\\Book1.xlsx");
		Sheet sheet = WorkbookFactory.create(file).getSheet("Sheet2");
		int lastrow = sheet.getLastRowNum();
		for(int i=0;i<=lastrow-1;i++) {
			short cellnum = sheet.getRow(i).getLastCellNum();
			for(int j=0;j<=cellnum-1;j++) {
				Cell values = sheet.getRow(i).getCell(j);
				CellType type = values.getCellType();
				if(type==CellType.STRING) {
					System.out.print(values.getStringCellValue());
				}
				else if(type==CellType.NUMERIC) {
					System.out.print(values.getNumericCellValue());
				}
				else if(type==CellType.BOOLEAN) {
					System.out.print(values.getBooleanCellValue());
				}
			}System.out.println(" ");
		}
		}
		
		
		

		
		}
		 
	
		
	


