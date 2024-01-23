package commonutils;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtils {
	
	public String getdatafromExcel(String Sheetname,int rownum,int cellnum) throws EncryptedDocumentException, IOException {
		FileInputStream fls=new FileInputStream("src\\main\\resources\\Conpom.xlsx");
		Workbook w =WorkbookFactory.create(fls);
		String ExeValue = w.getSheet(Sheetname).getRow(rownum). getCell(cellnum).getStringCellValue();
		return ExeValue;
		
	}

	public String getdatafromExcelOrg(String Sheetname,int rownum,int cellnum) throws EncryptedDocumentException, IOException
	
	{
		FileInputStream fls=new FileInputStream("src\\main\\resources\\ogpom.xlsx");
		Workbook w =WorkbookFactory.create(fls);
		String ExeValue = w.getSheet(Sheetname).getRow(rownum). getCell(cellnum).getStringCellValue();
		return ExeValue;
	}
	
	
}
