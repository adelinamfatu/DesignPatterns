package comportamental.specification;

public class InStockSpecification implements Specification<Product> {

    @Override
    public boolean isSpecifiedBy(Product item) {
        return item.isInStock();
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
