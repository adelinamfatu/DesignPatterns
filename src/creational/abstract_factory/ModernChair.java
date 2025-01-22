package creational.abstract_factory;

//Obiect concret de tip scaun
//ConcreteProductA2
public class ModernChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("Sitting on a modern chair.");
    }
}
