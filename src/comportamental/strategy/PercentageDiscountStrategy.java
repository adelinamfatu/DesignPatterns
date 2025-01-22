package comportamental.strategy;

//Clasa ConcreteStrategyA
//Implementeaza interfata Strategy
public class PercentageDiscountStrategy implements PricingStrategy {
    private double discountPercentage;

    public PercentageDiscountStrategy(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    @Override
    public double calculatePrice(double basePrice) {
        return basePrice - (basePrice * discountPercentage / 100);
    }
}
