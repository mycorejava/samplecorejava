import java.io.FileWriter;
import java.io.IOException;

public class ExampleFileWriter
{
    public static void main(String[] args) throws IOException
    {
        String fileContent ="file created using filewriter";
        FileWriter writer = new FileWriter("C:\\Users\\Shree\\Desktop\\Java Files\\filewriter.txt");
        writer.write(fileContent);
        writer.close();
    }
}
