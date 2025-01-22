package creational.abstract_factory;

//Compania XYZ produce seturi de mobilier pentru case și birouri. Fiecare set include un scaun și o masă.
//Scaunele și mesele dintr-un set trebuie să aibă un stil uniform (modern sau clasic).
//Fiecare stil (Modern și Clasic) are implementări specifice pentru scaune și mese:
//Scaunele moderne au un design minimalist, iar cele clasice sunt ornamentate.
//Mesele moderne sunt realizate din sticlă și metal, iar mesele clasice sunt din lemn masiv.
//Sistemul trebuie să permită crearea de seturi de mobilier (scaun și masă) în funcție de stilul dorit, utilizând Abstract Factory.

public class Main {
    public static void main(String[] args) {
        FurnitureFactory modernFactory = new ModernFurnitureFactory();
        Chair modernChair = modernFactory.createChair();
        Table modernTable = modernFactory.createTable();

        System.out.println("Modern Furniture:");
        modernChair.sitOn();
        modernTable.placeItems();

        //Creare mobilier clasic
        FurnitureFactory classicFactory = new ClassicFurnitureFactory();
        Chair classicChair = classicFactory.createChair();
        Table classicTable = classicFactory.createTable();

        System.out.println("\nClassic Furniture:");
        classicChair.sitOn();
        classicTable.placeItems();
    }
}
