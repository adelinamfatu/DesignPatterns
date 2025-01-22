package comportamental.visitor;

import java.util.ArrayList;
import java.util.List;

public class ProductStore {
    private List<Element> products;

    public ProductStore() {
        products = new ArrayList<>();
    }

    public void addProduct(Element product) {
        products.add(product);
    }

    public void accept(Visitor visitor) {
        for (Element product : products) {
            product.accept(visitor);
        }
    }
}
