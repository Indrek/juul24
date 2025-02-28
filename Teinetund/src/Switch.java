public class Switch {

    public static void main(String[] args) {
        int value = 3;
        if(value == 1) {
            System.out.println("Value = 1");
        } else if(value == 2) {
            System.out.println("Value = 2");
        } else {
            System.out.println("Pole 1 ega 2");
        }

        System.out.println("*************************");

        int switchValue = 666;

        switch (switchValue) {
            case 1:
                System.out.println("switchValue = 1");
                break;
            case 2:
                System.out.println("switchValue = 2");
                break;
            case 3: case 4: case 5: case 666:
                System.out.println("Oli 3, 4 või 5 või 666");
                break;
            default:
                System.out.println("Pole 1 ega 2");
                break; //siin (defaultis) pole break tähtis
        } //break hüppab siia


        /*
        Tee switch
        kasutame char tüüpi muutujat
        Kui väärtus on A, siis printi "Oli A"
        Kui väärtus on B, siis printi "Oli B"
        Kui väärtus on C, D või E, siis printi "Oli C, D või E"
        Muul juhul printi "Ei leitud"
         */

        char switchChar = 'a';

        switch (switchChar) {
            case 'A':
                System.out.println("Oli A");
                break;
            case 'B':
                System.out.println("Oli B");
                break;
            case 'C': case 'D': case 'E':
                System.out.println("Oli C, D või E");
                break;
            default:
                System.out.println("Ei leitud");
        }

        int test = '5';
        System.out.println(test);

        int month = 1;
        int daysInMonth = 0;

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

        if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
            daysInMonth = 31;
        }
    }


}
