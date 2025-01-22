package comportamental.specification;

public class PriceSpecification implements Specification<Product> {
    private double price;

    public PriceSpecification(double price) {
        this.price = price;
    }

    @Override
    public boolean isSpecifiedBy(Product item) {
        return item.getPrice() <= price;
    }

    @Override
    public Specification<Product> and(Specification<Product> other) {
        return new AndSpecification<>(this, other);
    }

    @Override
    public Specification<Product> or(Specification<Product> other) {
        return new OrSpecification<>(this, other);
    }

    @Override
    public Specification<Product> not() {
        return new NotSpecification<>(this);
    }
}
