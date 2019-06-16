import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesFileReading {
	public static void main(String[] args) {

        try {
        	InputStream input = new FileInputStream("E:\\Ethans_Selenium\\Java\\Eclipse\\Ethans_JAVA\\Properties.config");
            Properties prop = new Properties();

            // load a properties file
            prop.load(input);

            // get the property value and print it out
            System.out.println(prop.getProperty("db.url"));
            System.out.println(prop.getProperty("db.user"));
            System.out.println(prop.getProperty("db.password"));
            //System.out.println(prop.getProperty("db.link"));

        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
}
