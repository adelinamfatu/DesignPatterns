package comportamental.command;

//Clasa de tipul ConcreteCommand - 1 pentru fiecare metoda din Receiver
public class TurnOnLightCommand implements Command {
    private Light light;

    public TurnOnLightCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }
}
