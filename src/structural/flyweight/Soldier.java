package structural.flyweight;

//Clasa ConcreteFlyweight ce contine caracteristicile partajate
public class Soldier implements Unit {
    private final String type;
    private final int attackPower;
    private final int defense;
    private final int speed;

    public Soldier(String type, int attackPower, int defense, int speed) {
        this.type = type;
        this.attackPower = attackPower;
        this.defense = defense;
        this.speed = speed;
    }

    @Override
    public void display(int x, int y, int health) {
        System.out.println("Displaying " + type + " at (" + x + ", " + y + ") with health: " + health);
    }
}
