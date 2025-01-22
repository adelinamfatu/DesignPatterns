package creational.abstract_factory;

//ConcreteFactoryB
//Creeaza obiecte atat de tip Chair, cat si de tip Table (ConcreteProductA2 si ConcreteProductB2)
public class ModernFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Table createTable() {
        return new ModernTable();
    }
}
