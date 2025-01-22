package comportamental.template_method;

public class WordProcessor extends DocumentProcessor {
    @Override
    protected void processContent() {
        System.out.println("Procesarea conținutului Word...");
    }
}
