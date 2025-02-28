public class MethodOverloadNaide {

    public static void main(String[] args) {

        /*
        meetod calcCentimeters(returnib double)
        2 sisendit: jalad(feet), tollid(inches)
        mõlemad int

        Kontrollime, et jalad >= 0
        Kontrollime, et tollid on >=0 ja <12
        returnime -1, kui üks nendest tingimustest pole täidetud

        Kui sisend on õige, siis arvutame mitu cm need jalad ja tollid on
        returnime selle väärtuse (cm)

        teine meetod sama nimega calcCentimeters (returnib double)
        üks sisend: tollid(int)
        kontrollime, et tollid oleks >= 0
        Kui ei ole, returnime -1
        Kui sisend on õige, siis teisendame ta jalgadeks ja tollideks
        Kutsume esimese meetodi saadud väärtustega

        1 toll = 2.54 cm, 1 jalg = 12 tolli
         */

        calcCentimeters(13);

    }
    public static double calcCentimeters(int feet, int inches) {

        //sisendi kontroll
        if(feet < 0 || inches < 0 || inches >= 12) {
            return -1;
        }

        double centimeters = (feet * 12 + inches) * 2.54;
        System.out.println(feet + " jalga ja " + inches + " tolli on " + centimeters + " cm");
        return centimeters;

    }
    public static double calcCentimeters(int inches) {

        if(inches < 0) {
            return -1;
        }

        //15 -> 3 tolli
        //15 -> 1 jalg?

        int feet = inches / 12;
        int remainingInches = inches % 12;
        System.out.println(inches + " tolli on " + feet + " jalga ja " + remainingInches + " tolli");
        return calcCentimeters(feet,remainingInches);



    }

}
