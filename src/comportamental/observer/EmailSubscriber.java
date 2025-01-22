package comportamental.observer;

//Clasa ConcreteObserverA
public class EmailSubscriber implements Observer {
    private String name;

    public EmailSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String news) {
        System.out.println("Email către " + name + ": " + news);
    }
}
