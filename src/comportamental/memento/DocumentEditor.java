package comportamental.memento;

//Clasa Originator
public class DocumentEditor {
    private String content;

    public void setContent(String content) {
        this.content = content;
        System.out.println("Conținut actualizat: " + content);
    }

    public String getContent() {
        return content;
    }

    public Memento save() {
        System.out.println("Stare salvată.");
        return new Memento(content);
    }

    public void restore(Memento memento) {
        content = memento.getState();
        System.out.println("Starea a fost restaurată la: " + content);
    }
}
