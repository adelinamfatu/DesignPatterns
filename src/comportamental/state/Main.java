package comportamental.state;

//Imaginați-vă un lift care se poate afla în trei stări: staționar, urcă, sau coboară.
//Comportamentul liftului (pornirea sau oprirea) depinde de starea curentă. Vom folosi design pattern-ul
//State pentru a gestiona aceste comportamente, permițând schimbarea dinamică a stării liftului în funcție
//de acțiunile utilizatorului.

public class Main {
    public static void main(String[] args) {
        LiftContext lift = new LiftContext(new StationaryState());

        System.out.println("=== Simularea liftului ===");
        lift.pressButton(); //Staționar -> Ascendent
        lift.pressButton(); //Ascendent -> Staționar
        lift.setState(new DescendingState()); //Manual set to Descendent
        lift.pressButton(); //Descendent -> Staționar
    }
}
