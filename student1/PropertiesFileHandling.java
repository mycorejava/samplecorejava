
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesFileHandling {
    public static void main(String[] args) {

        try {
            Properties prop = new Properties();
            InputStream input = new FileInputStream("config.properties");

            // load a properties file
            prop.load(input);

            // get the property value and print it out
            System.out.println(prop.getProperty("name"));
            String age = prop.getProperty("age");
            System.out.println(age);
            System.out.println(prop.getProperty("location"));

        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
}
