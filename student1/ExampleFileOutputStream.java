import java.io.FileOutputStream;
import java.io.IOException;

public class ExampleFileOutputStream
{
    public static void main(String[] args) throws IOException {
        String fileContent = "file created using fileoutputstream";

        FileOutputStream outputStream = new FileOutputStream("C:\\Users\\Shree\\Desktop\\Java Files\\fileoutputstream.txt");
        byte[] strToBytes = fileContent.getBytes();
        outputStream.write(strToBytes);

        outputStream.close();


    }
}
