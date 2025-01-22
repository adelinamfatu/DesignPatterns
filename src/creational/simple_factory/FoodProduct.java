package creational.simple_factory;

import java.util.Date;

//ConcreteProductC
public class FoodProduct implements Product {
    private Date expiryDate;
    private String type;

    private FoodProduct(Date expiryDate, String type) {
        this.expiryDate = expiryDate;
        this.type = type;
    }

    public static FoodProduct create(Date expiryDate, String type) {
        return new FoodProduct(expiryDate, type);
    }

    @Override
    public void showCharacteristics() {
        System.out.println(getClass().getName() + ": expiry date - " + expiryDate + ", type - " + type);
    }
}
