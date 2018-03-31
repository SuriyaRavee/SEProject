package Report;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExceldataRead {
	public  static void main(String[] args) throws IOException {
		
		//Open Workbook 
	   XSSFWorkbook wBook= new XSSFWorkbook("./Data/CreateleadData.xlsx");
	
	  //Go to Sheet
	   XSSFSheet sheet = wBook.getSheet("createlead");
	
	  //Find no. of row in the sheet(Sheet Level)
		int rowCount = sheet.getLastRowNum();
		System.out.println(rowCount);
		
		//Go to Header Row(Row=0)
		XSSFRow headerRow = sheet.getRow(0);
		
		//Find no. of columns in a row(Row Level)
		short columnCount = headerRow.getLastCellNum();
		
		//Loop for Go to each Row
		for (int i = 1; i <=rowCount; i++) {
			{ 
				XSSFRow row = sheet.getRow(i);
				
				//Loop for Go to Each Column
				for (int j = 0; j <columnCount; j++) {
				XSSFCell cell = row.getCell(j);	
				
				//To print the contents of the cell
				System.out.println(cell.getStringCellValue());
				}
			}
		}
		wBook.close();
	}

}
