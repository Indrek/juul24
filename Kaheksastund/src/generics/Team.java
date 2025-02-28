package generics;

import java.util.ArrayList;

public class Team<T extends Player> implements Comparable<Team<T>>{

    private String name;
    private int played = 0;
    private int won = 0;
    private int tied = 0;
    private int lost = 0;

    private ArrayList<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ArrayList<T> getMembers() {
        return members;
    }

    public boolean addPlayer(T player) {
        if(members.contains(player)) {
            System.out.println(((Player) player).getName() + " on juba tiimis");
            return false;
        }
        members.add(player);
        System.out.println(((Player)player).getName() + " on lisatud tiimi");
        return true;
    }
    public int numPlayers() {
        return members.size();
    }

    public void matchResult(Team<T> opponent, int ourScore, int theirScore) {
        String message;
        //meie tiimi nimi + message + vastastiimi nimi

        if(ourScore > theirScore) {
            won++;
            message = " võitis vs. ";
        } else if(ourScore == theirScore) {
            tied++;
            message = " mängis viiki vs. ";
        } else {
            lost++;
            message = " kaotas vs. ";
        }
        played++;

        if(opponent != null) {
            System.out.println(this.getName() + message + opponent.getName());
            opponent.matchResult(null, theirScore, ourScore);
        }
    }
    public int points() {
        return won*3+tied;
    }

    @Override
    public int compareTo(Team<T> team) {
        if(this.points() > team.points()) {
            return -1; //meie tiim läheb tabelis ülespoole
        } else if (this.points() < team.points()) {
            return 1;
        } else {
            return 0;
        }
        //saab asendada sellega:
        //return Integer.compare(team.points(), this.points());
    }
}
