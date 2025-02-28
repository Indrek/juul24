package adventure;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    //Colossal Cave Adventure

    public static void main(String[] args) {
        Map<Integer, Location> locations = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        locations.put(0,new Location(0,"Istud arvuti ees ja õpid Javat"));
        locations.put(1,new Location(1,"Seisad tänava alguses"));
        locations.put(2,new Location(2,"Seisad mäe otsas"));
        locations.put(3,new Location(3,"Seisad maja ees"));
        locations.put(4,new Location(4,"Seisad jõe ääres"));
        locations.put(5,new Location(5,"Seisad metsas"));

        //loc1
        locations.get(1).addExit("W",2);
        locations.get(1).addExit("E",3);
        locations.get(1).addExit("S",4);
        locations.get(1).addExit("N",5);

        //loc2
        locations.get(2).addExit("N",5);

        //loc3
        locations.get(3).addExit("W",1);

        //loc4
        locations.get(4).addExit("N",1);
        locations.get(4).addExit("W",2);

        //loc5
        locations.get(5).addExit("S",1);
        locations.get(5).addExit("W",2);

        //Näide, kuidas me saame igat sõna eraldi kätte
        String[] strings = "Istud arvuti ees ja õpid Javat".split(" ");
        for (String s : strings) {
            System.out.println(s);
        }
        Map<String, String> vocabulary = new HashMap<>();
        vocabulary.put("QUIT","Q");
        vocabulary.put("NORTH","N");
        vocabulary.put("SOUTH","S");
        vocabulary.put("WEST","W");
        vocabulary.put("EAST","E");



        int loc = 1;
        while (true) {
            System.out.println(locations.get(loc).getDescription());

            if(loc == 0) {
                System.out.println(loc);
                break;
            }

            //Kuvame kasutajale suunad, kuhu ta saab minna
            Map<String, Integer> exits = locations.get(loc).getExits();
            System.out.println("Olemasolevad suunad");
            for(String exit : exits.keySet()) {
                System.out.print(exit + ", ");
            }
            System.out.println();
            //Küsime kasutajalt, kuhu ta minna tahab
            String direction = scanner.nextLine().toUpperCase();

            //Kontrollime, kas sisend oli 1 täht või rohkem
            if(direction.length() > 1) {
                String[] words = direction.split(" ");
                for(String word : words) {
                    if(vocabulary.containsKey(word)) {
                        direction = vocabulary.get(word);

                        //ignoreerime sõnu, mida pole vaja
                        break;
                    }
                }
            }

            //Kontrollime, kas sinna saab minna
            if(exits.containsKey(direction)) {
                loc = exits.get(direction);
            } else {
                System.out.println("Sinna ei saa minna");
            }




//            loc = scanner.nextInt();
//            scanner.nextLine();
//
//            if(!locations.containsKey(loc)) {
//                System.out.println("Sinna ei saa minna");
//            }
        }
    }
}
