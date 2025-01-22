package creational.multiton;

//O aplicație de gestiune a flotei unei companii trebuie să gestioneze mai multe tipuri de vehicule: Camioane, Autoturisme și Autobuze.
//Fiecare tip de vehicul are o configurație specifică stocată într-o bază de date, iar aplicația trebuie să asigure că există o
//singură instanță de configurație pentru fiecare tip de vehicul.
//Se dorește implementarea unui modul care să permită accesarea configurării pentru un anumit tip de vehicul,
//asigurând că nu se creează mai multe instanțe pentru același tip de vehicul.
//Acest modul trebuie să folosească Multiton pentru a gestiona instanțele în funcție de tipul de vehicul.
//Asigurați-vă că există o singură instanță pentru fiecare tip de vehicul (camion, autoturism, autobuz).
//Implementați o metodă care returnează instanța configurării pentru tipul de vehicul solicitat.
//Dacă este necesară o instanță pentru un nou tip de vehicul, aceasta trebuie creată doar la cerere.

public class Main {
    public static void main(String[] args) {
        //Creare instante singleton pentru fiecare tip de vehicul
        VehicleConfiguration truckConfiguration = VehicleConfiguration.getInstances("Truck");
        VehicleConfiguration carConfiguration = VehicleConfiguration.getInstances("Car");
        VehicleConfiguration busConfiguration = VehicleConfiguration.getInstances("Bus");

        //Afisare configurari existente
        System.out.println(truckConfiguration.getConfigurationDetails());
        System.out.println(carConfiguration.getConfigurationDetails());
        System.out.println(busConfiguration.getConfigurationDetails());

        //Actualizare configurari camion
        truckConfiguration.setConfigurationDetails("Updated Truck Config");
        System.out.println(truckConfiguration.getConfigurationDetails());

        //Verificare reutilizare instanta
        VehicleConfiguration vehicleConfiguration = VehicleConfiguration.getInstances("Car");
        System.out.println(vehicleConfiguration.getConfigurationDetails());
    }
}
