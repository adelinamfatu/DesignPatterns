package creational.multiton;

import java.util.HashMap;
import java.util.Map;

//Clasa multiton - mai multe perechi unice
public class VehicleConfiguration {
    //Pereche cheie-valoare singleton
    private static Map<String, VehicleConfiguration> instances = new HashMap<>();
    private String configurationDetails;

    //Constructor privat
    private VehicleConfiguration(String configurationDetails) {
        this.configurationDetails = configurationDetails;
    }

    //Metoda ce adauga o noua pereche cheie-valoare la Map daca nu exista deja si dupa returneaza valoarea
    public static VehicleConfiguration getInstances(String vehicleType) {
        synchronized (instances) { //Asigurarea unicitatii in multi-threading
            if (!instances.containsKey(vehicleType)) {
                instances.put(vehicleType, new VehicleConfiguration("Config pentru " + vehicleType));
            }
            return instances.get(vehicleType);
        }
    }

    public String getConfigurationDetails() {
        return configurationDetails;
    }

    public void setConfigurationDetails(String configurationDetails) {
        this.configurationDetails = configurationDetails;
    }
}
