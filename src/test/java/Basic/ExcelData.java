package Basic;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
//		// TODO Auto-generated method 
//		WebDriver a=new ChromeDriver();
//		a.manage().window().maximize();
//		a.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//		TO READ THE DATA FROM  EXTERNAL FILE
		FileInputStream fl=new FileInputStream("src\\main\\resources\\DataExcel2.xlsx");
//		TO READ THE DATA FROM EXCEL
		Workbook w = WorkbookFactory.create(fl);
		
		
   //   TO GET CONTROL OF SHEET
		Sheet sh = w.getSheet("Selenium");
//		   TO GET CONTROL OF ROW
		 Row r = sh.getRow(1);
//		    TO GET CONTROL OF CELL
		Cell cell = r.getCell(1
				);
//		   TO GET DATA PRESENT IN CELL
		System.out.println(cell.getStringCellValue());
		 
		
		
		

	}

}
