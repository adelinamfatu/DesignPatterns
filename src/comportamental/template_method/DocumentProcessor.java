package comportamental.template_method;

//Clasa AbstractClass
//Defineste niste actiuni ce trebuie facute intr-o anumita ordine
public abstract class DocumentProcessor {
    public final void processDocument() {
        openFile();
        processContent();
        closeFile();
    }

    private void openFile() {
        System.out.println("Deschiderea fișierului...");
    }

    private void closeFile() {
        System.out.println("Închiderea fișierului...");
    }

    //Metoda abstracta pentru procesarea continutului
    protected abstract void processContent();
}
