package creational.simple_factory;

//O aplicație de gestionare a comenzilor online permite clienților să plaseze comenzi pentru diferite tipuri de produse:
//electronice, îmbrăcăminte și alimente. Fiecare tip de produs are caracteristici și prețuri diferite.
//Se cere implementarea unei fabrici simple care să creeze instanțe ale produselor în funcție de tipul solicitat.
//Clasa Factory va gestiona logica de creare a produselor, iar restul aplicației va interacționa doar cu obiectele create,
//fără a ști cum sunt implementate.

public class Main {
    public static void main(String[] args) {
        //Crearea produselor din cele 3 tipuri
        Product electronicProduct = ProductFactory.getProduct("Electronics");
        Product foodProduct = ProductFactory.getProduct("Food");
        Product clothingProduct = ProductFactory.getProduct("Clothing");

        //Afisarea caracteristicilor
        electronicProduct.showCharacteristics();
        foodProduct.showCharacteristics();
        clothingProduct.showCharacteristics();
    }
}
