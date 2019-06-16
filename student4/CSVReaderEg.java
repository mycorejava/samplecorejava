import com.opencsv.*;
import java.io.*;

public class CSVReaderEg 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		String csvFile = "E:\\Ethans_Selenium\\Java\\Eclipse\\Ethans_JAVA\\CSVReader.csv";
	        CSVReader reader = null;
	        try {
	            reader = new CSVReader(new FileReader(csvFile));
	            String[] line;
	            while ((line = reader.readNext()) != null) 
	            {
	                System.out.println("Country [id= " + line[0] + ", code= " + line[1] + " , name=" + line[2] + "]");
//		FileReader fr = new FileReader("E:\\Ethans_Selenium\\Java\\Eclipse\\Ethans_JAVA\\CSVReader.csv");
//		CSVReader cr = new CSVReader(fr);
//		String[] nextRecord;
//		while((nextRecord = cr.readNext())!=null)
//		{
//			for (String cell : nextRecord) 
//		{ 
//                System.out.print(cell + "\t"); 
//		}
//		}
		}
	        }
		catch(Exception e)
		{
			e.printStackTrace();
		}
	        finally
	        {
	        	
	        }
		

}
}
