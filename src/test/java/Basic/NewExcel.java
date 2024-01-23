package Basic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class NewExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
//		TO FETCH THE SHEET
		FileInputStream fl=new FileInputStream("src\\main\\resources\\Data.xlsx");
//		TO READ THE DATA FROM EXCEL
		Workbook w = WorkbookFactory.create(fl);	
   //   TO GET CONTROL OF SHEET
		Sheet sh = w.createSheet("Sheet2");
//		   TO  Create ROW
		 Row r = sh.createRow(0);
//		    TO Create  CELL
		Cell cell = r.createCell(0);
//		Enter the Data
		cell.setCellValue("SARANG");
//		To write data to external FIle
		FileOutputStream f=new FileOutputStream("src\\main\\resources\\Data.xlsx");
//		To write data to excel
		w.write(f);

	}

}
