package structural.proxy;

//Clasa RealSubject
public class RealAccount implements Account {
    @Override
    public void performTransaction() {
        System.out.println("RealSubject: Performing action...");
    }
}
