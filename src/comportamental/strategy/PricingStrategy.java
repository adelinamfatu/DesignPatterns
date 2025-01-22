package comportamental.strategy;

//Interfata Strategy ce contine metoda algoritm ce trebuie implementata in fiecare clasa specifica
public interface PricingStrategy {
    double calculatePrice(double basePrice);
}
