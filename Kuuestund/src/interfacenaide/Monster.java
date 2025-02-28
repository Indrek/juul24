package interfacenaide;

import java.util.ArrayList;
import java.util.List;

public class Monster implements Saveable{

    private String name;
    private int hitPoints;
    private int strength;

    public Monster(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    @Override
    public List<String> write() {
        List<String> values = new ArrayList<>();
        values.add(0, name);
        values.add(1, String.valueOf(hitPoints));
        values.add(2, ""+strength);
        return values;
    }

    @Override
    public void read(List<String> savedValues) {
        //kontr., list != null ega poleks tühi
        if(savedValues != null && !savedValues.isEmpty()) {
            name = savedValues.get(0);
            hitPoints = Integer.parseInt(savedValues.get(1));
            strength = Integer.parseInt(savedValues.get(2));
        }
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }
}
