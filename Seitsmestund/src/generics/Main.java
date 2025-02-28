package generics;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> items = new ArrayList<>();
        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
//        items.add("Juku");
        items.add(5);
        printDoubled(items);


        BasketballPlayer martin = new BasketballPlayer("Martin");
        FootballPlayer ragnar = new FootballPlayer("Ragnar");
        TennisPlayer kaia = new TennisPlayer("Kaia");

        Team<FootballPlayer> viljandi = new Team("Viljandi Tulevik");
        viljandi.addPlayer(ragnar);
//        viljandi.addPlayer(martin);
//        viljandi.addPlayer(kaia);
        System.out.println(viljandi.numPlayers());

//        Team<String> brokenTeam = new Team<>("See ei toimi");
//        brokenTeam.addPlayer("Juku");

        Team<BasketballPlayer> kalev = new Team<>("Kalev/Cramo");
        kalev.addPlayer(martin);

        Team<FootballPlayer> levadia = new Team<>("Levadia");
        Team<FootballPlayer> kalju = new Team<>("Nõmme kalju");

        viljandi.matchResult(levadia, 1, 2);
        viljandi.matchResult(kalju,3,2);
        levadia.matchResult(kalju,3,2);

        System.out.println("Edetabel:");
        System.out.println(viljandi.getName() + ": " + viljandi.points() + " punkti");
        System.out.println(levadia.getName() + ": " + levadia.points() + " punkti");
        System.out.println(kalju.getName() + ": " + kalju.points() + " punkti");

//        System.out.println("Edetabel järjest:");
//        league.showTable();

    }

    private static void printDoubled(ArrayList<Integer> items) {
        for (int i : items) { //for each / enhanced for loop
            System.out.println((int) i*2);
        }
    }

}
