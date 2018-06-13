package generate.PDF;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfWriter;

public class App 
{

	public static void main( String[] args ) throws Exception
    {
        System.out.println( "Hello World!" );
        
        Document document = new Document(PageSize.A4, 50, 50, 50, 50);
        
        PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(".\\Itext.pdf"));
        
        document.open();
        
        document.add(new Paragraph("RDP Food Products"));
        
        document.close();
    }
}
