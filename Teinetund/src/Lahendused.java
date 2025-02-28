public class Lahendused {

    public static void main(String[] args) {

        //1. harjutus (return tüüp: void)
        //Tee meetod (sisend int), mis ütleb, kas arv on negatiivne, 0 või positiivne
        posNegZero(-1);
        posNegZero(0);
        posNegZero(1);
        double number = kmToMiles(-5);
        System.out.println(number);

        //2. harjutus (returnib double)
        //Tee meetod, mis konverteerib kilomeetrid miilideks
        //Kontrolli, et sisend poleks negatiivne (return -1, kui on)
        //1 miil = kilomeeter / 1.609
        //võib lisada printi, mis ütleb X km/h on Y mi/h
        //returnib miilid

    }

    public static double kmToMiles(double km) {

        //sisendi kontroll
        if(km < 0) {
            return -1;
        }
        double mile = km / 1.609;
        System.out.println(km + " km/h on " + mile + " mi/h");
        return mile;
    }

    public static void posNegZero(int number) {
        if(number>0) {
            System.out.println(number + " on positiivne");
        } else if(number < 0) {
            System.out.println(number + " on negatiivne");
        } else {
            System.out.println(number + " on 0");
        }
    }


}
