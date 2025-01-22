package comportamental.template_method;

//Clasa ConcreteClass
public class PDFProcessor extends DocumentProcessor {
    @Override
    protected void processContent() {
        System.out.println("Procesarea conținutului PDF...");
    }
}
