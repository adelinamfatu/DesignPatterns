package structural.adapter;

//Clasa Adaptee - clasa ce trebuie adaptata
public class USDProcessor {
    public void processUSD(double amount) {
        System.out.println("Processing payment of $" + amount + " USD.");
    }
}
