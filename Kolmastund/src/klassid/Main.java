package klassid;

public class Main {

    public static void main(String[] args) {

        //andmetüüp muutujaNimi = väärtus
        Car porche = new Car();
        porche.setModel("911");
        System.out.println(porche.getModel());

        Car opel = new Car();
        opel.setModel("Astra");
        System.out.println(opel.getModel());
//        System.out.println(addNumber(6)); //ei toimi, sest addNumber pole static


    }
    //set annab, get võtab väärtuse

    public int addNumber(int number) {
        return number + 5;
    }

}
