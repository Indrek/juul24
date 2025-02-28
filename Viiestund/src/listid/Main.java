package listid;

import java.util.Scanner;

public class Main {

    /*
    List (eesti k Loend)
    Korrastatud andmekogum (säilitab järjekorra)
    Põhilised listid: ArrayList ja LinkedList

    Kui tavalisel array-l on pikkus määratud, siis List on dünaamiline
    Loomisel ei pea pikkust määrama, suureneb vastavalt vajadusele
     */
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {

        boolean quit = false;

        printInstructions();
        while(!quit) {
            System.out.println("Sisesta valik: ");
            int choice;
            if(!scanner.hasNextInt()) {
                scanner.nextLine();
                continue;
            }
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchItem();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }

    }

    private static void searchItem() {
        System.out.println("Otsitav toode:");
        String item = scanner.nextLine();
        if(!groceryList.onFile(item)) {
            System.out.println(item + " pole listis");
        } else {
            System.out.println(item + " leitud");
        }
    }

    private static void removeItem() {
        System.out.println("Sisesta toode, mida kustutada");
        String item = scanner.nextLine();
        groceryList.removeItem(item);
    }

    private static void modifyItem() {
        System.out.println("Sisesta toode, mida asendada: ");
        String oldItem = scanner.nextLine();
        System.out.println("Sisesta uus toode:");
        String newItem = scanner.nextLine();
        groceryList.modifyItem(oldItem,newItem);
    }

    private static void addItem() {
        System.out.println("Sisesta toode: ");
        String toode = scanner.nextLine();
        groceryList.addItem(toode);
    }

    private static void printInstructions() {
        System.out.println("""
                Vajuta:
                    0 - kuva valikud
                    1 - kuva listis olevad tooted
                    2 - lisa toode listi
                    3 - muuda toodet
                    4 - eemalda toode listist
                    5 - otsi toodet
                    6 - välju""");
    }


}
