package encapsulation;

public class ParemPlayer {

    private String name;
    private int hitPoints = 50; // default väärtus
    private String weapon;

    private int[] inventory;



    public ParemPlayer(String name, int health, String weapon) {
        this.name = name;
        if(health > 0 && health <= 100) {
            this.hitPoints = health;
        }
        this.weapon = weapon;
    }
    public void loseHealth(int damage) {
        hitPoints -= damage;
        if(hitPoints <= 0) {
            System.out.println("Mängija kukkus ümber");
        }
    }

    public int getHealth() {
        return hitPoints;
    }
    public int[] getInventory() {
        int[] fake = inventory;
        return fake; //returnime koopia, mitte originaali
    }
}
