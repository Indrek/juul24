package interfacenaide;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Player player = new Player("Juku", 10, 20);

        System.out.println(player);

        saveObject(player);
//        loadObject(player);

        System.out.println(player);

        Saveable monster = new Monster("Vampiir", 20, 40);
        System.out.println(monster);
        saveObject(monster);
//        loadObject(monster);
        System.out.println(monster);
        System.out.println();

        //castimine
        System.out.println( ((Monster) monster).getStrength());

        double myDouble = 5.6;
        System.out.println((int) myDouble); //5

    }

    private static void loadObject(Saveable objectToLoad) {
        List<String> values = readValues();
        objectToLoad.read(values);

    }

    private static List<String> readValues() {
        List<String> values = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;

        System.out.println("""
                Vali:
                0 - Välju
                1 - Sisesta andmeid""");
        while(!quit) {
            System.out.println("Tee valik:");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.println("Sisesta String (index = " + index + "):");
                    String value = scanner.nextLine();
                    values.add(index,value);
                    index++;
                    break;

            }
        }

        return values;
    }

    private static void saveObject(Saveable objectToSave) {
        for(int i = 0; i<objectToSave.write().size(); i++) {
            System.out.println("Salvestame " + objectToSave.write().get(i) + " kuskile mällu");
        }
    }

}
