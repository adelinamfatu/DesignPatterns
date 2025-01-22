package comportamental.specification;

public class TypeSpecification implements Specification<Product> {
    private String type;

    public TypeSpecification(String type) {
        this.type = type;
    }

    @Override
    public boolean isSpecifiedBy(Product item) {
        return item.getType().equals(type);
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
