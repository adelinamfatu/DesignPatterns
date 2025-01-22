package comportamental.memento;

//Imaginați-vă un editor de text care permite utilizatorilor să facă modificări într-un document și
//să salveze starea curentă pentru a putea reveni la aceasta mai târziu (funcționalitatea de „Undo”).
//Vom utiliza design pattern-ul Memento pentru a salva și restaura starea documentului fără ca alte părți
//ale sistemului să intervină direct asupra acestei stări.

public class Main {
    public static void main(String[] args) {
        DocumentEditor editor = new DocumentEditor();
        History history = new History();

        //Modificare continut si salvare stare
        editor.setContent("Prima versiune.");
        history.saveState(editor.save());

        editor.setContent("A doua versiune.");
        history.saveState(editor.save());

        editor.setContent("A treia versiune.");

        //Restaurare stari anterioare
        System.out.println("\n=== Undo-uri ===");
        Memento previousState = history.undo();
        if (previousState != null) {
            editor.restore(previousState);
        }

        previousState = history.undo();
        if (previousState != null) {
            editor.restore(previousState);
        }
    }
}
