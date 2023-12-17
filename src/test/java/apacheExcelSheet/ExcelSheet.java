package apacheExcelSheet;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import io.cucumber.core.internal.com.fasterxml.jackson.databind.exc.InvalidFormatException;

public class ExcelSheet {
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public List<Map<String, String>> readExcelSheet() throws IOException {
		
		//String path = System.getProperty("user.dir")+"/src/test/resources/TestData/Demo.xlsx";
		File Excelfile = new File("C:/New folder/ds-algo-project/src/test/resources/TestData/testDataTextBox.xlsx");
		
		FileInputStream Fis = new FileInputStream(Excelfile);
		XSSFWorkbook workbook = new XSSFWorkbook(Fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
		           sheet.getRow(0).getCell(0);
		int rowCount= sheet.getLastRowNum();
		int cellCount=sheet.getRow(0).getLastCellNum();
		
		for(int r=1;r<=rowCount;r++) {
			   XSSFRow row=sheet.getRow(r);
			for(int c=0;c<=cellCount;c++) {
				 XSSFCell cell = row.getCell(c);
				 
			}
			   
		}
		
		String entery=sheet.getRow(1).getCell(1).getStringCellValue();
		return null;
	
		
		
		
		
		
	}
}
