package comportamental.mediator;

public class ConcreteRestaurantMediator implements RestaurantMediator {
    private Waiter waiter;
    private Customer customer;

    public void setWaiter(Waiter waiter) {
        this.waiter = waiter;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public void sendMessage(String message, Employee employee) {
        if (employee == waiter) {
            customer.receiveMessage(message);  //Ospătarul trimite un mesaj clientului
        } else {
            waiter.receiveMessage(message);  //Clientul trimite un mesaj ospătarului
        }
    }
}
