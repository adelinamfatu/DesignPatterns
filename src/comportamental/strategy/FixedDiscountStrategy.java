package comportamental.strategy;

//Clasa ConcreteStrategyB
public class FixedDiscountStrategy implements PricingStrategy {
    private double discountAmount;

    public FixedDiscountStrategy(double discountAmount) {
        this.discountAmount = discountAmount;
    }

    @Override
    public double calculatePrice(double basePrice) {
        return basePrice - discountAmount;
    }
}
