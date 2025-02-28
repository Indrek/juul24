public class ForLoop {

    public static void main(String[] args) {
        System.out.println("Number 1");
        System.out.println("Number 2");
        System.out.println("Number 3");
        System.out.println("Number 4");
        System.out.println("Number 5");

        //for tsükkel (for loop)
        //1) Kood, mis täidetakse tsükli alguses (initseerimisel)
        //2) Tingimuslause (senikaua, kuni vastab tõele, tsükkel käib)
        //3) Kood, mis täidetakse igal tsükli sammul (iteratsioonil)
        //for(initseerimine; tingimus; iteratsioon) {}

        for(int i = 1; i < 1000; i++) {
            System.out.println("Number " + i);
        }
        int amount = 1000;
        for(int i = 8; i >= 2; i--) {
            System.out.println(amount + " " + i + "% intressiga on " + calculateInterest(amount, i));
        }

    }
    public static double calculateInterest(double amount, double interestRate) {
        return amount * (interestRate / 100);
    }

}
