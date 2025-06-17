package June9th;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDynamicDataExcel {

    public static void main(String[] args) throws IOException {
        // Creating Excel file output stream
        FileOutputStream file = new FileOutputStream(System.getProperty("user.dir") + "\\testdata\\myfile.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Data");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many rows?");
        int noOfRows = sc.nextInt();

        System.out.println("Enter how many columns?");
        int noOfCols = sc.nextInt();

        // Loop through rows and columns to take input
        for (int r = 0; r < noOfRows; r++) {
            XSSFRow currentRow = sheet.createRow(r);
            for (int c = 0; c < noOfCols; c++) {
                System.out.println("Enter data for row " + r + ", column " + c + ":");
                XSSFCell cell = currentRow.createCell(c);
                cell.setCellValue(sc.next());
            }
        }

        // Save and close
        workbook.write(file);
        workbook.close();
        file.close();
        sc.close();

        System.out.println("File is created successfully.");
    }
}
