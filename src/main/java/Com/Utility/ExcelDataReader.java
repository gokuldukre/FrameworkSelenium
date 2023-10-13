package Com.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataReader {
	XSSFWorkbook wb;
	public  ExcelDataReader() throws Exception {
		String path="C:\\Users\\DELL\\eclipse-workspace\\FrameWorkSelenium\\TestDataProvider\\Data.xlsx";
		FileInputStream file = new FileInputStream(path);
		 wb=new XSSFWorkbook(file);
		
	}
	public String getData(String SheetName, int Row, int Cell) {
		String data= wb.getSheet(SheetName).getRow(Row).getCell(Cell).getStringCellValue();
		return data;
		
	}

}
