package comportamental.specification;

//Implementează un sistem de filtrare pentru un magazin online în care produsele pot fi selectate pe baza
//mai multor specificații. Fiecare produs poate avea diferite caracteristici, cum ar fi prețul, tipul (carte sau telefon)
//și disponibilitatea în stoc. Sistemul trebuie să permită definirea unor specificații complexe prin combinarea
//specificațiilor simple folosind operatorii logici AND, OR și NOT. Aceste specificații vor fi utilizate pentru a filtra produsele.

public class Main {
    public static void main(String[] args) {
        //Crearea produselor
        Product book = new Product("Java Programming Book", 30.0, true, "Book");
        Product phone = new Product("Smartphone", 250.0, false, "Phone");
        Product anotherBook = new Product("Python Book", 40.0, true, "Book");

        //Crearea specificațiilor
        Specification<Product> priceSpec = new PriceSpecification(35.0);
        Specification<Product> inStockSpec = new InStockSpecification();
        Specification<Product> typeSpec = new TypeSpecification("Book");

        //Combinarea specificațiilor
        Specification<Product> combinedSpec = priceSpec.and(inStockSpec).or(typeSpec);

        //Verificarea produselor pe baza specificației combinate
        System.out.println("Book matches criteria: " + combinedSpec.isSpecifiedBy(book));
        System.out.println("Phone matches criteria: " + combinedSpec.isSpecifiedBy(phone));
        System.out.println("Another book matches criteria: " + combinedSpec.isSpecifiedBy(anotherBook));
    }
}
