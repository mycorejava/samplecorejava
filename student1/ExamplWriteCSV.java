import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class ExamplWriteCSV
{
    public static void main(String[] args) throws IOException
    {
        Properties properties = new Properties();
//writing properties
        properties.setProperty("favoriteAnimal", "marmot");
        properties.setProperty("favoriteContinent", "Antarctica");
        properties.setProperty("favoritePerson", "Nicole");

        File file = new File("C:\\Users\\Shree\\Desktop\\JAVAFILES\\db1.properties");
        FileOutputStream fileOut = new FileOutputStream(file);
        properties.store(fileOut, "Favorite Things");
        fileOut.close();
//Reading properties
        FileReader reader =new FileReader("C:\\Users\\Shree\\Desktop\\JAVAFILES\\db1.properties");
        properties.load(reader);
        System.out.println(properties.getProperty("favoriteAnimal"));
        System.out.println(properties.getProperty("favoriteContinent"));
        System.out.println(properties.getProperty("favoritePerson"));

    }
}
