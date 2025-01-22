package comportamental.command;

//Clasa Receiver
public class Thermostat {
    public void setTemperature(int temperature) {
        System.out.println("Temperatura a fost setată la " + temperature + " grade.");
    }
}
