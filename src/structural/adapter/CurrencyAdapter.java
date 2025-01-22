package structural.adapter;

//Clasa Adapter
//Are un obiect de tip Adaptee
//In metoda implementata din Target verifica daca e nevoie de adaptare si face altceva
public class CurrencyAdapter implements PaymentProcessor {
    private USDProcessor usdProcessor;

    public CurrencyAdapter(USDProcessor usdProcessor) {
        this.usdProcessor = usdProcessor;
    }

    @Override
    public void processPayment(double amount, String currency) {
        if ("USD".equalsIgnoreCase(currency)) {
            usdProcessor.processUSD(amount);
        } else if ("EUR".equalsIgnoreCase(currency)) {
            double convertedAmount = convertEURtoUSD(amount);
            usdProcessor.processUSD(convertedAmount);
            System.out.println("Converted " + amount + " EUR to $" + convertedAmount + " USD.");
        } else {
            System.out.println("Currency not supported: " + currency);
        }
    }

    private double convertEURtoUSD(double amount) {
        return amount * 1.1;
    }
}
