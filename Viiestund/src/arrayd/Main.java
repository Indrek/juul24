package arrayd;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Massiiv (array)
        int[] myNumber = new int[5]; //kantsulgudes ütleb, mitu elementi massiivis on

        double[] myDoubles = new double[4];
        String[] myStrings = new String[3];

        //andmetüüp kantsulud muutujaNimi = new andmetüüp kantsulud (ja nr kantsulgudes)
        //int[] nimi = new int[1]

        int[] newIntArray = new int[10]; //esimene element alati indeksiga 0
        newIntArray[5] = 50; //kuigi nr 5, siis ta on 6-s element
        newIntArray[2] = 20; //kuigi nr 2, siis ta on 3-s element
        //0, 0, 20, 0, 0, 50, 0, 0, 0, 0

        //anname väärtused massiivi loomise hetkel
        int[] myIntArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(myIntArray[0]);
        System.out.println(myIntArray[4]);
        System.out.println(myIntArray[9]);
//        System.out.println(myIntArray[10]); //out of bounds

        int[] forIntArray = new int[25];
        for(int i = 0; i < forIntArray.length; i++) {
            forIntArray[i] = i*10;
        }
        printArray(forIntArray);

        printArray(new int[]{2,4,6,8,10,12});

        System.out.println(Arrays.toString(forIntArray));
        System.out.println(forIntArray);

        System.out.println(getAverage(forIntArray));

        /*
        Tee meetod, mis arvutab array keskmise väärtuse
        returnib double, sisendiks int[] array

        keskmine = kogusumma / elementide kogus
         */

        /*
        Tee meetod, mis küsib kasutajalt numbreid ja lisab nad massiivi
        returnib int[] massiivi; sisendiks kogus, kui mitu numbrit kasutaja sisestab

        Kasuta scannerit
         */
        int[] myIntegers = getIntegers(7);
        printArray(myIntegers);
        System.out.println("Keskmine väärtus: " + getAverage(myIntegers));


    }

    private static int[] getIntegers(int amount) {
        Scanner scanner = new Scanner(System.in);
        int[] values = new int[amount];

        for (int i = 0; i<values.length; i++) {
            System.out.println("Sisesta täisarv ["+(i+1)+"/"+amount+"]: ");
            values[i] = scanner.nextInt();
            scanner.nextLine();
        }
        return values;
    }

    private static double getAverage(int[] array) {
        double sum = 0;
        for (int i = 0; i< array.length; i++) {
            sum += array[i];
        }
        return sum / array.length;
    }

    private static void printArray(int[] array) {
        for(int i = 0; i< array.length; i++) {
            System.out.println("Element " + i + ", väärtus: " + array[i]);
        }
    }

}
