package Report;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;


public class ExcelDataReadToReadMultipleFiles {
	
	public Object[][] readExcel(String filename, String tabname) throws IOException {
		XSSFWorkbook wBook= new XSSFWorkbook("./Data/"+filename+".xlsx");
		XSSFSheet sheet = wBook.getSheet(tabname);
		int rowCount = sheet.getLastRowNum();
		System.out.println(rowCount);
		XSSFRow headerRow = sheet.getRow(0);
		short columnCount = headerRow.getLastCellNum();
		Object[][] data= new Object[rowCount][columnCount];
		for(int i=1; i<=rowCount; i++) {
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j < columnCount; j++) {
				XSSFCell cell = row.getCell(j);
				//System.out.println(cell.getStringCellValue());
				data[i-1][j]=cell.getStringCellValue();
			}
		}
		wBook.close();
		return data;
	}

	public static void main(String[] args) {
		ExceldataRead data1= new ExceldataRead();
		//data.readExcel("Createlead", "CreateleadData");

	}

}
