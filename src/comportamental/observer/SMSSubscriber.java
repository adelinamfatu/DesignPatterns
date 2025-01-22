package comportamental.observer;

//ConcreteObserverB
public class SMSSubscriber implements Observer {
    private String name;

    public SMSSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String news) {
        System.out.println("SMS către " + name + ": " + news);
    }
}
