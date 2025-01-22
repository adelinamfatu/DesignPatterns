package structural.adapter;

//O companie dorește să implementeze un sistem pentru procesarea plăților.
//Sistemul existent (Adaptee) permite procesarea plăților doar în dolari americani (USD),
//dar clientul are nevoie să accepte și plăți în euro (EUR).

public class Main {
    public static void main(String[] args) {
        USDProcessor usdProcessor = new USDProcessor();

        //Adaptarea procesarii platii
        PaymentProcessor paymentProcessor = new CurrencyAdapter(usdProcessor);

        //Verificare procesare plati
        paymentProcessor.processPayment(5000, "USD");
        paymentProcessor.processPayment(2500, "EUR");
        paymentProcessor.processPayment(4500, "RON");
    }
}
