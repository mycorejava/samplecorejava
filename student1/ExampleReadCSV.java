import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExampleReadCSV
{
    public static void main(String[] args) throws IOException
    {
        File src = new File("C:\\Users\\Shree\\Desktop\\JAVAFILES\\writeCSV.csv");
        FileInputStream fis = new FileInputStream(src);
        HSSFWorkbook wb = new HSSFWorkbook(fis);
//xlx = use HSSFWorkbook for xlx format and use XSSFWorkbook for xlsx
//in excel sheet index stats with (0)
        HSSFSheet sheet1 = wb.getSheetAt(0);

//take value from 0th row and 0th column and stored in String data0
        String data0 = sheet1.getRow(0).getCell(0).getStringCellValue();
        System.out.println(data0);
        String data1 = sheet1.getRow(0).getCell(1).getStringCellValue();
        System.out.println(data1);
        String data2 = sheet1.getRow(1).getCell(0).getStringCellValue();
        System.out.println(data2);
        String data3 = sheet1.getRow(1).getCell(1).getStringCellValue();
        System.out.println(data3);
    }
}
