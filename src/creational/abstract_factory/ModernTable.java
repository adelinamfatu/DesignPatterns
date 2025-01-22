package creational.abstract_factory;

//Obiect concret de tip masa
//ConcreteProductB2
public class ModernTable implements Table {
    @Override
    public void placeItems() {
        System.out.println("Placing items on a modern table.");
    }
}
