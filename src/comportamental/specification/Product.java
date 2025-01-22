package comportamental.specification;

public class Product {
    private String name;
    private double price;
    private boolean inStock;
    private String type;

    public Product(String name, double price, boolean inStock, String type) {
        this.name = name;
        this.price = price;
        this.inStock = inStock;
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public boolean isInStock() {
        return inStock;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return name + " (" + type + ") - Price: " + price + ", In stock: " + inStock;
    }
}
