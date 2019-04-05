import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.encryption.InvalidPasswordException;
import org.apache.pdfbox.text.PDFTextStripper;

public class ReadPDF
{
    public static void main(String[] args) throws InvalidPasswordException, IOException
    {
        File file = new File("C:\\Users\\Shree\\Desktop\\JAVAFILES\\DtaTable.pdf");
        PDDocument document = PDDocument.load(file);
        PDFTextStripper pdfstripper = new PDFTextStripper();
        String text = pdfstripper.getText(document);
        System.out.println(text);
    }

}
