package structural.flyweight;

//Clasa UnsharedConcreteFlyweight ce contine caracteristicile unice
public class UnitInstance {
    private final Unit unit; //Obiect partajat
    private int x;
    private int y;
    private int health;

    public UnitInstance(Unit unit, int x, int y, int health) {
        this.unit = unit;
        this.x = x;
        this.y = y;
        this.health = health;
    }

    public void move(int newX, int newY) {
        this.x = newX;
        this.y = newY;
    }

    public void takeDamage(int damage) {
        this.health -= damage;
    }

    public void display() {
        unit.display(x, y, health);
    }
}
