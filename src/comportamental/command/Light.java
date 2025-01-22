package comportamental.command;

//Clasa Receiver ce are actiuni specifice
public class Light {
    public void turnOn() {
        System.out.println("Lumina a fost pornită.");
    }

    public void turnOff() {
        System.out.println("Lumina a fost oprită.");
    }
}
