import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ExampleBufferedWriter
{
    public static void main(String[] args) throws IOException {
        String fileContent = "file created using bufferedwriter";
        BufferedWriter writer =new BufferedWriter(new FileWriter("C:\\Users\\Shree\\Desktop\\Java Files\\bufferedwriter.txt"));
        writer.write(fileContent);
        //if writer.close() is missing msg will not print on the output text file
        writer.close();

    }
}
