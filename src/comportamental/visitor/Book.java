package comportamental.visitor;

public class Book implements Element {
    private double price;

    public Book(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void applyDiscount(double discount) {
        this.price -= this.price * discount;
        System.out.println("Prețul cărții după reducere: " + price);
    }
}
