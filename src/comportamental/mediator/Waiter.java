package comportamental.mediator;

public class Waiter implements Employee {
    private RestaurantMediator mediator;

    public Waiter(RestaurantMediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("Ospătarul trimite: " + message);
        mediator.sendMessage(message, this);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println("Ospătarul a primit: " + message);
    }
}
