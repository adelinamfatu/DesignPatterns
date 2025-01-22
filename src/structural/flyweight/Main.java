package structural.flyweight;

//Compania XYZ implementează un joc de strategie în care sunt reprezentate unități de soldați
//(infanterie, cavalerie, arcași). Fiecare unitate are caracteristici comune, cum ar fi tipul unității, puterea de atac,
//apărarea și viteza de mișcare. Pe lângă acestea, fiecare unitate are caracteristici unice,
//cum ar fi poziția pe hartă și starea curentă (de exemplu, viață rămasă).
//Pentru a optimiza memoria jocului, se dorește partajarea stării comune a unităților
//(cum ar fi tipul unității și caracteristicile generale) între toate unitățile de același tip.

public class Main {
    public static void main(String[] args) {
        //Creare prin FlyweightFactory unitatile partajate
        Unit infantry = UnitFactory.getUnit("Infantry");
        Unit cavalry = UnitFactory.getUnit("Cavalry");
        Unit archer = UnitFactory.getUnit("Archer");

        UnitInstance infantry1 = new UnitInstance(infantry, 0, 0, 100);
        UnitInstance infantry2 = new UnitInstance(infantry, 10, 10, 90);

        UnitInstance cavalry1 = new UnitInstance(cavalry, 5, 5, 120);

        UnitInstance archer1 = new UnitInstance(archer, 3, 8, 80);

        //Afisare unitati
        infantry1.display();
        infantry2.display();
        cavalry1.display();
        archer1.display();

        //Verificare numar obiecte partajate
        System.out.println("Number of unique unit types created: " + UnitFactory.getUnitCount());
    }
}
