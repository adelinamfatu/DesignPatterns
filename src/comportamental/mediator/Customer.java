package comportamental.mediator;

public class Customer implements Employee {
    private RestaurantMediator mediator;

    public Customer(RestaurantMediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("Clientul trimite: " + message);
        mediator.sendMessage(message, this);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println("Clientul a primit: " + message);
    }
}
