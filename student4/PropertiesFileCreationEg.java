	import java.io.FileOutputStream;
	import java.io.IOException;
	import java.io.OutputStream;
	import java.util.Properties;

public class PropertiesFileCreationEg {


	    public static void main(String[] args) {

	        try{
	        	OutputStream output = new FileOutputStream("E:\\Ethans_Selenium\\Java\\Eclipse\\Ethans_JAVA\\Properties.config");

	            Properties prop = new Properties();

	            // set the properties value
	            prop.setProperty("db.url", "localhost");
	            prop.setProperty("db.user", "mkyong");
	            prop.setProperty("db.password", "password");
	            String str = "Trial String;";
	            // save properties to project root folder
	            prop.store(output, str);   //str is added as comments in the file
	            System.out.println(prop);

	        } catch (IOException io) {
	            io.printStackTrace();
	        }

	    }
}

