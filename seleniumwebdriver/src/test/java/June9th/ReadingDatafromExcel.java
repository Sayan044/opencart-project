package June9th;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingDatafromExcel {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "\\testdata\\Book1.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		int totalRows = sheet.getLastRowNum();
		int totalCells = sheet.getRow(1).getLastCellNum();
		
		System.out.println("Number of rows: " + totalRows);
		System.out.println("Number of cells: " + totalCells);
		
		for(int r=0;r<=totalRows;r++) {
			XSSFRow currentRow=sheet.getRow(r);
			
			for(int c=0;c<totalCells;c++) {
				XSSFCell cell=currentRow.getCell(c);
				System.out.println(cell.toString());
			}
			
		}
		
		workbook.close();
		file.close();
	}
}
