package creational.abstract_factory;

//Obiect concret de tip scaun
//ConcreteProductA1
public class ClassicChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("Sitting on a classic chair.");
    }
}
