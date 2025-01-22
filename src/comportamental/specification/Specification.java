package comportamental.specification;

public interface Specification<T> {
    boolean isSpecifiedBy(T item);
    Specification<T> and(Specification<T> other);
    Specification<T> or(Specification<T> other);
    Specification<T> not();
}
