import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class ExampleExcelCreation
{
    public static void main(String[] args) throws IOException
    {
// Create a workbook instances 
        Workbook wb = new HSSFWorkbook();

        //creating a new excel file location
        FileOutputStream os = new FileOutputStream("C:\\Users\\Shree\\Desktop\\JAVAFILES\\New.xls");

        // Creating a sheet using predefined class provided by Apache POI
        Sheet sheet = wb.createSheet("Company Prepration");



        // Specific row number
        Row row1 = sheet.createRow(1);

        // Specific cell number
        Cell cell1 = row1.createCell(1);

        // putting value at specific position
        cell1.setCellValue("Geeks");

        // writing the content to Workbook
        wb.write(os);

        System.out.println("given cell is created at position (1, 1)");




    }
}