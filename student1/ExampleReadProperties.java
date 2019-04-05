import java.util.*;
import java.io.*;

public class ExampleReadProperties
{
    public static void main(String[] args)throws Exception
    {
        FileReader reader =new FileReader("C:\\Users\\Shree\\Desktop\\JAVAFILES\\db.properties");
        Properties p = new Properties();
        p.load(reader);
        System.out.println(p.getProperty("username"));
        System.out.println(p.getProperty("password"));

    }
}
