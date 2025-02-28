package whileloop;

public class WhileLoop {

    public static void main(String[] args) {

        //while tsükkel
        //while (tingimus)

        int count = 0;
        while (count < 5) {
            System.out.println("count = " + count);
            count++;
        }
        //for tsükli analoog
        for (int i = 0; i<5; i++) {
            System.out.println("i = " + i);
        }

        count = 0;
        while (true) {
            if(count == 5) {
                break;
            }
            System.out.println("Uus count = " + count);
            count++;
        }

        /*
        Teeme kaks muutujat: number ja finishNumber (mõlemad int muutujad)
        Tee while tsükkel, mis printib numbrid vahemikus number ja finishNumber
        (esialgsed numbrid nt 4 ja 20)

        Teeme meetodi isEvenNumber(int number), mis returnib booleani
        returnib true, kui number on paarisarv

        While tsüklis printi ainult paarisarvud (kasutades isEvenNumber meetodit)

        breakime tsüklist välja, kui on leitud 5 paarisarvu

         */
        int number = 4;
        int finishNumber = 20;
        int numbersFound = 0;

        while(number <= finishNumber) {
            if(isEvenNumber(number)) {
                System.out.println(number);
                numbersFound++;
            }
            if(numbersFound == 5) {
                break;
            }
            number++;
        }
    }
    public static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }
}
