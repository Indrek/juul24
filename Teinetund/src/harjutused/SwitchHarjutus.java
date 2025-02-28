package harjutused;

public class SwitchHarjutus {

    public static void main(String[] args) {

        int month, daysInMonth, year;
        month = 2;


        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                daysInMonth = 31;
                break;
            case 4: case 6: case 9: case 11:
                daysInMonth = 30;
                break;
            case 2:
                daysInMonth = 28;
                break;
            default:
                daysInMonth = -1;
        }
        System.out.println("Päevi on " + daysInMonth);
    }

    /*
    Tee meetod, mis kontrollib, kas aasta on liigaasta
    Muuda ülemist switchi selliselt, et liigaasta puhul on veebruaris (case 2) 29 päeva

    Liigaasta tingimused:
    Aastaarv jagub 4-ga ja ei tohi jaguda 100-ga
    Aastaarv jagub 400-ga
     */
}
