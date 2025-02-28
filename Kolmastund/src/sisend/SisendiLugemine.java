package sisend;

import java.util.Scanner;

public class SisendiLugemine {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Sisesta sünniaasta:");
        boolean hasNextInt = scanner.hasNextInt();

        if(hasNextInt) {
            int aasta = scanner.nextInt();
            scanner.nextLine();
            int vanus = 2024 - aasta;


            System.out.println("Sisesta oma nimi:");
            String name = scanner.nextLine();
            if(vanus >= 0 && vanus <= 123) {
                System.out.println("Sinu nimi on " + name + " ja vanus on " + vanus);
            } else {
                System.out.println("Kahtlane sünniaasta");
            }
        } else {
            System.out.println("Ei saa parsida sünniaastat");
        }

    }

}
