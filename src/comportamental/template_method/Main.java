package comportamental.template_method;

//Imaginați-vă că aveți un sistem care procesează documente în formate diferite (de exemplu, PDF și Word).
//Procesarea documentului implică următorii pași:
//Deschiderea fișierului.
//Procesarea conținutului specific.
//Închiderea fișierului.

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Procesare PDF ===");
        DocumentProcessor pdfProcessor = new PDFProcessor();
        pdfProcessor.processDocument();

        System.out.println("\n=== Procesare Word ===");
        DocumentProcessor wordProcessor = new WordProcessor();
        wordProcessor.processDocument();
    }
}
