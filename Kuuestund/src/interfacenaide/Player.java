package interfacenaide;

import java.util.ArrayList;
import java.util.List;

public class Player implements Saveable{

    private String name;
    private int hitPoints;
    private int strength;
    private String weapon;

    public Player(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
        this.weapon = "Kaigas";
    }

    @Override
    public List<String> write() {
        List<String> values = new ArrayList<>();
        values.add(0, name);
        values.add(1, String.valueOf(hitPoints));
        values.add(2, ""+strength);
        values.add(3, weapon);
        return values;
    }

    @Override
    public void read(List<String> savedValues) {
        //kontr., list != null ega poleks tühi
        if(savedValues != null && !savedValues.isEmpty()) {
            name = savedValues.get(0);
            hitPoints = Integer.parseInt(savedValues.get(1));
            strength = Integer.parseInt(savedValues.get(2));
            weapon = savedValues.get(3);
        }
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                ", weapon='" + weapon + '\'' +
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

    public String getWeapon() {
        return weapon;
    }
}
