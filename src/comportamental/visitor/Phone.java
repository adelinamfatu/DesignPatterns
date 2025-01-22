package comportamental.visitor;

public class Phone implements Element {
    private double price;

    public Phone(double price) {
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
        System.out.println("Prețul telefonului după reducere: " + price);
    }
}
