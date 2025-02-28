package encapsulation;

public class Player {

    //NB! HALB NÄIDE

    public String name;
    public int health;
    public String weapon;

    public void loseHealth(int damage) {
        health -= damage;
        if(health <= 0) {
            System.out.println("Mängija kukkus ümber");
        }
    }

    public int getHealth() {
        return health;
    }
}
