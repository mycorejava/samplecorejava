//reading from excel to text

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

public class ExamplExcelToText
{

    public static void main(String[] args) throws IOException
    {
        File src = new File("C:\\Users\\Shree\\Desktop\\JAVAFILES\\Data1.xlsx");
        FileInputStream fis = new FileInputStream(src);
        XSSFWorkbook wb = new XSSFWorkbook(fis);
//xlx = use HSSFWorkbook for xlx format and use XSSFWorkbook for xlsx
//in excel sheet index stats with (0)
        XSSFSheet sheet1 = wb.getSheetAt(0);

//take value from 0th row and 0th column and stored in String data0
        String data0 = sheet1.getRow(0).getCell(0).getStringCellValue();
        System.out.println(data0);
        String data1 = sheet1.getRow(0).getCell(1).getStringCellValue();
        System.out.println(data1);
        String data2 = sheet1.getRow(2).getCell(2).getStringCellValue();
        System.out.println(data2);
        FileWriter fileWriter = new FileWriter("C:\\Users\\Shree\\Desktop\\JAVAFILES\\Data1text.txt");
        fileWriter.write(data0);

        fileWriter.write(data1);

        fileWriter.write(data1);



        fileWriter.close();

    }

}

