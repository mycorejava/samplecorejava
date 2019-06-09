import java.io.File;

public class FindAbsolutePath
{
    public static void main(String[] args) {

        File file1 = new File("sample.xlsx");
        file1.getAbsolutePath();
        System.out.println(file1.getAbsolutePath());
        //System.out.println(file1.getCanonicalPath());

    }


}
