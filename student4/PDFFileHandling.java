
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.parser.PdfTextExtractor;

/*
Goto    https://mvnrepository.com/artifact/com.itextpdf/itextpdf/5.5.13
Download    jar file
Import into project
Copy sample.pdf to your project root folder
Run below program
 */

public class PDFFileHandling {

    public static void main(String args[]) throws Exception{

            PdfReader reader = new PdfReader("C:\\Users\\Admin\\Downloads\\PoojaAdodraResume.pdf");

            // pageNumber = 3
            String textFromPage = PdfTextExtractor.getTextFromPage(reader, 3);

            System.out.println(textFromPage);

            reader.close();

    }

}