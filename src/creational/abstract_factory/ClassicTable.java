package creational.abstract_factory;

//Obiect concret de tip masa
//ConcreteProductB1
public class ClassicTable implements Table {
    @Override
    public void placeItems() {
        System.out.println("Placing items on a classic table.");
    }
}
