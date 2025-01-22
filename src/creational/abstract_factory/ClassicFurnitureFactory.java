package creational.abstract_factory;

//ConcreteFactoryA
//Creeaza obiecte atat de tip Chair, cat si de tip Table (ConcreteProductA1 si ConcreteProductB1)
public class ClassicFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ClassicChair();
    }

    @Override
    public Table createTable() {
        return new ClassicTable();
    }
}
