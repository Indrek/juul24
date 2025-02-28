public class MethodOverload {

    public static void main(String[] args) {
        System.out.println("String");
        System.out.println(10);
        System.out.println(5.5);

        //Method overload (meeotdi ülelaadimine)
        //Meetodid on kõik sama nimega
        //Erinevad parameetrite tüübi, arvu, järjekorra poolest

        //liidaKaksNumbrit(int a, int b)
        //liidaKolmNumbrit(int a, int b, int c)

        //liida(int a, int b)
        //liida(int a, int b, int c)

        say(1);
        say("Hello"); //erineb andmetüübi poolest
        say(2, 3.4); //erineb sisendite arvu poolest
        say(5.6, 7); //erineb sisendite järjekorra poolest

    }

    public static void say(int a) {
        System.out.println("Ütlen numbri " + a);
    }
    public static void say(String s) {
        System.out.println(s);
    }
    public static void say(int a, double b) {
        System.out.println("Ütlen arvu " + a + " ja komaarvu " + b);
    }
    public static void say(double b, int a) {
        System.out.println("Ütlen komaarvu " + b + " ja täisarvu " + a);
    }

}
