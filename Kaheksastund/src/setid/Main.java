package setid;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    //Set ehk hulk on kollektsioon või kogum elementidest, milles ükski liige ei kordu
    //Set on kaootiline
    //.add(), remove(), size(), isEmpty(), .contains()
    //Setist ei saa spetsiifilist elementi kätte (pole .get() meetodit)

    public static void main(String[] args) {

        Map<String, HeavenlyBody> solarSystem = new HashMap<>();
        Set<HeavenlyBody> planets = new HashSet<>();

        HeavenlyBody tempPlanet;
        tempPlanet = new HeavenlyBody("Mercury", 88);
        solarSystem.put(tempPlanet.getName(), tempPlanet);
        planets.add(tempPlanet);

        tempPlanet = new HeavenlyBody("Venus", 225);
        solarSystem.put(tempPlanet.getName(), tempPlanet);
        planets.add(tempPlanet);

        tempPlanet = new HeavenlyBody("Earth", 365);
        solarSystem.put(tempPlanet.getName(), tempPlanet);
        planets.add(tempPlanet);

        HeavenlyBody tempMoon;
        tempMoon = new HeavenlyBody("Moon", 27);
        solarSystem.put(tempMoon.getName(), tempMoon);
        tempPlanet.addMoon(tempMoon);

        tempPlanet = new HeavenlyBody("Mars", 678);
        solarSystem.put(tempPlanet.getName(), tempPlanet);
        planets.add(tempPlanet);

        //tempPlanet.addMoon(tempMoon); //lisame Kuu Marsile

        tempMoon = new HeavenlyBody("Deimos", 1.3);
        solarSystem.put(tempMoon.getName(), tempMoon);
        tempPlanet.addMoon(tempMoon);

        tempMoon = new HeavenlyBody("Phobos", 0.3);
        solarSystem.put(tempMoon.getName(), tempMoon);
        tempPlanet.addMoon(tempMoon);

        HeavenlyBody body = solarSystem.get("Mars");
        System.out.println("Moons of " + body.getName());
        for(HeavenlyBody moon : body.getSatellites()){
            System.out.println("\t" + moon.getName());
        }

        Set<HeavenlyBody> moons = new HashSet<>();
        for(HeavenlyBody planet : planets) {
            moons.addAll(planet.getSatellites());
        }
        System.out.println("Kõik kuud:");
        for(HeavenlyBody moon : moons) {
            System.out.println("\t" + moon.getName());
        }
    }

}
