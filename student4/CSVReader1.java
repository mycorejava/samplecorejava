import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CSVReader1 {

    public static void main(String[] args) {

        String csvFile = "E:\\Ethans_Selenium\\Java\\Eclipse\\Ethans_JAVA\\CSVReader.csv";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";

        try {

            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] postsplit = line.split(cvsSplitBy);

                System.out.println(postsplit[0]+" " +postsplit[1]+" "+postsplit[2]);

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

}