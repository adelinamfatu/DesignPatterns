package comportamental.command;

//Imaginați-vă un sistem pentru controlul dispozitivelor smart dintr-o casă inteligentă (smart home).
//Dispozitivele (de exemplu, luminile și termostatul) pot primi comenzi precum pornire, oprire sau ajustare a temperaturii.
//Vom folosi design pattern-ul Command pentru a implementa acest sistem, astfel încât comenzile să poată fi trimise și
//gestionate flexibil, fără ca invocatorul (telecomanda) să cunoască detaliile implementării dispozitivelor.

public class Main {
    public static void main(String[] args) {
        //Creare receivers
        Light livingRoomLight = new Light();
        Thermostat thermostat = new Thermostat();

        //Creare comenzi
        Command turnOnLight = new TurnOnLightCommand(livingRoomLight);
        Command turnOffLight = new TurnOffLightCommand(livingRoomLight);
        Command setTemperature = new SetTemperatureCommand(thermostat, 22);

        //Creare Invoker
        RemoteControl remote = new RemoteControl();

        //Utilizare comenzi
        System.out.println("=== Pornirea luminii ===");
        remote.setCommand(turnOnLight);
        remote.pressButton();

        System.out.println("\n=== Setarea temperaturii ===");
        remote.setCommand(setTemperature);
        remote.pressButton();

        System.out.println("\n=== Oprirea luminii ===");
        remote.setCommand(turnOffLight);
        remote.pressButton();
    }
}
