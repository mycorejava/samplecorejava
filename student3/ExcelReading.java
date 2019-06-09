import java.io.File;
import java.io.FileInputStream;


import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


/*
Goto
https://www.apache.org/dyn/closer.lua/poi/release/bin/poi-bin-4.1.0-20190412.zip
Download from any mirror
Unzip
Import all jars from each folder
Open only MS Office 2013 onwards to create sample.xml file
Run below program
*/

public class ExcelReading {
    private static final String FILE_NAME = "C:/Users/Amita/Desktop/sample.xlsx";

    public static void main(String[] args) throws Exception {
        FileInputStream excelFile = new FileInputStream(new File(FILE_NAME));
        XSSFWorkbook workbook = new XSSFWorkbook(excelFile);
        XSSFSheet datatypeSheet = workbook.getSheetAt(0);
        System.out.println("Data at Cell(1,0): " + datatypeSheet.getRow(1).getCell(0));

        for (int m = 0; m < datatypeSheet.getLastRowNum(); m++)
        {
            XSSFRow row = datatypeSheet.getRow(m);
            for (int k=0 ; k< row.getLastCellNum(); k++){
                System.out.println(row.getCell(k));
            }
        }
        datatypeSheet.getRow(2).getCell(0).setCellValue("Amita");
        System.out.println("Replaced Data at Cell(2,0): " + datatypeSheet.getRow(2).getCell(0));
                workbook.close();

    }

}
