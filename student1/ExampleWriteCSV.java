import java.io.*;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class ExampleWriteCSV
{
    public static void main(String[] args)throws IOException
    {
// Create a workbook instances
        Workbook wb = new HSSFWorkbook();

        //creating a new excel file location
        FileOutputStream os = new FileOutputStream("C:\\Users\\Shree\\Desktop\\JAVAFILES\\writeCSV.csv");

        // Creating a sheet using predefined class provided by Apache POI
        Sheet sheet = wb.createSheet("Company Prepration");



        //writing at 0th row and 0th column
        Row row0 = sheet.createRow(0);
        Cell cell0 = row0.createCell(0);
        cell0.setCellValue("username");


        Cell cell1 = row0.createCell(1);
        cell1.setCellValue("password");



        Row row1 = sheet.createRow(1);
        Cell cell2 = row1.createCell(0);
        cell2.setCellValue("A");


        Cell cell3 = row1.createCell(1);
        cell3.setCellValue("A1");

        // writing the content to Workbook
        wb.write(os);

        System.out.println("given cells are created");


    }
}
