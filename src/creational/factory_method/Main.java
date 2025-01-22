package creational.factory_method;

//Compania XYZ are mai mulți angajați, iar fiecare tip de angajat (de exemplu, developer, manager, designer)
//are caracteristici și comportamente diferite. Toți angajații au un nume, un salariu și o funcție,
//dar fiecare tip de angajat poate avea și informații suplimentare, cum ar fi limba de programare preferată (pentru developer),
//departamentul în care lucrează (pentru manager), sau proiectele la care lucrează (pentru designer).
//Se dorește implementarea unui sistem de gestionare a angajaților care să utilizeze Factory Method pentru a crea obiecte
//de tip Employee în funcție de rolul acestora.

public class Main {
    public static void main(String[] args) {
        //Creare developer
        EmployeeFactory developerFactory = new DeveloperFactory();
        developerFactory.createEmployee("Alice", "Developer", 5000, "Java").showEmployeeData();

        //Creare manager
        EmployeeFactory managerFactory = new ManagerFactory();
        managerFactory.createEmployee("Bob", "Manager", 7000, "HR").showEmployeeData();
    }
}
