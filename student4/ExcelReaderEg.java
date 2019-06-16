import java.io.File;
import java.io.FileInputStream;
import java.util.*;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReaderEg {
	
private static final String FILE_NAME = "E:\\Ethans_Selenium\\Java\\Eclipse\\Ethans_JAVA\\sample.xlsx";
	
	public static void main(String[] args) throws Exception {	
		Scanner sc = new Scanner(System.in);	
		System.out.println("Which row do you want to read?\n");
		int rownumber = sc.nextInt();
		System.out.println("Which column do you want to read?\n");
		int columnnumber = sc.nextInt();
            FileInputStream excelFile = new FileInputStream(new File(FILE_NAME));
            XSSFWorkbook workbook = new XSSFWorkbook(excelFile);
            XSSFSheet datatypeSheet = workbook.getSheetAt(0);
         //   for (int m = 0; m < datatypeSheet.getLastRowNum(); m++){
            	 XSSFRow row = datatypeSheet.getRow(rownumber); 
        //    	for (int k=0 ; k< row.getLastCellNum(); k++){
                	System.out.println(row.getCell(columnnumber));
               // }
            //}
            workbook.close();
            
	}

}
