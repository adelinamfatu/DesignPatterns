package creational.simple_factory;

import java.util.Date;

public class ProductFactory {
    //Metoda statica ce returneaza si creeaza obiecte din tipul primit ca parametru
    //Se pun valori default ca mai apoi ele sa poata fi modificate prin setteri, altfel n-ar mai putea fi folosita interfata
    public static Product getProduct(String productType) {
        switch(productType) {
            case "Electronics":
                return ElectronicProduct.create("TV", 1500);
            case "Clothing":
                return ClothingProduct.create("M", "Pink");
            case "Food":
                return FoodProduct.create(new Date(2025, 8, 12), "Sweets");
            default:
                throw new IllegalArgumentException("Unknown product type: " + productType);
        }
    }
}
