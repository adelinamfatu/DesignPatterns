package comportamental.observer;

import java.util.ArrayList;
import java.util.List;

//Clasa Subject
//Are o lista de observeri si operatiile pe ei
public abstract class Subject {
    private List<Observer> observers = new ArrayList<>();

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(String news) {
        for (Observer observer : observers) {
            observer.update(news);
        }
    }
}
