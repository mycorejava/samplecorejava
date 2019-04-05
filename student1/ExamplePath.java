import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ExamplePath
{
    public static void main(String[] args) throws IOException {
        String fileContent = "writing file using path";

        Path path = Paths.get("C:\\Users\\Shree\\Desktop\\Java Files\\path.txt");

        Files.write(path, fileContent.getBytes());


    }
}
