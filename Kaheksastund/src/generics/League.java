package generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class League<T extends Team<? extends Player>> {

    //? - wildcard
    //? - võib olla ükskõik mis objekt.

    //Liigal on nimi ja list tiimidest, mis liigas on
    //konstruktor, nimele getter
    //addTeam meetod, mis lisab tiimi liigasse
    //showTable() meetod, mis kuvab tiimid punktide järjekorras

    private String name;
    private List<T> league;

    public League(String name) {
        this.name = name;
        this.league = new ArrayList<>();
    }

    public List<T> getLeague() {
        return league;
    }

    public String getName() {
        return name;
    }
    public boolean addTeam(T team) {
        if(league.contains(team)) {
            System.out.println(team.getName() + " on juba liigas, ei lisatud.");
            return false;
        }
        league.add(team);
        System.out.println(team.getName() + " lisatud liigasse");
        return true;

    }

    public void showTable() {
        Collections.sort(league);
        for (T team : league) {
            System.out.println(team.getName() + " : " + team.points() + " punkti");
        }
    }

}
