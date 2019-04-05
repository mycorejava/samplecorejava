//import java.io.File;
//import java.io.IOException;

import java.io.File;
import java.io.IOException;

public class ExampleFile {
    public static void main(String[] args) {
        File file = new File("data.txt");
        try {
            boolean createNewFile = file.createNewFile();
            System.out.println("File Created = " + createNewFile);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
