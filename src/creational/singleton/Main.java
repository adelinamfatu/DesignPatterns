package creational.singleton;

//Atunci când aplicația pentru gestionarea setărilor globale este pornită, aceasta trebuie să permită accesarea și
//modificarea configurațiilor aplicației. Fiecare instanță a clasei care gestionează setările trebuie să fie unică,
//astfel încât să nu existe conflicte între valorile salvate. Aplicația trebuie să permită gestionarea unor setări precum:
//URL-ul bazei de date, timeout-ul conexiunii, și modul de logare (ex: "debug", "info", "error").
//În cazul în care utilizatorul nu setează explicit aceste valori, aplicația trebuie să inițializeze setările cu valori
//implicite (ex: URL-ul bazei de date cu "localhost", timeout-ul cu 30 de secunde).
//Să se dezvolte modulul care asigură gestionarea unică a setărilor globale folosind modelul de design Singleton.

public class Main {
    public static void main(String[] args) {
        ConfigurationManager configurationManager = ConfigurationManager.getInstance();

        //Afisare setari implicite
        System.out.println("Database URL: " + configurationManager.getSetting("databaseURL"));
        System.out.println("Timeout: " + configurationManager.getSetting("timeout"));
        System.out.println("Log Level: " + configurationManager.getSetting("logLevel"));

        //Actualizare setari
        configurationManager.setSetting("databaseURL", "192.168.1.100");
        configurationManager.setSetting("timeout", "60");

        //Afisare setari actualizate
        System.out.println("\nSetări actualizate:");
        System.out.println("Database URL: " + configurationManager.getSetting("databaseURL"));
        System.out.println("Timeout: " + configurationManager.getSetting("timeout"));
    }
}