package testCases;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExceldataRead {
	public  static void main(String[] args) throws IOException {
	XSSFWorkbook wBook= new XSSFWorkbook("./Data/CreateleadData.xlsx");
	XSSFSheet sheet = wBook.getSheet("createlead");
		int rowCount = sheet.getLastRowNum();
		System.out.println(rowCount);
		XSSFRow headerRow = sheet.getRow(0);
		short columnCount = headerRow.getLastCellNum();
		for (int i = 1; i <=rowCount; i++) {
			{
				XSSFRow row = sheet.getRow(i);
				for (int j = 0; j <columnCount; j++) {
				XSSFCell cell = row.getCell(j);	
				System.out.println(cell.getStringCellValue());
				}
			}
		}
		wBook.close();
	}

}
