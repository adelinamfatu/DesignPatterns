package creational.simple_factory;

////ConcreteProductB
public class ElectronicProduct implements Product {
    private double price;
    private String name;

    private ElectronicProduct(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public static Product create(String name, double price) {
        return new ElectronicProduct(name, price);
    }

    @Override
    public void showCharacteristics() {
        System.out.println(getClass().getName() + ": name - " + name + ", price - " + price);
    }
}
