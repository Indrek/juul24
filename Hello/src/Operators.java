public class Operators {

    //lühend psvm
    public static void main(String[] args) {

        //liitmine
        int result = 1 + 2; //1 + 2 = 3
        System.out.println(result);

        result = result - 1; //3 - 1 = 2
        System.out.println(result);

        //korrutamine
        result = result * 10; //2 * 10 = 20
        System.out.println(result);

        //jagamine
        result = result / 4; //20 / 4 = 5
        System.out.println(result);

        //jääk (modulo)
        result = result % 3; //5 % 3 = 2
        System.out.println(result);

        //result = result + 1
        result++; //2 + 1 = 3
        System.out.println(result);
        //++ liidab ühe

        //result = result - 1
        result--; //3 - 1 = 2
        System.out.println(result);
        //-- lahutab ühe

        //result = result + 2
        result += 2; //2 + 2 = 4
        System.out.println(result);

        //result = result * 10
        result *= 10; //4 * 10 = 40
        System.out.println(result);

        //result = result / 8
        result /= 8; //40 / 8 = 5
        System.out.println(result);

        //result = result - 2
        result -= 2; //5 - 2 = 3
        System.out.println(result);

        //mõistlik boolen muutujad nimetada küsimusena
        boolean isAlien = true; //boolean true või false

        if(isAlien == true) {
            System.out.println("See on tulnukas");
        }

        int topScore = 85;
        if(topScore == 100) {
            System.out.println("Sa said parima skoori!");
        }
        int secondTopScore = 80;
        if(topScore > secondTopScore && topScore < 100) {
            System.out.println("Sinu skoor on parem kui teine");
        }
        if(topScore > 90 || secondTopScore < 90) {
            System.out.println("Üks või mõlemad on tõesed");
        }
        // && - ja (mõlemad tingimused peavad olema täidetud)
        // || - või (vähemalt üks tingimus peab olema täidetud)
        // võib olla mitu tingimust

        boolean isCar = false;

        if(isCar) { //kas isCar == true
            System.out.println("See on auto");
        }
        if(!isCar) { // ! - not
            //sama, mis isCar == false
            System.out.println("See ei ole auto");
        }

        /*
        loogilised võrdlused
        == (peab olema võrdne)
        > (rangelt suurem)
        < (rangelt väiksem)
        >= (suurem-võrdne)
        <= (väiksem-võrdne)
        != (ei tohi võrduda)
         */

        double myDouble = 6.5; //double on komakohaga arvud
        System.out.println(myDouble + result);

        //ülesanne
        /*
        Teisenda naelad kilogrammideks
        1 nael = 0.45kg
        printi X naela on Y kilo
        näiteks: 3 naela on 1.35 kg
        vihje: kasuta double andmetüüpi
         */
        double naelKilodes = 0.45;
        int naelad = 5;
        double kilod = naelKilodes * naelad;
        System.out.println(naelad + " naela on " + kilod + " kilo");

        /*
        ülesanne
        1) double1 = 20
        2) double2 = 80
        3) liida nr-d ja korruta 100-ga
        4) leia jääk saadud tulemuse ja 40 vahel
        5) kirjuta if tingimus, mis ütleb "Jääki jäi üle", kui jääki jäi üle
         */
        double double1 = 20;
        double double2 = 80;
        double double3 = (double1 + double2) * 100;
        double remainder = double3 % 40;

        if(remainder > 0) {
            System.out.println("Jääki jäi üle " + remainder);
        } else {
            //else tuleb juhul, kui varasemad tingimused pole täidetud
            System.out.println("Jääki ei jäänud");
        }

        if(double1 < double2) {
            System.out.println("double1 on väiksem kui double2");
        } else if (double1 > double2) {
            //else if võib olla lõputult palju
            System.out.println("double1 on suurem kui double2");
        } else if(double1 < double2) {
            System.out.println("Siia ei jõuta mitte kunagi");
        }else {
            System.out.println("double1 ja double2 on võrdsed");
        }

        /*
        Harjutus:
        Tee 3 int tüüpi muutujat
        Kui üks nendest kolmest on negatiivne, printi "Vale väärtus"
        Kui kõik numbrid on võrdsed, printi "Kõik numbrid on võrdsed"
        Kui kõik numbrid on erinevad, printi "Kõik numbrid on erinevad"
        Muul juhul printi "Pole võrdsed ega erinevad"
         */


    }
}
