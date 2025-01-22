package structural.flyweight;

import java.util.HashMap;
import java.util.Map;

//Clasa FlyweightFactory
//Are o pereche cheie-valoare de obiecte flyweight
public class UnitFactory {
    private static final Map<String, Unit> units = new HashMap<>();

    public static Unit getUnit(String type) {
        if (!units.containsKey(type)) {
            switch (type) {
                case "Infantry":
                    units.put(type, new Soldier("Infantry", 10, 5, 3));
                    break;
                case "Cavalry":
                    units.put(type, new Soldier("Cavalry", 15, 8, 5));
                    break;
                case "Archer":
                    units.put(type, new Soldier("Archer", 12, 4, 4));
                    break;
                default:
                    throw new IllegalArgumentException("Unknown unit type: " + type);
            }
        }
        return units.get(type);
    }

    public static int getUnitCount() {
        return units.size();
    }
}
