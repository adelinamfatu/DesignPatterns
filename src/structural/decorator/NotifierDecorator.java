package structural.decorator;

//Clasa abstracta Decorator
//Implementeaza interfata
//Are un obiect de tip al interfetei pe care il primeste in constructor si de care se foloseste in metoda implementata
//De fiecare data cand se creeaza un obiect de tipul interfetei se pastreaza referinta catre obiectul creat de dinainte
public abstract class NotifierDecorator implements Notifier {
    protected Notifier wrappedNotifier;

    public NotifierDecorator(Notifier notifier) {
        this.wrappedNotifier = notifier;
    }

    @Override
    public void send(String message) {
        wrappedNotifier.send(message);
    }
}
