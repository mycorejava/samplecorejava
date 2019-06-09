import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ParsingPropertiesFileEx
{
    public static void main(String[] args) {

        try {
            Properties prop = new Properties();
            InputStream input = new FileInputStream("C:/Users/Amita/Desktop/Details.properties");

            // load a properties file
            prop.load(input);

            // get the property value and print it out
            System.out.println(prop.getProperty("user"));
            String url = prop.getProperty("url");
            System.out.println(url);
            System.out.println(prop.getProperty("db_user"));

        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
}
