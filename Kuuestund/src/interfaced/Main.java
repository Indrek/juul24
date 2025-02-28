package interfaced;

public class Main {

    public static void main(String[] args) {

        Telephone jukuphone; //interface ei saa instantseerida
        jukuphone = new DeskPhone(123);
        jukuphone.powerOn();
        jukuphone.callPhone(123);
        jukuphone.answer();
        jukuphone.dial(456);

        System.out.println();

        jukuphone = new MobilePhone(234);
        jukuphone.powerOn();
        jukuphone.callPhone(234);
        jukuphone.answer();
        jukuphone.dial(456);




    }

}
