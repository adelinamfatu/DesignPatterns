package comportamental.memento;

import java.util.Stack;

//Clasa Caretaker
public class History {
    private final Stack<Memento> history = new Stack<>();

    public void saveState(Memento memento) {
        history.push(memento);
    }

    public Memento undo() {
        if (!history.isEmpty()) {
            return history.pop();
        }
        System.out.println("Nu există nicio stare salvată.");
        return null;
    }
}
