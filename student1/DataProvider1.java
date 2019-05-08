package testng1;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataProvider1
{







    @DataProvider(name = "Authentication")

    public static Object[][] credentials()
    {
        String values[][]= new String [3][2];
        try {
            File src = new File("C:\\Users\\Shree\\Desktop\\JAVAFILES\\dataprovider.xlsx");
            FileInputStream fis = new FileInputStream(src);
            XSSFWorkbook wb = new XSSFWorkbook(fis);

            XSSFSheet sheet1 = wb.getSheetAt(0);

            String value1 = sheet1.getRow(0).getCell(0).getStringCellValue();

            String value2 = sheet1.getRow(0).getCell(1).getStringCellValue();

            String value3 = sheet1.getRow(1).getCell(0).getStringCellValue();

            String value4 = sheet1.getRow(1).getCell(1).getStringCellValue();


            values[0][0] = value1;
            values[0][1] = value2;
            values[1][0] = value3;
            values[1][1] = value4;
            values[2][0] = value3;
            values[2][1] = value4;

        }
catch (Exception e)
{
    e.printStackTrace();
}

        return  values;

    }

    @Test(dataProvider = "Authentication")

    public void test(String sUsername, String sPassword)
    {
        System.out.println("username : "+sUsername);
        System.out.println("password : "+sPassword);


    }
}
