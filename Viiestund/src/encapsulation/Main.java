package encapsulation;

public class Main {

    public static void main(String[] args) {

        Player player = new Player();
        player.name = "Juku";
        player.health = 20;
        player.weapon = "Kaigas";

        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Elusid alles: " + player.getHealth());

        damage = 11;
        player.health = 100;
        player.loseHealth(damage);
        System.out.println("Elusid alles: " + player.getHealth());

        ParemPlayer paremPlayer = new ParemPlayer("Juhan", 1000, "Vibu");
        System.out.println("Elusid alles: " + paremPlayer.getHealth());

        damage = 41;
//        paremPlayer.health = 100;
        paremPlayer.loseHealth(damage);
        System.out.println("Elusid alles: " + paremPlayer.getHealth());

    }

}
