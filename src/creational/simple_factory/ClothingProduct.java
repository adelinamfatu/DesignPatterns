package creational.simple_factory;

//Produs specific ce implementeaza interfata
//ConcreteProductA
public class ClothingProduct implements Product {
    private String size;
    private String color;

    //Constructor private astfel incat obiectele sa nu poata fi create din afara clasei
    private ClothingProduct(String size, String color) {
        this.size = size;
        this.color = color;
    }

    public static Product create(String size, String color) {
        return new ClothingProduct(size, color);
    }

    @Override
    public void showCharacteristics() {
        System.out.println(getClass().getName() + ": sie - " + size + ", color - " + color);
    }
}
