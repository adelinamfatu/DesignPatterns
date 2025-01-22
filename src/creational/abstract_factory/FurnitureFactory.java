package creational.abstract_factory;

//Interfata AbstractFactory
//Creeaza obiecte din fiecare tip generic (interfata)
public interface FurnitureFactory {
    Chair createChair();
    Table createTable();
}
