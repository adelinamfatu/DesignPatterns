package creational.singleton;

import java.util.HashMap;
import java.util.Map;

//Clasa Singleton
public class ConfigurationManager {
    //Instanta unica statica
    //Pentru Eager Initialziation - s-ar crea instanta aici cu new ConfigurationManager()
    private static ConfigurationManager instance = null;
    private Map<String, String> settings;

    //Constructor private ca sa nu poata fi apelat decat dinauntrul clasei, altfel ar putea fi create mai multe instante
    private ConfigurationManager() {
        settings = new HashMap<>();
        settings.put("databaseURL", "localhost");
        settings.put("timeout", "30");
        settings.put("logLevel", "info");
    }

    //Metoda statica ce creeaza in mod unic in cadrul tuturor thread-urilor o singura instanta de ConfigurationManager
    //Daca nu ar fi static ar crea mereu un nou obiect
    public static synchronized ConfigurationManager getInstance() {
        if (instance == null) { //Lazy initialization - instanta creata la primul apel, nu inainte
            instance = new ConfigurationManager();
        }
        return instance;
    }

    public String getSetting(String key) {
        return settings.getOrDefault(key, "Not Found");
    }

    public void setSetting(String key, String value) {
        settings.put(key, value);
    }
}
