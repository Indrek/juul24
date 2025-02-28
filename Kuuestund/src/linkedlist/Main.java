package linkedlist;

import javax.swing.*;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<>();
        addInOrder(placesToVisit, "Tartu");
        addInOrder(placesToVisit, "Pärnu");
        addInOrder(placesToVisit, "Haapsalu");
        addInOrder(placesToVisit, "Narva");
        addInOrder(placesToVisit, "Valga");
        addInOrder(placesToVisit, "Tallinn");

        printList(placesToVisit);

        addInOrder(placesToVisit, "Rapla");
        printList(placesToVisit);

        placesToVisit.remove(4);
        printList(placesToVisit);

        visit(placesToVisit);
    }

    private static void visit(LinkedList<String> cities) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        ListIterator<String> listIterator = cities.listIterator();
        boolean goingForward = true;

        printMenu();
        if(cities.isEmpty()) {
            System.out.println("Listis pole ühtegi linna");
            return;
        }
        System.out.println("Hetkel oleme linnas: " + listIterator.next());
        while(!quit) {
            System.out.println("Sisesta valik:");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0: //quit
                    System.out.println("Reis läbi");
                    quit = true;
                    break;
                case 1: //edasi

                    //kontrollime ümberpöördemomenti
                    if(!goingForward) {
                        if(listIterator.hasNext()) {
                            listIterator.next();
                        }
                    }
                    goingForward = true;
                    if(listIterator.hasNext()) {
                        System.out.println("Hetkel oleme linnas: " + listIterator.next());
                    } else {
                        System.out.println("Oleme listi lõpus");
                        goingForward = false;
                    }
                    break;
                case 2: //tagasi

                    //kontrollime ümberpöördemomenti
                    if(goingForward) {
                        if(listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                    }

                    goingForward = false;
                    if(listIterator.hasPrevious()) {
                        System.out.println("Hetkel oleme linnas: " + listIterator.previous());
                    } else {
                        System.out.println("Oleme listi alguses");
                        goingForward = true;
                    }
                    break;
                case 3: //printi menüü
                    printMenu();
                    break;
            }
        }
    }

    private static void printMenu() {
        System.out.println("""
                Valikud:
                0 - Välju
                1 - Mine järgmisesse linna
                2 - Mine eelmisesse linna
                3 - Printi menüü""");
    }

    private static void printList(LinkedList<String> linkedList) {

        Iterator<String> i = linkedList.iterator();
        while (i.hasNext()){
            System.out.println("Praegu linnas: " + i.next());
        }
        System.out.println("*************************");

    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
        ListIterator<String> listIterator = linkedList.listIterator();

        while (listIterator.hasNext()) {
            int comparison = listIterator.next().compareTo(newCity);

            if(comparison == 0) {
                //võrdsed, linn on juba listis olemas
                System.out.println(newCity + " on juba olemas");
                return false;
            } else if (comparison > 0) {
                //uus linn peaks olema enne praegust (kontrollitavat) linna
                listIterator.previous();
                listIterator.add(newCity);
                //linn edukalt lisatud, returnime true
                return true;
            } else if(comparison < 0) {
                //ei ole veel õigesse kohta jõudnud, ei muuda midagi
            }

        }
        listIterator.add(newCity); //linn lisatakse listi lõppu
        return true;
    }

}
