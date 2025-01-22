package structural.adapter;

//Interfata target
//Are o metoda ce face un anumit lucru
public interface PaymentProcessor {
    void processPayment(double amount, String currency);
}
