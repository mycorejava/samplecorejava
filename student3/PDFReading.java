import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.parser.PdfTextExtractor;

public class PDFReading
{
    public static void main(String args[]) throws Exception{

        PdfReader reader = new PdfReader("C:/Users/Amita/Desktop/sample.pdf");

        // pageNumber = 1
        String textFromPage = PdfTextExtractor.getTextFromPage(reader, 1);

        System.out.println(textFromPage);

        reader.close();

    }
}
