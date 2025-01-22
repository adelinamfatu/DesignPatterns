package comportamental.mediator;

//Într-un restaurant, există mai mulți ospătari care preiau comenzile de la clienți.
//Fiecare ospătar poate interacționa cu un client, dar toate comenzile și întrebările sunt gestionate
//printr-un mediator, care asigură că fiecare ospătar știe ce comandă a fost plasată de fiecare client.
//Mediatorul ajută astfel la evitarea confuziei și îmbunătățește comunicarea între ospătari.

public class Main {
    public static void main(String[] args) {
// Crearea mediatorului
        ConcreteRestaurantMediator mediator = new ConcreteRestaurantMediator();

        //Crearea Ospătarului și Clientului
        Waiter waiter = new Waiter(mediator);
        Customer customer = new Customer(mediator);

        //Setarea relațiilor în mediator
        mediator.setWaiter(waiter);
        mediator.setCustomer(customer);

        //Clientul face o comandă
        customer.sendMessage("Aș dori o pizza, vă rog!");

        //Ospătarul răspunde clientului
        waiter.sendMessage("Pizza va veni imediat.");
    }
}
